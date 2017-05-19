package dragonLang.opcode;

import dragonLang.*;

import java.util.function.Consumer;

/**
 * Created by Administrator on 2017/4/24.
 */
public class SET_PARAM extends OPCode {
    final Function defaultExpr;
    public SET_PARAM(Function defaultExpr){
        this.defaultExpr = defaultExpr;
    }
    @Override
    public boolean process(Context context) {
        //这时上下文的参数栈里应该已经包含了所有参数
//        System.out.println("before params:");
//        context.currentLayer().params.forEach(new Consumer<Value>() {
//            @Override
//            public void accept(Value value) {
//                System.out.println(value.debugInfo());
//            }
//        });
//        System.out.println("before params===");
        if (!context.currentLayer().params.isEmpty()){
            context.push(context.currentLayer().params.pop());
        }else if (defaultExpr==null){
            script.throwException("提供的参数不足以调用函数，参数声明也未定义默认值");
        }else{
            //调用默认值表达式获取默认值
            context.callFunction(defaultExpr,null,"(参数默认值)");
        }
        return false;
    }
}
