package dragonLang.opcode.expr;

import dragonLang.Context;
import dragonLang.OPCode;
import dragonLang.Value;

/**
 * Created by Administrator on 2017/4/26.
 */
public class NOT extends OPCode {
    @Override
    public boolean process(Context context) {
        Value v = context.pop();
        if (v.getType()==Value.BOOLEAN){
            context.push(Value.create(!v.getBooleanValue()));
        }else{
            script.throwException("该变量无法取非操作："+v.shortInfo());
        }
        return false;
    }
}
