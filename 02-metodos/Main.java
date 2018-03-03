class Main {
  public static void main(String[] args) {
    // especificação
    String r = Text.padLeft("if", 6, '*');
    System.out.println(r); // ****if
    System.out.println(r.equals("****if"));

    String p = Text.padRight("rs", 6, '#');
    System.out.println(p); // rs####
    System.out.println(p.equals("rs####"));

    // especificando/projetando
    String t = Text.repeat('@', 10);
    System.out.println(t); // @@@@@@@@@@
    System.out.println(t.equals("@@@@@@@@@@"));



  }
}
