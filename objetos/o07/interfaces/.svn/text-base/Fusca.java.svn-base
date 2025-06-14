package objeto.o07.interfaces;

public class Fusca implements Carro {

    public enum Tanque {CHEIO, VAZIO}
    
    private String modelo = "Fusca 1990";
    
    public void acelerar(){
        System.out.println("acelerou!");
    }
    
    public void frear(){
        System.out.println("freou!");
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void abastecer(Tanque tanque) {
        switch (tanque) {
            case VAZIO: System.out.println("Abasteca o carro!"); break;
            case CHEIO: System.out.println("O carro esta abastecido!"); break;
        }
    }
    
}
