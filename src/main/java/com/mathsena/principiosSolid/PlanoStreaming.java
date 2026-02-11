package com.mathsena.principiosSolid;

// 1. A Abstração
interface PlanoStreaming {
  double getPreco();
}

// 2. As Extensões
class PlanoBasico implements PlanoStreaming {
  public double getPreco() { return 29.90; }
}

class Plano4K implements PlanoStreaming {
  public double getPreco() { return 55.90; }
}

class PlanoFamilia implements PlanoStreaming { // Nova extensão
  public double getPreco() { return 89.90; }
}

// 3. A Classe Fechada
class CobrancaService {
  public void cobrar(PlanoStreaming plano) {
    // Se surgir um plano novo amanhã, esta linha NÃO muda.
    System.out.println("Cobrando o valor de: R$ " + plano.getPreco());
  }
}