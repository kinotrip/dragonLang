package dragonLang.opcode;

import dragonLang.Context;
import dragonLang.OPCode;
import dragonLang.Value;

/**
 * Created by Administrator on 2017/4/22.
 */
public class PUSH extends OPCode {

    final Value value;

    public PUSH(Value value){
        if (value!=null) {
            if ((value.getType() >= Value.OBJECT) && (value.getType() != Value.FUNCTION)) {
                script.throwException("不应压入复杂对象值");
            }
        }
        this.value = value;
    }

    @Override
    public boolean process(Context context) {
        if (value!=null) {
            context.push(value);
        }else{
            context.push(context.pushValue);
            context.pushValue = null;
        }
        return false;
    }
}
