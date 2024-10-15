// Generated from C:/Users/jgasp/OneDrive/Documents/4º Semestre/LPROG/src/Ex6/Ex6/Ex6\LabeledExpr6.g4 by ANTLR 4.10.1
package Ex6.Ex6.Ex6;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LabeledExpr6Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LabeledExpr6Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LabeledExpr6Parser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(LabeledExpr6Parser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code highergrade}
	 * labeled alternative in {@link LabeledExpr6Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHighergrade(LabeledExpr6Parser.HighergradeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link LabeledExpr6Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlank(LabeledExpr6Parser.BlankContext ctx);
}