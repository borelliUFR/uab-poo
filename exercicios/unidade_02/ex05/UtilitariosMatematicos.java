package exercicios.unidade_02.ex05;

// Exercício 5: Biblioteca de Utilitários
import java.text.DecimalFormat;
import java.util.Random;

class UtilitariosMatematicos {

    public static double calcularMedia(double a, double b, double c) {
        return (a + b + c) / 3.0;
    }

    public static double arredondarParaDuasCasas(double valor) {
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(valor).replace(",", "."));
    }

    public static int gerarNumeroAleatorioEntre(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min + 1)) + min;
    }

    public static void main(String[] args) {
        System.out.println("Média: " + calcularMedia(5.5, 7.2, 8.0));
        System.out.println("Valor arredondado: " + arredondarParaDuasCasas(3.14159));
        System.out.println("Número aleatório entre 1 e 10: " + gerarNumeroAleatorioEntre(1, 10));
    }
}
