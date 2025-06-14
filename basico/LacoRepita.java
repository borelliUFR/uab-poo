package basico;

/*
 * Exemplo de classe para uso do laço repita
 */

// importando classe para leitura de teclado
import java.util.Scanner;

public class LacoRepita {

	public static void main(String[] args) {
		
		// declarando leitura de teclado
		Scanner ler = new Scanner(System.in);
		String senha;
				
		do {
			
			System.out.println("Digite a senha");
			senha = ler.nextLine();
			
			if (senha.equalsIgnoreCase("senha"))
				break;
			
		} while (true);
		
		System.out.println("Laço foi quebrado!");
	}
	
}
