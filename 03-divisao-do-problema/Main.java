class Main {
  public static void main(String[] args) {

    char l = 'a';
    System.out.println(Text.upcase(l) == 'A');
    System.out.println(Text.upcase('u') == 'U');
    System.out.println(Text.upcase('1') == '1');
    System.out.println(Text.upcase('@') == '@');
    System.out.println(Text.upcase('z') == 'Z');

    String a = "Texto Teste";
    // TEXTO TESTE
    System.out.println(Text.upcase(a));
    System.out.println(Text.upcase(a).equals("TEXTO TESTE"));

    String b = "POO 2Sem";
    // poo 2sem
    System.out.println(Text.downcase(b));
    System.out.println(Text.downcase(b).equals("poo 2sem"));

    // SUBSTRING!!!
              //01234567890
    String t = "tads ifrs";
              //987654321 (negativo)
    System.out.println(t.substring(1, 3));
    System.out.println(t.substring(5, 9));
    // System.out.println(t.substring(5, 10));

    System.out.println(Text.substr(t, 5, 4)); // ifrs
    System.out.println(Text.substr(t, 5, 4).equals("ifrs"));
    System.out.println(Text.substr("programa", -3, 2)); //am

    // String c = "orientado a objetos";
    // // Orientado a objetos
    // System.out.println(Text.capitalize(c));
    // System.out.println(Text.capitalize(c).equals("Orientado a objetos"));
    // System.out.println(Text.capitalize("uM teXto").equals("Um texto"));









  }
}
