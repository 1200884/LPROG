// Generated from C:/Users/jgasp/OneDrive/Documents/4� Semestre/LPROG/src/ex1/ex1\LabeledExpr1.g4 by ANTLR 4.10.1
package ex1;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link LabeledExpr1Visitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class LabeledExpr1BaseVisitor<T> extends AbstractParseTreeVisitor<T> implements LabeledExpr1Visitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitProg(LabeledExpr1Parser.ProgContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitPrintExpr(LabeledExpr1Parser.PrintExprContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitBlank(LabeledExpr1Parser.BlankContext ctx) { return visitChildren(ctx); }
}