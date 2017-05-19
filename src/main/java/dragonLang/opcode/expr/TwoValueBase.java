package dragonLang.opcode.expr;

import dragonLang.Context;
import dragonLang.OPCode;
import dragonLang.Value;
import static dragonLang.Value.*;
/**
 * Created by Administrator on 2017/4/26.
 */
public class TwoValueBase extends OPCode {

//1. 所有类型之间都可以判断相等或者不等
//2. 如果是字符串，字符串可以和其他值相加
//3. 所有String类型的处理应该单独计算
//4. Float和Int可以作数学运算，bool之间可以做布尔运算
//
//+ INT和FLOAT,此外String可以和所有值进行计算
//- 只有INT和FLOAT
//* 只有INT和FLOAT
/// 只有INT和FLOAT
//% 只有INT和FLOAT
//
//-(负数）只有INT或FLOAT
//
//> INT和FLOAT,STRING和SYMBOL内部，此外所有类型都可以和NULL进行计算
//>=INT和FLOAT,STRING和SYMBOL内部，此外所有类型都可以和NULL进行计算
//            < INT和FLOAT,STRING和SYMBOL内部，此外所有类型都可以和NULL进行计算
//<=INT和FLOAT,STRING和SYMBOL内部，此外所有类型都可以和NULL进行计算
//
//!= INT和FLOAT,所有同类型内部，此外所有类型都可以和NULL进行计算
//== INT和FLOAT,所有同类型内部，此外所有类型都可以和NULL进行计算
//
//
//|| 仅BOOL
//&& 仅BOOL
//!  仅BOOL

    @Override
    public boolean process(Context context) {
        Value v2 = context.pop();
        Value v1 = context.pop();
        int type1 = v1.getType();
        int type2 = v2.getType();
        if (!booleanOnly()){
            if ((type1<=FLOAT)&&(type2<=FLOAT)){
                Value result = null;
                //整数之间运算
                if (type1==INT){
                    if (type2==INT){
                        result = intVSint(v1.getIntValue(),v2.getIntValue());
                    }else{
                        result = intVSfloat(v1.getIntValue(),v2.getFloatValue());
                    }
                }else{
                    if (type2==INT){
                        result = floatVSint(v1.getFloatValue(),v2.getIntValue());
                    }else{
                        result = floatVSfloat(v1.getFloatValue(),v2.getFloatValue());
                    }
                }
                context.push(result);
                return false;
            }else if (sameOtherTypeOrNull()){
                Value result = Value.nullValue;
                if (type1==type2){
                    result = sameOtherType(v1,v2);
                }else if (type2==NULL){
                    result = v1VSnull(v1);
                }else if (type1==NULL){
                    result = nullVSv2(v2);
                }else{
                    throwError(v1,v2);
                }
                context.push(result);
                return false;
            }else if (stringOrSymbolOrNull()){
                Value result = Value.nullValue;
                if (type1==STRING){
                    if (type2==STRING){
                        result = sameOtherType(v1,v2);
                    }else if (type2==NULL){
                        result = v1VSnull(v1);
                    }else{
                        throwError(v1,v2);
                    }
                }else if (type1==SYMBOL){
                    if (type2==SYMBOL){
                        result = sameOtherType(v1,v2);
                    }else if (type2==NULL){
                        result = v1VSnull(v1);
                    }else{
                        throwError(v1,v2);
                    }
                }else if (type1==NULL){
                    if (type2==NULL){
                        result = sameOtherType(v1,v2);
                    }else if (type2==STRING){
                        result = nullVSv2(v2);
                    }else if (type2==SYMBOL){
                        result = nullVSv2(v2);
                    }else{
                        throwError(v1,v2);
                    }
                }
                context.push(result);
                return false;
            }else if (addFunction()){
                Value result = Value.nullValue;
                if (type1==STRING){
                    result = Value.create( v1.getStringValue()+v2.toString() );
                }else if (type2==STRING){
                    result = Value.create( v1.toString()+v2.getStringValue() );
                }else{
                    throwError(v1,v2);
                }
                context.push(result);
                return false;
            }else{
                throwError(v1,v2);
            }
        }else{
            if ((type1!=BOOLEAN)||(type2!=BOOLEAN)){
                throwError(v1,v2);
            }else{
                Value result = boolVSbool(v1.getBooleanValue(),v2.getBooleanValue());
                context.push(result);
                return false;
            }
        }
        return false;
    }

    protected void throwError(Value v1,Value v2){
        script.throwException("无效的计算："+v1.shortInfo()+" "+calcName()+" "+v2.shortInfo());
    }

    protected String calcName(){
        throw new RuntimeException("not support!");
    }

    /**
     * 是否只允许布尔变量之间运算
     * @return
     */
    protected boolean booleanOnly(){
        return false;
    }

    protected Value intVSint(long i1,long i2){
        throw new RuntimeException("not support!");
    }
    protected Value intVSfloat(long i1,double f2){
        throw new RuntimeException("not support!");
    }
    protected Value floatVSint(double f1,long i2){
        throw new RuntimeException("not support!");
    }
    protected Value floatVSfloat(double f1,double f2){
        throw new RuntimeException("not support!");
    }
    protected Value boolVSbool(boolean b1,boolean b2){
        throw new RuntimeException("not support!");
    }

    protected boolean sameOtherTypeOrNull(){
        return false;
    }
    protected boolean stringOrSymbolOrNull(){
        return false;
    }

    protected Value sameOtherType(Value v1,Value v2){
        throw new RuntimeException("not support!");
    }
    protected Value v1VSnull(Value v1){
        throw new RuntimeException("not support!");
    }
    protected Value nullVSv2(Value v2){
        throw new RuntimeException("not support!");
    }
    protected boolean addFunction(){
        return false;
    }

    static boolean numberIsSmall(double v){
        return Math.abs(v) <0.0000000000001;
    }
    static Value numberToValue(double v){
        double roundv = Math.round(v);
        if (numberIsSmall(v - roundv)){
            return Value.create((long)roundv);
        }
        return Value.create(v);
    }
}
