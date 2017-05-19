package dragonLang;

import dragonLang.generated.DragonLangLexer;
import dragonLang.generated.DragonLangParser;
import dragonLang.opcode.ASSIGN;
import dragonLang.opcode.POP;
import dragonLang.opcode.PUSH;
import dragonLang.opcode.SET_PARAM;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/4/22.
 */
public class Function {
    final List<OPCode> opcodeList;

    Memory closureContext = null;

    public void setClosureContext(Memory closureContext) {
        this.closureContext = closureContext;
    }

    public final Value thisPoint;
    public Function(){
        opcodeList = new ArrayList<>();
        thisPoint = null;
    }

    public Function(Value thisPoint,Function prototypeFunc){
        this.opcodeList = prototypeFunc.opcodeList;
        this.thisPoint = thisPoint;
    }


    public Function add(OPCode opcode, ScriptInfo scriptInfo){ //ParserRuleContext context
        opcode.script = scriptInfo;
        opcodeList.add(opcode);
        if (opcode instanceof ASSIGN){
            if (!((ASSIGN) opcode).isKeepObject()){
                //如果是普通赋值，加一句压入context.pushValue的代码
                opcodeList.add(new PUSH(null));
            }
        }
        return this;
    }

    public void defineParam(Symbol paramSymbol, Function defaultExpr, ScriptInfo scriptInfo){
        //每个参数都是函数初始化的一部分
        add(new PUSH(Value.currentContext),scriptInfo);
        add(new PUSH(paramSymbol.asValue()),scriptInfo);
        add(new SET_PARAM(defaultExpr),scriptInfo);
        add(new ASSIGN(false,true),scriptInfo);//强制将值放到当前上下文中
        add(new POP(),scriptInfo);
    }

    public void removeLastOP(){
        opcodeList.remove(opcodeList.size()-1);
    }


    static public Function fromScriptContent(String scriptName, String content){

        CharStream codeStream = CharStreams.fromString(content);

        DragonLangLexer lexer = new DragonLangLexer(codeStream);
        lexer.removeErrorListeners();
        lexer.addErrorListener(ThrowingErrorListener.INSTANCE);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DragonLangParser parser = new DragonLangParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(ThrowingErrorListener.INSTANCE);

        Compiler compiler = new Compiler(scriptName);
        ParseTree tree = parser.start();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(compiler, tree);

        return compiler.getFunction();
    }

}
