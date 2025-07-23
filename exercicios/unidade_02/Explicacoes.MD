# Explicação das Soluções dos Exercícios de Programação Orientada a Objetos em Java

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
