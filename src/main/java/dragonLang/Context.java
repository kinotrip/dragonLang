package dragonLang;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Administrator on 2017/4/22.
 */
public class Context {
    public final Memory rootLayer;
    Memory currentLayer;
    public Memory currentLayer() {return currentLayer;}
    final Stack<Value> stack = new Stack<>();
    int callDeep = 0;

    public void push(Value value){
        if (value==null){
            throw new RuntimeException("can't push null value");
        }
        stack.push(value);
    }
    public Value pop(){
        return stack.pop();
    }

    public void printStack(){
        for(int i=stack.size()-1;i>=0;i--){
            System.out.println(stack.elementAt(i));
        }
    }
    /**
     * 1 is the first
     * @param index
     * @return
     */
    public Value stackValueFromTop(int index){
        return stack.elementAt(stack.size()-index);
    }

    public Context(){ //Function rootFunction
        rootLayer = new Memory();
        currentLayer = null;
//        currentLayer.opAddress = -1;//最初始无代码

        //初始化常量类型原型类，只应该在rootLayer里做这件事
        rootLayer.put(Value.INT_SYMBOL ,Value.createClass("整数"));
        rootLayer.put(Value.FLOAT_SYMBOL ,Value.createClass("小数"));
        rootLayer.put(Value.BOOLEAN_SYMBOL ,Value.createClass("是否"));
        rootLayer.put(Value.STRING_SYMBOL ,Value.createClass("字符串"));
        rootLayer.put(Value.NULL_SYMBOL ,Value.createClass("空值"));
//        rootLayer.put(Value.SYMBOL_SYMBOL ,Value.createClass());
        rootLayer.put(Value.OBJECT_SYMBOL ,Value.createClass("对象"));
        rootLayer.put(Value.ARRAY_SYMBOL ,Value.createClass("数组"));
        rootLayer.put(Value.FUNCTION_SYMBOL ,Value.createClass("函数"));
        rootLayer.put(Value.CLASS_SYMBOL ,Value.createClass("类定义"));
    }

    public boolean playFromRoot(Function function){
        if (currentLayer!=null){
            throw new RuntimeException("current layer not finished");
        }
        currentLayer = rootLayer;
        currentLayer.setFunction(function);
        return playNoLock(null);
    }


    public void callFunction(Function function,ScriptInfo callScript,Symbol funcSymbol){
        if (funcSymbol==null){
            callFunction(function,callScript,(String)null);
        }else {
            callFunction(function, callScript, funcSymbol.symbolName());
        }
    }
    public void callFunction(Function function,ScriptInfo callScript,String funcName){
        callDeep ++;
        if (callDeep>300){
            currentLayer().printCallStack();
            throw new RuntimeException("调用栈过深");
        }
        Memory newLayer = new Memory(function,currentLayer,callScript,funcName);
        currentLayer = newLayer;
        newLayer.opAddress = 0;//指向第一行代码
        //指定闭包上下文
        newLayer.closureContext = function.closureContext;
    }

    public void returnFunction(){
        currentLayer.clearFunction();
        currentLayer = currentLayer.parent;
        callDeep --;
    }

    public Value pushValue = null;



    AsyncTicket ticket = null;

    //true 表示中断在某处，false则正常结束
    boolean playNoLock(Memory quitLayer){
        if (ticket==null) {
            ticket = new AsyncTicket(this);//可以标志为正在执行状态，如果变成null就是执行完成状态了
        }
        do{
            OPCode code = currentLayer.nextOPCode();
            if(code==null){
                //非return，执行到尽头了，强制返回
                if (currentLayer.forceReturnThisPoint){
                    push(currentLayer.thisPoint);
                }else {
                    push(currentLayer.lastPOP);
                }
                returnFunction();
            }else{
                boolean result =code.process(this);
                if (result){
                    return true;
                }
            }
        }while(currentLayer!=quitLayer);
        ticket = null;//标志为已经执行完毕状态
        return false;
    }

    ///////////////////////////////////////////////
    //  以下是异步处理部分
    //////////////////////////////////////////////

    public boolean isFinished(){
        return ticket == null;
    }

    public static class ProcessFinished extends Exception{}
    public static class TicketExpired extends Exception {}

