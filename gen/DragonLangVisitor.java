// Generated from /Users/julien/IdeaProjects/dragonLang/src/main/resources/DragonLang.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DragonLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DragonLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DragonLangParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(DragonLangParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lineExpr}
	 * labeled alternative in {@link DragonLangParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineExpr(DragonLangParser.LineExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lineReturn}
	 * labeled alternative in {@link DragonLangParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineReturn(DragonLangParser.LineReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lineFunc}
	 * labeled alternative in {@link DragonLangParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineFunc(DragonLangParser.LineFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lineIf}
	 * labeled alternative in {@link DragonLangParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineIf(DragonLangParser.LineIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lineClass}
	 * labeled alternative in {@link DragonLangParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineClass(DragonLangParser.LineClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lineLoop}
	 * labeled alternative in {@link DragonLangParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineLoop(DragonLangParser.LineLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lineContinue}
	 * labeled alternative in {@link DragonLangParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineContinue(DragonLangParser.LineContinueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lineBreak}
	 * labeled alternative in {@link DragonLangParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineBreak(DragonLangParser.LineBreakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lineRawCall}
	 * labeled alternative in {@link DragonLangParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineRawCall(DragonLangParser.LineRawCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link DragonLangParser#loopInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopInit(DragonLangParser.LoopInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link DragonLangParser#loopJudge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopJudge(DragonLangParser.LoopJudgeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DragonLangParser#loopIncrease}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopIncrease(DragonLangParser.LoopIncreaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DragonLangParser#loopBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopBlock(DragonLangParser.LoopBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DragonLangParser#callParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallParam(DragonLangParser.CallParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link DragonLangParser#callBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallBody(DragonLangParser.CallBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAndSub}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAndSub(DragonLangParser.ExprAndSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprMinusOne}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMinusOne(DragonLangParser.ExprMinusOneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprGreaterThan}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprGreaterThan(DragonLangParser.ExprGreaterThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprMulDivRmd}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMulDivRmd(DragonLangParser.ExprMulDivRmdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprVar}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprVar(DragonLangParser.ExprVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAddAssign}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAddAssign(DragonLangParser.ExprAddAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAssign}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAssign(DragonLangParser.ExprAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprNumber}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNumber(DragonLangParser.ExprNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprNagative}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNagative(DragonLangParser.ExprNagativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprNull}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNull(DragonLangParser.ExprNullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprOr}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOr(DragonLangParser.ExprOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprSubtractAssign}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSubtractAssign(DragonLangParser.ExprSubtractAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAnd}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAnd(DragonLangParser.ExprAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprEqualEqual}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEqualEqual(DragonLangParser.ExprEqualEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprGreaterEqual}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprGreaterEqual(DragonLangParser.ExprGreaterEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAddSubtract}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAddSubtract(DragonLangParser.ExprAddSubtractContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprLessThan}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLessThan(DragonLangParser.ExprLessThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprFunction}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFunction(DragonLangParser.ExprFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprNot}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNot(DragonLangParser.ExprNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprObject}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprObject(DragonLangParser.ExprObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprLessEqual}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLessEqual(DragonLangParser.ExprLessEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprTrue}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprTrue(DragonLangParser.ExprTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprNotEqual}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNotEqual(DragonLangParser.ExprNotEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBracket}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBracket(DragonLangParser.ExprBracketContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprCall}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCall(DragonLangParser.ExprCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprPlusOne}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPlusOne(DragonLangParser.ExprPlusOneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprString}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprString(DragonLangParser.ExprStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprFalse}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFalse(DragonLangParser.ExprFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprArray}
	 * labeled alternative in {@link DragonLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprArray(DragonLangParser.ExprArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link DragonLangParser#otherExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherExpr(DragonLangParser.OtherExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DragonLangParser#ifexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfexpr(DragonLangParser.IfexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DragonLangParser#elseif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif(DragonLangParser.ElseifContext ctx);
	/**
	 * Visit a parse tree produced by {@link DragonLangParser#otherelse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherelse(DragonLangParser.OtherelseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DragonLangParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(DragonLangParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DragonLangParser#ifBlockInKH}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlockInKH(DragonLangParser.IfBlockInKHContext ctx);
	/**
	 * Visit a parse tree produced by {@link DragonLangParser#blockInKH}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockInKH(DragonLangParser.BlockInKHContext ctx);
	/**
	 * Visit a parse tree produced by {@link DragonLangParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(DragonLangParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DragonLangParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(DragonLangParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link DragonLangParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(DragonLangParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link DragonLangParser#arraySub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraySub(DragonLangParser.ArraySubContext ctx);
	/**
	 * Visit a parse tree produced by {@link DragonLangParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(DragonLangParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link DragonLangParser#objectSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectSub(DragonLangParser.ObjectSubContext ctx);
	/**
	 * Visit a parse tree produced by {@link DragonLangParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(DragonLangParser.PairContext ctx);
	/**
	 * Visit a parse tree produced by {@link DragonLangParser#objectFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectFunc(DragonLangParser.ObjectFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link DragonLangParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(DragonLangParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varPoint}
	 * labeled alternative in {@link DragonLangParser#varGetter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarPoint(DragonLangParser.VarPointContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varIndex}
	 * labeled alternative in {@link DragonLangParser#varGetter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarIndex(DragonLangParser.VarIndexContext ctx);
}