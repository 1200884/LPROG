package Ex6.Ex6.Ex6;

public class EvalVisitor6 extends LabeledExpr6BaseVisitor<Integer> {
    int maxgrade = 0;
    int numberofgrade = 0;
    public void highergrade(int grade, int numeroaluno) {
        System.out.println("abilioA");
        if (grade > maxgrade) {
            maxgrade = grade;
            numberofgrade = numeroaluno;
        }
        System.out.println(maxgrade+"_____"+numberofgrade);
    }

    @Override
    public Integer visitHighergrade(LabeledExpr6Parser.HighergradeContext ctx) {
        System.out.println((ctx.TIPO()));
        System.out.println("alberto");
        highergrade(Integer.parseInt(String.valueOf(ctx.NOTA(0))), Integer.parseInt(String.valueOf(ctx.NUMERO())));
        return super.visitHighergrade(ctx);
    }

    @Override public Integer visitProg(LabeledExpr6Parser.ProgContext ctx) {
        System.out.println("bruhfrgwegkw");
        return visitChildren(ctx); }

    @Override public Integer visitBlank(LabeledExpr6Parser.BlankContext ctx) {
        System.out.println("Blanko");
        return visitChildren(ctx); }

}
