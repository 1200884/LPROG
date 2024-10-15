package Ex6.Ex6.Ex6;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Calc6 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(new File("src/Ex6/teste6.txt"));
        LabeledExpr6Lexer lexer = new LabeledExpr6Lexer(new ANTLRInputStream(fis));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LabeledExpr6Parser parser = new LabeledExpr6Parser(tokens);
        ParseTree tree = parser.prog(); // parse
        EvalVisitor6 eval = new EvalVisitor6();
        eval.visit(tree);
    }
}

