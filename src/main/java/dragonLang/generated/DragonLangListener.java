// Generated from /Users/julien/IdeaProjects/dragonLang/src/main/resources/DragonLang.g4 by ANTLR 4.7
package dragonLang.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DragonLangParser}.
 */
public interface DragonLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DragonLangParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(DragonLangParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link DragonLangParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(DragonLangParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lineExpr}
	 * labeled alternative in {@link DragonLangParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLineExpr(DragonLangParser.LineExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lineExpr}
	 * labeled alternative in {@link DragonLangParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLineExpr(DragonLangParser.LineExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lineReturn}
	 * labeled alternative in {@link DragonLangParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLineReturn(DragonLangParser.LineReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lineReturn}
	 * labeled alternative in {@link DragonLangParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLineReturn(DragonLangParser.LineReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lineFunc}
	 * labeled alternative in {@link DragonLangParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLineFunc(DragonLangParser.LineFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lineFunc}
	 * labeled alternative in {@link DragonLangParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLineFunc(DragonLangParser.LineFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lineIf}
	 * labeled alternative in {@link DragonLangParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLineIf(DragonLangParser.LineIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lineIf}
	 * labeled alternative in {@link DragonLangParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLineIf(DragonLangParser.LineIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lineClass}
	 * labeled alternative in {@link DragonLangParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLineClass(DragonLangParser.LineClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lineClass}
	 * labeled alternative in {@link DragonLangParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLineClass(DragonLangParser.LineClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lineLoop}
	 * labeled alternative in {@link DragonLangParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLineLoop(DragonLangParser.LineLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lineLoop}
	 * labeled alternative in {@link DragonLangParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLineLoop(DragonLangParser.LineLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lineContinue}
	 * labeled alternative in {@link DragonLangParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLineContinue(DragonLangParser.LineContinueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lineContinue}
	 * labeled alternative in {@link DragonLangParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLineContinue(DragonLangParser.LineContinueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lineBreak}
	 * labeled alternative in {@link DragonLangParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLineBreak(DragonLangParser.LineBreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lineBreak}
	 * labeled alternative in {@link DragonLangParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLineBreak(DragonLangParser.LineBreakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lineRawCall}
	 * labeled alternative in {@link DragonLangParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLineRawCall(DragonLangParser.LineRawCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lineRawCall}
	 * labeled alternative in {@link DragonLangParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLineRawCall(DragonLangParser.LineRawCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lineArrow}
	 * labeled alternative in {@link DragonLangParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLineArrow(DragonLangParser.LineArrowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lineArrow}
	 * labeled alternative in {@link DragonLangParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLineArrow(DragonLangParser.LineArrowContext ctx);
	/**
	 * Enter a parse tree produced by {@link DragonLangParser#loopInit}.
	 * @param ctx the parse tree
	 */
	void enterLoopInit(DragonLangParser.LoopInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DragonLangParser#loopInit}.
	 * @param ctx the parse tree
	 */
	void exitLoopInit(DragonLangParser.LoopInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DragonLangParser#loopJudge}.
	 * @param ctx the parse tree
	 */
	void enterLoopJudge(DragonLangParser.LoopJudgeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DragonLangParser#loopJudge}.
	 * @param ctx the parse tree
	 */
	void exitLoopJudge(DragonLangParser.LoopJudgeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DragonLangParser#loopIncrease}.
	 * @param ctx the parse tree
	 */
	void enterLoopIncrease(DragonLangParser.LoopIncreaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DragonLangParser#loopIncrease}.
	 * @param ctx the parse tree
	 */
	void exitLoopIncrease(DragonLangParser.LoopIncreaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DragonLangParser#loopBlock}.
	 * @param ctx the parse tree
	 */
	void enterLoopBlock(DragonLangParser.LoopBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DragonLangParser#loopBlock}.
	 * @param ctx the parse tree
	 */
	void exitLoopBlock(DragonLangParser.LoopBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DragonLangParser#callParam}.
	 * @param ctx the parse tree
	 */
	void enterCallParam(DragonLangParser.CallParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link DragonLangParser#callParam}.
	 * @param ctx the parse tree
	 */
	void exitCallParam(DragonLangParser.CallParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link DragonLangParser#callBody}.
	 * @param ctx the parse tree
	 */
	void enterCallBody(DragonLangParser.CallBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DragonLangParser#callBody}.
	 * @param ctx the parse tree
	 */
	void exitCallBody(DragonLangParser.CallBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DragonLangParser#arrowPart}.
	 * @param ctx the parse tree
	 */
	void enterArrowPart(DragonLangParser.ArrowPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link DragonLangParser#arrowPart}.
	 * @param ctx the parse tree
	 */
	void exitArrowPart(DragonLangParser.ArrowPartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprAndSub}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAndSub(DragonLangParser.ExprAndSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAndSub}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAndSub(DragonLangParser.ExprAndSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprMinusOne}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMinusOne(DragonLangParser.ExprMinusOneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprMinusOne}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMinusOne(DragonLangParser.ExprMinusOneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprGreaterThan}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprGreaterThan(DragonLangParser.ExprGreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprGreaterThan}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprGreaterThan(DragonLangParser.ExprGreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprMulDivRmd}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMulDivRmd(DragonLangParser.ExprMulDivRmdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprMulDivRmd}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMulDivRmd(DragonLangParser.ExprMulDivRmdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprVar}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprVar(DragonLangParser.ExprVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprVar}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprVar(DragonLangParser.ExprVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprAddAssign}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAddAssign(DragonLangParser.ExprAddAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAddAssign}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAddAssign(DragonLangParser.ExprAddAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprAssign}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAssign(DragonLangParser.ExprAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAssign}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAssign(DragonLangParser.ExprAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprNumber}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNumber(DragonLangParser.ExprNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprNumber}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNumber(DragonLangParser.ExprNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprNagative}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNagative(DragonLangParser.ExprNagativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprNagative}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNagative(DragonLangParser.ExprNagativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprNull}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNull(DragonLangParser.ExprNullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprNull}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNull(DragonLangParser.ExprNullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprOr}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprOr(DragonLangParser.ExprOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprOr}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprOr(DragonLangParser.ExprOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprSubtractAssign}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprSubtractAssign(DragonLangParser.ExprSubtractAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprSubtractAssign}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprSubtractAssign(DragonLangParser.ExprSubtractAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprAnd}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAnd(DragonLangParser.ExprAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAnd}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAnd(DragonLangParser.ExprAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprEqualEqual}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprEqualEqual(DragonLangParser.ExprEqualEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprEqualEqual}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprEqualEqual(DragonLangParser.ExprEqualEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprGreaterEqual}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprGreaterEqual(DragonLangParser.ExprGreaterEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprGreaterEqual}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprGreaterEqual(DragonLangParser.ExprGreaterEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprAddSubtract}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSubtract(DragonLangParser.ExprAddSubtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAddSubtract}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSubtract(DragonLangParser.ExprAddSubtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprLessThan}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprLessThan(DragonLangParser.ExprLessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprLessThan}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprLessThan(DragonLangParser.ExprLessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprFunction}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprFunction(DragonLangParser.ExprFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprFunction}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprFunction(DragonLangParser.ExprFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprNot}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNot(DragonLangParser.ExprNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprNot}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNot(DragonLangParser.ExprNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprObject}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprObject(DragonLangParser.ExprObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprObject}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprObject(DragonLangParser.ExprObjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprLessEqual}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprLessEqual(DragonLangParser.ExprLessEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprLessEqual}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprLessEqual(DragonLangParser.ExprLessEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprTrue}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprTrue(DragonLangParser.ExprTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprTrue}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprTrue(DragonLangParser.ExprTrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprNotEqual}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNotEqual(DragonLangParser.ExprNotEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprNotEqual}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNotEqual(DragonLangParser.ExprNotEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprBracket}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprBracket(DragonLangParser.ExprBracketContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBracket}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprBracket(DragonLangParser.ExprBracketContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprCall}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprCall(DragonLangParser.ExprCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprCall}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprCall(DragonLangParser.ExprCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprPlusOne}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPlusOne(DragonLangParser.ExprPlusOneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprPlusOne}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPlusOne(DragonLangParser.ExprPlusOneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprString}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprString(DragonLangParser.ExprStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprString}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprString(DragonLangParser.ExprStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprFalse}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprFalse(DragonLangParser.ExprFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprFalse}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprFalse(DragonLangParser.ExprFalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprArray}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprArray(DragonLangParser.ExprArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprArray}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprArray(DragonLangParser.ExprArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link DragonLangParser#otherExpr}.
	 * @param ctx the parse tree
	 */
	void enterOtherExpr(DragonLangParser.OtherExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DragonLangParser#otherExpr}.
	 * @param ctx the parse tree
	 */
	void exitOtherExpr(DragonLangParser.OtherExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DragonLangParser#ifexpr}.
	 * @param ctx the parse tree
	 */
	void enterIfexpr(DragonLangParser.IfexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DragonLangParser#ifexpr}.
	 * @param ctx the parse tree
	 */
	void exitIfexpr(DragonLangParser.IfexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DragonLangParser#elseif}.
	 * @param ctx the parse tree
	 */
	void enterElseif(DragonLangParser.ElseifContext ctx);
	/**
	 * Exit a parse tree produced by {@link DragonLangParser#elseif}.
	 * @param ctx the parse tree
	 */
	void exitElseif(DragonLangParser.ElseifContext ctx);
	/**
	 * Enter a parse tree produced by {@link DragonLangParser#otherelse}.
	 * @param ctx the parse tree
	 */
	void enterOtherelse(DragonLangParser.OtherelseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DragonLangParser#otherelse}.
	 * @param ctx the parse tree
	 */
	void exitOtherelse(DragonLangParser.OtherelseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DragonLangParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(DragonLangParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DragonLangParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(DragonLangParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DragonLangParser#ifBlockInKH}.
	 * @param ctx the parse tree
	 */
	void enterIfBlockInKH(DragonLangParser.IfBlockInKHContext ctx);
	/**
	 * Exit a parse tree produced by {@link DragonLangParser#ifBlockInKH}.
	 * @param ctx the parse tree
	 */
	void exitIfBlockInKH(DragonLangParser.IfBlockInKHContext ctx);
	/**
	 * Enter a parse tree produced by {@link DragonLangParser#blockInKH}.
	 * @param ctx the parse tree
	 */
	void enterBlockInKH(DragonLangParser.BlockInKHContext ctx);
	/**
	 * Exit a parse tree produced by {@link DragonLangParser#blockInKH}.
	 * @param ctx the parse tree
	 */
	void exitBlockInKH(DragonLangParser.BlockInKHContext ctx);
	/**
	 * Enter a parse tree produced by {@link DragonLangParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(DragonLangParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DragonLangParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(DragonLangParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DragonLangParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(DragonLangParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link DragonLangParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(DragonLangParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link DragonLangParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(DragonLangParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link DragonLangParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(DragonLangParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link DragonLangParser#arraySub}.
	 * @param ctx the parse tree
	 */
	void enterArraySub(DragonLangParser.ArraySubContext ctx);
	/**
	 * Exit a parse tree produced by {@link DragonLangParser#arraySub}.
	 * @param ctx the parse tree
	 */
	void exitArraySub(DragonLangParser.ArraySubContext ctx);
	/**
	 * Enter a parse tree produced by {@link DragonLangParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(DragonLangParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link DragonLangParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(DragonLangParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link DragonLangParser#objectSub}.
	 * @param ctx the parse tree
	 */
	void enterObjectSub(DragonLangParser.ObjectSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link DragonLangParser#objectSub}.
	 * @param ctx the parse tree
	 */
	void exitObjectSub(DragonLangParser.ObjectSubContext ctx);
	/**
	 * Enter a parse tree produced by {@link DragonLangParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(DragonLangParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link DragonLangParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(DragonLangParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link DragonLangParser#objectFunc}.
	 * @param ctx the parse tree
	 */
	void enterObjectFunc(DragonLangParser.ObjectFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link DragonLangParser#objectFunc}.
	 * @param ctx the parse tree
	 */
	void exitObjectFunc(DragonLangParser.ObjectFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link DragonLangParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(DragonLangParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link DragonLangParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(DragonLangParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varPoint}
	 * labeled alternative in {@link DragonLangParser#varGetter}.
	 * @param ctx the parse tree
	 */
	void enterVarPoint(DragonLangParser.VarPointContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varPoint}
	 * labeled alternative in {@link DragonLangParser#varGetter}.
	 * @param ctx the parse tree
	 */
	void exitVarPoint(DragonLangParser.VarPointContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varIndex}
	 * labeled alternative in {@link DragonLangParser#varGetter}.
	 * @param ctx the parse tree
	 */
	void enterVarIndex(DragonLangParser.VarIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varIndex}
	 * labeled alternative in {@link DragonLangParser#varGetter}.
	 * @param ctx the parse tree
	 */
	void exitVarIndex(DragonLangParser.VarIndexContext ctx);
}