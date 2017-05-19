package dragonLang;

/**
 * Created by Administrator on 2017/5/1.
 */
public class AsyncTicket {
    final Context context ;
    public AsyncTicket(Context context){
        this.context  = context;
    }
    public void resume(Value result) throws Context.ProcessFinished, Context.TicketExpired {
        context.play(this,result);
    }
}
