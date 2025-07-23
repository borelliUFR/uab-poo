package exercicios.unidade_02.ex03;

// Exercício 3: Sistema de Descontos
class Produto {
    protected String nome;
    protected double precoBase;

    public Produto(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public double calcularPrecoFinal() {
        return precoBase;
    }
}

class Livro extends Produto {
    public Livro(String nome, double precoBase) {
        super(nome, precoBase);
    }

    @Override
    public double calcularPrecoFinal() {
        return precoBase * 0.90;
    }
}

class Eletronico extends Produto {
    public Eletronico(String nome, double precoBase) {
        super(nome, precoBase);
    }

    @Override
    public double calcularPrecoFinal() {
        return precoBase * 1.05;
    }
}

class MainDescontos {
    public static void main(String[] args) {
        Produto p1 = new Produto("Caneta", 2.00);
        Livro l1 = new Livro("Java para Iniciantes", 50.00);
        Eletronico e1 = new Eletronico("Fone Bluetooth", 100.00);

        System.out.println("Preço final do Produto: R$ " + p1.calcularPrecoFinal());
        System.out.println("Preço final do Livro: R$ " + l1.calcularPrecoFinal());
        System.out.println("Preço final do Eletrônico: R$ " + e1.calcularPrecoFinal());
    }
}
