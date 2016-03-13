/* Generated By:JavaCC: Do not edit this line. LibParser.java */
package lib;
public class LibParser implements LibParserConstants {
  private int website_count = 0;

  final public void Library() throws ParseException {
                 int count = 0;
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LIBRARY:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      jj_consume_token(LIBRARY);
              count++;
      jj_consume_token(WORD);
      jj_consume_token(LB);
      Content();
      jj_consume_token(RB);
    }
    jj_consume_token(0);
   if (count > 1)
   {
     {if (true) throw new ParseException("Sorry, but you cannot have more than one LIBRARY in a input file");}
   }
  }

// ANY ORDER
  final public void Content() throws ParseException {
  int website_count,building_count,timeofyear_count,staff_count,bookcollection_count;
  website_count = 0;
  building_count = 0;
  timeofyear_count = 0;
  staff_count = 0;
  bookcollection_count = 0;
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case WEBSITE:
        Website();
            website_count++;
            if (website_count > 1)
            {
                        {if (true) throw new ParseException("Sorry, you cannot have more than one website entry");}
            }
        break;
      case BUILDING:
        Building();
            building_count++;
            if (building_count > 1)
            {
                        {if (true) throw new ParseException("Sorry, you cannot have more than one building entry");}
            }
        break;
      case TIMEOFYEAR:
        TimeofYear();
                       timeofyear_count++;
        break;
      case STAFF:
        Staff();
                  staff_count++;
        break;
      case BOOKCOLLECTION:
        BookCollection();
                           bookcollection_count++;
        break;
      default:
        jj_la1[1] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case WEBSITE:
      case BUILDING:
      case TIMEOFYEAR:
      case STAFF:
      case BOOKCOLLECTION:
        ;
        break;
      default:
        jj_la1[2] = jj_gen;
        break label_2;
      }
    }
                if(website_count != 1)
                {
                        {if (true) throw new ParseException("Sorry, you must have ONE website entry");}
                }
                if(building_count != 1)
                {
                        {if (true) throw new ParseException("Sorry, you must have ONE building entry");}
                }
                if(timeofyear_count < 1)
                {
                        {if (true) throw new ParseException("Sorry, you must have ATLEAST ONE time of year entry");}
                }
                if(!(staff_count >= 1))
                {
                        {if (true) throw new ParseException("Sorry, you must have ATLEAST ONE staff entry");}
                }
                if(!(bookcollection_count >= 1))
                {
                        {if (true) throw new ParseException("Sorry, you must have ONE book collection entry");}
                }
  }

  final public void BookCollection() throws ParseException {
        int book_entries = 0;
    jj_consume_token(BOOKCOLLECTION);
    jj_consume_token(WORD);
    jj_consume_token(LB);
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case BOOK:
        ;
        break;
      default:
        jj_la1[3] = jj_gen;
        break label_3;
      }
      BookEntry();
               book_entries++;
    }
    jj_consume_token(RB);
    if (book_entries < 1)
    {
      {if (true) throw new ParseException("Sorry, you must have ATLEAST ONE book entry in the collection");}
    }
  }

//ANY ORDER
  final public void BookEntry() throws ParseException {
        int titles = 0;
        int authors = 0;
    jj_consume_token(BOOK);
    jj_consume_token(BOOK_DIGIT);
    jj_consume_token(LB);
    label_4:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case TITLE:
      case AUTHOR:
        ;
        break;
      default:
        jj_la1[4] = jj_gen;
        break label_4;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case TITLE:
        Title();
       titles++;
       if (titles >1)
       {
         {if (true) throw new ParseException("Sorry you cannot have more than ONE title");}
       }
        break;
      case AUTHOR:
        Author();
           authors++;
        break;
      default:
        jj_la1[5] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    jj_consume_token(RB);
    if (titles != 1)
    {
      {if (true) throw new ParseException("Sorry you must have EXACTLY ONE title");}
    }
    if(authors <1)
    {
      {if (true) throw new ParseException("Sorry you must have ATLEAST ONE author");}
    }
  }

  final public void Author() throws ParseException {
    jj_consume_token(AUTHOR);
    jj_consume_token(QUOTE);
    jj_consume_token(AUTHOR_NAME);
    jj_consume_token(COMMA);
    label_5:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case AUTHOR_NAME:
        jj_consume_token(AUTHOR_NAME);
        break;
      case INITIAL:
        jj_consume_token(INITIAL);
        break;
      default:
        jj_la1[6] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case INITIAL:
      case AUTHOR_NAME:
        ;
        break;
      default:
        jj_la1[7] = jj_gen;
        break label_5;
      }
    }
    jj_consume_token(QUOTE);
  }

  final public void Title() throws ParseException {
    jj_consume_token(TITLE);
    Book_Title();
  }

  final public void Book_Title() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case BOOK_TITLE:
      jj_consume_token(BOOK_TITLE);
      break;
    case WORD:
      jj_consume_token(WORD);
      break;
    default:
      jj_la1[8] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

