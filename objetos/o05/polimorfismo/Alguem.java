package objeto.o05.polimorfismo;

public class Alguem {

    public static void main(String[] args) {

        // instanciando as classes
        Pessoa pessoa = new Pessoa();
        Salustrina salu = new Salustrina();
        Jungler juge = new Jungler();


        // utilzando o metodo imprimir e 
        // passando como parametro os objetos criados acima
        imprimir(pessoa);
        //imprimir(salu);
        //imprimir(juge);
        
    }

    public static void imprimir(Pessoa alguem) {
        // observe que todos as classes tem o metodo getNome configurando o polimorfismo
        System.out.println(alguem.getNome());
    }
}
