/* The following code was generated by JFlex 1.6.1 */

/* Secci�n de declaraciones de JFlex */

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>D:/SegundoSemestre2018/Compiladores e Interpretes/Proyectos/Proyecto1/Scanner/Scanner_ABC/src/ScannerABC.flex</tt>
 */
public class ScannerABC {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\1\0\10\0\1\0\1\2\1\6\1\6\1\3\22\0\1\1\1\61"+
    "\1\63\1\62\1\61\1\61\1\61\1\0\1\27\1\32\1\30\1\54"+
    "\1\53\1\12\1\10\1\34\1\7\11\5\1\60\1\53\1\57\1\56"+
    "\1\55\1\0\1\61\1\14\1\36\1\42\1\16\1\11\1\13\1\40"+
    "\1\45\1\24\1\4\1\52\1\41\1\26\1\15\1\17\1\50\1\4"+
    "\1\20\1\44\1\21\1\47\1\25\1\46\1\22\1\35\1\4\1\53"+
    "\1\0\1\53\1\61\1\4\1\0\1\14\1\36\1\42\1\16\1\37"+
    "\1\13\1\40\1\45\1\24\1\4\1\52\1\41\1\26\1\15\1\17"+
    "\1\50\1\4\1\20\1\44\1\21\1\47\1\25\1\46\1\22\1\35"+
    "\1\4\1\33\1\0\1\31\7\0\1\6\252\0\2\23\115\0\1\43"+
    "\u1ea8\0\1\6\1\6\u0100\0\1\51\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udee5\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\3\2\4\1\5\1\3\1\6"+
    "\10\3\1\0\3\3\1\6\1\0\1\6\4\3\1\0"+
    "\4\3\5\6\2\0\1\7\1\10\1\5\2\0\1\4"+
    "\2\3\1\10\2\3\1\0\5\3\1\0\1\3\1\11"+
    "\1\0\1\3\1\11\1\12\5\3\3\11\1\3\1\10"+
    "\2\13\7\3\3\0\4\3\1\0\5\3\2\10\2\7"+
    "\1\14\1\15\1\16\1\0\1\5\1\0\1\3\1\11"+
    "\3\3\1\12\4\3\1\0\1\3\2\0\6\3\2\0"+
    "\2\3\2\0\4\3\1\6\1\17\1\7\1\20\1\0"+
    "\1\15\1\10\5\3\1\0\1\3\1\13\1\0\2\3"+
    "\2\0\2\3\1\0\3\3\2\0\1\21\2\3\1\0"+
    "\1\3\2\0\1\3\1\0\2\3\1\0\1\21\1\10"+
    "\1\0\3\3\1\0\1\10\1\0\1\21\1\3\2\0"+
    "\1\21\1\0\1\10";

