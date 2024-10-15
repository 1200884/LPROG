// Generated from C:/Users/jgasp/OneDrive/Documents/4º Semestre/LPROG/src/Ex6/Ex6/Ex6\LabeledExpr6.g4 by ANTLR 4.10.1
package Ex6.Ex6.Ex6;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link LabeledExpr6Visitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class LabeledExpr6BaseVisitor<T> extends AbstractParseTreeVisitor<T> implements LabeledExpr6Visitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitProg(LabeledExpr6Parser.ProgContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitHighergrade(LabeledExpr6Parser.HighergradeContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitBlank(LabeledExpr6Parser.BlankContext ctx) { return visitChildren(ctx); }
}