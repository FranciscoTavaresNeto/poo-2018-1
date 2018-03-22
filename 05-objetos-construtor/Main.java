class Main {
  public static void main(String[] args) {

                      // new -> invoca o construtor!
                      // passando "Komeco" no construtor
    ArCondicionado ar = new ArCondicionado("Komeco");
    System.out.println(ar.marca);
    // ar.marca = "LG"; // PROIBIDO! (final)
    System.out.println(ar.temperatura()); // 22
    ar.aumentarTemperatura();
    System.out.println(ar.temperatura()); // 23

    ArCondicionado km = ar;
    System.out.println(km.marca);
    km.aumentarTemperatura();
    // ambas variáveis operam o MESMO OBJETO!
    System.out.println(km.temperatura());
    System.out.println(ar.temperatura());

    ArCondicionado lg = new ArCondicionado("LG", 18, 28);
    System.out.println(lg.temperatura());


















  }
}
