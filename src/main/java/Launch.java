//import antlr.hussarLexer;

import antlr.hussarLexer;
import antlr.hussarParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Launch {
    public static void main(String [] args){
        try{
            int idx = 1;

            String input = "input_" + idx + ".txt";

            CharStream cs = fromFileName(input);
            hussarLexer lexer = new hussarLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            hussarParser parser = new hussarParser(token);
            ParseTree tree = parser.program_sym();

            MyVisitor visitor = new MyVisitor();

            PrintStream out = new PrintStream(new FileOutputStream("src/main/java/Output.java"));
            PrintStream sys = System.out;
            System.setOut(out);

            System.out.println("public class Output{");
            visitor.visit(tree);
            System.out.println("}");

            System.setOut(sys);
            Output.main();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
