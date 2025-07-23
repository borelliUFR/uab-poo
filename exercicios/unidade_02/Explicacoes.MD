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
