import java.io.*;

import Ast.AstNode;
import Ast.AstNodePrinter;
import Ast.SemanticChecker;
import generated.MathExprLexer;
import generated.MathExprParser;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;


public class Program {
    public static void main(String[] args) {
        try {

            CharStream input = args.length == 1 ? new ANTLRFileStream(args[0])
                    : new ANTLRReaderStream(new InputStreamReader(System.in));
            MathExprLexer lexer = new MathExprLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MathExprParser parser = new MathExprParser(tokens);
            parser.setTreeAdaptor(new AstNode.AstNodeTreeAdapter()); //!!!

            Tree program = (Tree) parser.execute().getTree();
            AstNodePrinter.Print(program);

            //parser.start();

            SemanticChecker c = new SemanticChecker();
            c.check((AstNode)program, null);

            //System.out.println("OK!");
        }
        catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
