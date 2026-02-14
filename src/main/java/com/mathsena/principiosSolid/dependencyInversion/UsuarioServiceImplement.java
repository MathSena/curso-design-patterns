package com.mathsena.principiosSolid.dependencyInversion;

// Alto Nível
public class UsuarioServiceImplement {
  private UsuarioRepository repo;

  // Recebe a interface no construtor
  public UsuarioServiceImplement(UsuarioRepository repo) {
    this.repo = repo;
  }
}