// IN ANY ORDER
  final public void Staff() throws ParseException {
  int position = 0;
  int email = 0;
  int type = 0;
  int rate = 0;
    jj_consume_token(STAFF);
    jj_consume_token(WORD);
    jj_consume_token(LB);
    label_6:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case POSITION:
        Position();
    position++;
    if (position > 1)
    {
      {if (true) throw new ParseException("Sorry, you cannot have more than ONE position");}
    }
        break;
      case EMAIL:
        Email();
          email++;
        break;
      case TYPE:
        Type();
    type++;
    if (type > 1)
    {
      {if (true) throw new ParseException("Sorry, you cannot have more than ONE type");}
    }
        break;
      case RATE:
        Rate();
    rate++;
        if (rate > 1)
        {
          {if (true) throw new ParseException("Sorry, you cannot have more than ONE rate");}
        }
        break;
      default:
        jj_la1[9] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case POSITION:
      case EMAIL:
      case TYPE:
      case RATE:
        ;
        break;
      default:
        jj_la1[10] = jj_gen;
        break label_6;
      }
    }
    jj_consume_token(RB);
    if (position != 1)
    {
      {if (true) throw new ParseException("Sorry, you must have EXACTLY ONE position");}
    }
    if (type != 1)
    {
      {if (true) throw new ParseException("Sorry, you must have EXACTLY ONE type");}
    }
    if (rate != 1)
    {
      {if (true) throw new ParseException("Sorry, you must have EXACTLY ONE rate");}
    }
    if(email<1)
    {
      {if (true) throw new ParseException("Sorry, you must have ATLEAST ONE email");}
    }
  }

  final public void Rate() throws ParseException {
    jj_consume_token(RATE);
    jj_consume_token(PAY);
  }

  final public void Type() throws ParseException {
    jj_consume_token(TYPE);
    jj_consume_token(WORK_TYPE);
  }

  final public void Position() throws ParseException {
    jj_consume_token(POSITION);
    jj_consume_token(WORD);
  }

  final public void Email() throws ParseException {
    jj_consume_token(EMAIL);
    jj_consume_token(VALID_EMAIL);
  }

// FIXED ORDER 
  final public void TimeofYear() throws ParseException {
  int start = 0;
  int end  = 0;
  int hours = 0;
    jj_consume_token(TIMEOFYEAR);
    jj_consume_token(WORD);
    jj_consume_token(LB);
    label_7:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case START:
        ;
        break;
      default:
        jj_la1[11] = jj_gen;
        break label_7;
      }
      jj_consume_token(START);
    start++;
    if (start > 1)
    {
                {if (true) throw new ParseException("Sorry, you can only have ONE START only. Cannot have multiple START.");}
    }
      StartandEnd();
    }
    label_8:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case END:
        ;
        break;
      default:
        jj_la1[12] = jj_gen;
        break label_8;
      }
      jj_consume_token(END);
      StartandEnd();
    end++;
    if (end > 1)
    {
                {if (true) throw new ParseException("Sorry, you can only have ONE END only.Cannot have multiple END.");}
    }
    }
    label_9:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case HOURS:
        ;
        break;
      default:
        jj_la1[13] = jj_gen;
        break label_9;
      }
      Hours();
           hours++;
    }
        if (hours < 1)
        {
                {if (true) throw new ParseException("Sorry you must have atleast ONE HOUR entry. Cannot have less than one HOUR entry.");}
        }
    jj_consume_token(RB);
    if(start != 1)
    {
      {if (true) throw new ParseException("Sorry you must only have EXACTLY one START. Cannot have less than 1 START token.");}
    }
    if(end != 1)
    {
      {if (true) throw new ParseException("Sorry, you must have EXACTLY one END token. Cannot have less than 1 END.");}
    }
    if(hours < 1)
    {
      {if (true) throw new ParseException("Sorry, you must have ATLEAST one HOUR entry.");}
    }
  }

  final public void Hours() throws ParseException {
    jj_consume_token(HOURS);
    jj_consume_token(DAYS_SHORT);
    label_10:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case COMMA:
        ;
        break;
      default:
        jj_la1[14] = jj_gen;
        break label_10;
      }
      jj_consume_token(COMMA);
      jj_consume_token(DAYS_SHORT);
    }
    jj_consume_token(LP);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case TIME:
      jj_consume_token(TIME);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case AM:
        jj_consume_token(AM);
        break;
      case PM:
        jj_consume_token(PM);
        break;
      default:
        jj_la1[15] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      jj_consume_token(TO);
      jj_consume_token(TIME);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case AM:
        jj_consume_token(AM);
        break;
      case PM:
        jj_consume_token(PM);
        break;
      default:
        jj_la1[16] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
    case CLOSED:
      jj_consume_token(CLOSED);
      break;
    default:
      jj_la1[17] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    jj_consume_token(RP);
  }

  final public void StartandEnd() throws ParseException {
    jj_consume_token(DAYS_LONG);
    jj_consume_token(COMMA);
    jj_consume_token(DAY);
    jj_consume_token(MONTH);
    jj_consume_token(YEAR);
  }

  final public void Building() throws ParseException {
    jj_consume_token(BUILDING);
    jj_consume_token(BUILDING_NUMBER);
  }

  final public void Website() throws ParseException {
    jj_consume_token(WEBSITE);
    jj_consume_token(URL);
  }

  /** Generated Token Manager. */
  public LibParserTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[18];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x20000,0x421c0000,0x421c0000,0x80000000,0x0,0x0,0x0,0x0,0x0,0x3c000000,0x3c000000,0x200000,0x400000,0x800000,0x80,0x0,0x0,0x1000000,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x0,0x0,0x0,0x0,0x3,0x3,0x30000000,0x30000000,0xc0000000,0x0,0x0,0x0,0x0,0x0,0x0,0x30,0x30,0x1000000,};
   }

  /** Constructor with InputStream. */
  public LibParser(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public LibParser(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new LibParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 18; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 18; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public LibParser(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new LibParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 18; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 18; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public LibParser(LibParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 18; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(LibParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 18; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[64];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 18; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 64; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}
