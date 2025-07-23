package exercicios.unidade_01.ex01;

public class Biblioteca {
    public static void main(String[] args) {

        // 🔹 Instanciação de um objeto do tipo Livro
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 1899, 256);

        // 🔹 Utilização dos métodos
        livro1.exibirDetalhes();  // Exibe os dados do livro
        livro1.emprestar();       // Marca o livro como emprestado
        livro1.exibirDetalhes();  // Mostra o novo status
        livro1.devolver();        // Devolve o livro
        livro1.exibirDetalhes();  // Status atualizado novamente
    }
}