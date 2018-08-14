package destiny.crystal;

import destiny.crystal.core.Lexer;
import destiny.crystal.core.Token;
import destiny.crystal.exception.ParseException;
import destiny.crystal.gui.CodeDialog;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ParseException {
        Lexer l = new Lexer(new CodeDialog());
        for (Token t; (t = l.read()) != Token.EOF; ) {
            System.out.println("=> " + t.getText());
        }
    }
}
