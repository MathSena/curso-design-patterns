package com.mathsena.principiosSolid;

public class RelatorioQuarterback {
  public void gerarPDF(Quarterback qb) {
    System.out.println("🖨️ Gerando PDF para: " + qb.getNome());
    System.out.println("   --> Stats: " + qb.getJardas() + " jardas totais.");
  }

  public void gerarHTML(Quarterback qb) {
    System.out.println("🌐 <h1>" + qb.getNome() + "</h1>");
  }
}
