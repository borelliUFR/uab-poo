package objeto.o08.agregacao.partes;

public class Painel {

    public enum Estado {

        DESLIGADO, LIGADO
    }

    public enum Direcao {

        DIREITA, ESQUERDA
    }

    public void farol(Estado estado) {
        switch (estado) {
            case DESLIGADO:
                System.out.println("FAROL DESLIGADO");
                break;
            case LIGADO:
                System.out.println("FAROL LIGADO");
                break;
        }
    }

    public void seta(Direcao direcao) {
        if (direcao == Direcao.DIREITA) {
            System.out.println("VIRAR PARA DIREITA");
        } else {
            System.out.println("VIRAR PARA ESQUERDA");
        }
    }

    public void velocimetro(double velocidade) {
        for (int i = 0; i < 9; i++) {

            if ((int) velocidade == (i * 10)) {
                System.out.print("|*" + velocidade + "*|");
            } else {
                System.out.print("| " + (i * 10) + " |");
            }
        }
        System.out.println("");
    }
}
