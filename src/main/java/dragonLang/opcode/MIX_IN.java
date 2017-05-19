package dragonLang.opcode;

import dragonLang.Context;
import dragonLang.OPCode;
import dragonLang.Symbol;
import dragonLang.Value;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/5/4.
 */
public class MIX_IN extends OPCode {

    Symbol base;

    public MIX_IN(Symbol base){
        this.base = base;
    }

    @Override
    public boolean process(Context context) {
        Value current = context.stackValueFromTop(1);
        if (current.getType()!=Value.CLASS){
            script.throwException("当前对象并非类定义");
        }
        Value baseClass = context.rootLayer.get(base);
        if ((baseClass==null)||(baseClass.getType()!=Value.CLASS)){
            script.throwException("无效的基类:"+base.symbolName());
        }
        HashMap<Symbol,Value> currentObject = current.getObjectValue();
        //进行组合
        for(Map.Entry<Symbol,Value> e : baseClass.getObjectValue().entrySet()){
            Symbol symbol = e.getKey();
            if (currentObject.containsKey(symbol)){
                symbol = Symbol.get(base.symbolName()+"_"+symbol.symbolName());
            }
            currentObject.put(symbol,e.getValue().cloneIfArrayOrObject());
        }
        return false;
    }
}
