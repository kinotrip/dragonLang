package dragonLang.opcode.expr;

import dragonLang.Value;

/**
 * Created by Administrator on 2017/4/26.
 */
public class SUBTRACT extends TwoValueBase {
    @Override
    protected String calcName() {
        return "-";
    }

    @Override
    protected Value intVSint(long i1, long i2) {
        return Value.create(i1 - i2);
    }

    @Override
    protected Value intVSfloat(long i1, double f2) {
        return numberToValue((double)i1 - f2);
    }

    @Override
    protected Value floatVSint(double f1, long i2) {
        return numberToValue(f1 - (double) i2);
    }

    @Override
    protected Value floatVSfloat(double f1, double f2) {
        return numberToValue(f1 - f2);
    }
}
