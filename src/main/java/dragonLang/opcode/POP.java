package dragonLang.opcode;

import dragonLang.Context;
import dragonLang.OPCode;
import dragonLang.Value;

/**
 * Created by Administrator on 2017/4/22.
 */
public class POP extends OPCode {
    @Override
    public boolean process(Context context) {
        Value value = context.pop();
        context.currentLayer().setLastPOP(value);
        return false;
    }
}
