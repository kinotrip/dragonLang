package dragonLang;

import dragonLang.generated.DragonLangListener;
import dragonLang.generated.DragonLangParser;
import dragonLang.opcode.*;
import dragonLang.opcode.expr.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashSet;
import java.util.List;
import java.util.Stack;

import static dragonLang.CompileProperty.*;

/**
 * Created by Administrator on 2017/4/22.
 */
public class Compiler  implements DragonLangListener {

    String scriptName;
    public Compiler(String scriptName){
        this.scriptName = scriptName;
    }

    public ScriptInfo script(ParserRuleContext ctx){
        return new ScriptInfo(scriptName,ctx);
    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {
        new ScriptInfo(scriptName,errorNode.getSymbol()).throwException("语法解析错误");
    }

    //可执行代码
    Function rootExecutable = new Function();
    Stack<Function> executableStack = new Stack<>();{
        executableStack.push(rootExecutable);
    }

    public Function getFunction(){
        if (executableStack.size()>1){
            throw new RuntimeException("executableStack.size error!");
        }
        if (executableStack.peek()!=rootExecutable ){
            throw new RuntimeException("executableStack.peek error!");
        }
        return rootExecutable;
    }

    void add(OPCode opcode,ParserRuleContext context){
        if (executableStack.isEmpty()){
            script(context).throwException("编译栈已空");
        }
        executableStack.peek().add(opcode,script(context));
    }

    int currentAddress(){
        return  executableStack.peek().opcodeList.size();
    }

    //编译过程中的属性
    CompileProperty property = new CompileProperty();

    boolean isEmpty(List list){
        return (list==null)||(list.size()==0);
    }
    boolean notEmpty(List list) {return !isEmpty(list);}
    int sizeOrZero(List list) { return  (list==null)?0:list.size(); }

    @Override public void enterStart(DragonLangParser.StartContext ctx) {}
    @Override public void exitStart(DragonLangParser.StartContext ctx) {}

    /////////////////////////////////////////////////
    void line级别处理_标签(){};
    /////////////////////////////////////////////////

    @Override public void enterLineExpr(DragonLangParser.LineExprContext ctx) {}
    @Override public void exitLineExpr(DragonLangParser.LineExprContext ctx) {
        add(new POP(),ctx);
    }

    @Override public void enterLineReturn(DragonLangParser.LineReturnContext ctx) {}
    @Override
    public void exitLineReturn(DragonLangParser.LineReturnContext ctx) {
        add(new RETURN(ctx.expr()!=null),ctx);
    }

    @Override
    public void enterLineFunc(DragonLangParser.LineFuncContext ctx) {
        Value context;
        if (ctx.POINT()!=null){
            context = Value.thisPointContext;
        }else if (ctx.DOLLAR()!=null){ //全局变量
            context = Value.globalContext;
        }else{
            context = Value.currentContext;
        }
        add(new PUSH(context),ctx);
        add(new PUSH(Symbol.get(ctx.WORD().getText()).asValue()),ctx);
        //压入上下文和符号，准备赋值
    }

    @Override public void exitLineFunc(DragonLangParser.LineFuncContext ctx) {
        add(new ASSIGN(false,false),ctx);
        add(new POP(),ctx);//每一行结尾弹出本行当前值
    }

    @Override public void enterLineIf(DragonLangParser.LineIfContext ctx) {}
    @Override public void exitLineIf(DragonLangParser.LineIfContext ctx) {} //if 语句原则上整句都不压入当前值，不需要弹出

    @Override
    public void enterLineClass(DragonLangParser.LineClassContext ctx) {
        add(new PUSH(Value.globalContext),ctx);
        String name  = ctx.name.getText();
        add(new PUSH(Symbol.get(name).asValue()),ctx);
        property.set(ctx.object(),DEFINE_CLASS);
    }

    @Override
    public void exitLineClass(DragonLangParser.LineClassContext ctx) {
        add(new ASSIGN(false,false),ctx);
        HashSet<String> baseSet = new HashSet<>();
        for(int i=1;i<ctx.WORD().size();i++){
            String name = ctx.WORD(i).getText();
            if (baseSet.contains(name)){
                script(ctx).throwException("重复的类组合："+name);
            }
            baseSet.add(name);
            add(new MIX_IN(Symbol.get(name)),ctx);
        }
        add(new POP(),ctx);
    }

    @Override
    public void enterLineRawCall(DragonLangParser.LineRawCallContext ctx) {
        //第一个VAR是被赋值
        if (ctx.var().size()>1) {
            property.set(ctx.var(0), ASSIGN_VAR);
        }
    }
    @Override
    public void exitLineRawCall(DragonLangParser.LineRawCallContext ctx) {
        add(new PUSH(Value.create(sizeOrZero(ctx.expr()))),ctx);//参数个数
        add(new CALL_FUNC(false),ctx);
        if (ctx.var().size()>1) {
            add(new ASSIGN(false,false),ctx);
        }
        add(new POP(),ctx);
    }

    //箭头函数调用
    @Override
    public void enterLineArrow(DragonLangParser.LineArrowContext ctx) {
        if (ctx.var()!=null) {
            property.set(ctx.var(), ASSIGN_VAR);
        }
    }
    @Override
    public void exitLineArrow(DragonLangParser.LineArrowContext ctx) {
        if (ctx.var()!=null) {
            add(new ASSIGN(false,false),ctx);
        }
        add(new POP(),ctx);//每一行结尾弹出本行当前值
    }


    @Override
    public void enterArrowPart(DragonLangParser.ArrowPartContext ctx) {
        if (ctx.callBody()!=null){
            property.set(ctx.callBody(),IS_ARROW_CALL);
        }
    }

    @Override
    public void exitArrowPart(DragonLangParser.ArrowPartContext ctx) {
        if (ctx.callBody()==null){
            //无参数箭头调用函数
            add(new PUSH(Value.create(0)),ctx);
            //然后进行调用
            add(new CALL_FUNC(true),ctx);
        }
    }


    /////////////////////////////////////////////////
    void 函数定义和调用_标签(){};
    /////////////////////////////////////////////////

    @Override public void enterExprFunction(DragonLangParser.ExprFunctionContext ctx) {}
    @Override
    public void exitExprFunction(DragonLangParser.ExprFunctionContext ctx) {
        //为闭包绑定上下文
        add(new BIND_CLOSURE(),ctx);
    }

    @Override public void enterFunction(DragonLangParser.FunctionContext ctx) {}

    @Override
    public void exitFunction(DragonLangParser.FunctionContext ctx) {
        //在enterParams时新建，在exitParams压入的Function
        Function function = executableStack.pop();
        add(new PUSH(Value.create(function)),ctx);
    }

    @Override public void enterParams(DragonLangParser.ParamsContext ctx) {
        Function function = new Function();
        if (notEmpty(ctx.param())) {
            for (DragonLangParser.ParamContext param : ctx.param()) {
                property.set(param,FUNCTION,function);
            }
        }
        property.set(ctx,FUNCTION,function);
    }
    @Override public void exitParams(DragonLangParser.ParamsContext ctx) {
        Function function = (Function) property.get(ctx,FUNCTION);
        //以下开始定义函数
        executableStack.push(function);
    }


    @Override
    public void enterParam(DragonLangParser.ParamContext ctx) {
        if (ctx.expr()!=null){
            Function defaultExpr = new Function();
            executableStack.push(defaultExpr);
        }
        String name = ctx.WORD().getText();
        if (name.equals(Symbol.self.name)||(name.equals(Symbol.self2.name))){
            script(ctx).throwException("不可使用“自我”或者“self”作参数名！");
        }
    }

    @Override
    public void exitParam(DragonLangParser.ParamContext ctx) {
        Function defaultExpr = null;
        if (ctx.expr()!=null){
            add(new POP(),ctx);
            defaultExpr = executableStack.pop();
        }
        Function function = (Function) property.get(ctx,FUNCTION);
        function.defineParam(Symbol.get(ctx.WORD().getText()),defaultExpr,script(ctx));
    }

    @Override public void enterExprCall(DragonLangParser.ExprCallContext ctx) {}
    @Override public void exitExprCall(DragonLangParser.ExprCallContext ctx) {}
    @Override public void enterCallParam(DragonLangParser.CallParamContext ctx) {}
    @Override public void exitCallParam(DragonLangParser.CallParamContext ctx) {}
    @Override public void enterCallBody(DragonLangParser.CallBodyContext ctx) {}
    @Override
    public void exitCallBody(DragonLangParser.CallBodyContext ctx) {
        //在这里进行调用
        //先压入参数数量
        int paramCount = (ctx.expr()==null)?0:1 + sizeOrZero(ctx.callParam());
        add(new PUSH(Value.create(paramCount)),ctx);
        //然后进行调用
        add(new CALL_FUNC(property.getBoolean(ctx,IS_ARROW_CALL)),ctx);
    }

    /////////////////////////////////////////////////
    void 变量赋值部分_标签(){};
    /////////////////////////////////////////////////

    @Override
    public void enterVar(DragonLangParser.VarContext ctx) {
        if (ctx.WORD()!=null) {
            Value context;
            if (ctx.POINT()!=null){
                context = Value.thisPointContext;
            }else if (ctx.DOLLAR()!=null){ //全局变量
                context = Value.globalContext;
            }else{
                context = Value.currentContext;
            }
            add(new PUSH(context), ctx);
            add(new PUSH(Symbol.get(ctx.WORD().getText()).asValue()), ctx);
            add(new LOAD(true, false), ctx);
        }else if (ctx.NUMBER()!=null){
            Value number = numberStrToValue(ctx.NUMBER().getText());
            add(new PUSH(number),ctx);
        }else{
            script(ctx).throwException("VAR表达式没有主体内容");
        }
        if (!isEmpty(ctx.varGetter())){
            //只允许对数组赋值时候的最后一项用[]表示插入
            final boolean isAssignVar = property.getBoolean(ctx, ASSIGN_VAR);
            int size = ctx.varGetter().size();
            for(int i=0;i<size;i++){
                ParserRuleContext getter = ctx.varGetter().get(i);
                String text = getter.getText();
                if (text.equals("[]")){
                    if ((isAssignVar&&(i<size-1))||(!isAssignVar)){
                        script(ctx).throwException("只有被赋值项的最后允许使用[]=表达式进行数组插入");
                    }
                }
            }
        }
    }

    @Override
    public void exitVar(DragonLangParser.VarContext ctx) {
        final boolean isAssignVar = property.getBoolean(ctx, ASSIGN_VAR);
        final boolean isAssignVarLoad = property.getBoolean(ctx, ASSIGN_VAR_LOAD);
        if (isAssignVar||isAssignVarLoad) {
            executableStack.peek().removeLastOP();
        }
        if (isAssignVarLoad){
            add(new LOAD(true,true),ctx);
        }
    }

    @Override public void enterVarPoint(DragonLangParser.VarPointContext ctx) {}
    @Override
    public void exitVarPoint(DragonLangParser.VarPointContext ctx) {
        add(new PUSH(Symbol.get(ctx.WORD().getText()).asValue()),ctx);
        add(new LOAD(true,false),ctx);
    }

    @Override public void enterVarIndex(DragonLangParser.VarIndexContext ctx) {}
    @Override
    public void exitVarIndex(DragonLangParser.VarIndexContext ctx) {
        if (ctx.expr()==null) { //空的[]表达式表示插入
            add(new PUSH(Value.nullValue),ctx);
        }
        add(new LOAD(false,false),ctx); //因为之前的expr表达式已经向栈内push了index值了
    }

    @Override public void enterExprVar(DragonLangParser.ExprVarContext ctx) { }
    @Override public void exitExprVar(DragonLangParser.ExprVarContext ctx) { }

    @Override public void enterExprAndGetter(DragonLangParser.ExprAndGetterContext ctx) {}
    @Override public void exitExprAndGetter(DragonLangParser.ExprAndGetterContext ctx) {}

    @Override
    public void enterExprAssign(DragonLangParser.ExprAssignContext ctx) {
        //在IF表达式里屏蔽赋值语句
        if (isUnderIFExpr){
            script(ctx).throwException("在IF条件判断中不可使用赋值（=）语句,判断相等请使用（==）语句");
        }
        property.set(ctx.var(),ASSIGN_VAR);
    }

    @Override
    public void exitExprAssign(DragonLangParser.ExprAssignContext ctx) {
        add(new ASSIGN(false,false),ctx);
    }

    @Override public void enterBlockInKH(DragonLangParser.BlockInKHContext ctx) {}
    @Override public void exitBlockInKH(DragonLangParser.BlockInKHContext ctx) {}

    /////////////////////////////////////////////////
    void 数值初始化部分_标签(){};
    /////////////////////////////////////////////////

    @Override public void enterExprString(DragonLangParser.ExprStringContext ctx) {}
    @Override
    public void exitExprString(DragonLangParser.ExprStringContext ctx) {
        String text = ctx.STRING().getText();
        if (text.startsWith("\"")||text.startsWith("“")){
            text = text.substring(1,text.length()-1);
        }else  if (text.startsWith("@")){
            text = text.substring(1,text.length());
        }else script(ctx).throwException("not valid string format");
        add(new PUSH(Value.create(text)),ctx);
    }

    @Override public void enterExprNumber(DragonLangParser.ExprNumberContext ctx) {}
    @Override
    public void exitExprNumber(DragonLangParser.ExprNumberContext ctx) {
        String numberStr = ctx.NUMBER().getText();
        Value value = numberStrToValue(numberStr);
        add(new PUSH(value),ctx);
    }
    public Value numberStrToValue(String numberStr){
        Value value;
        if (numberStr.indexOf(".")>=0){
            value = Value.create(Double.valueOf(numberStr));
        }else{
            value = Value.create(Long.valueOf(numberStr));
        }
        return value;
    }


    @Override public void enterExprNull(DragonLangParser.ExprNullContext ctx) {}
    @Override
    public void exitExprNull(DragonLangParser.ExprNullContext ctx) {
        add(new PUSH(Value.nullValue),ctx);
    }

    @Override public void enterExprTrue(DragonLangParser.ExprTrueContext ctx) {}
    @Override
    public void exitExprTrue(DragonLangParser.ExprTrueContext ctx) {
        add(new PUSH(Value.create(true)),ctx);
    }

    @Override public void enterExprFalse(DragonLangParser.ExprFalseContext ctx) {}

    @Override
    public void exitExprFalse(DragonLangParser.ExprFalseContext ctx) {
        add(new PUSH(Value.create(false)),ctx);
    }

    @Override public void enterExprObject(DragonLangParser.ExprObjectContext ctx) {}
    @Override public void exitExprObject(DragonLangParser.ExprObjectContext ctx) {}


    @Override
    public void enterObject(DragonLangParser.ObjectContext ctx) {
        if (property.getBoolean(ctx,DEFINE_CLASS)){
            add(new NEW_OBJECT(true,false), ctx);
        }else {
            add(new NEW_OBJECT(false,false), ctx);
        }
    }

    @Override public void exitObject(DragonLangParser.ObjectContext ctx) { }

    @Override public void enterObjectSub(DragonLangParser.ObjectSubContext ctx) {}
    @Override public void exitObjectSub(DragonLangParser.ObjectSubContext ctx) {}

    @Override
    public void enterPair(DragonLangParser.PairContext ctx) {
        String name = ctx.WORD().getText();
        if (name.equals(Symbol.self.name)||name.equals(Symbol.self2.name)){
            script(ctx).throwException("不可使用“自我”或“self”作字段名！");
        }
        add(new PUSH(Value.createSymbol(name)),ctx);
    }

    @Override
    public void exitPair(DragonLangParser.PairContext ctx) {
        if (ctx.expr()==null){
            add(new PUSH(Value.nullValue),ctx);
        }
        add(new ASSIGN(true,false),ctx);
    }

    @Override
    public void enterObjectFunc(DragonLangParser.ObjectFuncContext ctx) {
        add(new PUSH(Value.createSymbol(ctx.WORD().getText())),ctx);
    }

    @Override
    public void exitObjectFunc(DragonLangParser.ObjectFuncContext ctx) {
        Function function = executableStack.pop();
        add(new PUSH(Value.create(function)),ctx);
        add(new ASSIGN(true,false),ctx);
    }

    @Override public void enterExprArray(DragonLangParser.ExprArrayContext ctx) {}
    @Override public void exitExprArray(DragonLangParser.ExprArrayContext ctx) {}


    @Override
    public void enterArray(DragonLangParser.ArrayContext ctx) {
        add(new NEW_OBJECT(false,true),ctx);
        if (ctx.expr()!=null){
            add(new PUSH(Value.nullValue),ctx);
        }
    }

    @Override
    public void exitArray(DragonLangParser.ArrayContext ctx) {
        if (ctx.expr()!=null) {
            add(new ASSIGN(true,false), ctx);
        }
    }

    @Override
    public void enterArraySub(DragonLangParser.ArraySubContext ctx) {
        add(new ASSIGN(true,false),ctx);
        add(new PUSH(Value.nullValue),ctx);
    }

    @Override public void exitArraySub(DragonLangParser.ArraySubContext ctx) {}

    @Override
    public void enterExprAndSub(DragonLangParser.ExprAndSubContext ctx) {
        if (isUnderIFExpr){
            script(ctx).throwException("在IF条件判断中不可使用多个并列表达式（|）语句,或运算请使用（||）语句");
        }
    }
    @Override public void exitExprAndSub(DragonLangParser.ExprAndSubContext ctx) {}
    @Override
    public void enterOtherExpr(DragonLangParser.OtherExprContext ctx) {
        add(new POP(),ctx);
    }
    @Override public void exitOtherExpr(DragonLangParser.OtherExprContext ctx) {}

    @Override public void enterExprBracket(DragonLangParser.ExprBracketContext ctx) {}
    @Override public void exitExprBracket(DragonLangParser.ExprBracketContext ctx) {}


    /////////////////////////////////////////////////
    void 表达式计算_标签(){};
    /////////////////////////////////////////////////


    @Override public void enterExprMulDivRmd(DragonLangParser.ExprMulDivRmdContext ctx) {}
    @Override
    public void exitExprMulDivRmd(DragonLangParser.ExprMulDivRmdContext ctx) {
        if (ctx.mul!=null){
            add(new MULTIPLCATION(),ctx);
        }else if (ctx.div!=null){
            add(new DIVISION(),ctx);
        }else if (ctx.rmd!=null){
            add(new REMAINDER(),ctx);
        }
    }
    @Override public void enterExprAddSubtract(DragonLangParser.ExprAddSubtractContext ctx) { }
    @Override
    public void exitExprAddSubtract(DragonLangParser.ExprAddSubtractContext ctx) {
        if (ctx.add!=null){
            add(new ADD(),ctx);
        }else if (ctx.sub!=null){
            add(new SUBTRACT(),ctx);
        }
    }
    //数值

    @Override public void enterExprNagative(DragonLangParser.ExprNagativeContext ctx) {}
    @Override
    public void exitExprNagative(DragonLangParser.ExprNagativeContext ctx) {
        add(new NAGATIVE(),ctx);
    }

    //布尔变量

    @Override public void enterExprAnd(DragonLangParser.ExprAndContext ctx) {}
    @Override
    public void exitExprAnd(DragonLangParser.ExprAndContext ctx) {
        add(new AND(),ctx);
    }

    @Override public void enterExprOr(DragonLangParser.ExprOrContext ctx) {}
    @Override
    public void exitExprOr(DragonLangParser.ExprOrContext ctx) {
        add(new OR(),ctx);
    }

    @Override public void enterExprNot(DragonLangParser.ExprNotContext ctx) {}
    @Override
    public void exitExprNot(DragonLangParser.ExprNotContext ctx) {
        add(new NOT(),ctx);
    }

    //等式比较

    @Override public void enterExprEqualEqual(DragonLangParser.ExprEqualEqualContext ctx) {}
    @Override
    public void exitExprEqualEqual(DragonLangParser.ExprEqualEqualContext ctx) {
        add(new IS_EQUAL(),ctx);
    }


    @Override public void enterExprNotEqual(DragonLangParser.ExprNotEqualContext ctx) {}
    @Override
    public void exitExprNotEqual(DragonLangParser.ExprNotEqualContext ctx) {
        add(new NOT_EQUAL(),ctx);
    }

    //比较函数
    @Override public void enterExprGreaterThan(DragonLangParser.ExprGreaterThanContext ctx) {}
    @Override
    public void exitExprGreaterThan(DragonLangParser.ExprGreaterThanContext ctx) {
        add(new GREATER_THAN(),ctx);
    }


    @Override public void enterExprGreaterEqual(DragonLangParser.ExprGreaterEqualContext ctx) {}
    @Override
    public void exitExprGreaterEqual(DragonLangParser.ExprGreaterEqualContext ctx) {
        add(new GREATER_EQUAL(),ctx);
    }


    @Override public void enterExprLessThan(DragonLangParser.ExprLessThanContext ctx) {}
    @Override
    public void exitExprLessThan(DragonLangParser.ExprLessThanContext ctx) {
        add(new LESS_THAN(),ctx);
    }

    @Override public void enterExprLessEqual(DragonLangParser.ExprLessEqualContext ctx) {}
    @Override
    public void exitExprLessEqual(DragonLangParser.ExprLessEqualContext ctx) {
        add(new LESS_EQUAL(),ctx);
    }

    //赋值

    @Override
    public void enterExprAddAssign(DragonLangParser.ExprAddAssignContext ctx) {
        property.set(ctx.var(),ASSIGN_VAR_LOAD);
    }

    @Override
    public void exitExprAddAssign(DragonLangParser.ExprAddAssignContext ctx) {
        add(new ADD(),ctx);
        add(new ASSIGN(false,false),ctx);
    }

    @Override
    public void enterExprSubtractAssign(DragonLangParser.ExprSubtractAssignContext ctx) {
        property.set(ctx.var(),ASSIGN_VAR_LOAD);
    }

    @Override
    public void exitExprSubtractAssign(DragonLangParser.ExprSubtractAssignContext ctx) {
        add(new SUBTRACT(),ctx);
        add(new ASSIGN(false,false),ctx);
    }


    @Override
    public void enterExprPlusOne(DragonLangParser.ExprPlusOneContext ctx) {
        property.set(ctx.var(),ASSIGN_VAR_LOAD);
    }

    @Override
    public void exitExprPlusOne(DragonLangParser.ExprPlusOneContext ctx) {
        add(new PUSH(Value.create(1)),ctx);
        add(new ADD(),ctx);
        add(new ASSIGN(false,false),ctx);
    }


    @Override
    public void enterExprMinusOne(DragonLangParser.ExprMinusOneContext ctx) {
        property.set(ctx.var(),ASSIGN_VAR_LOAD);
    }
    @Override
    public void exitExprMinusOne(DragonLangParser.ExprMinusOneContext ctx) {
        add(new PUSH(Value.create(1)),ctx);
        add(new SUBTRACT(),ctx);
        add(new ASSIGN(false,false),ctx);
    }

    /////////////////////////////////////////////////
    void 条件判断_标签(){};
    /////////////////////////////////////////////////
    boolean isUnderIFExpr = false;
    @Override
    public void enterIfexpr(DragonLangParser.IfexprContext ctx) {
        isUnderIFExpr = true;
        JUMP jumpFullIfBody = new JUMP();
        property.set(ctx, IF_FULL_BODY_JUMP,jumpFullIfBody);//跳出整个if，用于条件符合之后自然执行部分的结尾
        property.set(ctx.ifBlockInKH(),IF_FULL_BODY_JUMP,jumpFullIfBody);
        //把跳转出整个IF行的的JUMP命令分发到每个ifBlockInKH体内
        if (!isEmpty(ctx.elseif())){
            for(DragonLangParser.ElseifContext elseif : ctx.elseif()){
                property.set(elseif.ifBlockInKH(),IF_FULL_BODY_JUMP,jumpFullIfBody);
            }
        }
        if (ctx.otherelse()!=null){
            property.set(ctx.otherelse().ifBlockInKH(),IF_FULL_BODY_JUMP,jumpFullIfBody);
            property.set(ctx.otherelse().ifBlockInKH(),NOT_ELSE_IF_BLOCK);
        }
    }

    @Override
    public void exitIfexpr(DragonLangParser.IfexprContext ctx) {
        isUnderIFExpr = false;
        //设置整个IF跳出地址
        JUMP jump = (JUMP) property.get(ctx, IF_FULL_BODY_JUMP);
        jump.setAddress(currentAddress());
    }

    @Override
    public void enterIfBlockInKH(DragonLangParser.IfBlockInKHContext ctx) {
        //如果是else if 就不需要搞JUMP_IF_NOT了
        if (!property.getBoolean(ctx,NOT_ELSE_IF_BLOCK)) {
            JUMP_IF_NOT jumpIfNot = new JUMP_IF_NOT();
            add(jumpIfNot, ctx);
            property.set(ctx, IF_NEXT_EXPR_JUMP, jumpIfNot);
        }
        isUnderIFExpr = false;
    }

    @Override
    public void exitIfBlockInKH(DragonLangParser.IfBlockInKHContext ctx) {
        if (!property.getBoolean(ctx,NOT_ELSE_IF_BLOCK)) {
            JUMP jumpFullIfBody = (JUMP) property.get(ctx, IF_FULL_BODY_JUMP);
            add(jumpFullIfBody, ctx);

            JUMP_IF_NOT jumpIfNot = (JUMP_IF_NOT) property.get(ctx, IF_NEXT_EXPR_JUMP);
            jumpIfNot.setAddress(currentAddress());
        }
        isUnderIFExpr = true;
    }

    @Override public void enterElseif(DragonLangParser.ElseifContext ctx) {}
    @Override public void exitElseif(DragonLangParser.ElseifContext ctx) {}
    @Override public void enterOtherelse(DragonLangParser.OtherelseContext ctx) {}
    @Override public void exitOtherelse(DragonLangParser.OtherelseContext ctx) {}
    @Override public void visitTerminal(TerminalNode terminalNode) {}

    /////////////////////////////////////////////////
    void 循环管理_标签(){};
    /////////////////////////////////////////////////

    @Override
    public void enterLineLoop(DragonLangParser.LineLoopContext ctx) {
        if (((ctx.loopInit()!=null)&&(ctx.loopIncrease()==null))
                ||((ctx.loopInit()==null)&&(ctx.loopIncrease()!=null))){
            script(ctx).throwException("循环初始化体和累加体必须同时存在或者同时不存在");
        }

        LOOP_PUSH loopPush = new LOOP_PUSH();
        property.set(ctx.loopBlock (),LOOP_JUMP_OPCODE,loopPush);//循环整体break和contiue入栈命令
        //整个循环先压入break,continue,和flag三个值入栈
        add(loopPush,ctx);

        JUMP_IF_NOT breakJump = new JUMP_IF_NOT();
        property.set(ctx.loopBlock(),LOOP_BREAK_JUMP,breakJump); //循环体记录跳出地址
        property.set(ctx.loopJudge (),LOOP_BREAK_JUMP,breakJump); //判断题根据判断结果决定跳出循环体

        if (ctx.loopInit()!=null){
            JUMP judgeJump = new JUMP();
            property.set(ctx.loopJudge(),LOOP_JUDGE_JUMP,judgeJump); //判断体入口地址
            property.set(ctx.loopIncrease(),LOOP_JUDGE_JUMP,judgeJump);  //累加体结束后跳入判断体

            JUMP bodyJump = new JUMP();
            property.set(ctx.loopJudge(),LOOP_BODY_JUMP,bodyJump); //判断失败后进入循环执行体
            property.set(ctx.loopBlock(),LOOP_BODY_JUMP,bodyJump); //记录循环执行体入口

            property.set(ctx.loopIncrease(),LOOP_JUMP_OPCODE,loopPush);//循环整体break和contiue入栈命令
        }else{
            property.set(ctx.loopJudge(),LOOP_JUMP_OPCODE,loopPush);//循环整体break和contiue入栈命令
        }
    }
    @Override
    public void exitLineLoop(DragonLangParser.LineLoopContext ctx) {
        //弹出最初入栈的三个值
        add(new LOOP_POP(),ctx);
    }

    @Override public void enterLoopInit(DragonLangParser.LoopInitContext ctx) { }
    @Override
    public void exitLoopInit(DragonLangParser.LoopInitContext ctx) {
        //抛弃初始化入栈值
        add(new POP(),ctx);
    }
    @Override
    public void enterLoopJudge(DragonLangParser.LoopJudgeContext ctx) {
        int address = currentAddress();
        JUMP judgeJump = (JUMP) property.get(ctx,LOOP_JUDGE_JUMP);
        if (judgeJump!=null) judgeJump.setAddress(address);
        LOOP_PUSH loopPush = (LOOP_PUSH)property.get(ctx,LOOP_JUMP_OPCODE);
        if (loopPush!=null) loopPush.setContinueAddress(address);
    }
    @Override
    public void exitLoopJudge(DragonLangParser.LoopJudgeContext ctx) {
        JUMP_IF_NOT jumpIfNot = (JUMP_IF_NOT) property.get(ctx,LOOP_BREAK_JUMP);
        add(jumpIfNot,ctx);
        JUMP bodyJump = (JUMP) property.get(ctx,LOOP_BODY_JUMP);
        if (bodyJump!=null){
            add(bodyJump,ctx);
        }
    }
    @Override
    public void enterLoopIncrease(DragonLangParser.LoopIncreaseContext ctx) {
        LOOP_PUSH loopPush = (LOOP_PUSH)property.get(ctx,LOOP_JUMP_OPCODE);
        loopPush.setContinueAddress(currentAddress());
    }
    @Override
    public void exitLoopIncrease(DragonLangParser.LoopIncreaseContext ctx) {
        add(new POP(),ctx);//抛弃累加表达式入栈值

        JUMP judgeJump = (JUMP) property.get(ctx,LOOP_JUDGE_JUMP);
        add(judgeJump,ctx);
    }
    @Override
    public void enterLoopBlock(DragonLangParser.LoopBlockContext ctx) {
        JUMP bodyJump = (JUMP) property.get(ctx,LOOP_BODY_JUMP);
        if (bodyJump!=null){
            bodyJump.setAddress(currentAddress());
        }
    }
    @Override
    public void exitLoopBlock(DragonLangParser.LoopBlockContext ctx) {
        //整块结尾的时候自动continue
        add(new LOOP_JUMP(false),ctx);

        int address = currentAddress();
        JUMP_IF_NOT jumpIfNot = (JUMP_IF_NOT) property.get(ctx,LOOP_BREAK_JUMP);
        jumpIfNot.setAddress(address);
        LOOP_PUSH loopPush = (LOOP_PUSH)property.get(ctx,LOOP_JUMP_OPCODE);
        loopPush.setBreakAddress(address);
    }

    @Override public void enterLineContinue(DragonLangParser.LineContinueContext ctx) {}
    @Override
    public void exitLineContinue(DragonLangParser.LineContinueContext ctx) {
        add(new LOOP_JUMP(false),ctx);
    }
    @Override public void enterLineBreak(DragonLangParser.LineBreakContext ctx) {}
    @Override
    public void exitLineBreak(DragonLangParser.LineBreakContext ctx) {
        add(new LOOP_JUMP(true),ctx);
    }


    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }

}
