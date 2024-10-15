// Generated from C:/Users/jgasp/OneDrive/Documents/4º Semestre/LPROG/src/Ex6/Ex6/Ex6\LabeledExpr6.g4 by ANTLR 4.10.1
package Ex6.Ex6.Ex6;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LabeledExpr6Parser}.
 */
public interface LabeledExpr6Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LabeledExpr6Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(LabeledExpr6Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExpr6Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(LabeledExpr6Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code highergrade}
	 * labeled alternative in {@link LabeledExpr6Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterHighergrade(LabeledExpr6Parser.HighergradeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code highergrade}
	 * labeled alternative in {@link LabeledExpr6Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitHighergrade(LabeledExpr6Parser.HighergradeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link LabeledExpr6Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(LabeledExpr6Parser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link LabeledExpr6Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(LabeledExpr6Parser.BlankContext ctx);
}