  private static int [] zzUnpackAction() {
    int [] result = new int[193];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\64\0\64\0\150\0\234\0\320\0\u0104\0\64"+
    "\0\u0138\0\u016c\0\u01a0\0\u01d4\0\u0208\0\u023c\0\u0270\0\u02a4"+
    "\0\u02d8\0\u030c\0\u0340\0\u0374\0\u03a8\0\u03dc\0\u0410\0\u0444"+
    "\0\u0478\0\u04ac\0\u04e0\0\u0514\0\u0548\0\u057c\0\u05b0\0\u05e4"+
    "\0\u0618\0\u064c\0\64\0\u0680\0\u06b4\0\u06e8\0\u071c\0\u016c"+
    "\0\u0750\0\u0784\0\u07b8\0\u07ec\0\u0820\0\u0854\0\u0888\0\u08bc"+
    "\0\u08f0\0\64\0\u0924\0\u0958\0\u098c\0\u09c0\0\u09f4\0\u0a28"+
    "\0\u0a5c\0\u0a90\0\u0ac4\0\u0af8\0\u0b2c\0\u0b60\0\u0b94\0\234"+
    "\0\234\0\u0bc8\0\u0bfc\0\u0c30\0\u0c64\0\u0c98\0\64\0\u0ccc"+
    "\0\u0d00\0\u0d34\0\u0d68\0\64\0\u0d9c\0\u0dd0\0\u0e04\0\u0e38"+
    "\0\u0e6c\0\u0ea0\0\u0ed4\0\u0f08\0\u0f3c\0\u0f70\0\u0fa4\0\u0fd8"+
    "\0\u100c\0\u1040\0\u1074\0\u10a8\0\u10dc\0\u1110\0\u1144\0\u1178"+
    "\0\u11ac\0\u11e0\0\u1214\0\u1248\0\u127c\0\u12b0\0\u12e4\0\u12e4"+
    "\0\u12b0\0\u1318\0\u134c\0\u1380\0\u13b4\0\u13e8\0\u141c\0\u1450"+
    "\0\64\0\u1484\0\u14b8\0\u14ec\0\u1520\0\u1554\0\u1588\0\u0d68"+
    "\0\u15bc\0\u15f0\0\u1624\0\u1658\0\u168c\0\u16c0\0\u16f4\0\u1728"+
    "\0\u175c\0\u1790\0\u17c4\0\u17f8\0\u182c\0\u1860\0\u1894\0\u18c8"+
    "\0\u18fc\0\u11e0\0\u1930\0\u1964\0\u12b0\0\u1998\0\u19cc\0\u1a00"+
    "\0\u1a34\0\u1a68\0\u1a9c\0\u1ad0\0\u1b04\0\u1b38\0\u1b6c\0\u0d68"+
    "\0\u1ba0\0\u1bd4\0\u1c08\0\u1c3c\0\u1c70\0\u1ca4\0\u1cd8\0\u1d0c"+
    "\0\u1d40\0\u1d74\0\u1da8\0\u1ddc\0\u1e10\0\u1e44\0\u1e78\0\u1eac"+
    "\0\u1ee0\0\u1f14\0\u1f48\0\u1f7c\0\u1fb0\0\u1fe4\0\u2018\0\u204c"+
    "\0\u2080\0\u20b4\0\u20e8\0\u211c\0\u2150\0\u2184\0\u21b8\0\u21ec"+
    "\0\u2220\0\u2254\0\u2288\0\u22bc\0\u22f0\0\u2324\0\u2358\0\u238c"+
    "\0\u23c0";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[193];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\0\1\2\1\3\1\4\1\5\1\6\1\0\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\12\1\0\1\12\1\30\1\31\1\5\1\32\1\11"+
    "\1\33\1\34\1\35\1\36\1\37\1\5\1\40\1\41"+
    "\1\42\1\0\1\5\1\43\1\44\1\45\1\12\1\46"+
    "\1\47\1\50\1\51\1\52\66\0\1\3\65\0\2\5"+
    "\1\0\1\5\1\0\1\5\1\0\10\5\1\0\3\5"+
    "\6\0\6\5\1\0\5\5\1\0\1\5\15\0\1\53"+
    "\1\6\1\0\1\6\1\54\1\53\1\0\10\53\1\0"+
    "\3\53\6\0\6\53\1\0\5\53\1\0\1\53\7\0"+
    "\1\55\1\56\4\0\1\53\1\57\1\0\1\57\1\54"+
    "\1\53\1\0\10\53\1\0\3\53\6\0\6\53\1\0"+
    "\5\53\1\0\1\53\7\0\1\55\1\56\4\0\2\5"+
    "\1\0\1\5\1\0\1\5\1\0\2\5\1\60\5\5"+
    "\1\0\3\5\6\0\4\5\1\61\1\5\1\0\5\5"+
    "\1\0\1\5\11\0\2\62\2\0\2\62\1\0\55\62"+
    "\4\0\2\5\1\0\1\5\1\0\1\5\1\0\1\5"+
    "\1\63\2\5\1\64\3\5\1\65\1\66\2\5\6\0"+
    "\6\5\1\0\3\5\1\67\1\5\1\0\1\5\15\0"+
    "\2\5\1\0\1\5\1\0\1\5\1\0\2\5\1\70"+
    "\2\5\1\71\2\5\1\0\3\5\6\0\6\5\1\0"+
    "\5\5\1\0\1\5\15\0\2\5\1\0\1\5\1\0"+
    "\1\5\1\0\4\5\1\72\3\5\1\73\1\74\2\5"+
    "\6\0\6\5\1\0\5\5\1\0\1\5\15\0\2\5"+
    "\1\0\1\5\1\0\1\5\1\0\4\5\1\75\3\5"+
    "\1\76\1\77\2\5\6\0\6\5\1\0\5\5\1\0"+
    "\1\5\15\0\2\5\1\0\1\5\1\0\1\5\1\0"+
    "\1\100\4\5\1\101\2\5\1\0\3\5\6\0\6\5"+
    "\1\0\5\5\1\0\1\5\15\0\2\5\1\0\1\5"+
    "\1\0\1\102\1\0\10\5\1\0\3\5\6\0\2\5"+
    "\1\102\3\5\1\0\5\5\1\0\1\5\15\0\2\5"+
    "\1\0\1\5\1\0\1\5\1\0\4\5\1\100\1\103"+
    "\2\5\1\0\3\5\6\0\1\104\5\5\1\0\1\5"+
    "\1\105\3\5\1\0\1\5\15\0\2\5\1\0\1\5"+
    "\1\0\1\5\1\0\4\5\1\106\3\5\1\0\3\5"+
    "\6\0\6\5\1\0\5\5\1\0\1\5\24\0\1\107"+
    "\1\0\1\110\52\0\2\5\1\0\1\5\1\0\1\5"+
    "\1\0\1\100\1\5\1\111\5\5\1\0\3\5\6\0"+
    "\6\5\1\0\5\5\1\0\1\5\15\0\2\5\1\0"+
    "\1\5\1\0\1\5\1\0\1\5\1\112\6\5\1\0"+
    "\3\5\6\0\6\5\1\0\5\5\1\0\1\5\15\0"+
    "\2\5\1\0\1\5\1\0\1\5\1\0\4\5\1\70"+
    "\3\5\1\0\3\5\6\0\6\5\1\0\5\5\1\0"+
    "\1\5\11\0\2\62\2\0\2\62\1\0\21\62\1\113"+
    "\33\62\31\30\1\114\32\30\34\0\1\115\21\0\1\43"+
    "\11\0\2\5\1\0\1\5\1\0\1\116\1\0\4\5"+
    "\1\117\3\5\1\0\3\5\6\0\1\120\1\5\1\116"+
    "\3\5\1\0\5\5\1\0\1\5\15\0\2\5\1\0"+
    "\1\5\1\0\1\5\1\0\4\5\1\121\3\5\1\0"+
    "\3\5\6\0\6\5\1\0\5\5\1\0\1\5\15\0"+
    "\2\5\1\0\1\5\1\0\1\5\1\0\1\5\1\122"+
    "\2\5\1\123\3\5\1\0\3\5\6\0\6\5\1\0"+
    "\5\5\1\0\1\5\15\0\2\5\1\0\1\5\1\0"+
    "\1\5\1\0\1\5\1\61\2\5\1\124\3\5\1\0"+
    "\3\5\6\0\6\5\1\0\1\5\1\25\3\5\1\0"+
    "\1\5\22\0\1\125\7\0\1\126\15\0\1\125\5\0"+
    "\1\127\22\0\2\5\1\0\1\5\1\0\1\130\1\0"+
    "\6\5\1\131\1\5\1\0\3\5\6\0\2\5\1\130"+
    "\3\5\1\0\1\5\1\132\3\5\1\0\1\5\15\0"+
    "\2\5\1\0\1\5\1\0\1\5\1\0\5\5\1\133"+
    "\2\5\1\134\1\135\2\5\6\0\6\5\1\0\1\5"+
    "\1\136\3\5\1\0\1\5\15\0\2\5\1\0\1\5"+
    "\1\0\1\5\1\0\2\5\1\137\5\5\1\0\3\5"+
    "\6\0\6\5\1\0\5\5\1\0\1\5\15\0\2\5"+
    "\1\0\1\5\1\0\1\5\1\0\1\5\1\140\3\5"+
    "\1\141\2\5\1\0\3\5\6\0\6\5\1\0\5\5"+
    "\1\0\1\5\11\0\2\62\2\0\2\62\1\0\45\62"+
    "\1\142\7\62\55\0\1\47\1\43\62\0\2\43\1\47"+
    "\62\0\1\43\5\0\2\62\2\0\1\62\1\143\1\0"+
    "\1\143\54\62\3\144\1\145\57\144\1\146\4\0\1\53"+
    "\4\0\1\53\1\0\10\53\1\0\3\53\6\0\6\53"+
    "\1\0\5\53\1\0\1\53\16\0\1\147\1\0\1\150"+
    "\61\0\1\151\1\0\1\151\54\0\63\56\1\151\4\0"+
    "\1\53\1\57\1\0\1\57\1\152\1\53\1\0\10\53"+
    "\1\0\3\53\6\0\6\53\1\0\5\53\1\0\1\53"+
    "\7\0\1\55\1\56\4\0\2\5\1\0\1\5\1\0"+
    "\1\5\1\0\3\5\1\100\4\5\1\0\3\5\6\0"+
    "\6\5\1\0\5\5\1\0\1\5\15\0\2\5\1\0"+
    "\1\5\1\0\1\5\1\0\10\5\1\0\3\5\6\0"+
    "\6\5\1\153\1\154\4\5\1\0\1\5\15\0\2\5"+
    "\1\0\1\5\1\0\1\5\1\0\10\5\1\0\3\5"+
    "\6\0\4\5\1\61\1\5\1\0\5\5\1\0\1\5"+
    "\15\0\2\5\1\0\1\5\1\0\1\5\1\0\5\5"+
    "\1\155\2\5\1\0\3\5\6\0\6\5\1\0\5\5"+
    "\1\0\1\5\52\0\1\153\26\0\2\5\1\0\1\5"+
    "\1\0\1\5\1\0\10\5\1\0\3\5\6\0\4\5"+
    "\1\154\1\5\1\0\5\5\1\0\1\5\15\0\2\5"+
    "\1\0\1\5\1\0\1\5\1\0\2\5\1\156\5\5"+
    "\1\0\3\5\6\0\6\5\1\0\5\5\1\0\1\5"+
    "\15\0\2\5\1\0\1\5\1\0\1\5\1\0\3\5"+
    "\1\101\4\5\1\0\3\5\6\0\6\5\1\0\5\5"+
    "\1\0\1\5\15\0\2\5\1\0\1\5\1\0\1\5"+
    "\1\0\5\5\1\157\2\5\1\0\3\5\6\0\6\5"+
    "\1\0\5\5\1\0\1\5\15\0\2\5\1\0\1\5"+
    "\1\0\1\5\1\0\6\5\1\101\1\5\1\0\3\5"+
    "\6\0\6\5\1\0\5\5\1\0\1\5\52\0\1\107"+
    "\26\0\2\5\1\0\1\5\1\0\1\5\1\0\10\5"+
    "\1\0\3\5\6\0\4\5\1\100\1\5\1\0\5\5"+
    "\1\0\1\5\15\0\2\5\1\0\1\5\1\0\1\5"+
    "\1\0\10\5\1\0\3\5\6\0\6\5\1\0\2\5"+
    "\1\160\2\5\1\0\1\5\36\0\1\161\42\0\2\5"+
    "\1\0\1\5\1\0\1\5\1\0\10\5\1\0\1\5"+
    "\1\101\1\5\6\0\6\5\1\0\5\5\1\0\1\5"+
    "\15\0\2\5\1\0\1\5\1\0\1\5\1\0\1\5"+
    "\1\162\6\5\1\0\3\5\6\0\5\5\1\163\1\0"+
    "\4\5\1\164\1\0\1\5\15\0\2\5\1\0\1\5"+
    "\1\0\1\5\1\0\10\5\1\0\3\5\6\0\6\5"+
    "\1\0\3\5\1\154\1\5\1\0\1\5\15\0\2\5"+
    "\1\0\1\5\1\0\1\5\1\0\10\5\1\0\3\5"+
    "\6\0\6\5\1\0\4\5\1\154\1\0\1\5\15\0"+
    "\2\5\1\0\1\5\1\0\1\165\1\0\10\5\1\0"+
    "\3\5\6\0\2\5\1\165\3\5\1\0\5\5\1\0"+
    "\1\5\15\0\2\5\1\0\1\5\1\0\1\5\1\0"+
    "\5\5\1\101\2\5\1\0\3\5\6\0\6\5\1\0"+
    "\5\5\1\0\1\5\32\0\1\107\17\0\1\166\26\0"+
    "\2\5\1\0\1\5\1\0\1\5\1\0\6\5\1\100"+
    "\1\5\1\0\3\5\6\0\4\5\1\167\1\5\1\0"+
    "\5\5\1\0\1\5\15\0\2\5\1\0\1\5\1\0"+
    "\1\5\1\0\5\5\1\100\2\5\1\0\3\5\6\0"+
    "\6\5\1\0\5\5\1\0\1\5\11\0\30\170\1\171"+
    "\1\0\32\170\2\115\2\0\2\115\1\0\55\115\4\0"+
    "\2\5\1\0\1\5\1\0\1\5\1\0\10\5\1\0"+
    "\3\5\6\0\3\5\1\172\2\5\1\0\5\5\1\0"+
    "\1\5\15\0\2\5\1\0\1\5\1\0\1\5\1\0"+
    "\4\5\1\173\3\5\1\0\3\5\6\0\6\5\1\0"+
    "\5\5\1\0\1\5\15\0\2\5\1\0\1\5\1\0"+
    "\1\5\1\0\6\5\1\154\1\5\1\0\3\5\6\0"+
    "\6\5\1\0\5\5\1\0\1\5\15\0\2\5\1\0"+
    "\1\5\1\0\1\5\1\0\6\5\1\174\1\5\1\0"+
    "\3\5\6\0\6\5\1\0\5\5\1\0\1\5\15\0"+
    "\2\5\1\0\1\5\1\0\1\5\1\0\10\5\1\0"+
    "\3\5\6\0\1\5\1\175\4\5\1\0\5\5\1\0"+
    "\1\5\15\0\2\5\1\0\1\5\1\0\1\5\1\0"+
    "\2\5\1\176\5\5\1\0\3\5\6\0\6\5\1\0"+
    "\5\5\1\0\1\5\15\0\2\5\1\0\1\5\1\0"+
    "\1\5\1\0\2\5\1\177\5\5\1\0\3\5\6\0"+
    "\6\5\1\0\5\5\1\0\1\5\32\0\1\107\62\0"+
    "\1\200\62\0\1\201\50\0\2\5\1\0\1\5\1\0"+
    "\1\5\1\0\6\5\1\100\1\5\1\0\3\5\6\0"+
    "\6\5\1\0\5\5\1\0\1\5\15\0\2\5\1\0"+
    "\1\5\1\0\1\5\1\0\5\5\1\202\2\5\1\0"+
    "\3\5\6\0\6\5\1\0\5\5\1\0\1\5\15\0"+
    "\2\5\1\0\1\5\1\0\1\5\1\0\4\5\1\203"+
    "\3\5\1\0\3\5\6\0\6\5\1\0\5\5\1\0"+
    "\1\5\15\0\2\5\1\0\1\5\1\0\1\5\1\0"+
    "\10\5\1\204\1\120\2\5\6\0\6\5\1\0\5\5"+
    "\1\0\1\5\32\0\1\205\46\0\2\5\1\0\1\5"+
    "\1\0\1\5\1\0\6\5\1\206\1\5\1\0\3\5"+
    "\6\0\6\5\1\0\5\5\1\0\1\5\15\0\2\5"+
    "\1\0\1\5\1\0\1\5\1\0\10\5\1\65\1\66"+
    "\2\5\6\0\6\5\1\0\5\5\1\0\1\5\15\0"+
    "\2\5\1\0\1\5\1\0\1\5\1\0\6\5\1\207"+
    "\1\5\1\0\3\5\6\0\6\5\1\0\5\5\1\0"+
    "\1\5\15\0\2\5\1\0\1\5\1\0\1\5\1\0"+
    "\10\5\1\0\3\5\6\0\5\5\1\210\1\0\5\5"+
    "\1\0\1\5\15\0\2\5\1\0\1\5\1\0\1\5"+
    "\1\0\4\5\1\211\3\5\1\0\3\5\6\0\6\5"+
    "\1\0\5\5\1\0\1\5\65\0\1\212\13\0\1\53"+
    "\1\213\1\0\1\213\1\0\1\53\1\0\10\53\1\0"+
    "\3\53\6\0\6\53\1\0\5\53\1\0\1\53\7\0"+
    "\1\55\1\56\63\214\1\215\2\214\1\144\60\214\1\215"+
    "\4\0\1\53\1\216\1\0\1\216\1\0\1\53\1\0"+
    "\10\53\1\0\3\53\6\0\6\53\1\0\5\53\1\0"+
    "\1\53\7\0\1\55\1\56\4\0\1\53\1\217\1\0"+
    "\1\217\1\0\1\220\1\0\10\53\1\0\3\53\6\0"+
    "\6\53\1\0\5\53\1\0\1\53\7\0\1\55\1\56"+
    "\5\0\1\147\1\0\1\147\65\0\1\107\25\0\1\107"+
    "\30\0\2\5\1\0\1\5\1\0\1\100\1\0\10\5"+
    "\1\0\3\5\6\0\2\5\1\100\3\5\1\0\5\5"+
    "\1\0\1\5\15\0\2\5\1\0\1\5\1\0\1\5"+
    "\1\0\10\5\1\0\3\5\6\0\6\5\1\0\2\5"+
    "\1\221\2\5\1\0\1\5\15\0\2\5\1\0\1\5"+
    "\1\0\1\5\1\0\10\5\1\0\3\5\6\0\5\5"+
    "\1\222\1\0\5\5\1\0\1\5\15\0\2\5\1\0"+
    "\1\5\1\0\1\5\1\0\1\5\1\223\6\5\1\0"+
    "\3\5\6\0\6\5\1\0\5\5\1\0\1\5\15\0"+
    "\2\5\1\0\1\5\1\0\1\5\1\0\2\5\1\121"+
    "\5\5\1\0\3\5\6\0\6\5\1\0\5\5\1\0"+
    "\1\5\15\0\2\5\1\0\1\5\1\0\1\5\1\0"+
    "\3\5\1\100\4\5\1\0\3\5\6\0\4\5\1\100"+
    "\1\5\1\0\5\5\1\0\1\5\15\0\2\5\1\0"+
    "\1\5\1\0\1\5\1\0\4\5\1\224\3\5\1\0"+
    "\3\5\6\0\6\5\1\0\5\5\1\0\1\5\15\0"+
    "\2\5\1\0\1\5\1\0\1\225\1\0\10\5\1\0"+
    "\3\5\6\0\2\5\1\225\3\5\1\0\5\5\1\0"+
    "\1\5\15\0\2\5\1\0\1\5\1\0\1\5\1\0"+
    "\2\5\1\100\5\5\1\0\3\5\6\0\6\5\1\0"+
    "\5\5\1\0\1\5\34\0\2\226\43\0\2\5\1\0"+
    "\1\5\1\0\1\5\1\0\10\5\1\226\1\227\2\5"+
    "\6\0\6\5\1\0\5\5\1\0\1\5\11\0\30\170"+
    "\1\171\1\0\1\230\31\170\4\0\2\5\1\0\1\5"+
    "\1\0\1\5\1\0\10\5\1\231\1\165\2\5\6\0"+
    "\6\5\1\0\5\5\1\0\1\5\15\0\2\5\1\0"+
    "\1\5\1\0\1\5\1\0\10\5\1\0\3\5\6\0"+
    "\4\5\1\232\1\5\1\0\5\5\1\0\1\5\15\0"+
    "\2\5\1\0\1\5\1\0\1\5\1\0\4\5\1\100"+
    "\3\5\1\0\3\5\6\0\6\5\1\0\5\5\1\0"+
    "\1\5\15\0\2\5\1\0\1\5\1\0\1\74\1\0"+
    "\10\5\1\0\3\5\6\0\2\5\1\74\3\5\1\0"+
    "\5\5\1\0\1\5\15\0\2\5\1\0\1\5\1\0"+
    "\1\5\1\0\10\5\1\0\3\5\6\0\3\5\1\233"+
    "\2\5\1\0\5\5\1\0\1\5\15\0\2\5\1\0"+
    "\1\5\1\0\1\5\1\0\10\5\1\0\3\5\6\0"+
    "\6\5\1\125\1\130\4\5\1\0\1\5\34\0\2\234"+
    "\57\0\1\235\47\0\2\5\1\0\1\5\1\0\1\5"+
    "\1\0\10\5\1\234\1\236\2\5\6\0\6\5\1\0"+
    "\5\5\1\0\1\5\15\0\2\5\1\0\1\5\1\0"+
    "\1\5\1\0\5\5\1\237\2\5\1\0\3\5\6\0"+
    "\6\5\1\0\5\5\1\0\1\5\32\0\1\153\107\0"+
    "\1\107\22\0\2\5\1\0\1\5\1\0\1\5\1\0"+
    "\10\5\1\0\3\5\6\0\6\5\1\0\1\5\1\100"+
    "\3\5\1\0\1\5\15\0\2\5\1\0\1\5\1\0"+
    "\1\5\1\0\10\5\1\73\1\74\2\5\6\0\6\5"+
    "\1\0\5\5\1\0\1\5\15\0\2\5\1\0\1\5"+
    "\1\0\1\5\1\0\10\5\1\0\3\5\6\0\6\5"+
    "\1\0\5\5\1\240\1\241\15\0\2\5\1\0\1\5"+
    "\1\0\1\5\1\0\10\5\1\0\3\5\6\0\3\5"+
    "\1\242\1\5\1\243\1\0\5\5\1\0\1\5\15\0"+
    "\1\53\1\213\1\0\1\213\1\244\1\53\1\0\10\53"+
    "\1\0\3\53\6\0\6\53\1\0\5\53\1\0\1\53"+
    "\7\0\1\55\1\56\63\214\1\146\4\0\1\53\1\216"+
    "\1\0\1\216\1\244\1\53\1\0\10\53\1\0\3\53"+
    "\6\0\6\53\1\0\5\53\1\0\1\53\7\0\1\55"+
    "\1\56\4\0\1\53\1\217\1\0\1\217\1\244\1\220"+
    "\1\0\10\53\1\0\3\53\6\0\6\53\1\0\5\53"+
    "\1\0\1\53\7\0\1\55\1\56\1\0\1\245\2\0"+
    "\1\53\1\246\1\0\1\246\1\0\1\53\1\245\10\53"+
    "\1\0\3\53\6\0\6\53\1\0\5\53\1\0\1\53"+
    "\1\0\1\245\13\0\2\5\1\0\1\5\1\0\1\5"+
    "\1\0\1\5\1\224\6\5\1\0\3\5\6\0\6\5"+
    "\1\0\5\5\1\0\1\5\15\0\2\5\1\0\1\5"+
    "\1\0\1\5\1\0\6\5\1\247\1\5\1\0\3\5"+
    "\6\0\6\5\1\0\5\5\1\0\1\5\15\0\2\5"+
    "\1\0\1\5\1\0\1\5\1\0\10\5\1\0\3\5"+
    "\6\0\1\100\5\5\1\0\5\5\1\0\1\5\15\0"+
    "\2\5\1\0\1\5\1\0\1\5\1\0\5\5\1\60"+
    "\2\5\1\0\3\5\6\0\6\5\1\0\5\5\1\0"+
    "\1\5\15\0\2\5\1\0\1\5\1\0\1\5\1\0"+
    "\1\5\1\130\6\5\1\0\3\5\6\0\6\5\1\0"+
    "\5\5\1\0\1\5\26\0\1\153\52\0\2\5\1\0"+
    "\1\5\1\0\1\5\1\0\2\5\1\154\5\5\1\0"+
    "\3\5\6\0\6\5\1\0\5\5\1\0\1\5\26\0"+
    "\1\107\52\0\2\5\1\0\1\5\1\0\1\250\1\0"+
    "\10\5\1\0\3\5\6\0\2\5\1\250\3\5\1\0"+
    "\5\5\1\0\1\5\15\0\2\5\1\0\1\5\1\0"+
    "\1\5\1\0\10\5\1\251\1\252\2\5\6\0\6\5"+
    "\1\0\5\5\1\0\1\5\26\0\1\253\67\0\1\254"+
    "\46\0\2\5\1\0\1\5\1\0\1\5\1\0\2\5"+
    "\1\255\5\5\1\0\3\5\6\0\6\5\1\0\5\5"+
    "\1\0\1\5\15\0\2\5\1\0\1\5\1\0\1\5"+
    "\1\0\6\5\1\233\1\5\1\0\3\5\6\0\6\5"+
    "\1\0\5\5\1\0\1\5\22\0\1\256\25\0\1\256"+
    "\30\0\2\5\1\0\1\5\1\0\1\60\1\0\10\5"+
    "\1\0\3\5\6\0\2\5\1\60\3\5\1\0\5\5"+
    "\1\0\1\5\15\0\2\5\1\0\1\5\1\0\1\5"+
    "\1\0\5\5\1\257\2\5\1\0\3\5\6\0\6\5"+
    "\1\0\5\5\1\0\1\5\15\0\2\5\1\0\1\5"+
    "\1\0\1\260\1\0\10\5\1\0\3\5\6\0\2\5"+
    "\1\260\3\5\1\0\5\5\1\0\1\5\16\0\1\261"+
    "\1\0\1\261\61\0\1\246\1\0\1\246\60\0\1\53"+
    "\1\262\1\0\1\262\1\0\1\263\1\0\10\53\1\0"+
    "\3\53\6\0\6\53\1\0\5\53\1\0\1\53\7\0"+
    "\1\55\1\56\4\0\2\5\1\0\1\5\1\0\1\5"+
    "\1\0\10\5\1\264\1\265\2\5\6\0\6\5\1\0"+
    "\5\5\1\0\1\5\15\0\2\5\1\0\1\5\1\0"+
    "\1\5\1\0\1\5\1\165\6\5\1\0\3\5\6\0"+
    "\6\5\1\0\5\5\1\0\1\5\26\0\1\125\52\0"+
    "\2\5\1\0\1\5\1\0\1\5\1\0\2\5\1\130"+
    "\5\5\1\0\3\5\6\0\6\5\1\0\5\5\1\0"+
    "\1\5\51\0\1\107\46\0\2\251\43\0\2\5\1\0"+
    "\1\5\1\0\1\5\1\0\10\5\1\0\3\5\6\0"+
    "\3\5\1\100\2\5\1\0\5\5\1\0\1\5\27\0"+
    "\1\107\51\0\2\5\1\0\1\5\1\0\1\5\1\0"+
    "\1\5\1\266\6\5\1\0\3\5\6\0\6\5\1\0"+
    "\5\5\1\0\1\5\15\0\2\5\1\0\1\5\1\0"+
    "\1\5\1\0\3\5\1\267\4\5\1\0\3\5\6\0"+
    "\6\5\1\0\5\5\1\0\1\5\15\0\1\53\1\270"+
    "\1\0\1\270\1\0\1\271\1\0\10\53\1\0\3\53"+
    "\6\0\6\53\1\0\5\53\1\0\1\53\7\0\1\55"+
    "\1\56\4\0\1\53\1\262\1\0\1\262\1\244\1\263"+
    "\1\0\10\53\1\0\3\53\6\0\6\53\1\0\5\53"+
    "\1\0\1\53\7\0\1\55\1\56\1\0\1\272\2\0"+
    "\1\53\1\273\1\0\1\273\1\0\1\53\1\272\10\53"+
    "\1\0\3\53\6\0\6\53\1\0\5\53\1\0\1\53"+
    "\1\0\1\272\26\0\1\231\50\0\2\5\1\0\1\5"+
    "\1\0\1\5\1\0\4\5\1\165\3\5\1\0\3\5"+
    "\6\0\6\5\1\0\5\5\1\0\1\5\15\0\2\5"+
    "\1\0\1\5\1\0\1\5\1\0\10\5\1\0\2\5"+
    "\1\100\6\0\6\5\1\0\5\5\1\0\1\5\15\0"+
    "\2\5\1\0\1\5\1\0\1\5\1\0\10\5\1\0"+
    "\3\5\6\0\6\5\1\0\3\5\1\274\1\5\1\0"+
    "\1\5\15\0\1\53\1\270\1\0\1\270\1\244\1\271"+
    "\1\0\10\53\1\0\3\53\6\0\6\53\1\0\5\53"+
    "\1\0\1\53\7\0\1\55\1\56\1\0\1\275\2\0"+
    "\1\53\1\276\1\0\1\276\1\0\1\53\1\275\10\53"+
    "\1\0\3\53\6\0\6\53\1\0\5\53\1\0\1\53"+
    "\1\0\1\275\14\0\1\273\1\0\1\273\60\0\1\53"+
    "\1\277\1\0\1\277\1\0\1\53\1\0\10\53\1\0"+
    "\3\53\6\0\6\53\1\0\5\53\1\0\1\53\7\0"+
    "\1\55\1\56\4\0\2\5\1\0\1\5\1\0\1\5"+
    "\1\0\5\5\1\154\2\5\1\0\3\5\6\0\6\5"+
    "\1\0\5\5\1\0\1\5\16\0\1\276\1\0\1\276"+
    "\60\0\1\53\1\300\1\0\1\300\1\0\1\301\1\0"+
    "\10\53\1\0\3\53\6\0\6\53\1\0\5\53\1\0"+
    "\1\53\7\0\1\55\1\56\4\0\1\53\1\277\1\0"+
    "\1\277\1\244\1\53\1\0\10\53\1\0\3\53\6\0"+
    "\6\53\1\0\5\53\1\0\1\53\7\0\1\55\1\56"+
    "\4\0\1\53\1\300\1\0\1\300\1\244\1\301\1\0"+
    "\10\53\1\0\3\53\6\0\6\53\1\0\5\53\1\0"+
    "\1\53\7\0\1\55\1\56\1\0\1\55\2\0\1\53"+
    "\1\151\1\0\1\151\1\0\1\53\1\55\10\53\1\0"+
    "\3\53\6\0\6\53\1\0\5\53\1\0\1\53\1\0"+
    "\1\55\7\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[9204];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\4\1\1\11\12\1\1\0\4\1\1\0"+
    "\5\1\1\0\4\1\1\11\4\1\2\0\3\1\2\0"+
    "\3\1\1\11\2\1\1\0\5\1\1\0\2\1\1\0"+
    "\10\1\1\11\4\1\1\11\10\1\3\0\4\1\1\0"+
    "\14\1\1\0\1\1\1\0\5\1\1\11\4\1\1\0"+
    "\1\1\2\0\6\1\2\0\2\1\2\0\10\1\1\0"+
    "\7\1\1\0\2\1\1\0\2\1\2\0\2\1\1\0"+
    "\3\1\2\0\3\1\1\0\1\1\2\0\1\1\1\0"+
    "\2\1\1\0\2\1\1\0\3\1\1\0\1\1\1\0"+
    "\2\1\2\0\1\1\1\0\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[193];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
 
 /* C�digo personalizado */
 
 // Se agreg� una propiedad para verificar si existen tokens pendientes
 private boolean _existenTokens = false;
 
 public boolean existenTokens(){
 return this._existenTokens;
 }
 


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public ScannerABC(java.io.Reader in) {
   /* C�digo que se ejecutar� en el constructor de la clase */
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 244) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
     
 /* C�digo a ejecutar al finalizar el an�lisis, en este caso cambiaremos el valor de una variable bandera */
 this._existenTokens = false;
 

    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { // Ignorar cuando se ingrese un espacio
            }
          case 18: break;
          case 2: 
            { /*Token t = new Token("Enter", Types.IDENTIFIER);
 this._existenTokens = true;
 return t;*/
            }
          case 19: break;
          case 3: 
            { Token t = new Token(yytext(), Types.IDENTIFIER);
 this._existenTokens = true;
 return t;
            }
          case 20: break;
          case 4: 
            { Token t = new Token(yytext(), Types.ERROR_INTEGER);
 t.setLine(yyline-1);
 this._existenTokens = true;
 return t;
            }
          case 21: break;
          case 5: 
            { Token t = new Token(yytext(), Types.ERROR_FLOATING_POINT);
 this._existenTokens = true;
 return t;
            }
          case 22: break;
          case 6: 
            { Token t = new Token(yytext(), Types.OPERATOR);
 this._existenTokens = true;
 return t;
            }
          case 23: break;
          case 7: 
            { Token t = new Token(yytext(), Types.ERROR_STRING);
 this._existenTokens = true;
 return t;
            }
          case 24: break;
          case 8: 
            { Token t = new Token(yytext(), Types.ERROR_IDENTIFIER);
 this._existenTokens = true;
 return t;
            }
          case 25: break;
          case 9: 
            { Token t = new Token(yytext(), Types.RESERVED);
 this._existenTokens = true;
 return t;
            }
          case 26: break;
          case 10: 
            { Token t = new Token(yytext(), Types.LOGICAL_OPERATOR);
 this._existenTokens = true;
 return t;
            }
          case 27: break;
          case 11: 
            { // Comentario de bloque 1
            }
          case 28: break;
          case 12: 
            { Token t = new Token(yytext(), Types.STRING_LITERAL);
 this._existenTokens = true;
 return t;
            }
          case 29: break;
          case 13: 
            { Token t = new Token(yytext(), Types.FLOATING_POINT_NUMERIC_LITERAL);
 this._existenTokens = true;
 return t;
            }
          case 30: break;
          case 14: 
            { Token t = new Token(yytext(), Types.INTEGER_NUMERIC_LITERAL);
 this._existenTokens = true;
 return t;
            }
          case 31: break;
          case 15: 
            { Token t = new Token(yytext(), Types.NUMERIC_CHAR_LITERAL);
 this._existenTokens = true;
 return t;
            }
          case 32: break;
          case 16: 
            { Token t = new Token(yytext(), Types.CHAR_LITERAL);
 this._existenTokens = true;
 return t;
            }
          case 33: break;
          case 17: 
            { Token t = new Token(yytext(), Types.SCIENTIFIC_NOTATION_NUMERIC_LITERAL);
 this._existenTokens = true;
 return t;
            }
          case 34: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
