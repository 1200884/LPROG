// Generated from C:/Users/jgasp/OneDrive/Documents/4� Semestre/LPROG/src/ex1/ex1/ex2/ex1/ex1/ex2\LabeledExpr2.g4 by ANTLR 4.10.1
package Ex2;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LabeledExpr2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LabeledExpr2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LabeledExpr2Parser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(LabeledExpr2Parser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code validateMenor}
	 * labeled alternative in {@link LabeledExpr2Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidateMenor(LabeledExpr2Parser.ValidateMenorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code validateMaior}
	 * labeled alternative in {@link LabeledExpr2Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidateMaior(LabeledExpr2Parser.ValidateMaiorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code validateIgual}
	 * labeled alternative in {@link LabeledExpr2Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidateIgual(LabeledExpr2Parser.ValidateIgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code validateDiferente}
	 * labeled alternative in {@link LabeledExpr2Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidateDiferente(LabeledExpr2Parser.ValidateDiferenteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link LabeledExpr2Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlank(LabeledExpr2Parser.BlankContext ctx);
	/**
	 * Visit a parse tree produced by the {@code invalid}
	 * labeled alternative in {@link LabeledExpr2Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvalid(LabeledExpr2Parser.InvalidContext ctx);
}