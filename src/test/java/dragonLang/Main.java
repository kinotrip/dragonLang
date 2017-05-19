package dragonLang;

/**
 * Created by julien on 2017/5/19.
 */
public class Main {
    public static void main( String[] args) throws Exception
    {
        Context context = new Context();
        context.playFromRoot(Function.fromScriptContent("test.txt"
                ,"1+2*3"));
        context.printStack();
    }
}
