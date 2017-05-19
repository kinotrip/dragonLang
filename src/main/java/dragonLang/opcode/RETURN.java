package dragonLang.opcode;

import dragonLang.Context;
import dragonLang.OPCode;

/**
 * Created by Administrator on 2017/4/22.
 */
public class RETURN extends OPCode {
    final boolean withResultValue;
    public RETURN(boolean withResultValue){
        this.withResultValue = withResultValue;
    }
    @Override
    public boolean process(Context context) {
        if (!context.currentLayer().forceReturnThisPoint) {
            if (!withResultValue) {
                context.push(context.currentLayer().getLastPOP());
            }
        }else{
            context.push(context.currentLayer().thisPoint);
        }
        context.returnFunction();
        return false;
    }
}
