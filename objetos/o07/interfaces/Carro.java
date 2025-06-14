package objeto.o07.interfaces;

// Exemplo de classe abstrata

//Observe que estamos agora implementando uma interface e nao uma classe
/*
 * A interface serah sempre um modelo para implementação de classes 
 * mas seus métodos nao serao necessariamente implementados na classe.
 */
public interface Carro {
    
    public void acelerar();
    
    public void frear();
    
    public void setModelo(String modelo);
    
    public String getModelo();

    
}
