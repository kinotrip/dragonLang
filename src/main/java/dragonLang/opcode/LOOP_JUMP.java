package dragonLang.opcode;

import dragonLang.Context;
import dragonLang.OPCode;
import dragonLang.Value;

/**
 * Created by Administrator on 2017/4/29.
 */
public class LOOP_JUMP extends OPCode {

    final boolean isBreak;
    //默认为
    public LOOP_JUMP(boolean isBreak){
        this.isBreak = isBreak;
    }

    @Override
    public boolean process(Context context) {
        Value flag = context.stackValueFromTop(1);
        if (flag!=Value.loopFlagValue){
             script.throwException("并未处于循环体内");
        }
        //-3:breakAddress,-2:continueAddress,-1:loopFlagValue
        if (isBreak){
            context.currentLayer().jumpTo(context.stackValueFromTop(3).getIntPure());
        }else{
            context.currentLayer().jumpTo(context.stackValueFromTop(2).getIntPure());
        }
        return false;
    }
}
