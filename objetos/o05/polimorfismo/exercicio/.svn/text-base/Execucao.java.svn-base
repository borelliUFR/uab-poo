package objeto.o05.polimorfismo.exercicio;

public class Execucao {
    
    public static void main(String[] args) {
        
        Arvore arvore = new Arvore();
        
        
       String teste = "teste";
        
        arvore.setEspecie("Amoreira");
        arvore.setAltura(2);
        arvore.setNomeFruto("Amora");
        
        Cajueiro cajueiro = new Cajueiro();
        cajueiro.corFruto = "Amarelo";
        
        buscarDados(arvore);
        
        buscarDados(cajueiro);
        
        Aroeira aroeira = new Aroeira();
       
        buscarDados(aroeira);
    }
    
    public static void buscarDados(Arvore arvore) {
        System.out.println(arvore.getEspecie());
        System.out.println(arvore.getAltura());
        System.out.println(arvore.getNomeFruto());
        
    }
    
}
