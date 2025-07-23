package objeto.o05.polimorfismo;

public class Jungler extends Pessoa {

    public Jungler() {
        super.setNome("Jungler Manoel");  
    }

    @Override
    public String getNome() {
        System.out.println("Jungler escreveu o nome");
        return super.getNome();
    }
}
