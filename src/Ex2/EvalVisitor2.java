package Ex2;

public class EvalVisitor2 extends LabeledExpr2BaseVisitor<Integer> {
    @Override
    public Integer visitInvalid(LabeledExpr2Parser.InvalidContext ctx) {
        System.out.println("desculpa lá mas tás nas drogas obrigado e nao tropeces no coiso.");
        return super.visitInvalid(ctx);
    }

    @Override
    public Integer visitValidateMaior(LabeledExpr2Parser.ValidateMaiorContext ctx) {
        String a = String.valueOf(ctx.NUMBER(0));
        int aint = Integer.parseInt(a);
        String b = String.valueOf(ctx.NUMBER(1));
        int bint = Integer.parseInt(b);
        if (aint > bint) {
            System.out.println("verdadeiro");
        } else {
            System.out.println("falso");
        }
        return super.visitValidateMaior(ctx);
    }

    @Override
    public Integer visitValidateDiferente(LabeledExpr2Parser.ValidateDiferenteContext ctx) {

        String a = String.valueOf(ctx.NUMBER(0));
        int aint = Integer.parseInt(a);
        String b = String.valueOf(ctx.NUMBER(1));
        int bint = Integer.parseInt(b);
        if (aint != bint) {
            System.out.println("verdadeiro");
        } else {
            System.out.println("falso");
        }
        return super.visitValidateDiferente(ctx);
    }

    @Override
    public Integer visitValidateMenor(LabeledExpr2Parser.ValidateMenorContext ctx) {
        String a = String.valueOf(ctx.NUMBER(0));
        int aint = Integer.parseInt(a);
        String b = String.valueOf(ctx.NUMBER(1));
        int bint = Integer.parseInt(b);
        if (aint < bint) {
            System.out.println("verdadeiro");
        } else {
            System.out.println("falso");
        }
        return super.visitValidateMenor(ctx);
    }
    @Override
    public Integer visitValidateIgual(LabeledExpr2Parser.ValidateIgualContext ctx) {
        String a = String.valueOf(ctx.NUMBER(0));
        int aint = Integer.parseInt(a);
        String b = String.valueOf(ctx.NUMBER(1));
        int bint = Integer.parseInt(b);
        if (aint == bint) {
            System.out.println("verdadeiro");
        } else {
            System.out.println("falso");
        }
        return super.visitValidateIgual(ctx);
    }
}