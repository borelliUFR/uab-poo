# Explicação das Soluções dos Exercícios de Programação Orientada a Objetos em Java

Este documento apresenta a explicação das resoluções dos exercícios propostos, com foco nos princípios fundamentais da programação orientada a objetos (POO), tais como encapsulamento, modularidade, visibilidade e organização de classes.

---

## Exercício 4: Controle de Acesso e Encapsulamento

### Tema: Visibilidade e Modificadores de Acesso

### Descrição Resumida:

* Criar uma classe `Aluno` com os atributos privados: `nome`, `matricula`, `notaFinal`.
* Métodos `get` e `set` públicos apenas para `nome` e `notaFinal`.
* Método `aprovado()` que retorna `true` se a `notaFinal` for maior ou igual a 6.0.

### Explicação:

Este exercício tem como objetivo reforçar o princípio de **encapsulamento**, por meio do uso de modificadores de acesso `private` (para ocultar os dados) e `public` (para expor métodos de controle). A ideia é proteger os dados sensíveis da classe `Aluno`, permitindo o acesso controlado apenas por meio de métodos específicos.

### Conceitos Aplicados:

* **Encapsulamento**: Proteção dos atributos contra acesso externo direto.
* **Modificadores de acesso**: Uso de `private` e `public`.
* **Métodos de acesso (getters e setters)**: Implementação de acesso seletivo aos atributos.

---

## Exercício 7: Projeto Modular com Encapsulamento

### Tema: Modularidade e Organização de Classes

### Descrição Resumida:

* Criar duas classes: `Livro` e `Biblioteca`.
* A classe `Livro` deve conter os atributos `titulo`, `autor`, `ano`, `emprestado` como privados.
* Métodos para acessar informações do livro e alterar seu estado de empréstimo.
* A classe `Biblioteca` deve conter uma lista de livros, com métodos para:

  * Adicionar livros;
  * Emprestar livros;
  * Listar livros disponíveis ou emprestados.

### Explicação:

Este exercício trabalha com **modularidade** e **organização de classes**, promovendo a separação de responsabilidades. A classe `Livro` encapsula os dados de um livro, enquanto a classe `Biblioteca` gerencia um conjunto de objetos `Livro`. A interação entre as classes mostra como os objetos podem colaborar respeitando limites definidos por encapsulamento.

### Conceitos Aplicados:

* **Modularidade**: Separação de responsabilidades entre as classes.
* **Encapsulamento**: Atributos privados e métodos públicos controlam o acesso.
* **Composição**: A `Biblioteca` contém uma coleção de objetos do tipo `Livro`.
* **Interação entre objetos**: A classe `Biblioteca` manipula os objetos `Livro` com base em métodos públicos.

### Observações:

* Este exercício é especialmente útil para mostrar a aplicação prática de **coleções** em Java (como `ArrayList`).
* A escolha dos métodos públicos demonstra o controle necessário sobre a visibilidade de atributos e comportamentos.

---

## Considerações Finais

* Os exercícios foram propostos de forma progressiva, abordando desde aspectos básicos de encapsulamento até organização modular.

* Os exemplos foram desenvolvidos em linguagem Java, mas são facilmente adaptáveis a outras linguagens orientadas a objetos como Python e C++.
* O uso de diagramas UML (como classe e relação de composição) pode ser uma ferramenta complementar para visualização dos relacionamentos entre classes.

---

## Exercício 1: Analisador de Números

### Tema: Tipos de Dados, Operadores, Condicionais e Laços

### Descrição Resumida:

* Solicitar ao usuário a entrada de 5 números inteiros.
* Para cada número, indicar se é par ou ímpar, e se é positivo, negativo ou zero.

### Explicação:

Este exercício visa reforçar a manipulação de **tipos primitivos**, operadores aritméticos e estruturas de controle de fluxo. O uso do laço `for` permite a repetição controlada da entrada e análise de múltiplos dados. A aplicação de condicionais permite classificar corretamente os números fornecidos.

### Conceitos Aplicados:

* **Laços de repetição** (`for`)
* **Operadores aritméticos e relacionais**
* **Condicionais (`if-else`)**
* **Entrada de dados com `Scanner`**

---

## Exercício 2: Gerenciador de Tarefas

### Tema: Métodos, Passagem de Parâmetros e Retorno, Sobrecarga

### Descrição Resumida:

* Classe `GerenciadorDeTarefas` com:
  * Método `adicionarTarefa(String)`
  * Sobrecarga `adicionarTarefa(String, int)`
  * Método `concluirTarefa(String)` com retorno booleano

### Explicação:

Este exercício explora a **definição de métodos com parâmetros** e o conceito de **sobrecarga**, permitindo diferentes formas de executar a mesma ação. O método `concluirTarefa` demonstra o uso de retorno de valor (`boolean`) para indicar o sucesso da operação.

### Conceitos Aplicados:

* **Definição e invocação de métodos**
* **Sobrecarga de métodos**
* **Retorno de valores**
* **Encapsulamento básico**

---

## Exercício 3: Sistema de Descontos

### Tema: Herança e Sobrescrita de Métodos

### Descrição Resumida:

* Classe base `Produto` com método `calcularPrecoFinal()`.
* Subclasses `Livro` (desconto de 10%) e `Eletronico` (acréscimo de 5%).
* Uso do `@Override` para redefinir o comportamento do método.

### Explicação:

A herança permite que `Livro` e `Eletronico` reutilizem a estrutura da superclasse `Produto`, mas com comportamentos específicos através da sobrescrita. O exemplo demonstra como subclasses podem especializar métodos herdados.

### Conceitos Aplicados:

* **Herança**
* **Sobrescrita de métodos**
* **Uso da anotação `@Override`**
* **Especialização de comportamento**

---

## Exercício 4: Relatórios Polimórficos

### Tema: Polimorfismo, Classes Abstratas

### Descrição Resumida:

* Classe abstrata `Relatorio` com método abstrato `gerarConteudo()`.
* Subclasses `RelatorioVendas` e `RelatorioFinanceiro`.
* Lista de relatórios manipulada polimorficamente.

### Explicação:

Este exercício apresenta o **polimorfismo**, permitindo o uso de uma interface comum (`Relatorio`) para manipular diferentes tipos de relatórios. A classe abstrata impõe uma estrutura, enquanto as subclasses concretizam o conteúdo. A iteração com `List<Relatorio>` demonstra o uso prático de coleções com objetos polimórficos.

### Conceitos Aplicados:

* **Classes abstratas**
* **Métodos abstratos**
* **Polimorfismo**
* **Coleções de objetos**

---

## Exercício 5: Biblioteca de Utilitários

### Tema: Bibliotecas de Classes, Reutilização, Métodos Estáticos

### Descrição Resumida:

* Classe `UtilitariosMatematicos` com métodos estáticos:
  * `calcularMedia(double, double, double)`
  * `arredondarParaDuasCasas(double)`
  * `gerarNumeroAleatorioEntre(int, int)`

### Explicação:

A construção de métodos estáticos auxilia na **reutilização de funcionalidades** que não dependem de estado de objetos. Este modelo promove coesão e centralização de utilitários matemáticos, além de reforçar o uso de bibliotecas nativas como `Math`, `Random` e `DecimalFormat`.

### Conceitos Aplicados:

* **Métodos estáticos**
* **Reutilização e coesão**
* **Bibliotecas padrão**
* **Formatação e geração de valores**
