package objeto.o08.agregacao;

import objeto.o08.agregacao.partes.Painel;
import objeto.o08.agregacao.partes.Painel.Direcao;
import objeto.o08.agregacao.partes.Motor;

public class Carro {
    
    private boolean estado;
    private double velocidade;

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
    
    public void virar(char direcao) {
        Painel painel = new Painel();
                
        switch (direcao) {
            case 'd': painel.seta(Direcao.DIREITA); break;
            case 'e': painel.seta(Direcao.ESQUERDA); break;
        }
    }
    
    public void acelerar() {
        Painel painel = new Painel();
        
        velocidade += 10;
        System.out.print("ACELEROU - ");
        painel.velocimetro(velocidade);
        
    }
    
    public void frear() {
        Painel painel = new Painel();
        
        velocidade -= 10;
        System.out.print("FREOU    - ");
        painel.velocimetro(velocidade);
        
    }
    
    public void ligar() {
        setEstado(true);
        
        Motor motor = new Motor();
        motor.ligar();
        
        Painel painel = new Painel();
        
        System.out.print("LIGOU    - ");
        painel.farol(Painel.Estado.LIGADO);
    }
    
    public void desligar() {
        setEstado(false);
        Painel painel = new Painel();
        
        setVelocidade(0);
        System.out.print("PAROU    - ");
        painel.velocimetro(velocidade);

        System.out.print("DESLIGOU - ");
        painel.farol(Painel.Estado.DESLIGADO);
    }
    
}
