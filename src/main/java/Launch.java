import antlr.hussarLexer;
import antlr.hussarParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Launch {
    public static void main(String[] args) throws Exception {
        String input = "input.txt";
        String output = "src/main/java/Output.java";

        convert(input, output);

        runProcess("java -cp src src/main/java/Output.java");
    }

    private static void printLines(InputStream ins) throws Exception {
        String line = null;
        BufferedReader in = new BufferedReader(
                new InputStreamReader(ins));
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
    }

    private static void runProcess(String command) throws Exception {
        Process pro = Runtime.getRuntime().exec(command);
        printLines(pro.getInputStream());
        printLines(pro.getErrorStream());
        pro.waitFor();
    }

    private static void convert(String inputFile, String output) {
        try {
            CharStream cs = fromFileName(inputFile);
            hussarLexer lexer = new hussarLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            hussarParser parser = new hussarParser(token);
            ParseTree tree = parser.program_sym();

            MyVisitor visitor = new MyVisitor(output);

            visitor.visit(tree);
            visitor.closeFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
