// Generated from C:/Users/jgasp/OneDrive/Documents/4� Semestre/LPROG/src/ex1/ex1/ex2/ex1/ex1/ex2\LabeledExpr2.g4 by ANTLR 4.10.1
package Ex2;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LabeledExpr2Parser}.
 */
public interface LabeledExpr2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LabeledExpr2Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(LabeledExpr2Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExpr2Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(LabeledExpr2Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code validateMenor}
	 * labeled alternative in {@link LabeledExpr2Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterValidateMenor(LabeledExpr2Parser.ValidateMenorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code validateMenor}
	 * labeled alternative in {@link LabeledExpr2Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitValidateMenor(LabeledExpr2Parser.ValidateMenorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code validateMaior}
	 * labeled alternative in {@link LabeledExpr2Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterValidateMaior(LabeledExpr2Parser.ValidateMaiorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code validateMaior}
	 * labeled alternative in {@link LabeledExpr2Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitValidateMaior(LabeledExpr2Parser.ValidateMaiorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code validateIgual}
	 * labeled alternative in {@link LabeledExpr2Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterValidateIgual(LabeledExpr2Parser.ValidateIgualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code validateIgual}
	 * labeled alternative in {@link LabeledExpr2Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitValidateIgual(LabeledExpr2Parser.ValidateIgualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code validateDiferente}
	 * labeled alternative in {@link LabeledExpr2Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterValidateDiferente(LabeledExpr2Parser.ValidateDiferenteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code validateDiferente}
	 * labeled alternative in {@link LabeledExpr2Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitValidateDiferente(LabeledExpr2Parser.ValidateDiferenteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link LabeledExpr2Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(LabeledExpr2Parser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link LabeledExpr2Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(LabeledExpr2Parser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code invalid}
	 * labeled alternative in {@link LabeledExpr2Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterInvalid(LabeledExpr2Parser.InvalidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code invalid}
	 * labeled alternative in {@link LabeledExpr2Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitInvalid(LabeledExpr2Parser.InvalidContext ctx);
}