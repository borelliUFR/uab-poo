package basico;

/*
 * Exemplo de classe com comando de desvio condicional
 * 
 * Operadores relacionais
 * 	== 	igual
 * 	!= 	diferente
 * 	>  	maior que
 *  <  	menor que
 *  >= 	maior igual
 *  <= 	menor igual
 * 
 * Operadores lógicos
 * 	!	não
 * 	&&	e
 * 	|| 	ou
 * 
 */
public class Condicionais {

	public static void main(String[] args) {
		
		boolean condicao = true;

		/*
		 * O uso do desvio condicional "if" deve ser limitado por chave,
		 * entretanto o uso da chave é falcultativo caso tenhamos somente
		 * uma instrução dentro do desvio
		 * 
		 */
		if (!condicao && condicao) 
			System.out.println("Verdadeiro");			
		else
			System.out.println("Falso");
		
		
		int valor1, valor2;
		
		valor1 = 9;
		valor2 = 20;
		
		if (valor1 == valor2  && valor1 > 5) {
			System.out.println("Valores iguais!");
		}
		else 
			System.out.println("Os valores são diferentes ou " +
							   "valor é menor que 5");
		
	
		if (valor1 > 10 || valor2 < 100)
			System.out.println("Valor 1 é maior que 10 ou " +
                                        "Valor 2 é menor que 100");
		
		
		/* Comparação de String deve ser feita através do métodos
		 * 	-	equals
		 * 	- 	equalsIgnoreCase
		 */
		String texto = "Texto";
		//String texto2 = "texto";
		
		if (texto.equals("texto"))
			System.out.println("Textos iguais");

		/*	
		if (condicao) {
			if (condicao2) {
				linhaexecucao;
				linhaexecucao2;
				if (condicao3)
					linhaexecucao3;
			}
		}
		*/	
	}

}
