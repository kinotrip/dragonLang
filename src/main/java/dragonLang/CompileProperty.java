package dragonLang;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/4/22.
 */
public class CompileProperty {

    static public final String ASSIGN_VAR = "ASSIGN_VAR";
    static public final String FUNCTION = "FUNCTION";
    static public final String ASSIGN_VAR_LOAD = "ASSIGN_VAR_LOAD";
    static public final String IF_FULL_BODY_JUMP = "IF_FULL_BODY_JUMP";
    static public final String IF_NEXT_EXPR_JUMP = "IF_NEXT_EXPR_JUMP";
    static public final String NOT_ELSE_IF_BLOCK = "NOT_ELSE_IF_BLOCK";
    static public final String DEFINE_CLASS = "DEFINE_CLASS";

    static public final String LOOP_BREAK_JUMP = "LOOP_BREAK_JUMP";
    static public final String LOOP_JUDGE_JUMP = "LOOP_JUDGE_JUMP";
    static public final String LOOP_BODY_JUMP = "LOOP_BODY_JUMP";
    static public final String LOOP_JUMP_OPCODE = "LOOP_JUMP_OPCODE";

    static public final String IS_ARROW_CALL = "IS_ARROW_CALL";

    final Map<ParserRuleContext,Map<String,Object>> contextMap = new HashMap<>();

    public void set(ParserRuleContext ctx,String symbol){
        set(ctx,symbol,Boolean.TRUE);
    }
    public void set(ParserRuleContext ctx,String symbol,Object value){
        Map<String,Object> container = contextMap.get(ctx);
        if (container==null){
            container = new HashMap<>();
            contextMap.put(ctx,container);
        }
        container.put(symbol,value);
    }

    public Object get(ParserRuleContext ctx,String symbol){
        Map<String,Object> container = contextMap.get(ctx);
        if (container==null){
            return null;
        }
        return container.get(symbol);
    }

    public boolean getBoolean(ParserRuleContext ctx,String symbol){
        Object result = get(ctx,symbol);
        return result != null;
    }

}
