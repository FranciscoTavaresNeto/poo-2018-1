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
    /*
    String c = "orientado a objetos";
    // Orientado a objetos
    System.out.println(Text.capitalize(c));
    System.out.println(Text.capitalize(c).equals("Orientado a objetos"));
    System.out.println(Text.capitalize("uM teXto").equals("Um texto"));
    */







  }
}
