import utility.Error;
import utility.MxErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;
import java.io.InputStream;




public class Compiler
{
    public static void main(String[] args) throws IOException
    {
        InputStream input_stream = System.in;
        CharStream charstream = CharStreams.fromStream(input_stream);
        // My compiler thought that everything goes so wrong that
        // no code should pass sementic check. 
        throw new RuntimeException();
    }
}