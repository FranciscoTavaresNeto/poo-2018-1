class Text {
  static String padLeft(String s, int n, char c) {
    int tam = s.length();
    for (int i = 0; i < n - tam; i++) s = c + s;
    return s;
  }

  static String padRight(String s, int n, char c) {
    int tam = s.length();
    for (int i = 0; i < n - tam; i++) s = s + c;
    return s;
  }

  static String repeat(char c, int n) {
    String s = "";
    for (int i = 0; i < n; i++) s += c;
    return s;
  }












}
