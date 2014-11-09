import generated.MathExprLexer;
import generated.MathExprParser;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.Tree;

import java.io.InputStreamReader;


public class Program {
    public static void main(String[] args) {
        try {

            CharStream input = args.length == 1 ? new ANTLRFileStream(args[0])
                    : new ANTLRReaderStream(new InputStreamReader(System.in));
            MathExprLexer lexer = new MathExprLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MathExprParser parser = new MathExprParser(tokens);
            //parser.start();
            Tree program = (Tree) parser.start().getTree();
            AstNodePrinter.Print(program);
            //System.out.println("OK!");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
