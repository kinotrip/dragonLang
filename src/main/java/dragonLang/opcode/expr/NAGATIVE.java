package dragonLang.opcode.expr;

import dragonLang.Context;
import dragonLang.OPCode;
import dragonLang.Value;

/**
 * Created by Administrator on 2017/4/26.
 */
public class NAGATIVE extends OPCode {
    @Override
    public boolean process(Context context) {
        Value v = context.pop();
        if (v.getType()==Value.INT){
            context.push(Value.create(-v.getIntValue()));
        }else if (v.getType()==Value.FLOAT){
            context.push(Value.create(-v.getFloatValue()));
        }else{
            script.throwException("无法获取负数值："+v.shortInfo());
        }
        return false;
    }
}
