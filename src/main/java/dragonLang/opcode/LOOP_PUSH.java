package dragonLang.opcode;

import dragonLang.Context;
import dragonLang.OPCode;
import dragonLang.Value;

/**
 * Created by Administrator on 2017/4/29.
 */
public class LOOP_PUSH extends OPCode {

    Value breakAddress = null;
    Value continueAddress = null;

    public void setBreakAddress(int breakAddress) {
        if (this.breakAddress!=null){
            script.throwException("跳出地址仅可设置一次");
        }
        this.breakAddress = Value.create(breakAddress);
    }

    public void setContinueAddress(int continueAddress) {
        if (this.continueAddress!=null){
            script.throwException("跳过地址仅可设置一次");
        }
        this.continueAddress = Value.create(continueAddress);
    }

    @Override
    public boolean process(Context context) {
        context.push(breakAddress);
        context.push(continueAddress);
        context.push(Value.loopFlagValue);
        return false;
    }
}
