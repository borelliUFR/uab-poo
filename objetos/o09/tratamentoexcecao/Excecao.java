package objeto.o09.tratamentoexcecao;

import java.util.Scanner;

public class Excecao {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        try {
            System.out.print("Digite um número inteiro:");
            int inteiro = Integer.parseInt(ler.nextLine());
            
            System.out.println("Contagem regressiva");
            for (int i = inteiro; i > 0; i--) {
                System.out.println(i);
            }
            
            System.out.print("Digite outro número inteiro:");
            int inteiro2 = Integer.parseInt(ler.nextLine());
            
            System.out.println("Divisão:" + (inteiro/inteiro2));
        } catch (NumberFormatException erro) {
            System.err.println("Erro na entrada de dados:" + erro.getMessage());
        } catch (ArithmeticException erro) {
            System.err.println("Erro na divisão de dados:" + erro.getMessage());
        } catch (Exception erro) {
            System.out.println("Erro genérico:" + erro.getMessage());
        } finally {
            System.out.println("Finalizou!");
        }
        
     

    }
}
