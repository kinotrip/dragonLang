package dragonLang.opcode.expr;

import dragonLang.Value;

/**
 * Created by Administrator on 2017/4/26.
 */
public class IS_EQUAL extends TwoValueBase {

    @Override
    protected String calcName() {
        return "==";
    }

    @Override
    protected Value intVSint(long i1, long i2) {
        return Value.create( i1==i2 );
    }

    @Override
    protected Value intVSfloat(long i1, double f2) {
        return Value.create( numberIsSmall( (double)i1 - f2) );
    }

    @Override
    protected Value floatVSint(double f1, long i2) {
        return Value.create( numberIsSmall( f1 - (double)i2) );
    }

    @Override
    protected Value floatVSfloat(double f1, double f2) {
        return Value.create( numberIsSmall( f1 - f2) );
    }

    @Override
    protected boolean sameOtherTypeOrNull() {
        return true;
    }

    @Override
    protected Value sameOtherType(Value v1, Value v2) {
        if (v1.getType()==Value.BOOLEAN){
            return Value.create( v1.getBooleanValue() == v2.getBooleanValue() );
        }if (v1.getType()==Value.STRING){
            return Value.create( v1.getStringValue().equals(v2.getStringValue()) );
        }else return Value.create( v1.getRawObject() == v2.getRawObject() );
    }

    @Override
    protected Value v1VSnull(Value v1) {
        return Value.create( v1.getType() == Value.NULL);
    }

    @Override
    protected Value nullVSv2(Value v2) {
        return Value.create( v2.getType() == Value.NULL);
    }
}
