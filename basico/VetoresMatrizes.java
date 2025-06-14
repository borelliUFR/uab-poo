package basico;

/*
 * Exemplo de classe com vetores e matrizes
 */
public class VetoresMatrizes {

	public static void main(String[] args) {
		/*
		 * Um vetor ou matriz deve obter em sua declaração
                 * o tipo de dado e o tamanho
		 */

		// neste caso o vetor foi declarado e não foi inicializado
		int[] vetorInt = new int[3];

		// a inicialização do vetor ocorre abaixo
		vetorInt[0] = 3;
		vetorInt[1] = 30;
		vetorInt[2] = 300;
                
                System.out.println("O tamanho de vetorInt é " + vetorInt.length);

		// neste caso o vetor é declarado e inicializado
		char vogais[] = { 'a', 'e', 'i', 'o', 'u' };
		
		System.out.println("Vogal: " + vogais[0]);

		String semana[] = { "segunda", "terça", "quarta", "quinta", "sexta",
				"sabado", "domingo" };
		System.out.println("Dia da Semana: " + semana[2]);
		
		// retornar o tamanho dos vetores
		System.out.println("O vetor semana tem " + semana.length + " posições");
		
		/*
		 * Matrizes
		 */
		
		short[][] matrizS = new short[2][2];
		
		matrizS[0][0] = 1;
		matrizS[0][1] = 2;
		matrizS[1][0] = 3;
		matrizS[1][1] = 4;
		
		System.out.println("matrizS:" + matrizS[0][1]);
		
		double matrizD[][] = {{1.5, 3},{5.9, 10}};
		
		System.out.println("matrizD:" + matrizD[1][1]);
		
		// tamanho da matriz
		System.out.println("A matriD tem " + matrizD.length + " linhas");
		System.out.println("A matriD tem " + matrizD[0].length + " colunas");
		

	}

}
