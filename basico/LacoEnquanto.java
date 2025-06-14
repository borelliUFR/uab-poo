package basico;
import java.util.Scanner;

/*
 * Exemplo de classe com o laço enquanto
 */
public class LacoEnquanto {

	public static void main(String[] args) {
		
		boolean laco = true;
		int cont = 1;
		
		while (laco) {
			
			System.out.println(cont);
			cont+=2; 	// igual a cont = cont + 2;
			
			if (cont > 10) {
				laco = false;
                        }
		}
                
		String senha = "";
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("Digite a senha correta:");
			senha = sc.nextLine();
			
			if (senha.equals("sair"))
				break;
		}
	}	
}
