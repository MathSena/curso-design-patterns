# 🏛️ Jornada Arquitetura de Software & Design Patterns

![Java](https://img.shields.io/badge/Language-Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![SOLID](https://img.shields.io/badge/Concept-SOLID-blue?style=for-the-badge)
![Clean Code](https://img.shields.io/badge/Focus-Clean_Code-green?style=for-the-badge)

Este repositório serve como guia de estudos sobre Arquitetura de Software, focando em escrever código limpo, testável e de fácil manutenção.

O objetivo não é apenas aprender a sintaxe da linguagem, mas sim **como organizar o pensamento**.

---

## 🧩 O que é SOLID?

SOLID é um acrônimo para cinco princípios de design (postulados por Robert C. Martin, o "Uncle Bob") que visam tornar o software mais compreensível, flexível e sustentável.

Imagine construir uma casa. Se você coloca os tijolos de qualquer jeito, a casa cai na primeira reforma. O SOLID são as regras de engenharia para garantir que a "casa" (seu software) aguente mudanças, novos andares e reformas futuras.

### Por que usar?
* **Evitar "Código Espaguete":** Aquele sistema tudo misturado que ninguém entende.
* **Facilitar Testes:** É difícil testar uma funcionalidade que faz tudo. É fácil testar algo pequeno e focado.
* **Reduzir Bugs:** Quando você mexe em um lugar, não quebra outro nada a ver.

### Os 5 Pilares:
1.  **[S] - Single Responsibility Principle** (Princípio da Responsabilidade Única)
2.  **[O] - Open/Closed Principle** (Princípio Aberto/Fechado)
3.  **[L] - Liskov Substitution Principle** (Princípio da Substituição de Liskov)
4.  **[I] - Interface Segregation Principle** (Princípio da Segregação de Interface)
5.  **[D] - Dependency Inversion Principle** (Princípio da Inversão de Dependência)

---

## 🎯 S - Single Responsibility Principle (SRP)

> **"Uma classe deve ter um, e apenas um, motivo para mudar."**

Muitos desenvolvedores acham que SRP significa "fazer apenas uma coisa". Mas a definição correta é sobre **Atores** e **Mudanças**.

### ❌ O Problema: A "God Class" (Classe Deus)
É a classe que centraliza responsabilidades de áreas diferentes.

**Exemplo Conceitual (Contexto NFL):**
Imagine um módulo chamado **Jogador**.
* O **Treinador** pede para mudar a regra de cálculo de jardas.
* O **Financeiro** pede para mudar o formato do relatório de salário.

Se tudo estiver no mesmo arquivo, ao mexer na regra do salário, você corre o risco de quebrar o cálculo de jardas do treinador, pois as dependências estão misturadas.

### ✅ A Solução: Separação de Responsabilidades
Dividimos a "God Class" em especialistas. Cada um cuida do seu quadrado.

1.  **Domínio/Regra de Negócio:** Cuida apenas das regras do jogo (jardas, pontos).
2.  **Repositório/Banco:** Cuida apenas de salvar e buscar dados (SQL).
3.  **Apresentação:** Cuida apenas de formatar a saída (PDF, HTML, Excel).

### Analogia do Mundo Real
* **Canivete Suíço (Ruim):** Tenta ser faca, tesoura e lixa ao mesmo tempo. Se quebrar a mola principal, você perde todas as ferramentas.
* **Caixa de Ferramentas (Bom):** O martelo só martela. A chave de fenda só aperta. Se você perder a chave de fenda, o martelo continua funcionando perfeitamente.

---

## 🚪 O - Open/Closed Principle (OCP)

> **"Entidades de software devem estar abertas para extensão, mas fechadas para modificação."**

O objetivo aqui é garantir que o sistema possa crescer sem que você precise "cirurgiar" o código antigo que já está funcionando e testado.

### ❌ O Problema: O "If" Infinito
Você percebe a violação quando vê uma classe cheia de `if/else` ou `switch` verificando tipos.

**Exemplo Conceitual (Contexto Streaming):**
Imagine uma classe `CalculadoraDeAssinatura`.
* Se o plano for "Básico", cobra X.
* Se o plano for "4K", cobra Y.

Se a empresa lançar um plano "Família", você terá que abrir essa classe e adicionar mais um `if`. Isso viola o princípio, pois a classe não estava **fechada**.

### ✅ A Solução: Polimorfismo (Interfaces)
Em vez da calculadora saber todos os preços, ela aceita qualquer objeto que tenha o contrato `Plano`.

1.  Cria-se uma interface comum (`Plano`).
2.  Cada plano novo é uma **nova classe** (`PlanoFamilia`, `PlanoVIP`).
3.  A calculadora apenas executa o contrato, sem saber qual plano específico está processando.
4.  Para adicionar uma feature nova, você cria um arquivo novo. Você **não toca** no arquivo antigo.

### Analogia do Mundo Real
* **Console de Videogame:** O hardware do console é **fechado** (você não precisa soldar novos fios para jogar um jogo novo). O sistema é **aberto para extensão** através dos cartuchos/discos. Quer uma funcionalidade nova? Insira um cartucho novo.

---

## 📚 Próximos Passos (Backlog)

- [x] **S - Single Responsibility:** Cada classe com um único motivo para mudar.
- [x] **O - Open/Closed:** Estender sem modificar.
- [ ] **L - Liskov:** Herança do jeito certo (evitando quebrar a classe pai).
- [ ] **I - Interface Segregation:** Interfaces magras vs. Interfaces gordas.
- [ ] **D - Dependency Inversion:** Depender de abstrações, não de implementações concretas.

---
*Estudo iniciado em: Fevereiro de 2026*