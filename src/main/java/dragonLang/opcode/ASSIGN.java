package dragonLang.opcode;

import dragonLang.*;

import java.util.Map;

/**
 * Created by Administrator on 2017/4/23.
 */
public class ASSIGN extends OPCode {

    final boolean  forceCurrentContext;
    final boolean keepObject;
    public ASSIGN(boolean keepObject,boolean  forceCurrentContext){
        this.keepObject = keepObject;
        this.forceCurrentContext = forceCurrentContext;
    }
    public boolean isKeepObject(){
        return keepObject;
    }

    @Override
    public boolean process(Context context) {
        Value value = context.pop();
        Value symbolValue = context.pop();
        Value object;
        if (keepObject) {
            object = context.stackValueFromTop(1);//只有需要替换值的才需要POP
        }else{
            object = context.pop();
            context.pushValue = value;
        }

        //System.out.println("键："+symbolValue +"   值："+value.debugInfo());

        Symbol symbol = null;
        Memory currentContext = context.currentLayer();
        if (object == Value.currentContext){

            //在当前域和闭包域里寻找已有值，如果都没有则定为当前域
            Memory target = null;
            symbol = checkSymbolValue(symbolValue);

            if (forceCurrentContext||currentContext.exists(symbol)){
                target = currentContext;
            }

            if (target==null){
                Memory current = currentContext;
                while((target==null)&&(current.closureContext!=null)){
                    current = current.closureContext;
                    if (current.exists(symbol)){
                        target = current;
                    }
                }
            }

            boolean putToThisPoint = false;
            if ((target==null)&&(currentContext.thisPoint!=null)&&(currentContext.thisPoint.getType()==Value.OBJECT)){ //在this指针里找对应值
                Value  maybe = currentContext.thisPoint.getObjectValue().get(symbol);
                if (maybe==null){
                    maybe = currentContext.thisPoint.getObjectValue().get(Symbol.prototype).getObjectValue().get(symbol);
                }
                //非函数不可覆盖函数
                if ((maybe!=null)&&(!((maybe.getType()==Value.FUNCTION)&&(value.getType()!=Value.FUNCTION)))){
                    putToThisPoint = true;
                }
            }
            //PUT操作
            if (putToThisPoint){
                currentContext.thisPoint.getObjectValue().put(symbol,value);
            }else {
                if (target == null) {
                    target = context.currentLayer();
                }
                target.put(symbol, value);
            }
        }else if (object == Value.globalContext){
            symbol = checkSymbolValue(symbolValue);
            context.rootLayer.put(symbol,value);
        }else if (object == Value.thisPointContext){
            object = currentContext.thisPoint;
            if (object==null){
                script.throwException("在没有类实例的上下文中用.符号访问当前类实例");
            }
            symbol = checkSymbolValue(symbolValue);
            object.getObjectValue().put(symbol,value);
        }else if (object.getType()== Value.OBJECT){
            symbol = checkSymbolValue(symbolValue);
            object.getObjectValue().put(symbol,value);
        }else if (object.getType()== Value.CLASS){
            symbol = checkSymbolValue(symbolValue);
            object.getObjectValue().put(symbol,value);
            this.checkClassAssign(object.getObjectValue(),symbol,value);
        }else if (object.getType()== Value.ARRAY){
            if (symbolValue == Value.nullValue){
                //变成插入
                object.getArrayValue().add(value);
            }else {
                if (symbolValue.getType() != Value.INT) {
                    script.throwException("向数组赋值，索引无效：" + symbolValue.shortInfo());
                }
                int index = (int) symbolValue.getIntValue();
                if ((index < 0) || (index >= object.getArrayValue().size())) {
                    script.throwException("向数组赋值，索引越界：" + object.shortInfo()+"["+ symbolValue.shortInfo()+"]");
                }
                object.getArrayValue().set(index, value);
            }
        }else {
            script.throwException("向并非对象或数组的值进行赋值："+object.shortInfo()+"["+ symbolValue.shortInfo()+"]");
        }
        if ((value.getName() == null)&&(symbol!=null)){
            value.setName(symbol);
        }

        return false;
    }

    //检查用于赋值的属性字段合法
    Symbol checkSymbolValue(Value symbolValue){
        Symbol symbol;
        if (symbolValue.getType() == Value.STRING){
            symbol = Symbol.get(symbolValue.getStringValue());
        }else if (symbolValue.getType()!=Value.SYMBOL){
            script.throwException("向对象赋值，属性无效："+symbolValue.shortInfo());
            symbol = Symbol.nouseSymbol;
        }else {
            symbol = symbolValue.getSymbolValue();
        }
        if (symbol == Symbol.prototype){
            script.throwException("请不要修改对象原型的值");
        }
        return symbol;
    }

    void checkClassAssign(Map<Symbol,Value> clazz, Symbol symbol, Value value){
        if ((symbol == Symbol.createSymbol)||(symbol == Symbol.createSymbol2)){
            script.throwException("不可在类定义中定义create或者“新建”方法");
        }
        if (clazz.containsKey(Symbol.initSymbol) && clazz.containsKey(Symbol.initSymbol2)){
            script.throwException("不可在类中定义两个初始化（init）方法");
        }
        if (value.getType() == Value.FUNCTION){//类成员函数不需要绑定闭包上下文
            value.getFunctionValue().setClosureContext(null);
        }
    }
}
