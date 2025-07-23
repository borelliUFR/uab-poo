package objeto.o02.controleacesso;

public class Carro {

    /*
   
     *    public - acesso liberado
     *    protected - acesso para as classes de mesmo pacote
     *    private -acesso somente pela classe
    
     */
    private int ano;
    private String cor;
    private double velocidade = 0;
    // estado público
    public String tipo;
    // estado protegido
    protected String placa;

    public Carro(int ano, String cor) {
        this.ano = ano;
        this.cor = cor;
    }

    public void acelerar() {
        this.velocidade += 5;
        System.out.println("Velocidade = " + velocidade);
    }

    public void frear() {

        if (velocidade < 5) {
            System.out.println("Velocidade = " + velocidade);
            System.out.println("Velocidade não pode ser menor que 0!");
        } else {
            this.velocidade -= 5;
            System.out.println("Velocidade = " + velocidade);
        }
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano > 1885) { // O primeiro carro foi inventado em 1886
            this.ano = ano;
        } else {
            System.out.println("Ano inválido!");
        }
    }

    /**
     * @return the cor
     */
    public String lerCor() {
        return cor;
    }

    /**
     * @return the velocidade
     */
    public double lerVelocidade() {
        return velocidade;
    }
}
