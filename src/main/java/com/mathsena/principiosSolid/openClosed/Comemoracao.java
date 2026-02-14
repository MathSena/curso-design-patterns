package com.mathsena.principiosSolid.openClosed;

// 1. A Abstração (Contrato)
interface Comemoracao {
  void executar();
}

// 2. As Extensões (Novas classes)
class Dancinha implements Comemoracao {
  public void executar() { System.out.println("🕺 Dancinha do TikTok!"); }
}

class Spike implements Comemoracao {
  public void executar() { System.out.println("🏈 Spike na bola!"); }
}

class LambeauLeap implements Comemoracao { // Nova extensão fácil de criar!
  public void executar() { System.out.println("🏟️ Pula na arquibancada!"); }
}

// 3. A Classe Fechada (Não muda nunca)
class JogoNFL {
  public void realizarTouchdown(Comemoracao comemoracao) {
    // O jogo não sabe qual é a comemoração, ele só manda executar.
    System.out.println("TOUCHDOWN!");
    comemoracao.executar();
  }
}
