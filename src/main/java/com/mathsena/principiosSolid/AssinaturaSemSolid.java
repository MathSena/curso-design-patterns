package com.mathsena.principiosSolid;

public class AssinaturaSemSolid {
    public double calcularTotal(String plano) {
      if (plano.equals("BASIC")) return 29.90;
      if (plano.equals("4K")) return 55.90;
      return 0;
    }

}
