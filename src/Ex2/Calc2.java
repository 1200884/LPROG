package Ex2;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Calc2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(new File("src/Ex2/teste2.txt"));
        LabeledExpr2Lexer lexer = new LabeledExpr2Lexer(new ANTLRInputStream(fis));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LabeledExpr2Parser parser = new LabeledExpr2Parser(tokens);
        ParseTree tree = parser.prog(); // parse
        EvalVisitor2 eval = new EvalVisitor2();
        eval.visit(tree);
    }
}
