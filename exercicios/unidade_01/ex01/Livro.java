package exercicios.unidade_01.ex01;

// Definição da classe Livro
public class Livro {
    
    // 🔸 Atributos privados (encapsulamento)
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int numeroPaginas;
    private boolean emprestado;

    // 🔸 Construtor para inicializar o objeto
    public Livro(String titulo, String autor, int anoPublicacao, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.numeroPaginas = numeroPaginas;
        this.emprestado = false; // por padrão, o livro começa como disponível
    }

    // 🔸 Método para emprestar o livro
    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("O livro \"" + titulo + "\" foi emprestado.");
        } else {
            System.out.println("O livro \"" + titulo + "\" já está emprestado.");
        }
    }

    // 🔸 Método para devolver o livro
    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("O livro \"" + titulo + "\" foi devolvido.");
        } else {
            System.out.println("O livro \"" + titulo + "\" já está disponível.");
        }
    }

    // 🔸 Método para exibir detalhes do livro
    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println("Número de Páginas: " + numeroPaginas);
        System.out.println("Status: " + (emprestado ? "Emprestado" : "Disponível"));
    }
}