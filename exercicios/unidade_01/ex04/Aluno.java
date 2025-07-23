package exercicios.unidade_01.ex04;

public class Aluno {
    
    // Atributos privados
    private String nome;
    private int matricula;
    private double notaFinal;

    // Construtor
    public Aluno(String nome, int matricula, double notaFinal) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaFinal = notaFinal;
    }

    // Get e Set para nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Get e Set para notaFinal
    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    // Método para verificar aprovação
    public boolean aprovado() {
        return notaFinal >= 6.0;
    }
}