package objeto.o06.classeabstrata;

// Exemplo de classe abstrata

//Observe que a classe e os métodos são abstratos
/*
 * Esta classe serah sempre uma super classe e definirah metodos 
 * obrigatorios para ser implementado por sua herdeira 
 */
public abstract class Carro {
    
    public enum Tanque {CHEIO, VAZIO, MEIO}
    
    public abstract void acelerar();
    
    public abstract void frear();
    
    public abstract void setModelo(String modelo);
    
    public abstract String getModelo();
    
    public void abastecer(Tanque tanque) {
        switch (tanque) {
            case VAZIO: System.out.println("Abasteca o carro!"); break;
            case CHEIO: System.out.println("O carro esta abastecido!"); break;
        }
    }
}
