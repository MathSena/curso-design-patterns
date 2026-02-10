package com.mathsena.principiosSolid;

class FilmeRepository {
  public void salvar(Filme filme) {
    System.out.println("💾 [SQL LOG]: Persistindo o filme " + filme.titulo);
  }

  public void deletar(Filme filme) {
    System.out.println("🗑️ [SQL LOG]: Removendo o filme " + filme.titulo);
  }
}