package basico;

/*
 * Conversão de tipos de dados
 */
public class Conversoes {
	public static void main(String[] args) {
		
		/*
		 * Conversão de String para outro tipo de dados
		 * 
		 * 	- uso do comando "parse"
		 */
		
		String valorSt = "10";
		
		byte valorB = Byte.parseByte(valorSt);
		short valorS = Short.parseShort(valorSt);
		int valorI = Integer.parseInt(valorSt);
		long valorL = Long.parseLong(valorSt);
		
		float valorF = Float.parseFloat(valorSt);
		double valorD = Double.parseDouble(valorSt);
		
		System.out.println("Parse: " + (valorB + valorS + valorI + 
								valorL + valorF + valorD));
		
		valorD = valorD + 0.67890;
		
		/*
		 * Conversão de um tipo maior para um menor
		 * 
		 * 	- ocorrerá perda da precisão para este tipo de conversão
		 */
		
		valorB = (byte)valorD;
		valorS = (short)valorF;
		valorI = (int)valorL;
		
		valorF = (float)valorD;
		
		System.out.println("Cast: " + (valorB + valorS + valorL + valorF));
	}
}

