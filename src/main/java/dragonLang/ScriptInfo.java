package dragonLang;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

/**
 * Created by Administrator on 2017/4/21.
 */
public class ScriptInfo {

    String scriptName;
    int startLine = -1;
    int startCharOffset = -1;
    int stopLine = -1;
    int stopCharOffset = -1;

    //public ScriptInfo(){}
    public ScriptInfo(String scriptName,ParserRuleContext context){
        Token start = context.getStart();
        if (start!=null){
            startLine = start.getLine();
            startCharOffset = start.getCharPositionInLine();
        }
        Token stop = context.getStop();
        if (stop!=null){
            stopLine = stop.getLine();
            stopCharOffset = stop.getCharPositionInLine();
        }
        this.scriptName = scriptName;
    }

    public ScriptInfo(String scriptName,Token token){
        startLine = token.getLine();
        startCharOffset = token.getCharPositionInLine();
        stopLine = startLine;
        stopCharOffset = startCharOffset+1;
        this.scriptName = scriptName;
    }

    public void throwException(String info){
        throw new ScriptError(info,this);
    }

    /////////////////////////////////////////////////////
    // 以下是Getter
    /////////////////////////////////////////////////////


    public String getScriptName() {
        return scriptName;
    }

    public int getStartLine() {
        return startLine;
    }

    public int getStartCharOffset() {
        return startCharOffset;
    }

    public int getStopLine() {
        return stopLine;
    }

    public int getStopCharOffset() {
        return stopCharOffset;
    }
}
