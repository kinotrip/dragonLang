package dragonLang.opcode;

import dragonLang.Context;
import dragonLang.OPCode;
import dragonLang.Value;

/**
 * Created by Administrator on 2017/4/29.
 */
public class NEW_OBJECT extends OPCode {

    final boolean isClass;
    final boolean isArray;
    public NEW_OBJECT(boolean isClass,boolean isArray){
        this.isClass = isClass;
        this.isArray = isArray;
        if (isArray&&isClass){
            throw new RuntimeException("can't be class and array same time!");
        }
    }

    @Override
    public boolean process(Context context) {
        Value value;
        if (!isClass) {
            value = isArray ? Value.createArray() : Value.createObject();
        }else{
            value = Value.createClass();
        }
        context.push(value);
        return false;
    }
}
