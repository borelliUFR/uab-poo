/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.util.Scanner;

/**
 *
 * @author Helberth
 */
public class OperacoesModulos {
    
    public static void main(String []arg) {
        
        Scanner ler = new Scanner(System.in);
        int v1, v2;
        
        System.out.print("Digite o primeiro valor:");
        v1 = ler.nextInt();
        System.out.print("Digite o segundo valor:");
        v2 = ler.nextInt();
        
        multiplicar(v1, v2);
        
        imprimir("A soma é " + somar(v1, v2));
        imprimir("A subtração é " + subtrair(v1, v2));
        
    }
    
    public static int somar(int v1, int v2) {
        return v1 + v2;
    }
    
    public static int subtrair(int v1, int v2) {
        return v1 - v2;
    }
    
    public static void multiplicar(int v1, int v2) {
        System.out.println(v1 * v2);
    }
    
    public static void dividir(int v1, int v2) {
        System.out.println(v1 / v2);
    }
    
    public static void imprimir(String texto) {
        System.out.println(texto);
    }
}
