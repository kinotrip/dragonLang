package dragonLang.opcode;

import dragonLang.Context;
import dragonLang.OPCode;
import dragonLang.Value;

/**
 * Created by Administrator on 2017/4/29.
 */
public class LOOP_POP extends OPCode {
    @Override
    public boolean process(Context context) {
        Value flag = context.stackValueFromTop(1);
        if (flag!=Value.loopFlagValue){
            script.throwException("并未处于循环体内");
        }
        context.pop();
        context.pop();
        context.pop();
        return false;
    }
}
