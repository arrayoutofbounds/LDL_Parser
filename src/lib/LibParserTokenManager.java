/* Generated By:JavaCC: Do not edit this line. LibParserTokenManager.java */
package lib;

/** Token Manager. */
public class LibParserTokenManager implements LibParserConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x88000L) != 0L)
         {
            jjmatchedKind = 38;
            return 51;
         }
         if ((active0 & 0x1000L) != 0L)
         {
            jjmatchedKind = 38;
            return 34;
         }
         if ((active0 & 0x6cbb72800L) != 0L)
         {
            jjmatchedKind = 38;
            return 3;
         }
         if ((active0 & 0x4404000L) != 0L)
         {
            jjmatchedKind = 38;
            return 16;
         }
         return -1;
      case 1:
         if ((active0 & 0x60ffff800L) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 1;
            return 3;
         }
         if ((active0 & 0xc0000000L) != 0L)
            return 3;
         return -1;
      case 2:
         if ((active0 & 0x60ffef800L) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 2;
            return 3;
         }
         if ((active0 & 0x10000L) != 0L)
            return 3;
         return -1;
      case 3:
         if ((active0 & 0x60c3ef800L) != 0L)
         {
            if (jjmatchedPos != 3)
            {
               jjmatchedKind = 38;
               jjmatchedPos = 3;
            }
            return 3;
         }
         if ((active0 & 0x3c00000L) != 0L)
            return 3;
         return -1;
      case 4:
         if ((active0 & 0x200000000L) != 0L)
         {
            if (jjmatchedPos < 3)
            {
               jjmatchedKind = 38;
               jjmatchedPos = 3;
            }
            return -1;
         }
         if ((active0 & 0x409147800L) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 4;
            return 3;
         }
         if ((active0 & 0x42a8000L) != 0L)
            return 3;
         return -1;
      case 5:
         if ((active0 & 0x400000000L) != 0L)
         {
            if (jjmatchedPos < 4)
            {
               jjmatchedKind = 38;
               jjmatchedPos = 4;
            }
            return -1;
         }
         if ((active0 & 0x200000000L) != 0L)
         {
            if (jjmatchedPos < 3)
            {
               jjmatchedKind = 38;
               jjmatchedPos = 3;
            }
            return -1;
         }
         if ((active0 & 0x1107800L) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 5;
            return 3;
         }
         if ((active0 & 0x8040000L) != 0L)
            return 3;
         return -1;
      case 6:
         if ((active0 & 0x400000000L) != 0L)
         {
            if (jjmatchedPos < 4)
            {
               jjmatchedKind = 38;
               jjmatchedPos = 4;
            }
            return -1;
         }
         if ((active0 & 0x200000000L) != 0L)
         {
            if (jjmatchedPos < 3)
            {
               jjmatchedKind = 38;
               jjmatchedPos = 3;
            }
            return -1;
         }
         if ((active0 & 0x1106000L) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 6;
            return 3;
         }
         if ((active0 & 0x1800L) != 0L)
            return 3;
         return -1;
      case 7:
         if ((active0 & 0x400000000L) != 0L)
         {
            if (jjmatchedPos < 4)
            {
               jjmatchedKind = 38;
               jjmatchedPos = 4;
            }
            return -1;
         }
         if ((active0 & 0x1004000L) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 7;
            return 3;
         }
         if ((active0 & 0x102000L) != 0L)
            return 3;
         return -1;
      case 8:
         if ((active0 & 0x1004000L) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 8;
            return 3;
         }
         return -1;
      case 9:
         if ((active0 & 0x4000L) != 0L)
            return 3;
         if ((active0 & 0x1000000L) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 9;
            return 3;
         }
         return -1;
      case 10:
         if ((active0 & 0x1000000L) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 10;
            return 3;
         }
         return -1;
      case 11:
         if ((active0 & 0x1000000L) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 11;
            return 3;
         }
         return -1;
      case 12:
         if ((active0 & 0x1000000L) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 12;
            return 3;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
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
      case 40:
         return jjStopAtPos(0, 5);
      case 41:
         return jjStopAtPos(0, 6);
      case 44:
         return jjStopAtPos(0, 7);
      case 59:
         return jjStopAtPos(0, 10);
      case 65:
         return jjMoveStringLiteralDfa1_0(0x48000000L);
      case 66:
         return jjMoveStringLiteralDfa1_0(0x3002000L);
      case 67:
         return jjMoveStringLiteralDfa1_0(0x40000L);
      case 69:
         return jjMoveStringLiteralDfa1_0(0x210000L);
      case 72:
         return jjMoveStringLiteralDfa1_0(0x20000L);
      case 76:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 80:
         return jjMoveStringLiteralDfa1_0(0x80100000L);
      case 82:
         return jjMoveStringLiteralDfa1_0(0x800000L);
      case 83:
         return jjMoveStringLiteralDfa1_0(0x88000L);
      case 84:
         return jjMoveStringLiteralDfa1_0(0x4404000L);
      case 87:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 104:
         return jjMoveStringLiteralDfa1_0(0x600000000L);
      case 123:
         return jjStopAtPos(0, 8);
      case 125:
         return jjStopAtPos(0, 9);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa2_0(active0, 0x800000L);
      case 69:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000L);
      case 73:
         return jjMoveStringLiteralDfa2_0(active0, 0x4004000L);
      case 76:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000L);
      case 77:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(1, 30, 3);
         else if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(1, 31, 3);
         return jjMoveStringLiteralDfa2_0(active0, 0x200000L);
      case 78:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000L);
      case 79:
         return jjMoveStringLiteralDfa2_0(active0, 0x3120000L);
      case 84:
         return jjMoveStringLiteralDfa2_0(active0, 0x88000L);
      case 85:
         return jjMoveStringLiteralDfa2_0(active0, 0x8002000L);
      case 89:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x800L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x600000000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa3_0(active0, 0x288000L);
      case 66:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000L);
      case 68:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(2, 16, 3);
         break;
      case 73:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      case 77:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000L);
      case 79:
         return jjMoveStringLiteralDfa3_0(active0, 0x3040000L);
      case 80:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000L);
      case 83:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000L);
      case 84:
         return jjMoveStringLiteralDfa3_0(active0, 0xc800000L);
      case 85:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000L);
      case 98:
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x600000000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 69:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(3, 22, 3);
         else if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(3, 23, 3);
         return jjMoveStringLiteralDfa4_0(active0, 0x4000L);
      case 70:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000L);
      case 72:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000000L);
      case 73:
         return jjMoveStringLiteralDfa4_0(active0, 0x300000L);
      case 75:
         if ((active0 & 0x2000000L) != 0L)
         {
            jjmatchedKind = 25;
            jjmatchedPos = 3;
         }
         return jjMoveStringLiteralDfa4_0(active0, 0x1000000L);
      case 76:
         return jjMoveStringLiteralDfa4_0(active0, 0x4002000L);
      case 82:
         return jjMoveStringLiteralDfa4_0(active0, 0x28000L);
      case 83:
         return jjMoveStringLiteralDfa4_0(active0, 0x41000L);
      case 112:
         return jjMoveStringLiteralDfa4_0(active0, 0x600000000L);
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 58:
         return jjMoveStringLiteralDfa5_0(active0, 0x200000000L);
      case 67:
         return jjMoveStringLiteralDfa5_0(active0, 0x1000000L);
      case 68:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000L);
      case 69:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(4, 26, 3);
         return jjMoveStringLiteralDfa5_0(active0, 0x40000L);
      case 70:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(4, 19, 3);
         break;
      case 73:
         return jjMoveStringLiteralDfa5_0(active0, 0x1000L);
      case 76:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(4, 21, 3);
         break;
      case 79:
         return jjMoveStringLiteralDfa5_0(active0, 0x8004000L);
      case 83:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(4, 17, 3);
         break;
      case 84:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(4, 15, 3);
         return jjMoveStringLiteralDfa5_0(active0, 0x100000L);
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x800L);
      case 115:
         return jjMoveStringLiteralDfa5_0(active0, 0x400000000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 47:
         return jjMoveStringLiteralDfa6_0(active0, 0x200000000L);
      case 58:
         return jjMoveStringLiteralDfa6_0(active0, 0x400000000L);
      case 68:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(5, 18, 3);
         break;
      case 70:
         return jjMoveStringLiteralDfa6_0(active0, 0x4000L);
      case 73:
         return jjMoveStringLiteralDfa6_0(active0, 0x102000L);
      case 79:
         return jjMoveStringLiteralDfa6_0(active0, 0x1000000L);
      case 82:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(5, 27, 3);
         break;
      case 84:
         return jjMoveStringLiteralDfa6_0(active0, 0x1000L);
      case 114:
         return jjMoveStringLiteralDfa6_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 47:
         if ((active0 & 0x200000000L) != 0L)
            return jjStopAtPos(6, 33);
         return jjMoveStringLiteralDfa7_0(active0, 0x400000000L);
      case 69:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(6, 12, 3);
         break;
      case 76:
         return jjMoveStringLiteralDfa7_0(active0, 0x1000000L);
      case 78:
         return jjMoveStringLiteralDfa7_0(active0, 0x2000L);
      case 79:
         return jjMoveStringLiteralDfa7_0(active0, 0x100000L);
      case 89:
         return jjMoveStringLiteralDfa7_0(active0, 0x4000L);
      case 121:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(6, 11, 3);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 47:
         if ((active0 & 0x400000000L) != 0L)
            return jjStopAtPos(7, 34);
         break;
      case 69:
         return jjMoveStringLiteralDfa8_0(active0, 0x4000L);
      case 71:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(7, 13, 3);
         break;
      case 76:
         return jjMoveStringLiteralDfa8_0(active0, 0x1000000L);
      case 78:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(7, 20, 3);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa9_0(active0, 0x4000L);
      case 69:
         return jjMoveStringLiteralDfa9_0(active0, 0x1000000L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 67:
         return jjMoveStringLiteralDfa10_0(active0, 0x1000000L);
      case 82:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(9, 14, 3);
         break;
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
private int jjMoveStringLiteralDfa10_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(8, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0);
      return 10;
   }
   switch(curChar)
   {
      case 84:
         return jjMoveStringLiteralDfa11_0(active0, 0x1000000L);
      default :
         break;
   }
   return jjStartNfa_0(9, active0);
}
private int jjMoveStringLiteralDfa11_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(9, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(10, active0);
      return 11;
   }
   switch(curChar)
   {
      case 73:
         return jjMoveStringLiteralDfa12_0(active0, 0x1000000L);
      default :
         break;
   }
   return jjStartNfa_0(10, active0);
}
private int jjMoveStringLiteralDfa12_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(10, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(11, active0);
      return 12;
   }
   switch(curChar)
   {
      case 79:
         return jjMoveStringLiteralDfa13_0(active0, 0x1000000L);
      default :
         break;
   }
   return jjStartNfa_0(11, active0);
}
private int jjMoveStringLiteralDfa13_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(11, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(12, active0);
      return 13;
   }
   switch(curChar)
   {
      case 78:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(13, 24, 3);
         break;
      default :
         break;
   }
   return jjStartNfa_0(12, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 63;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 2:
                  if ((0x3ff000000000000L & l) != 0L && kind > 29)
                     kind = 29;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 38)
                        kind = 38;
                     jjCheckNAdd(3);
                  }
                  if (curChar == 83)
                     jjAddStates(0, 3);
                  else if (curChar == 70)
                     jjAddStates(4, 5);
                  else if (curChar == 87)
                     jjAddStates(6, 7);
                  else if (curChar == 84)
                     jjAddStates(8, 12);
                  else if (curChar == 77)
                     jjAddStates(13, 15);
                  break;
               case 51:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 38)
                        kind = 38;
                     jjCheckNAdd(3);
                  }
                  if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 61;
                  else if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 57;
                  if (curChar == 117)
                     jjCheckNAdd(7);
                  else if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 50;
                  break;
               case 34:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 38)
                        kind = 38;
                     jjCheckNAdd(3);
                  }
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 40;
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 33;
                  break;
               case 16:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 38)
                        kind = 38;
                     jjCheckNAdd(3);
                  }
                  if (curChar == 104)
                     jjstateSet[jjnewStateCnt++] = 30;
                  else if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 24;
                  if (curChar == 104)
                     jjstateSet[jjnewStateCnt++] = 19;
                  else if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 17;
                  if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 15;
                  break;
               case 3:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 38)
                     kind = 38;
                  jjCheckNAdd(3);
                  break;
               case 4:
                  if (curChar == 77)
                     jjAddStates(13, 15);
                  break;
               case 5:
                  if (curChar == 110 && kind > 32)
                     kind = 32;
                  break;
               case 6:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 7:
                  if (curChar == 110 && kind > 35)
                     kind = 35;
                  break;
               case 8:
                  if (curChar == 111)
                     jjCheckNAdd(7);
                  break;
               case 9:
                  if (curChar == 121 && kind > 36)
                     kind = 36;
                  break;
               case 10:
               case 21:
               case 26:
               case 35:
               case 45:
               case 53:
               case 59:
                  if (curChar == 97)
                     jjCheckNAdd(9);
                  break;
               case 11:
                  if (curChar == 100)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 12:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 13:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 14:
                  if (curChar == 84)
                     jjAddStates(8, 12);
                  break;
               case 15:
                  if (curChar == 101 && kind > 32)
                     kind = 32;
                  break;
               case 17:
                  if (curChar == 101 && kind > 35)
                     kind = 35;
                  break;
               case 18:
                  if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 17;
                  break;
               case 19:
                  if (curChar == 117 && kind > 35)
                     kind = 35;
                  break;
               case 20:
                  if (curChar == 104)
                     jjstateSet[jjnewStateCnt++] = 19;
                  break;
               case 22:
                  if (curChar == 100)
                     jjstateSet[jjnewStateCnt++] = 21;
                  break;
               case 23:
                  if (curChar == 115)
                     jjstateSet[jjnewStateCnt++] = 22;
                  break;
               case 24:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 23;
                  break;
               case 25:
                  if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 24;
                  break;
               case 27:
                  if (curChar == 100)
                     jjstateSet[jjnewStateCnt++] = 26;
                  break;
               case 28:
                  if (curChar == 115)
                     jjstateSet[jjnewStateCnt++] = 27;
                  break;
               case 29:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 28;
                  break;
               case 30:
                  if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 29;
                  break;
               case 31:
                  if (curChar == 104)
                     jjstateSet[jjnewStateCnt++] = 30;
                  break;
               case 32:
                  if (curChar == 87)
                     jjAddStates(6, 7);
                  break;
               case 33:
                  if (curChar == 100 && kind > 35)
                     kind = 35;
                  break;
               case 36:
                  if (curChar == 100)
                     jjstateSet[jjnewStateCnt++] = 35;
                  break;
               case 37:
                  if (curChar == 115)
                     jjstateSet[jjnewStateCnt++] = 36;
                  break;
               case 38:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 37;
                  break;
               case 39:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 38;
                  break;
               case 40:
                  if (curChar == 100)
                     jjstateSet[jjnewStateCnt++] = 39;
                  break;
               case 41:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 40;
                  break;
               case 42:
                  if (curChar == 70)
                     jjAddStates(4, 5);
                  break;
               case 43:
                  if (curChar == 105 && kind > 35)
                     kind = 35;
                  break;
               case 44:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 43;
                  break;
               case 46:
                  if (curChar == 100)
                     jjstateSet[jjnewStateCnt++] = 45;
                  break;
               case 47:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 46;
                  break;
               case 48:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 47;
                  break;
               case 49:
                  if (curChar == 83)
                     jjAddStates(0, 3);
                  break;
               case 50:
                  if (curChar == 116 && kind > 35)
                     kind = 35;
                  break;
               case 52:
                  if (curChar == 117)
                     jjCheckNAdd(7);
                  break;
               case 54:
                  if (curChar == 100)
                     jjstateSet[jjnewStateCnt++] = 53;
                  break;
               case 55:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 54;
                  break;
               case 56:
                  if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 55;
                  break;
               case 57:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 56;
                  break;
               case 58:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 57;
                  break;
               case 60:
                  if (curChar == 100)
                     jjstateSet[jjnewStateCnt++] = 59;
                  break;
               case 61:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 60;
                  break;
               case 62:
                  if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 61;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 63 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   51, 52, 58, 62, 44, 48, 34, 41, 16, 18, 20, 25, 31, 6, 8, 13, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, "\50", "\51", "\54", "\173", "\175", "\73", 
"\114\151\142\162\141\162\171", "\127\105\102\123\111\124\105", "\102\125\111\114\104\111\116\107", 
"\124\111\115\105\117\106\131\105\101\122", "\123\124\101\122\124", "\105\116\104", "\110\117\125\122\123", 
"\103\114\117\123\105\104", "\123\124\101\106\106", "\120\117\123\111\124\111\117\116", 
"\105\115\101\111\114", "\124\131\120\105", "\122\101\124\105", 
"\102\117\117\113\103\117\114\114\105\103\124\111\117\116", "\102\117\117\113", "\124\111\124\114\105", "\101\125\124\110\117\122", null, 
null, "\101\115", "\120\115", null, "\150\164\164\160\72\57\57", 
"\150\164\164\160\163\72\57\57", null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x5fefffffe1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[63];
private final int[] jjstateSet = new int[126];
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
   for (i = 63; i-- > 0;)
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