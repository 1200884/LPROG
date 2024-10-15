package ex1;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Calc {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(new File("src/ex1/ex1/helloworld.txt"));
        LabeledExpr1Lexer lexer = new LabeledExpr1Lexer(new ANTLRInputStream(fis));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LabeledExpr1Parser parser = new LabeledExpr1Parser(tokens);
        ParseTree tree = parser.prog(); // parse
        EvalVisitor eval = new EvalVisitor();
        eval.visit(tree);
    }
}
