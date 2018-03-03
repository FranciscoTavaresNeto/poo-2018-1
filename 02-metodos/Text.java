class Text {

  static String pad(String s, int n, char c, char d) {
    if (d == 'r') return padRight(s, n, c);
    if (d == 'l') return padLeft(s, n, c);
    return s;
  }

  static String padLeft(String s, int n, char c) {
    return repeat(c, n - s.length()) + s;
  }

  static String padRight(String s, int n, char c) {
    return s + repeat(c, n - s.length());
  }

  static String repeat(char c, int n) {
    String s = "";
    for (int i = 0; i < n; i++) s += c;
    return s;
  }












}
