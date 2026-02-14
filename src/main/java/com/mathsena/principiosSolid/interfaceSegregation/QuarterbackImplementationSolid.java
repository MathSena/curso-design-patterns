package com.mathsena.principiosSolid.interfaceSegregation;

// Agora as classes implementam APENAS o que faz sentido
public class QuarterbackImplementationSolid implements Treinavel, Lancador {
  public void treinar() {  }
  public void lancarBola() {  }
  // Não precisa implementar chutar nem bloquear! Código limpo.
}
