package objeto.o01;

/**
 *
 * @author Helberth
 */
public class Pessoa {

    
    // estados - > variáveis
    
    private String nome = "Pessoa";
    int idade = 30;
    double altura = 1.70;
    double peso = 70;
    char sexo = 'f';
    
    public Pessoa() {
        System.out.println("Objeto instanciado!");
    }
    
    public Pessoa(String nome) {
        this.nome = nome;
    }
    
    // comportamentos - > métodos
    
    public String escreverNome() {
        return this.nome;
    }
    
    public void pular() {
        String nome = " de tal ";
        System.out.println(this.nome + " está pulando " + nome);
    }
    
    public void pular(int idade) {
        if (idade > 70)
            System.out.println("Não pule");
        else
            System.out.println("Pulou");
                
               
    }
    
    public void falar() {
        
        String nome;
        
        

        System.out.println(this.nome + " falando");
    }
    
    public void dancar() {
        System.out.println(this.nome + " dançando");
    }
    
}
