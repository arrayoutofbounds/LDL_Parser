/* Generated By:JavaCC: Do not edit this line. LibParserTokenManager.java */
package lib;

/** Token Manager. */
public class LibParserTokenManager implements LibParserConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 66:
         return jjMoveStringLiteralDfa1_0(0x80L);
      case 69:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 72:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 76:
         return jjMoveStringLiteralDfa1_0(0x20L);
      case 83:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 84:
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 87:
         return jjMoveStringLiteralDfa1_0(0x40L);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      default :
         return 1;
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 69:
         return jjMoveStringLiteralDfa2_0(active0, 0x40L);
      case 73:
         return jjMoveStringLiteralDfa2_0(active0, 0x100L);
      case 78:
         return jjMoveStringLiteralDfa2_0(active0, 0x400L);
      case 79:
         return jjMoveStringLiteralDfa2_0(active0, 0x800L);
      case 84:
         return jjMoveStringLiteralDfa2_0(active0, 0x200L);
      case 85:
         return jjMoveStringLiteralDfa2_0(active0, 0x80L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x20L);
      case 115:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000L);
      default :
         return 2;
   }
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 2;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 2;
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa3_0(active0, 0x200L);
      case 66:
         return jjMoveStringLiteralDfa3_0(active0, 0x40L);
      case 68:
         if ((active0 & 0x400L) != 0L)
            return jjStopAtPos(2, 10);
         break;
      case 73:
         return jjMoveStringLiteralDfa3_0(active0, 0x80L);
      case 77:
         return jjMoveStringLiteralDfa3_0(active0, 0x100L);
      case 85:
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      case 98:
         return jjMoveStringLiteralDfa3_0(active0, 0x20L);
      case 100:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000L);
      default :
         return 3;
   }
   return 3;
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 3;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 3;
   }
   switch(curChar)
   {
      case 69:
         return jjMoveStringLiteralDfa4_0(active0, 0x100L);
      case 76:
         return jjMoveStringLiteralDfa4_0(active0, 0x80L);
      case 82:
         return jjMoveStringLiteralDfa4_0(active0, 0xa00L);
      case 83:
         return jjMoveStringLiteralDfa4_0(active0, 0x40L);
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000L);
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x20L);
      default :
         return 4;
   }
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 4;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 4;
   }
   switch(curChar)
   {
      case 68:
         return jjMoveStringLiteralDfa5_0(active0, 0x80L);
      case 73:
         return jjMoveStringLiteralDfa5_0(active0, 0x40L);
      case 79:
         return jjMoveStringLiteralDfa5_0(active0, 0x100L);
      case 83:
         if ((active0 & 0x800L) != 0L)
            return jjStopAtPos(4, 11);
         break;
      case 84:
         if ((active0 & 0x200L) != 0L)
            return jjStopAtPos(4, 9);
         break;
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x20L);
      case 100:
         return jjMoveStringLiteralDfa5_0(active0, 0x1000L);
      default :
         return 5;
   }
   return 5;
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 5;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 5;
   }
   switch(curChar)
   {
      case 70:
         return jjMoveStringLiteralDfa6_0(active0, 0x100L);
      case 73:
         return jjMoveStringLiteralDfa6_0(active0, 0x80L);
      case 84:
         return jjMoveStringLiteralDfa6_0(active0, 0x40L);
      case 114:
         return jjMoveStringLiteralDfa6_0(active0, 0x20L);
      case 115:
         if ((active0 & 0x1000L) != 0L)
            return jjStopAtPos(5, 12);
         break;
      default :
         return 6;
   }
   return 6;
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 6;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 6;
   }
   switch(curChar)
   {
      case 69:
         if ((active0 & 0x40L) != 0L)
            return jjStopAtPos(6, 6);
         break;
      case 78:
         return jjMoveStringLiteralDfa7_0(active0, 0x80L);
      case 89:
         return jjMoveStringLiteralDfa7_0(active0, 0x100L);
      case 121:
         if ((active0 & 0x20L) != 0L)
            return jjStopAtPos(6, 5);
         break;
      default :
         return 7;
   }
   return 7;
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 7;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 7;
   }
   switch(curChar)
   {
      case 69:
         return jjMoveStringLiteralDfa8_0(active0, 0x100L);
      case 71:
         if ((active0 & 0x80L) != 0L)
            return jjStopAtPos(7, 7);
         break;
      default :
         return 8;
   }
   return 8;
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 8;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 8;
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa9_0(active0, 0x100L);
      default :
         return 9;
   }
}
private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 9;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 9;
   }
   switch(curChar)
   {
      case 82:
         if ((active0 & 0x100L) != 0L)
            return jjStopAtPos(9, 8);
         break;
      default :
         return 10;
   }
   return 10;
}
static final int[] jjnextStates = {
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, "\114\151\142\162\141\162\171", 
"\127\105\102\123\111\124\105", "\102\125\111\114\104\111\116\107", 
"\124\111\115\105\117\106\131\105\101\122", "\123\124\101\122\124", "\105\116\104", "\110\117\125\122\123", 
"\141\163\144\141\144\163", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x1fe1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[0];
private final int[] jjstateSet = new int[0];
protected char curChar;
/** Constructor. */
public LibParserTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public LibParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 0; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

}
