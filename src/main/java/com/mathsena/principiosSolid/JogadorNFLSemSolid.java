package com.mathsena.principiosSolid;

public class JogadorNFLSemSolid {
  public void bloquear() {
    System.out.println("🛡️ Bloqueando o adversário!");
  }
}

class LinemanSemSolid extends JogadorNFLSemSolid {
  // Bloqueia bem. OK.
}

class KickerSemSolid extends JogadorNFLSemSolid {
  @Override
  public void bloquear() {
    // VIOLAÇÃO: O Kicker se recusa a cumprir o contrato do Pai.
    throw new RuntimeException("Erro: Kicker não sabe bloquear!");
  }
}
