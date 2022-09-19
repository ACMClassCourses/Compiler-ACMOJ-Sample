package utility;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

public class Position
{
    private int row, col;
    public Position(int Row, int Col)
    {
        this.row = Row;
        this.col = Col;
    }
    public Position(ParserRuleContext ctx)
    {
        Token start_token = ctx.getStart();
        this.row = start_token.getLine();
        this.col = start_token.getCharPositionInLine();
    }
    public int get_row()
    {
        return this.row;
    }
    public int get_col()
    {
        return this.col;
    }
}