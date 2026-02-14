package com.mathsena.principiosSolid.dependencyInversion;

public class UsuarioService {
  // O Service (Regra de Negócio) depende direto do driver do MySQL
 // private MySQLConnection banco = new MySQLConnection();

  public void salvarUsuario(String nome) {
   // banco.insert(nome);
  }
}
