// Modelo de Ar Condicionado; é simplificado!
// ABSTRAÇÃO!
// Abstrair: é ignorar os detalhes que não são relevantes
//     + abstrato: menos detalhes
//     + concreto: mais detalhes (mais específico)

class ArCondicionado {
  // final significa constante
  // definida UMA VEZ!
  final String marca; // atributo marca
  // t é ENCAPSULADO!
  private int t = 22;
  final int min;
  final int max;

  // declarando um construtor
  ArCondicionado(String marca) {
    this.marca = marca;
    this.min = 17;
    this.max = 30;
  }

  ArCondicionado(String marca, int min, int max) {
    // this.marca significa o atributo marca
    this.marca = marca;
    this.min = min;
    this.max = max;
  }

  void diminuirTemperatura() {
    if (t > min) t = t - 1;
  }

  void aumentarTemperatura() {
    if (t < max) t++;
  }

  int temperatura() {
    return t;
  }

}
