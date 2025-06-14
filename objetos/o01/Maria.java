package objeto.o01;

import objeto.o02.controleacesso.Carro;

/**
 *
 * @author Helberth
 */
public class Maria {

    public static void main(String[] args) {

        // instânciar o objeto
        Pessoa maria = new Pessoa("Maria Aparecida");

        maria.altura = 1.65;
        maria.peso = 55;
        maria.idade = 18;

        maria.sexo = 'f';


        maria.falar();

        maria.pular();

        maria.dancar();

        maria.pular(maria.idade);



        Pessoa joao = new Pessoa("João Maria");

        joao.pular();

        System.out.println(joao.escreverNome() + " tem " + joao.idade + " anos");

        System.out.println(maria.escreverNome() + " tem " + maria.idade + " anos");


        Pessoa2 ana = new Pessoa2();
        
    }
}
