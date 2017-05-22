package dragonLang;

/**
 * Created by julien on 2017/5/19.
 */
public class Main {
    public static void main( String[] args) throws Exception
    {
        Context context = new Context();
//        String script = "￥测试 = {}\n￥测试。属性 = 12345\n￥测试【“属性”】"; //"1+2*3"
        String script =
                "减二（数字）{\n 数字-2 \n}\n" +
                "乘以（数字，乘数）{\n  数字*乘数 \n}\n" +
                "测试 = 24 >> 减二 》 乘以（4）\n" +
                "测试2  = 减二:测试\n" +
                "测试2";
        context.playFromRoot(Function.fromScriptContent("test.txt",script));
        context.printStack();
    }
}
