package dragonLang.opcode;

import dragonLang.Context;
import dragonLang.OPCode;

/**
 * Created by Administrator on 2017/4/27.
 */
public class JUMP extends OPCode {

    int address = -1;
    public void setAddress(int address){
        if (this.address!=-1){
            throw new RuntimeException("跳转地址不可重复指定");
        }
        this.address = address;
    }

    @Override
    public boolean process(Context context) {
        if (address == -1){
            script.throwException("未指定跳转地址");
        }
        context.currentLayer().jumpTo(address);
        return false;
    }
}
