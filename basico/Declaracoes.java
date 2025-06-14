package basico;

/*
 * Declaração e atribuição de variáveis
 * 
 */
public class Declaracoes {

	public static void main(String[] args) {


		/*
		 * Operadores matem�ticos
		 * 
		 * 	+	adição
		 * 	-	subtração
		 * 	*	multiplicação
		 * 	/	divisão
		 * 	%	módulo
		 * 
		 */
		
		/* Variáveis do tipo inteiro
		 * 
		 * 	byte	- um byte (8 bits)
		 * 	short	- 16 bits
		 * 	int	    - 32 bits
		 * 	long	- 64 bits
		 * 
		 */
		byte valorB	= 1;
		short valorS = 10;
		int valorInt = 100;
		long valorL = 1000;
		
		System.out.println("Inteiro: " + (valorB + valorS + valorInt + valorL));
		
		/*
		 * Variáveis do tipo real (ponto flutuante)
		 * 
		 * 	float	- 32 bits
		 * 	double	- 64 bits
		 */		
		float valorF = 10000.55f;
		double valorD = 100000.88;
		
		System.out.println("Ponto flutuante:" + (valorF * valorD));
		
		/*
		 * Variável do tipo caractere
		 * 
		 * 	char	- 8 bits
		 */
		char letra = 'a';
		
		System.out.println("Caractere:" + letra);
		
		/*
		 * Variável do tipo lógico
		 * 
		 * 	boolean 	- 1 bit
		 */
		boolean opcao = true;
		System.out.println("Lógico:" + opcao);
		
		/*
		 * "Variável" do tipo String
		 * 
		 * Neste caso não se trata de uma variável do tipo primitivo
		 * a String é uma classe que trabalha com texto
		 */
		String texto = "Texto de teste";
		System.out.println("Caractere (String):" + texto);
		
		/*
		 * Exemplos de operações matemáticas
		 */
		
		valorInt++;	// incrementa o valor em + 1
		valorInt += 5;	// incrementa o valor em + 5
		
		valorInt--;	// decrementa o valor em -1
		valorInt -= 5;	// decrementa o valor em -5
		
		valorInt *=5;	// multiplica o valorInt por 5 e atribui a valorInt
		valorInt /=5;	// divide o valorInt por 5 e atribui a valorInt
		
                // valorInt = valorInt / 5;
		
		System.out.println("Valor de valorInt: " + (valorInt + 5));
		
	}


}

