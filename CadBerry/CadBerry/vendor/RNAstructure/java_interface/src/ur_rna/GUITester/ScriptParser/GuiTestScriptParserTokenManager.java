/* GuiTestScriptParserTokenManager.java */
/* Generated By:JJTree&JavaCC: Do not edit this line. GuiTestScriptParserTokenManager.java */
 package ur_rna.GUITester.ScriptParser;

/** Token Manager. */
@SuppressWarnings("unused")public class GuiTestScriptParserTokenManager implements GuiTestScriptParserConstants {

  /** debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0, long active1){
   switch (pos)
   {
      case 0:
         if ((active0 & 0x380L) != 0L)
         {
            jjmatchedKind = 28;
            return 30;
         }
         if ((active0 & 0x4000000000000000L) != 0L || (active1 & 0x1000L) != 0L)
            return 37;
         if ((active0 & 0x10000000000L) != 0L)
            return 6;
         return -1;
      case 1:
         if ((active0 & 0x380L) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 28;
               jjmatchedPos = 1;
            }
            return 30;
         }
         return -1;
      case 2:
         if ((active0 & 0x380L) != 0L)
         {
            if (jjmatchedPos != 2)
            {
               jjmatchedKind = 28;
               jjmatchedPos = 2;
            }
            return 30;
         }
         return -1;
      case 3:
         if ((active0 & 0x100L) != 0L)
         {
            jjmatchedKind = 28;
            jjmatchedPos = 3;
            return 30;
         }
         if ((active0 & 0x280L) != 0L)
            return 30;
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0, long active1){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0, active1), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 33:
         jjmatchedKind = 46;
         return jjMoveStringLiteralDfa1_0(0x20000000000000L, 0x0L);
      case 35:
         return jjStopAtPos(0, 26);
      case 37:
         jjmatchedKind = 66;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x10000L);
      case 38:
         jjmatchedKind = 63;
         return jjMoveStringLiteralDfa1_0(0x80000000000000L, 0x2000L);
      case 40:
         return jjStopAtPos(0, 32);
      case 41:
         return jjStopAtPos(0, 33);
      case 42:
         jjmatchedKind = 61;
         return jjMoveStringLiteralDfa1_0(0x1000000000000000L, 0x800L);
      case 43:
         jjmatchedKind = 58;
         return jjMoveStringLiteralDfa1_0(0x100000000000000L, 0x200L);
      case 44:
         return jjStopAtPos(0, 39);
      case 45:
         jjmatchedKind = 59;
         return jjMoveStringLiteralDfa1_0(0x200020000000000L, 0x400L);
      case 46:
         return jjStartNfaWithStates_0(0, 40, 6);
      case 47:
         jjmatchedKind = 62;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x1000L);
      case 58:
         jjmatchedKind = 49;
         return jjMoveStringLiteralDfa1_0(0x80000000000L, 0x0L);
      case 59:
         return jjStopAtPos(0, 38);
      case 60:
         jjmatchedKind = 45;
         return jjMoveStringLiteralDfa1_0(0x8000000000000L, 0x20018L);
      case 61:
         jjmatchedKind = 42;
         return jjMoveStringLiteralDfa1_0(0x4000000000000L, 0x0L);
      case 62:
         jjmatchedKind = 44;
         return jjMoveStringLiteralDfa1_0(0x10000000000000L, 0xc0160L);
      case 63:
         return jjStopAtPos(0, 48);
      case 64:
         return jjStopAtPos(0, 27);
      case 91:
         return jjStopAtPos(0, 36);
      case 93:
         return jjStopAtPos(0, 37);
      case 94:
         jjmatchedKind = 65;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x8000L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa1_0(0x100L, 0x0L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa1_0(0x200L, 0x0L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa1_0(0x80L, 0x0L);
      case 123:
         return jjStopAtPos(0, 34);
      case 124:
         jjmatchedKind = 64;
         return jjMoveStringLiteralDfa1_0(0x40000000000000L, 0x4000L);
      case 125:
         return jjStopAtPos(0, 35);
      case 126:
         jjmatchedKind = 47;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x80L);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0, long active1){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0, active1);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active0 & 0x80000000000000L) != 0L)
            return jjStopAtPos(1, 55);
         break;
      case 42:
         if ((active0 & 0x1000000000000000L) != 0L)
            return jjStopAtPos(1, 60);
         break;
      case 43:
         if ((active0 & 0x100000000000000L) != 0L)
            return jjStopAtPos(1, 56);
         break;
      case 45:
         if ((active0 & 0x200000000000000L) != 0L)
            return jjStopAtPos(1, 57);
         break;
      case 60:
         if ((active1 & 0x8L) != 0L)
         {
            jjmatchedKind = 67;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0x20010L);
      case 61:
         if ((active0 & 0x80000000000L) != 0L)
            return jjStopAtPos(1, 43);
         else if ((active0 & 0x4000000000000L) != 0L)
            return jjStopAtPos(1, 50);
         else if ((active0 & 0x8000000000000L) != 0L)
            return jjStopAtPos(1, 51);
         else if ((active0 & 0x10000000000000L) != 0L)
            return jjStopAtPos(1, 52);
         else if ((active0 & 0x20000000000000L) != 0L)
            return jjStopAtPos(1, 53);
         else if ((active1 & 0x200L) != 0L)
            return jjStopAtPos(1, 73);
         else if ((active1 & 0x400L) != 0L)
            return jjStopAtPos(1, 74);
         else if ((active1 & 0x800L) != 0L)
            return jjStopAtPos(1, 75);
         else if ((active1 & 0x1000L) != 0L)
            return jjStopAtPos(1, 76);
         else if ((active1 & 0x2000L) != 0L)
            return jjStopAtPos(1, 77);
         else if ((active1 & 0x4000L) != 0L)
            return jjStopAtPos(1, 78);
         else if ((active1 & 0x8000L) != 0L)
            return jjStopAtPos(1, 79);
         else if ((active1 & 0x10000L) != 0L)
            return jjStopAtPos(1, 80);
         break;
      case 62:
         if ((active0 & 0x20000000000L) != 0L)
            return jjStopAtPos(1, 41);
         else if ((active1 & 0x20L) != 0L)
         {
            jjmatchedKind = 69;
            jjmatchedPos = 1;
         }
         else if ((active1 & 0x80L) != 0L)
            return jjStopAtPos(1, 71);
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0xc0100L);
      case 65:
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x100L, active1, 0L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x80L, active1, 0L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x200L, active1, 0L);
      case 124:
         if ((active0 & 0x40000000000000L) != 0L)
            return jjStopAtPos(1, 54);
         else if ((active1 & 0x40L) != 0L)
            return jjStopAtPos(1, 70);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0, active1);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0, long old1, long active1){
   if (((active0 &= old0) | (active1 &= old1)) == 0L)
      return jjStartNfa_0(0, old0, old1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0, active1);
      return 2;
   }
   switch(curChar)
   {
      case 60:
         if ((active1 & 0x10L) != 0L)
            return jjStopAtPos(2, 68);
         break;
      case 61:
         if ((active1 & 0x20000L) != 0L)
            return jjStopAtPos(2, 81);
         else if ((active1 & 0x40000L) != 0L)
            return jjStopAtPos(2, 82);
         break;
      case 62:
         if ((active1 & 0x100L) != 0L)
         {
            jjmatchedKind = 72;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0x80000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x300L, active1, 0L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x80L, active1, 0L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0, active1);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0, long old1, long active1){
   if (((active0 &= old0) | (active1 &= old1)) == 0L)
      return jjStartNfa_0(1, old0, old1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0, active1);
      return 3;
   }
   switch(curChar)
   {
      case 61:
         if ((active1 & 0x80000L) != 0L)
            return jjStopAtPos(3, 83);
         break;
      case 69:
      case 101:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(3, 7, 30);
         break;
      case 76:
      case 108:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(3, 9, 30);
         break;
      case 83:
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x100L, active1, 0L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0, active1);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0, long old1, long active1){
   if (((active0 &= old0) | (active1 &= old1)) == 0L)
      return jjStartNfa_0(2, old0, old1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0, 0L);
      return 4;
   }
   switch(curChar)
   {
      case 69:
      case 101:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(4, 8, 30);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0, 0L);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0xfffffffffffffffeL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec2 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 61;
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
               case 37:
                  if (curChar == 42)
                     { jjCheckNAddTwoStates(40, 41); }
                  else if (curChar == 47)
                  {
                     if (kind > 5)
                        kind = 5;
                     { jjCheckNAdd(38); }
                  }
                  break;
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 10)
                        kind = 10;
                     { jjCheckNAddStates(0, 8); }
                  }
                  else if ((0x2400L & l) != 0L)
                  {
                     if (kind > 3)
                        kind = 3;
                  }
                  else if (curChar == 47)
                     { jjAddStates(9, 10); }
                  else if (curChar == 39)
                     { jjCheckNAddStates(11, 13); }
                  else if (curChar == 34)
                     { jjCheckNAddStates(14, 16); }
                  else if (curChar == 46)
                     { jjCheckNAdd(6); }
                  if (curChar == 48)
                  {
                     if (kind > 10)
                        kind = 10;
                     { jjCheckNAddStates(17, 19); }
                  }
                  break;
               case 2:
                  if (curChar == 10 && kind > 4)
                     kind = 4;
                  break;
               case 3:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 4:
                  if ((0x2400L & l) != 0L && kind > 4)
                     kind = 4;
                  break;
               case 5:
                  if (curChar == 46)
                     { jjCheckNAdd(6); }
                  break;
               case 6:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 17)
                     kind = 17;
                  { jjCheckNAddStates(20, 22); }
                  break;
               case 8:
                  if ((0x280000000000L & l) != 0L)
                     { jjCheckNAdd(9); }
                  break;
               case 9:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 17)
                     kind = 17;
                  { jjCheckNAddTwoStates(9, 10); }
                  break;
               case 11:
                  if (curChar == 34)
                     { jjCheckNAddStates(14, 16); }
                  break;
               case 13:
                  if ((0x9400000000L & l) != 0L)
                     { jjCheckNAddStates(14, 16); }
                  break;
               case 14:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     { jjCheckNAddStates(14, 16); }
                  break;
               case 15:
                  if (curChar == 34 && kind > 20)
                     kind = 20;
                  break;
               case 17:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 18;
                  break;
               case 18:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 19;
                  break;
               case 19:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 20;
                  break;
               case 20:
               case 23:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddStates(14, 16); }
                  break;
               case 22:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 23;
                  break;
               case 24:
                  if (curChar == 39)
                     { jjCheckNAddStates(11, 13); }
                  break;
               case 25:
                  if ((0xffffff7fffffffffL & l) != 0L)
                     { jjCheckNAddStates(11, 13); }
                  break;
               case 26:
                  if (curChar == 39 && kind > 20)
                     kind = 20;
                  break;
               case 28:
                  if (curChar == 34)
                     { jjCheckNAddStates(11, 13); }
                  break;
               case 30:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 28)
                     kind = 28;
                  jjstateSet[jjnewStateCnt++] = 30;
                  break;
               case 31:
                  if (curChar != 48)
                     break;
                  if (kind > 10)
                     kind = 10;
                  { jjCheckNAddStates(17, 19); }
                  break;
               case 33:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 10)
                     kind = 10;
                  { jjCheckNAddTwoStates(33, 34); }
                  break;
               case 35:
                  if ((0xff000000000000L & l) == 0L)
                     break;
                  if (kind > 10)
                     kind = 10;
                  { jjCheckNAddTwoStates(35, 34); }
                  break;
               case 36:
                  if (curChar == 47)
                     { jjAddStates(9, 10); }
                  break;
               case 38:
                  if ((0xffffffffffffdbffL & l) == 0L)
                     break;
                  if (kind > 5)
                     kind = 5;
                  { jjCheckNAdd(38); }
                  break;
               case 39:
                  if (curChar == 42)
                     { jjCheckNAddTwoStates(40, 41); }
                  break;
               case 40:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(40, 41); }
                  break;
               case 41:
                  if (curChar == 42)
                     { jjCheckNAddStates(23, 25); }
                  break;
               case 42:
                  if ((0xffff7bffffffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(43, 41); }
                  break;
               case 43:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(43, 41); }
                  break;
               case 44:
                  if (curChar == 47 && kind > 6)
                     kind = 6;
                  break;
               case 45:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 10)
                     kind = 10;
                  { jjCheckNAddStates(0, 8); }
                  break;
               case 46:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 10)
                     kind = 10;
                  { jjCheckNAddTwoStates(46, 34); }
                  break;
               case 47:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(47, 48); }
                  break;
               case 48:
                  if (curChar != 46)
                     break;
                  if (kind > 17)
                     kind = 17;
                  { jjCheckNAddStates(26, 28); }
                  break;
               case 49:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 17)
                     kind = 17;
                  { jjCheckNAddStates(26, 28); }
                  break;
               case 51:
                  if ((0x280000000000L & l) != 0L)
                     { jjCheckNAdd(52); }
                  break;
               case 52:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 17)
                     kind = 17;
                  { jjCheckNAddTwoStates(52, 10); }
                  break;
               case 53:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(53, 54); }
                  break;
               case 55:
                  if ((0x280000000000L & l) != 0L)
                     { jjCheckNAdd(56); }
                  break;
               case 56:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 17)
                     kind = 17;
                  { jjCheckNAddTwoStates(56, 10); }
                  break;
               case 57:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddStates(29, 31); }
                  break;
               case 59:
                  if ((0x280000000000L & l) != 0L)
                     { jjCheckNAdd(60); }
                  break;
               case 60:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(60, 10); }
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
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 28)
                        kind = 28;
                     { jjCheckNAdd(30); }
                  }
                  else if (curChar == 92)
                     { jjAddStates(32, 33); }
                  break;
               case 1:
                  if (curChar == 92)
                     { jjAddStates(32, 33); }
                  break;
               case 7:
                  if ((0x2000000020L & l) != 0L)
                     { jjAddStates(34, 35); }
                  break;
               case 10:
                  if ((0x5000000050L & l) != 0L && kind > 17)
                     kind = 17;
                  break;
               case 12:
                  if (curChar == 92)
                     { jjAddStates(36, 38); }
                  break;
               case 13:
                  if ((0x14404410144044L & l) != 0L)
                     { jjCheckNAddStates(14, 16); }
                  break;
               case 14:
                  if ((0xffffffffefffffffL & l) != 0L)
                     { jjCheckNAddStates(14, 16); }
                  break;
               case 16:
                  if ((0x20000000200000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 17;
                  break;
               case 21:
                  if ((0x100000001000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 22;
                  break;
               case 22:
                  if ((0x7e0000007eL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 23;
                  break;
               case 23:
                  if ((0x7e0000007eL & l) != 0L)
                     { jjCheckNAddStates(14, 16); }
                  break;
               case 25:
                  { jjAddStates(11, 13); }
                  break;
               case 27:
                  if (curChar == 92)
                     { jjAddStates(39, 40); }
                  break;
               case 29:
               case 30:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 28)
                     kind = 28;
                  { jjCheckNAdd(30); }
                  break;
               case 32:
                  if ((0x100000001000000L & l) != 0L)
                     { jjCheckNAdd(33); }
                  break;
               case 33:
                  if ((0x7e0000007eL & l) == 0L)
                     break;
                  if (kind > 10)
                     kind = 10;
                  { jjCheckNAddTwoStates(33, 34); }
                  break;
               case 34:
                  if ((0x8100400081004L & l) != 0L && kind > 10)
                     kind = 10;
                  break;
               case 38:
                  if (kind > 5)
                     kind = 5;
                  jjstateSet[jjnewStateCnt++] = 38;
                  break;
               case 40:
                  { jjCheckNAddTwoStates(40, 41); }
                  break;
               case 42:
               case 43:
                  { jjCheckNAddTwoStates(43, 41); }
                  break;
               case 50:
                  if ((0x2000000020L & l) != 0L)
                     { jjAddStates(41, 42); }
                  break;
               case 54:
                  if ((0x2000000020L & l) != 0L)
                     { jjAddStates(43, 44); }
                  break;
               case 58:
                  if ((0x2000000020L & l) != 0L)
                     { jjAddStates(45, 46); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 14:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     { jjAddStates(14, 16); }
                  break;
               case 25:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     { jjAddStates(11, 13); }
                  break;
               case 38:
                  if (!jjCanMove_0(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 5)
                     kind = 5;
                  jjstateSet[jjnewStateCnt++] = 38;
                  break;
               case 40:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     { jjCheckNAddTwoStates(40, 41); }
                  break;
               case 42:
               case 43:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     { jjCheckNAddTwoStates(43, 41); }
                  break;
               default : if (i1 == 0 || l1 == 0 || i2 == 0 ||  l2 == 0) break; else break;
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
      if ((i = jjnewStateCnt) == (startsAt = 61 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   46, 34, 47, 48, 53, 54, 57, 58, 10, 37, 39, 25, 26, 27, 12, 14, 
   15, 32, 35, 34, 6, 7, 10, 42, 41, 44, 49, 50, 10, 57, 58, 10, 
   3, 4, 8, 9, 13, 16, 21, 24, 28, 51, 52, 55, 56, 59, 60, 
};
private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec2[i2] & l2) != 0L);
      default :
         return (jjbitVec0[i1] & l1) != 0L;
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, "\43", 
"\100", null, null, null, null, "\50", "\51", "\173", "\175", "\133", "\135", "\73", 
"\54", "\56", "\55\76", "\75", "\72\75", "\76", "\74", "\41", "\176", "\77", "\72", 
"\75\75", "\74\75", "\76\75", "\41\75", "\174\174", "\46\46", "\53\53", "\55\55", "\53", 
"\55", "\52\52", "\52", "\57", "\46", "\174", "\136", "\45", "\74\74", "\74\74\74", 
"\76\76", "\76\174", "\176\76", "\76\76\76", "\53\75", "\55\75", "\52\75", "\57\75", 
"\46\75", "\174\75", "\136\75", "\45\75", "\74\74\75", "\76\76\75", "\76\76\76\75", };
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
  Token specialToken = null;
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
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100000200L & (1L << curChar)) != 0L)
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
         matchedToken.specialToken = specialToken;
         return matchedToken;
      }
      else
      {
         if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
         {
            matchedToken = jjFillToken();
            if (specialToken == null)
               specialToken = matchedToken;
            else
            {
               matchedToken.specialToken = specialToken;
               specialToken = (specialToken.next = matchedToken);
            }
         }
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

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

    /** Constructor. */
    public GuiTestScriptParserTokenManager(JavaCharStream stream){

      if (JavaCharStream.staticFlag)
            throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");

    input_stream = stream;
  }

  /** Constructor. */
  public GuiTestScriptParserTokenManager (JavaCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  public void ReInit(JavaCharStream stream)
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
    for (i = 61; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  public void ReInit(JavaCharStream stream, int lexState)
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  public void SwitchTo(int lexState)
  {
    if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0xffffffff1c120789L, 0xfffffL, 
};
static final long[] jjtoSkip = {
   0x76L, 0x0L, 
};
static final long[] jjtoSpecial = {
   0x60L, 0x0L, 
};
    protected JavaCharStream  input_stream;

    private final int[] jjrounds = new int[61];
    private final int[] jjstateSet = new int[2 * 61];

    
    protected char curChar;
}
