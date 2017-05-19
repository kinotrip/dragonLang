package dragonLang;

import dragonLang.generated.DragonLangParser;
import dragonLang.opcode.ASSIGN;
import dragonLang.opcode.POP;
import dragonLang.opcode.PUSH;
import dragonLang.opcode.SET_PARAM;
import org.antlr.v4.runtime.ParserRuleContext;

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

}
