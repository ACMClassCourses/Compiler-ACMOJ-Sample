import utility.Error;
import utility.BuiltinFunctionASMPrinter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import java.io.IOException;
import java.io.InputStream;




public class Compiler
{
    public static void main(String[] args) throws IOException
    {
        InputStream input_stream = System.in;
        CharStream charstream = CharStreams.fromStream(input_stream);

        try
        {
            // Sort of MxLexer & Parser
            // Sort of ASTBuiler & SemanticChecker
            // Sort of IRBuilder, maybe opt
            // Sort of ASMBuilder, maybe opt
            BuiltinFunctionASMPrinter builtin_printer = new BuiltinFunctionASMPrinter("builtin.s");
        }
        catch (Error err)
        {
            throw new RuntimeException();
        }
    }
}