class numberValid{
  enum STATE { START, INTEGER, DECIMAL, UNKNOWN, AFTER_DECIMAL};

  static STATE get_next_state(STATE current_state, char ch) {
   switch(current_state) {
      case START:
      case INTEGER:
        if (ch == '.') {
        return STATE.DECIMAL;
        } else if (ch >= '0' && ch <= '9') {
          return STATE.INTEGER;
        } else {
          return STATE.UNKNOWN;
        }
      case DECIMAL:
        if (ch >= '0' && ch <= '9') {
          return STATE.AFTER_DECIMAL;
        } else {
          return STATE.UNKNOWN;
       }
      case AFTER_DECIMAL:
       if (ch >= '0' && ch <= '9') {
          return STATE.AFTER_DECIMAL;
        } else {
          return STATE.UNKNOWN;
       }
    }
    return STATE.UNKNOWN;
  }

  static boolean is_number_valid(String s) {
    if (s.isEmpty()) {
      return true;
    }
    int i = 0;
    if (s.charAt(i) == '+' || s.charAt(i) == '-') {
      ++i;
    }

    STATE current_state = STATE.START;

    while (i < s.length()) {
      current_state = get_next_state(current_state, s.charAt(i));

      if (current_state == STATE.UNKNOWN) {
        return false;
      }

      i = i + 1;
    }

    if (current_state == STATE.DECIMAL)
      return false;

    return true;
  }
  static void test(String s, boolean expected) {
    boolean is_valid = is_number_valid(s);

    if (is_valid) {
      System.out.println(s + " is valid.");
    }   else {
      System.out.println(s + " is not valid.");
    }
  }

  public static void main(String[] args) {
    test("4.325", true);
    test("4.325a", false);
    test("x4.325", false);
    test("4.32.5", false);
    test("4325", true);
    test("1.", false);
    test("1.1.", false);
    test("1.1.1", false);
    test("1.1.1.", false);
    test("+1.1.", false);
    test("+1.1", true);
    test("-1.1.", false);
    test("-1.1", true);
    test("", true);
  }
}
