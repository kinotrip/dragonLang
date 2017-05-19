package dragonLang;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * Created by Administrator on 2017/4/22.
 */
public class Memory {
    final Map<Symbol,Value> values = new HashMap<>();
    final Function function;
    final Memory parent;
    final ScriptInfo callScript;
    final String callFuncName;
    int opAddress = -1;
    public void jumpTo(int newAddress){
        opAddress = newAddress;
    }

    public OPCode nextOPCode(){
        if (opAddress<0){
            return null;
        }
        List<OPCode> list = function.opcodeList;
        if (opAddress>=list.size()){
            return null;
        }
        OPCode result = function.opcodeList.get(opAddress);
        opAddress += 1;
        return result;
    }

    Value lastPOP = Value.nullValue;
    public final Stack<Value> params = new Stack<>();

    public Value getLastPOP() {
        return lastPOP;
    }

    public void setLastPOP(Value lastPOP) {
        if (lastPOP==null){
            throw new RuntimeException("last pop can't be null");
        }
        this.lastPOP = lastPOP;
    }

    public void put(Symbol symbol,Value value){
        values.put(symbol,value);
    }

    public Value get(Symbol symbol){
        return values.get(symbol);
    }

    public boolean exists(Symbol symbol){
        return values.containsKey(symbol);
    }

    public Memory closureContext = null;
    public Value thisPoint = null;

    Memory(Function function, Memory parent,ScriptInfo callScript,String callFuncName){
        this.function = function;
        this.parent = parent;
        this.callScript = callScript;
        this.callFuncName = callFuncName;
    }
    Memory(Function function){
        this.function = function;
        this.parent = null;
        this.callScript = null;
        this.callFuncName = null;
    }

    public void printCallStack(){
        if (this.parent==null){
            return;
        }
        if (this.callScript!=null) {
            String funcName = callFuncName;
            if (funcName==null){
                funcName ="(匿名)";
            }
            System.out.println(String.format("%s(%s:%d-%d)", callFuncName, callScript.getScriptName(), callScript.getStartLine(), callScript.getStopLine()));
        }
        this.parent.printCallStack();
    }

    public boolean forceReturnThisPoint = false;
}
