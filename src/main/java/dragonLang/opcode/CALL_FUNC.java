package dragonLang.opcode;

import dragonLang.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

/**
 * Created by Administrator on 2017/4/23.
 */
public class CALL_FUNC extends OPCode {

    final boolean isArrowCall;
    public CALL_FUNC(boolean isArrowCall){
        this.isArrowCall = isArrowCall;
    }


    @Override
    public boolean process(Context context) {
        //目前从栈顶开始：参数个数，若干参数，函数/类定义
        Value paramCountValue = context.pop();
        if (paramCountValue.getType()!=Value.INT){
            script.throwException("栈内的参数个数无效");
        }
        int paramCount = paramCountValue.getIntPure();
        Value functionValue = context.stackValueFromTop(1+paramCount);
        if (functionValue.getType()== Value.FUNCTION){
            if (NativeFunction.isNativeFunction(functionValue)){
                return callNativeFunction(context, (NativeFunction) functionValue,paramCount);
            }

            Function function = functionValue.getFunctionValue();
            context.callFunction(function,script,functionValue.getName());

            //将参数压入新的调用层
            for(int i=0;i<paramCount;i++){
                Value p = context.pop();
                context.currentLayer().params.push(p);
            }
            //弹出函数本身
            context.pop();

            //箭头函数弹出第一个参数
            if (isArrowCall){
                Value p = context.pop();
                context.currentLayer().params.push(p);
            }

            //设置this指针，如果有的话
            context.currentLayer().thisPoint = functionValue.getFunctionValue().thisPoint;

        }else if(functionValue.getType()==Value.CLASS){
            createInstance(context,functionValue,paramCount);
        }else{
            script.throwException("被调用的并非函数或类型初始化"+functionValue.shortInfo());
        }
        return false;
    }

    public boolean  callNativeFunction(Context context,NativeFunction nativeFunction,int paramCount){

        //收集参数
        ArrayList<Value> params = new ArrayList<>();
        for(int i=0;i<paramCount;i++){
            params.add(0,context.pop());
        }

        //弹出函数本体
        context.pop();

        //箭头函数弹出第一个参数
        if (isArrowCall){
            params.add(0,context.pop());
        }

        Value result = nativeFunction.process(params,null,context,script);
        if (result!=null){
            //压入返回值
            context.push(result);
            return false;
        }else{
            return true;//等待函数返回
        }
    }

    public void createInstance(Context context,Value classValue,int paramCount){

        Map<Symbol,Value> clazz =  classValue.getObjectValue();

        Value initFunction = clazz.get(Symbol.initSymbol);
        if (initFunction == null){
            initFunction = clazz.get(Symbol.initSymbol2);
        }

        //判断是否原生的初始化方法
        if ((initFunction !=null)&&NativeFunction.isNativeFunction(initFunction)){
            callNativeFunction(context,(NativeFunction)initFunction,paramCount);
            return;
        }

        Value instanceValue = Value.createObject();
        Map<Symbol,Value> instance = instanceValue.getObjectValue();
        instance.put(Symbol.prototype,classValue);

        for(Map.Entry<Symbol,Value> e : clazz.entrySet()){
            if (e.getValue().getType() != Value.FUNCTION ){
                instance.put(e.getKey(),e.getValue().cloneIfArrayOrObject());
            }
        }
        if (initFunction == null){
            for(int i=0;i<paramCount;i++){
                context.pop();//弹出参数
            }
            //弹出类定义本身
            context.pop();
            //压入类实例
            context.push(instanceValue);
//            System.out.println("新建类实例");
        }else{ //跳转至初始化方法
            if (initFunction.getType()!=Value.FUNCTION){
                script.throwException("初始化并非可执行方法");
            }

            //上下文入栈
            context.callFunction(initFunction.getFunctionValue(),script,initFunction.getName());

            //将参数压入新的调用层
            for(int i=0;i<paramCount;i++){
                Value p = context.pop();
                //System.out.println(p.debugInfo());
                context.currentLayer().params.push(p);
            }
            //弹出类定义
            context.pop();
            //设置this指针，并强制返回this指针
            context.currentLayer().thisPoint = instanceValue;
            context.currentLayer().forceReturnThisPoint = true;
//            System.out.println("新建类实例，初始化方法跳转到" + context.address);
        }
    }
}
