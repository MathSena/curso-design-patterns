package com.mathsena.principiosSolid;

public class QuarterbackImplementation implements AtletaSemSolid {
  public void treinar() { System.out.println("Treinando passes..."); }
  public void lancarBola() { System.out.println("Lançamento de 50 jardas!"); }

  // O PROBLEMA ESTÁ AQUI:
  // O Quarterback é obrigado a implementar chutar e bloquear,
  // mesmo que nunca faça isso.
  public void chutarBola() {
    throw new UnsupportedOperationException("Eu não chuto!");
    // ou deixa vazio: {}
  }

  public void bloquear() {
    throw new UnsupportedOperationException("Eu não bloqueio!");
  }
}
