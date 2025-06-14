package basico;
import java.util.Scanner; // Classe Scanner para leitura de entrada

public class Notas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // instanciando classe Scanner
        int[][] notas = new int[3][3]; // Declarando uma matriz de notas 3x3

        // Preenchendo a matriz com notas
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("Digite a nota para o aluno " + (i + 1) + ", disciplina " + (j + 1) + ": ");
                notas[i][j] = scanner.nextInt();
            }
        }

        // Exibindo as notas e médias
        System.out.println("\nNotas dos alunos:");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Aluno " + (i + 1) + ": ");
            int soma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + " ");
                soma += notas[i][j];
            }
            double media = soma / (double) notas[i].length;
            System.out.printf("| Média: %.2f%n", media);
        }
    
        scanner.close();
    }
}