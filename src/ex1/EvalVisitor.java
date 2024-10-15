package ex1;

public class EvalVisitor extends LabeledExpr1BaseVisitor<Integer> {

    @Override
    public Integer visitPrintExpr(LabeledExpr1Parser.PrintExprContext ctx) {
        System.out.println("Hello World!!!!");
        String hw = "hello world";
        return null;
    }

}