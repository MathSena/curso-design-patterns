package com.mathsena.principiosSolid;

public class PagamentoSemSolid {
public void estornar() {
  System.out.println("💸 Devolvendo dinheiro...");
}
}

class PagamentoCartaoSemSolid extends PagamentoSemSolid {
  // OK. Chama a API da Visa.
}

class PagamentoBitcoinSemSolid extends PagamentoSemSolid {
  @Override
  public void estornar() {
    // VIOLAÇÃO: Quebra a promessa de estorno automático.
    throw new RuntimeException("Impossível estornar criptomoeda automaticamente.");
  }
}