package dragonLang.opcode;

import dragonLang.Context;
import dragonLang.OPCode;
import dragonLang.Value;

/**
 * Created by Administrator on 2017/4/29.
 */
public class BIND_CLOSURE extends OPCode {
    @Override
    public boolean process(Context context) {
        Value func = context.stackValueFromTop(1);
        if (func.getType()!=Value.FUNCTION){
            script.throwException("栈顶的值并非函数值！");
        }
//        if (context.currentLayer()!=context.rootLayer){
            func.getFunctionValue().setClosureContext(context.currentLayer());
//        }
        return false;
    }
}
