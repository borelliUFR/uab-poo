package objeto.o05.polimorfismo;

public class Pessoa {

    private String nome = "alguma pessoa";
    public String idade;

    /*
    public Pessoa() {
        nome = "alguma pessoa";
    }
    
    public Pessoa(String nome) {
        this.nome = nome;
    }
    */
    
    public String getNome() {
        System.out.println("A pessoa falou o nome");
        return nome;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
