package dragonLang;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/4/29.
 */
public abstract class NativeFunction extends Value {

    static final double nativeFlag = -123456.78;

    static public boolean isNativeFunction(Value function){
        return (function.getType()==Value.FUNCTION)&&(function.getFloatValue()==nativeFlag);
    }

    public NativeFunction(){
        this.type = FUNCTION;
        this.intValue = -1;
        this.floatValue = nativeFlag;
    }

    private NativeFunction(Value thisValue){
        this.type = FUNCTION;
        this.intValue = -1;
        this.floatValue = nativeFlag;
        this.object = thisValue;
    }

    public abstract Value process(ArrayList<Value> params,Value thisValue, Context context, ScriptInfo scriptInfo);

    public NativeFunction bindThisValue(Value  thisValue){
        NativeFunction outer = this;//闭包少绑一个值
        return new NativeFunction(thisValue) {
            @Override
            public Value process(ArrayList<Value> params, Value thisValue, Context context, ScriptInfo scriptInfo) {
                return outer.process(params,(Value)this.object,context,scriptInfo);
            }
        };
    }
}
