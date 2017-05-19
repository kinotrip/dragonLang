package dragonLang;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/4/22.
 */
public class Value {
    public static final int INT = 100;
    public static final int FLOAT = 200;
    public static final int BOOLEAN = 300;
    public static final int STRING = 400;

    public static final int NULL = 500;
    public static final int SYMBOL = 600;
    public static final int OBJECT = 700;
    public static final int ARRAY  = 800;
    public static final int FUNCTION = 10000;
    public static final int CLASS = 10100;

    static public final Value nullValue = new Value();
    static public final Value currentContext = Value.create(Symbol.get("currentContext"));
    static public final Value globalContext = Value.create(Symbol.get("globalContext"));
    static public final Value thisPointContext = Value.create(Symbol.get("thisPointContext"));

    static public final Value trueValue = Value.createBoolean(true);
    static public final Value falseValue = Value.createBoolean(false);
    static public final Value loopFlagValue = falseValue.createSymbol("loopFlagValue");

    public static final Symbol INT_SYMBOL = Symbol.get("INT");
    public static final Symbol FLOAT_SYMBOL = Symbol.get("FLOAT");
    public static final Symbol BOOLEAN_SYMBOL = Symbol.get("BOOLEAN");
    public static final Symbol STRING_SYMBOL = Symbol.get("STRING");
    public static final Symbol NULL_SYMBOL = Symbol.get("NULL");
//    public static final Symbol SYMBOL_SYMBOL = Symbol.get("SYMBOL");
    public static final Symbol OBJECT_SYMBOL = Symbol.get("OBJECT");
    public static final Symbol ARRAY_SYMBOL = Symbol.get("ARRAY");
    public static final Symbol FUNCTION_SYMBOL = Symbol.get("FUNCTION");
    public static final Symbol CLASS_SYMBOL = Symbol.get("CLASS");

    //第一次赋值时候的变量名符号
    Symbol name = null;
    protected int type = NULL;
    protected long intValue = 0;
    protected double floatValue = 0;
    protected Object object = null;

    public int  getType() {
        return type;
    }

    public Symbol getName() {
        return name;
    }

    public void setName(Symbol name) {
        this.name = name;
    }

    static public Value create(long value){
        Value result = new Value();
        result.type = INT;
        result.intValue = value;
        return result;
    }

    public long getIntValue(){
        return intValue;
    }

    public int getIntPure(){
        return (int) intValue;
    }

    static public Value create(float value){
        Value result = new Value();
        result.type = FLOAT;
        result.floatValue = value;
        return result;
    }

    static public Value create(double value){
        Value result = new Value();
        result.type = FLOAT;
        result.floatValue = value;
        return result;
    }

    public double getFloatValue(){
        return floatValue;
    }

    static public Value create(Symbol symbol){
        Value result = new Value();
        result.type = SYMBOL;
        result.object= symbol;
        return result;
    }

    public Symbol getSymbolValue(){
        return (Symbol)object;
    }

    static public Value createSymbol(String key){
        Value result = new Value();
        result.type = SYMBOL;
        result.object= Symbol.get(key);
        return result;
    }

    static public Value create(String staringValue){
        Value result = new Value();
        result.type = STRING;
        result.object= staringValue;
        return result;
    }

    public String getStringValue(){
        return (String)object;
    }

    static Value createBoolean(boolean booleanValue){
        Value result = new Value();
        result.type = BOOLEAN;
        result.intValue = booleanValue ? 1 : 0;
        return result;
    }
    static public Value create(boolean booleanValue){
        return booleanValue ? trueValue : falseValue;
    }


    public boolean getBooleanValue(){
        return intValue!=0 ;
    }

    static public Value createObject(){
        Value result = new Value();
        result.type = OBJECT;
        result.object = new HashMap();
        return result;
    }

    static public Value createObject(Map<Symbol,Value> target){
        Value result = new Value();
        result.type = OBJECT;
        result.object = target;
        return result;
    }

    public HashMap<Symbol,Value> getObjectValue(){
        return (HashMap<Symbol,Value>) object;
    }

    static public Value createArray(){
        Value result = new Value();
        result.type = ARRAY;
        result.object = new ArrayList<>();
        return result;
    }

    public ArrayList<Value> getArrayValue() {return (ArrayList<Value>) object;}


//    static public Value create(){
//        Value result = new Value();
//        result.type = FUNCTION;
//        result.object = new Function();
//        return result;
//    }
    static public Value create(Function function){
        Value result = new Value();
        result.type = FUNCTION;
        result.object = function;
        return result;
    }


