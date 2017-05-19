package dragonLang.opcode;

import dragonLang.Context;
import dragonLang.OPCode;
import dragonLang.Value;

/**
 * Created by Administrator on 2017/4/27.
 */
public class JUMP_IF_NOT extends OPCode {
    int address = -1;
    public void setAddress(int address){
        if (this.address!=-1){
            throw new RuntimeException("跳转地址不可重复指定");
        }
        this.address = address;
    }
    @Override
    public boolean process(Context context) {
        Value judge = context.pop();
        if (judge.getType()!=Value.BOOLEAN){
            script.throwException("条件判断返回值并非布尔变量:"+judge);
        }
        if (!judge.getBooleanValue()){
            if (address == -1){
                script.throwException("未设置跳转值");
            }
            context.currentLayer().jumpTo(address);
        }
        return false;
    }
}
