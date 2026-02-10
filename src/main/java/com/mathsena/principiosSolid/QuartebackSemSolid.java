package com.mathsena.principiosSolid;

public class QuartebackSemSolid {

  String nome;
  int jardas;

  public QuartebackSemSolid(String nome, int jardas) {
    this.nome = nome;
    this.jardas = jardas;
  }

  // Responsabilidade 1: Lógica do Esporte
  public void lancarBola(int jardasLancadas) {
    this.jardas += jardasLancadas;
    System.out.println("🏈 " + nome + " lançou a bola!");
  }

  // Responsabilidade 2: Formatação de Relatório
  public void imprimirRelatorio() {
    // Se mudar para HTML, eu tenho que editar a classe do Jogador! Errado.
    System.out.println("-------------------------");
    System.out.println("RELATÓRIO DO JOGADOR (PDF)");
    System.out.println("Atleta: " + nome);
    System.out.println("Performance: " + jardas + " yds");
    System.out.println("-------------------------");
  }
}
