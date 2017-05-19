package dragonLang.opcode.expr;

import dragonLang.Value;

/**
 * Created by Administrator on 2017/4/26.
 */
public class LESS_THAN extends TwoValueBase {
    @Override
    protected String calcName() {
        return "<";
    }

    @Override
    protected Value intVSint(long i1, long i2) {
        return Value.create(i1<i2);
    }

    @Override
    protected Value intVSfloat(long i1, double f2) {
        return Value.create( ((double)i1<f2) && (! numberIsSmall((double)i1 - f2)) );
    }

    @Override
    protected Value floatVSint(double f1, long i2) {
        return Value.create( (f1 < (double)i2) && (! numberIsSmall(f1 - (double)i2)) );
    }

    @Override
    protected Value floatVSfloat(double f1, double f2) {
        return Value.create((f1 < f2) && (! numberIsSmall(f1-f2)));
    }

    @Override
    protected boolean stringOrSymbolOrNull() {
        return true;
    }

    @Override
    protected Value sameOtherType(Value v1, Value v2) {
        if (v1.getType()==Value.STRING){
            return Value.create( v1.getStringValue().compareTo(v2.getStringValue()) <0  );
        }else if (v1.getType() == Value.SYMBOL){
            return Value.create( v1.getSymbolValue().symbolName().compareTo(v1.getSymbolValue().symbolName()) <0 );
        }else if (v1.getType() == Value.NULL){
            return Value.trueValue;
        }else{
            script.throwException("无法对这两个类型进行比较！");
        }
        return null;
    }

    @Override
    protected Value v1VSnull(Value v1) {
        return Value.falseValue;
    }

    @Override
    protected Value nullVSv2(Value v2) {
        return Value.trueValue;
    }
}
