/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package objeto.o03.encapsulamento;

import java.util.Scanner;

/**
 *
 * @author Helberth
 */
public class CadastroAluno {

    public static void main(String[] args) {
    
        Aluno aluno = new Aluno();
        
        aluno.setNome("Fulano");
        aluno.setFone("2222-2222");
        
        Scanner sc = new Scanner(System.in);
        double notas[] = new double[3];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("nota " + (i+1));
            notas[i] = sc.nextDouble();
        }
        
        aluno.setNotas(notas);
        
        
        aluno.exibirNotas();
    }
    
    
}
