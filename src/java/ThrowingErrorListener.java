
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dicr1
 */
public class ThrowingErrorListener extends BaseErrorListener {

   public static final ThrowingErrorListener INSTANCE = new ThrowingErrorListener();

   @Override
   public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
      throws ParseCancellationException {
         throw new ParseCancellationException("line " + line + ":" + charPositionInLine + " " + msg);
      }
}
