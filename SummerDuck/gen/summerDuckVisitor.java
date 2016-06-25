// Generated from /Users/ivandiaz/Desktop/SummerDuckCompi/SummerDuck/summerDuck.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link summerDuckParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface summerDuckVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link summerDuckParser#summerduck}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSummerduck(summerDuckParser.SummerduckContext ctx);
	/**
	 * Visit a parse tree produced by {@link summerDuckParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(summerDuckParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link summerDuckParser#vardec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardec(summerDuckParser.VardecContext ctx);
	/**
	 * Visit a parse tree produced by {@link summerDuckParser#vardecaux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardecaux(summerDuckParser.VardecauxContext ctx);
	/**
	 * Visit a parse tree produced by {@link summerDuckParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(summerDuckParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link summerDuckParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(summerDuckParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link summerDuckParser#varaux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVaraux(summerDuckParser.VarauxContext ctx);
	/**
	 * Visit a parse tree produced by {@link summerDuckParser#var2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar2(summerDuckParser.Var2Context ctx);
	/**
	 * Visit a parse tree produced by {@link summerDuckParser#varaux2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVaraux2(summerDuckParser.Varaux2Context ctx);
	/**
	 * Visit a parse tree produced by {@link summerDuckParser#fundef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFundef(summerDuckParser.FundefContext ctx);
	/**
	 * Visit a parse tree produced by {@link summerDuckParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(summerDuckParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link summerDuckParser#paramsaux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamsaux(summerDuckParser.ParamsauxContext ctx);
	/**
	 * Visit a parse tree produced by {@link summerDuckParser#paramsaux2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamsaux2(summerDuckParser.Paramsaux2Context ctx);
	/**
	 * Visit a parse tree produced by {@link summerDuckParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(summerDuckParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link summerDuckParser#asignations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignations(summerDuckParser.AsignationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link summerDuckParser#varAsign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAsign(summerDuckParser.VarAsignContext ctx);
	/**
	 * Visit a parse tree produced by {@link summerDuckParser#leer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeer(summerDuckParser.LeerContext ctx);
	/**
	 * Visit a parse tree produced by {@link summerDuckParser#leeraux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeeraux(summerDuckParser.LeerauxContext ctx);
	/**
	 * Visit a parse tree produced by {@link summerDuckParser#leeraux2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeeraux2(summerDuckParser.Leeraux2Context ctx);
	/**
	 * Visit a parse tree produced by {@link summerDuckParser#escribir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscribir(summerDuckParser.EscribirContext ctx);
	/**
	 * Visit a parse tree produced by {@link summerDuckParser#ifelse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfelse(summerDuckParser.IfelseContext ctx);
	/**
	 * Visit a parse tree produced by {@link summerDuckParser#ifelseaux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfelseaux(summerDuckParser.IfelseauxContext ctx);
	/**
	 * Visit a parse tree produced by {@link summerDuckParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(summerDuckParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link summerDuckParser#dowhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDowhile(summerDuckParser.DowhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link summerDuckParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(summerDuckParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link summerDuckParser#expaux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpaux(summerDuckParser.ExpauxContext ctx);
	/**
	 * Visit a parse tree produced by {@link summerDuckParser#exor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExor(summerDuckParser.ExorContext ctx);
	/**
	 * Visit a parse tree produced by {@link summerDuckParser#exoraux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExoraux(summerDuckParser.ExorauxContext ctx);
	/**
	 * Visit a parse tree produced by {@link summerDuckParser#exnot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExnot(summerDuckParser.ExnotContext ctx);
	/**
	 * Visit a parse tree produced by {@link summerDuckParser#exnotaux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExnotaux(summerDuckParser.ExnotauxContext ctx);
	/**
	 * Visit a parse tree produced by {@link summerDuckParser#exlog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExlog(summerDuckParser.ExlogContext ctx);
	/**
	 * Visit a parse tree produced by {@link summerDuckParser#exlogaux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExlogaux(summerDuckParser.ExlogauxContext ctx);
	/**
	 * Visit a parse tree produced by {@link summerDuckParser#exmod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExmod(summerDuckParser.ExmodContext ctx);
	/**
	 * Visit a parse tree produced by {@link summerDuckParser#exmodaux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExmodaux(summerDuckParser.ExmodauxContext ctx);
	/**
	 * Visit a parse tree produced by {@link summerDuckParser#ex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEx(summerDuckParser.ExContext ctx);
	/**
	 * Visit a parse tree produced by {@link summerDuckParser#exaux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExaux(summerDuckParser.ExauxContext ctx);
	/**
	 * Visit a parse tree produced by {@link summerDuckParser#termino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino(summerDuckParser.TerminoContext ctx);
	/**
	 * Visit a parse tree produced by {@link summerDuckParser#terminoaux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminoaux(summerDuckParser.TerminoauxContext ctx);
	/**
	 * Visit a parse tree produced by {@link summerDuckParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(summerDuckParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link summerDuckParser#functioncall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctioncall(summerDuckParser.FunctioncallContext ctx);
	/**
	 * Visit a parse tree produced by {@link summerDuckParser#functioncallaux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctioncallaux(summerDuckParser.FunctioncallauxContext ctx);
}