// Generated from C:/Users/jgasp/OneDrive/Documents/4� Semestre/LPROG/src/ex1/ex1\LabeledExpr1.g4 by ANTLR 4.10.1
package ex1;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LabeledExpr1Parser}.
 */
public interface LabeledExpr1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LabeledExpr1Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(LabeledExpr1Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExpr1Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(LabeledExpr1Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link LabeledExpr1Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(LabeledExpr1Parser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link LabeledExpr1Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(LabeledExpr1Parser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link LabeledExpr1Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(LabeledExpr1Parser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link LabeledExpr1Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(LabeledExpr1Parser.BlankContext ctx);
}