    public Function getFunctionValue(){
        return (Function) object;
    }

    public Object getRawObject() { return object;}

    static public Value createClass(){
        Value result = new Value();
        result.type = CLASS;
        result.object = new HashMap();
        return result;
    }
    static public Value createClass(String name){
        Value result = new Value();
        result.type = CLASS;
        result.object = new HashMap();
        result.setName(Symbol.get(name));
        return result;
    }


    public String debugInfo(boolean shortString) {
        String typeName;
        String valueStr;
        char left = '<';
        char right = '>';
        switch(type){
            case NULL:
                typeName = "空值";
                valueStr = "null";
                break;
            case INT :
                typeName = "整数";
                valueStr = String.valueOf(intValue);
                break;
            case FLOAT :
                typeName = "分数";
                valueStr = String.valueOf(floatValue);
                break;
            case SYMBOL :
                typeName = "符号";
                valueStr = ((Symbol) object).name;
                break;
            case STRING :
                typeName = "字符串";
                valueStr = (String) object;
                break;
            case BOOLEAN :
                typeName = "布尔";
                valueStr = intValue == 0 ? "否" : "是";
                break;
            case OBJECT :
                typeName = "对象";
                left = '{';
                right = '}';
                Map<Symbol,Value> map = (Map<Symbol,Value>)object;
                if (shortString) {
                    valueStr = map.size() + "成员";
                }
                else {
                    StringBuilder _valueStr = new StringBuilder();
                    for (Map.Entry<Symbol, Value> e : map.entrySet()) {
                        if (_valueStr.length() > 0) {
                            _valueStr.append(",");
                        }
                        _valueStr.append(e.getKey().name).append(" : ").append(e.getValue().debugInfo(false));
                    }
                    valueStr = _valueStr.toString();
                }
                break;
            case ARRAY :
                typeName = "";
                left = '[';
                right = ']';
                List<Value> list = (List<Value>)object;
                if (shortString) {
                    valueStr = list.size() + "成员";
                }else {
                    StringBuilder _valueStr = new StringBuilder();
                    for (Value v : list) {
                        if (_valueStr.length() > 0) {
                            _valueStr.append(",");
                        }
                        _valueStr.append(v.debugInfo(false));
                    }
                    valueStr = _valueStr.toString();
                }
                break;
            case FUNCTION:
                typeName = "函数";
                valueStr = (name==null)?"(函数)":name.name;
                break;
            case CLASS:
                if (name!=null) {
                    typeName = name.name;
                }else{
                    typeName = "匿名类";
                }
                left = '{';
                right = '}';
                valueStr = "(类定义)";
                break;
            default:
                typeName = "未知";
                valueStr = "type=" + type;
        }

        return left+" "+ (typeName.length()>0?(typeName+":"):"") + " "+valueStr+" "+right;
    }

    @Override
    public String toString() {
        switch(type) {
            case NULL:
                return "<空>";
            case INT :
                return String.valueOf(intValue);
            case FLOAT:
                return String.valueOf(floatValue);
            case SYMBOL:
                return ((Symbol)object).name;
            case STRING:
                return (String)object;
            case BOOLEAN:
                return intValue == 0 ? "否" : "是";
            case OBJECT:
                return "{ 对象 }";
            case ARRAY:
                return "[ 数组 ]";
            case FUNCTION:
                return "( 函数:"+ ((name==null)?"匿名":name.name )+" )";
            case CLASS:
                return "{ 类定义:"+((name==null)?"匿名":name.name )+" )";
        }
        return "??未知对象??";
    }

    public String shortInfo() {
        return debugInfo(true);
    }
    public String debugInfo(){
        return debugInfo(false);
    }

    public Value cloneIfArrayOrObject(){
        if (type == ARRAY){
            List<Value> list = getArrayValue();
            Value newInstance = Value.createArray();
            for(Value v : list){
                newInstance.getArrayValue().add(v.cloneIfArrayOrObject());
            }
            return newInstance;
        }else if (type== OBJECT){
            Map<Symbol,Value> m = getObjectValue();
            Value newInstance = Value.createObject();
            for(Map.Entry<Symbol,Value> e : m.entrySet()){
                newInstance.getObjectValue().put(e.getKey(),e.getValue().cloneIfArrayOrObject());
            }
            newInstance.setName(name);
            return newInstance;
        }else return this;
    }

}
