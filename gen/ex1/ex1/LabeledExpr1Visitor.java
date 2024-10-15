// Generated from C:/Users/jgasp/OneDrive/Documents/4º Semestre/LPROG/src/ex1/ex1\LabeledExpr1.g4 by ANTLR 4.10.1
package ex1.ex1;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LabeledExpr1Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LabeledExpr1Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LabeledExpr1Parser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(LabeledExpr1Parser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alfredo}
	 * labeled alternative in {@link LabeledExpr1Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlfredo(LabeledExpr1Parser.AlfredoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link LabeledExpr1Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlank(LabeledExpr1Parser.BlankContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nothing}
	 * labeled alternative in {@link LabeledExpr1Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNothing(LabeledExpr1Parser.NothingContext ctx);
}