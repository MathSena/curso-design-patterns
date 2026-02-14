package com.mathsena.principiosSolid.singleResponsabilty;

public class Quarterback {
  String nome;
  int jardas;

  public Quarterback(String nome) { this.nome = nome; }

  public void lancarBola(int jardas) {
    this.jardas += jardas;
    System.out.println("🏈 Lógica de jogo: " + nome + " ganhou jardas.");
  }

  public String getNome() { return nome; }
  public int getJardas() { return jardas; }
}