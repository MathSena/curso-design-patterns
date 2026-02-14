package com.mathsena.principiosSolid.liskov;

interface Pagamento {
  void pagar();
}

interface PagamentoEstornavel extends Pagamento {
  void estornar();
}

class PagamentoCartao implements PagamentoEstornavel {
  public void pagar() {

  }
  public void estornar() {

  }
}

class PagamentoBitcoin implements Pagamento {
  public void pagar() {

  }
  // Não tem estornar(). O sistema financeiro saberá que não deve tentar.
}