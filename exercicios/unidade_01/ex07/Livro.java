package exercicios.unidade_01.ex07;

public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private boolean emprestado;

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.emprestado = false;
    }

    public boolean estaEmprestado() {
        return emprestado;
    }

    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
        }
    }

    public void devolver() {
        emprestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void exibirDetalhes() {
        System.out.println(titulo + " - " + autor + " (" + ano + ") - " + (emprestado ? "Emprestado" : "Disponível"));
    }
}