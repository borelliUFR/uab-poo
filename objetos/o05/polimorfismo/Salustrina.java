package objeto.o05.polimorfismo;

public class Salustrina extends Pessoa {

    public Salustrina() {
        super.setNome("Salustrina Antonia");
    }

    public String getNome() {
        System.out.println("Salustrina digitou o nome");
        return super.getNome();
    }
}
