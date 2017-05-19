package dragonLang;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/4/8.
 */
public class Symbol {


    private final static Map<String,WeakReference<Symbol>> all = new HashMap<>();

    public  final static Symbol nouseSymbol = Symbol.get("nouseSymbol");
    public  final static Symbol createSymbol= Symbol.get("create");
    public  final static Symbol createSymbol2= Symbol.get("新建");
    public  final static Symbol initSymbol= Symbol.get("init");
    public  final static Symbol initSymbol2= Symbol.get("初始化");
    public  final static Symbol prototype = Symbol.get("prototype");
    public  final static Symbol self = Symbol.get("self");
    public  final static Symbol self2 = Symbol.get("自我");

    public static Symbol get(String name){
        if (name==null){
            throw new RuntimeException("Symbol不可以空值为名");
        }
        WeakReference<Symbol> weakRef = all.get(name);
        Symbol result = null;
        if (weakRef == null){
            result = new Symbol(name);
            weakRef= new WeakReference<>(result);
            all.put(name,weakRef);
            return result;
        }
        result = weakRef.get();
        if (result==null){
            result = new Symbol(name);
            weakRef= new WeakReference<>(result);
            all.put(name,weakRef);
        }
        return result;
    }

    Value symbolValue = null;
    public Value asValue(){
        if (symbolValue==null){
            symbolValue = Value.create(this);
        }
        return symbolValue;
    }

    public static void gc(){
        for(Map.Entry<String,WeakReference<Symbol>> e : all.entrySet()){
            if (e.getValue().get()==null){
                all.remove(e.getKey());
            }
        }
    }

    String name;
    private Symbol(String name){
        this.name = name;
    }
    public String symbolName(){return name;}
}
