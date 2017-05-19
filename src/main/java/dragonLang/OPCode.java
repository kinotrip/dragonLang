package dragonLang;

/**
 * Created by Administrator on 2017/4/21.
 */
public abstract class OPCode {
    protected ScriptInfo script = null;

    public ScriptInfo getScript() {
        return script;
    }

    //返回true则暂停,否则返回false则继续
    abstract public boolean process(Context context);
}
