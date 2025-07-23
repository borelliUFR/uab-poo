# ✅ Resolução do Exercício 1 — Conceitos de POO

---

## 🔹 1. Identificação dos Atributos da Classe `Livro`

Atributos representam o **estado** de um objeto. No caso da classe `Livro`, é possível identificar os seguintes atributos relevantes:

1. `título`: Representa o nome do livro.  
2. `autor`: Indica o nome do(s) autor(es) do livro.  
3. `anoPublicacao`: Indica o ano em que o livro foi publicado.  
4. `numeroPaginas`: Quantidade total de páginas do livro.  
5. `statusEmprestimo`: Indica se o livro está disponível ou emprestado.

> **Comentário:** Esses atributos descrevem características essenciais de um livro em um sistema de biblioteca digital. Eles ajudam a representar de maneira fiel a entidade que está sendo modelada.

---

## 🔹 2. Definição dos Métodos da Classe `Livro`

Métodos representam o **comportamento** de um objeto, ou seja, as ações que ele pode realizar ou sofrer. Três métodos pertinentes seriam:

1. `emprestar()`: Altera o `statusEmprestimo` para indicar que o livro foi emprestado, se ele estiver disponível.  
2. `devolver()`: Altera o `statusEmprestimo` para indicar que o livro está disponível novamente.  
3. `exibirDetalhes()`: Exibe os dados principais do livro, como título, autor, ano e status.

> **Comentário:** Esses métodos refletem operações típicas realizadas em um sistema de biblioteca, e demonstram claramente a diferença entre ações (métodos) e propriedades (atributos) de uma classe.

---

## 🔹 3. Instanciação e Uso da Classe `Livro` (Conceitualmente)

Para utilizar a classe `Livro` em um programa, seria necessário instanciar um objeto a partir dela e, em seguida, acessar seus métodos. Abaixo está uma descrição conceitual do processo:

### 1. Instanciação de um livro:
- Criar um objeto chamado, por exemplo, `livro1`, utilizando a classe `Livro`.
- Definir seus atributos com valores apropriados, como `título = "Dom Casmurro"`, `autor = "Machado de Assis"`, etc.

### 2. Uso de métodos:
- Chamar `livro1.exibirDetalhes()` para visualizar suas informações.  
- Chamar `livro1.emprestar()` para marcar o livro como emprestado.  
- Após algum tempo, chamar `livro1.devolver()` para atualizar o status como disponível.

> **Comentário:** O processo de instanciar e utilizar métodos ajuda os estudantes a compreenderem o ciclo de vida de um objeto em POO — desde sua criação até a manipulação de seu estado por meio de comportamentos definidos na classe.

---

## Síntese Final (Objetivos Didáticos Alcançados)

- A modelagem da classe `Livro` permite **transpor elementos do mundo real** (como livros, autores, disponibilidade) para o domínio computacional.  
- A distinção entre **atributos (estado)** e **métodos (comportamento)** é evidenciada de maneira prática e contextualizada.  
- A descrição conceitual da utilização da classe prepara o aluno para uma futura **implementação em linguagem de programação**, consolidando os fundamentos da orientação a objetos.


## Solução em UML

![alt text](image.png)