    public boolean play(AsyncTicket ticket , Value returnValue) throws ProcessFinished, TicketExpired {
        synchronized (rootLayer ){
            if (this.ticket==null){
                throw new ProcessFinished();
            }
            if (this.ticket != ticket){
                throw new TicketExpired();
            }
            //生成新的ticket,阻止其他并发的线程调用
            this.ticket = new AsyncTicket(this);
            //压入返回值
            push(returnValue);
            return  playNoLock(null);
        }
    }

    public AsyncTicket getTicket(){
        return ticket;
    }


    public Value callFunctionFromNative(Value function,Value[] params,Value thisValue, ScriptInfo script){
        if (function.getType()!=Value.FUNCTION ){
            script.throwException("回调对象必须是函数："+function.debugInfo(true));
        }
        if (!NativeFunction.isNativeFunction(function)){
            Memory returnLayer = currentLayer;
            callFunction(function.getFunctionValue(),null,(String)null);
            if (params!=null) {
                //最后的值最先push
                for (int i = params.length-1;i>=0;i--){
                    Value param = params[i];
                    currentLayer().params.push(param);
                }
            }
            currentLayer().thisPoint = thisValue;
            if (playNoLock(returnLayer)){//执行到返回当前上下文为止
                script.throwException("被本地函数回调时不可执行其他异步本地函数");
            }
            //获取返回值
            Value  result = pop();
            return result;
        }else{
            ArrayList<Value> _params = new ArrayList();
            if (_params!=null) {
                for (int i = 0; i < params.length; i++) {
                    _params.add(params[i]);
                }
            }
            Value result =((NativeFunction)function).process(_params,thisValue,this,script);
            if (result==null){
                script.throwException("被本地函数回调时不可执行其他异步本地函数");
            }
            return result;
        }
    }


    public Value getPrototypeClass(int type){
        switch(type){
            case Value.INT:
                return rootLayer.get(Value.INT_SYMBOL);
            case Value.FLOAT:
                return rootLayer.get(Value.FLOAT_SYMBOL);
            case Value.BOOLEAN:
                return rootLayer.get(Value.BOOLEAN_SYMBOL);
            case Value.STRING:
                return rootLayer.get(Value.STRING_SYMBOL);
            case Value.NULL:
                return rootLayer.get(Value.NULL_SYMBOL);
//            case Value.SYMBOL:
//                return rootLayer.get(Value.SYMBOL_SYMBOL);
            case Value.OBJECT:
                return rootLayer.get(Value.OBJECT_SYMBOL);
            case Value.ARRAY:
                return rootLayer.get(Value.ARRAY_SYMBOL);
            case Value.CLASS:
                return rootLayer.get(Value.CLASS_SYMBOL);
            case Value.FUNCTION:
                return rootLayer.get(Value.FUNCTION_SYMBOL);
        }
        throw new RuntimeException("not valid type:"+type);
    }

//    public void nativeGlobalFunction(String name, NativeFunction function){
//        rootLayer.put(Symbol.get(name),function);
//    }


    public void setGlobalValue(String name,Value value){
        rootLayer.put(Symbol.get(name),value);
    }

    //全部定义在rooyLayer
    public void nativeObjectFunction(int type,String name,NativeFunction function){
        Value clazz = getPrototypeClass(type);
        clazz.getObjectValue().put(Symbol.get(name),function);
    }

    public void nativeObjectFunctionForAll(String name,NativeFunction function){
        Symbol symbol = Symbol.get(name);
        getPrototypeClass(Value.INT).getObjectValue().put(symbol,function);
        getPrototypeClass(Value.FLOAT).getObjectValue().put(symbol,function);
        getPrototypeClass(Value.BOOLEAN).getObjectValue().put(symbol,function);
        getPrototypeClass(Value.STRING).getObjectValue().put(symbol,function);
        getPrototypeClass(Value.NULL).getObjectValue().put(symbol,function);
//        getPrototypeClass(Value.SYMBOL).getObjectValue().put(symbol,function);
        getPrototypeClass(Value.OBJECT).getObjectValue().put(symbol,function);
        getPrototypeClass(Value.ARRAY).getObjectValue().put(symbol,function);
        getPrototypeClass(Value.CLASS).getObjectValue().put(symbol,function);
        getPrototypeClass(Value.FUNCTION).getObjectValue().put(symbol,function);
    }

}
