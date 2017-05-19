package dragonLang.opcode;

import dragonLang.*;

/**
 * Created by Administrator on 2017/4/24.
 */
public class LOAD extends OPCode {
    boolean valueMustExists;
    boolean keepObjectAndSymbol;
    public LOAD(boolean valueMustExists,boolean keepObjectAndSymbol){
        this.valueMustExists = valueMustExists;
        this.keepObjectAndSymbol = keepObjectAndSymbol;
    }

    @Override
    public boolean process(Context context) {
        Value object;
        Value symbolValue;
        if (!keepObjectAndSymbol){
            symbolValue = context.pop();
            object = context.pop();
        }else{
            symbolValue = context.stackValueFromTop(1);
            object = context.stackValueFromTop(2);
        }
        Symbol symbol = null;
        Value value = null;

        if (object == Value.currentContext){
            symbol = checkSymbolValue(symbolValue);

            //判断该值是来自于哪里，当前上下文，闭包上下文，全局地址，还是this指针
            //显示指定当前对象本体的情形
            //System.out.println("判断路径");
            if ((symbol== Symbol.self)||(symbol==Symbol.self2)){
                //System.out.println("this指针");
                value = context.currentLayer().thisPoint;
                if (value==null){
                    script.throwException("在没有类实例的上下文中用self或者自我来访问当前类实例");
                }
            }else {
                //一般情况优先尝试从当前上下文获取
                value = context.currentLayer().get(symbol);
                //System.out.println("当前："+symbol.symbolName()+" - "+(value==null?"null":value.shortInfo()));
            }

            //从闭包上下文寻找
            if (value==null){
                Memory current = context.currentLayer();
                while((value==null) &&  (current.closureContext!=null)){
                    current = current.closureContext;
                    value = current.get(symbol);
                }
            }

            //从当前指针寻找
            if ((value==null)&&(context.currentLayer().thisPoint!=null)){
                object = context.currentLayer().thisPoint;
                if ((object!=null)&&(object.getType()==Value.OBJECT)){
                    value = getValueFromObject(object,symbol);
                }
            }

            if (value==null){
                value = context.rootLayer.get(symbol);
            }
        }else if (object == Value.globalContext) {
            symbol = checkSymbolValue(symbolValue);
            value = context.rootLayer.get(symbol);
        }else if ((object.getType()== Value.OBJECT)||(object==Value.thisPointContext)){
            symbol = checkSymbolValue(symbolValue);
            if (object==Value.thisPointContext){
                object = context.currentLayer().thisPoint;
                if (object==null){
                    script.throwException("在没有类实例的上下文中用.符号访问当前类实例");
                }
            }
            value = getValueFromObject(object,symbol);
        }else if (object.getType()== Value.CLASS){
            symbol = checkSymbolValue(symbolValue);
            value = object.getObjectValue().get(symbol);
        }else if ((object.getType()==Value.ARRAY)&&(symbolValue.getType()==Value.INT)){
//            if (symbolValue.getType()!=Value.INT){
//                script.throwException("从数组取值，索引无效："+symbolValue.shortInfo());
//                value = null;
//            }
            int index = (int) symbolValue.getIntValue();
            if ((index<0)||(index>=object.getArrayValue().size())){
                script.throwException("从数组取值，索引越界："+object.shortInfo()+"[" +symbolValue.shortInfo()+"]");
                value = null;
            }
            value = object.getArrayValue().get(index);
        }

        if ((value==null)&&(object.getType()!=Value.SYMBOL)){ //剔除所有context
            //尝试从原型类提取方法
            Value prototypeClass = context.getPrototypeClass(object.getType());
            if (symbol==null){
                symbol = checkSymbolValue(symbolValue);
            }
            Value prototypeTarget = prototypeClass.getObjectValue().get(symbol);
            if ((prototypeTarget!=null)&&(prototypeTarget.getType()==Value.FUNCTION)){
                //绑定this指针
                if (!NativeFunction.isNativeFunction(prototypeTarget)){
                    value = Value.create(new Function(object,prototypeTarget.getFunctionValue()));
                    value.setName(prototypeTarget.getName());
                }else{
                    value = ((NativeFunction)prototypeTarget).bindThisValue(object);
                }
            }
        }

        if (value==null){
            if (object.getType()==Value.ARRAY){
                script.throwException("从数组取值，索引无效："+symbolValue.shortInfo());
            }
            if (valueMustExists){
                script.throwException("属性不存在于对象中："+object.shortInfo() +"["+symbolValue.shortInfo()+"]");
            }else{
                value = Value.nullValue;
            }
        }
        context.push(value);
        //System.out.println("取值"+value.shortInfo());
        return false;
    }

    public Symbol checkSymbolValue(Value symbolValue){
        Symbol symbol;
        if (symbolValue.getType() == Value.STRING){
            symbol = Symbol.get(symbolValue.getStringValue());
        }else if (symbolValue.getType()!=Value.SYMBOL){
            script.throwException("从对象取值，属性无效："+symbolValue.shortInfo());
            symbol = Symbol.nouseSymbol;
        }else {
            symbol = symbolValue.getSymbolValue();
        }
        return symbol;
    }

    Value getValueFromObject(Value object,Symbol symbol){
        Value classValue = object.getObjectValue().get(Symbol.prototype);
        Value value;
        if (classValue!=null){
            value = classValue.getObjectValue().get(symbol);
            if (value!=null){
                if (value.getType() != Value.FUNCTION) {
                    value = null;
                }
            }
            if (value==null){
                value = object.getObjectValue().get(symbol);
            }
            //替换为绑定This指针的函数
            if ((value!=null)&&(value.getType()==Value.FUNCTION)){
                if (!NativeFunction.isNativeFunction(value)) {
                    value = Value.create(new Function(object, value.getFunctionValue()));
                }else{
                    value = ((NativeFunction)value).bindThisValue(object);
                }
            }
        }else{
            value = object.getObjectValue().get(symbol);
        }
        return value;
    }
}
