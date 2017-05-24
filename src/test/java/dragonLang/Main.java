package dragonLang;

/**
 * Created by julien on 2017/5/19.
 */
public class Main {
    public static void main( String[] args) throws Exception
    {
        Context context = new Context();
        String script =
                "测试{\n 问好（）{\n返回 @你好\n} \n}\n" +
                "实例=测试（）。问好（）";
        context.playFromRoot(Function.fromScriptContent("test.txt",script));
        context.printStack();
    }
}
