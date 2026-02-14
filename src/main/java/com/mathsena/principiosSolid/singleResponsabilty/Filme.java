package com.mathsena.principiosSolid.singleResponsabilty;

public class Filme {
  String titulo;

  public Filme(String titulo) { this.titulo = titulo; }

  public void reproduzir() {
    System.out.println("🎬 Play: " + titulo);
  }
}
