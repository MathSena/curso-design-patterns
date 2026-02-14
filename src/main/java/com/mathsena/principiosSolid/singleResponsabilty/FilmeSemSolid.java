package com.mathsena.principiosSolid.singleResponsabilty;

public class FilmeSemSolid {
  String titulo;
  String diretor;

  public FilmeSemSolid(String titulo, String diretor) {
    this.titulo = titulo;
    this.diretor = diretor;
  }

  // Responsabilidade 1: Regra de Negócio
  public void reproduzir() {
    System.out.println("🎬 Iniciando o filme: " + titulo);
  }

  // Responsabilidade 2: Infraestrutura (Banco de Dados)
  public void salvarNoBanco() {
    // Se mudarmos do MySQL para MongoDB, essa classe quebra.
    System.out.println("💾 Conectando ao JDBC...");
    System.out.println("💾 INSERT INTO filmes VALUES ('" + titulo + "')");
    System.out.println("💾 Conexão fechada.");
  }

}
