package dragonLang.opcode.expr;

import dragonLang.Value;

/**
 * Created by Administrator on 2017/4/26.
 */
public class OR extends TwoValueBase {
    @Override
    protected String calcName() {
        return "或";
    }

    @Override
    protected boolean booleanOnly() {
        return true;
    }

    @Override
    protected Value boolVSbool(boolean b1, boolean b2) {
        return Value.create(b1||b2);
    }
}
