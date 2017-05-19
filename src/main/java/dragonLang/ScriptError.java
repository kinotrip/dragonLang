package dragonLang;

/**
 * Created by Administrator on 2017/4/22.
 */
public class ScriptError extends RuntimeException {
    ScriptInfo script;
    public ScriptInfo getScript(){return script ;}
    public ScriptError(String message,ScriptInfo scriptInfo){
        super(message);
        script = scriptInfo;
    }
}
