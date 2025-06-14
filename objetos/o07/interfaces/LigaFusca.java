package objeto.o07.interfaces;

public class LigaFusca {
    
    public static void main(String[] args) {
        
        Fusca fusca = new Fusca();
        
        System.out.println(fusca.getModelo());
        
        fusca.abastecer(Fusca.Tanque.CHEIO);
        fusca.acelerar();
        fusca.frear();
        fusca.abastecer(Fusca.Tanque.VAZIO);
        
    }
    
}
