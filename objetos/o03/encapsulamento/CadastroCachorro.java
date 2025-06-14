package objeto.o03.encapsulamento;

import java.util.Scanner;

/**
 *
 * @author Helberth
 */
public class CadastroCachorro {
    
    public static int teste;
    
    public static void main(String[] args) {
        
        Cachorro toto = new Cachorro();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o nome do cachorro");
        String nome = sc.nextLine();
        
        System.out.println("Digite a raça do cachorro");
        String raca = sc.nextLine();
        
        toto.setEstados(nome, raca, 3, "amarelo", 5, null);
    
        toto.latir();
        
        toto.comer();
        
        toto.morder();
        
        toto.correr();

        Cachorro.codigo = 90;
        
        imprimirFicha(toto);
        
        
        Cachorro rex = new Cachorro();
        
        teste = 10;
        rex.setEstados("Rex", "fila", 30, "amarelo", 5, null);
        
        imprimirFicha(rex);
    }
    
    public static void imprimirFicha(Cachorro cachorro) {
        System.out.println(cachorro.getNome());
        System.out.println(cachorro.getIdade());
        System.out.println(cachorro.getPeso());
        System.out.println(cachorro.getCor());
        System.out.println(cachorro.getRaca());
        System.out.println(cachorro.getNomeDono());
        
    }
       
}
