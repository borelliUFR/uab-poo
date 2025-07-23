package exercicios.unidade_01.ex07;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public boolean emprestarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo) && !livro.estaEmprestado()) {
                livro.emprestar();
                return true;
            }
        }
        return false; // livro não encontrado ou já emprestado
    }

    public void listarLivros() {
        for (Livro livro : livros) {
            livro.exibirDetalhes();
        }
    }
}