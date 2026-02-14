package com.mathsena.principiosSolid.liskov;

interface Jogador {
  void entrarEmCampo();
}

interface Bloqueador {
  void bloquear();
}

class Lineman implements Jogador, Bloqueador {
  public void entrarEmCampo() {

  }
  public void bloquear() { System.out.println("🛡️ Bloqueio pesado!"); }
}

class Kicker implements Jogador {
  public void entrarEmCampo() {

  }
  // O Kicker NÃO implementa Bloqueador, logo o treinador nunca pedirá isso a ele.
}
