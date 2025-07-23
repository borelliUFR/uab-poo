package exercicios.unidade_01.ex02;

public class ContaBancaria {
    
    // 🔒 Atributos privados
    private String numeroConta;
    private String titular;
    private double saldo;

    // 🔹 Construtor
    public ContaBancaria(String numeroConta, String titular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // 🔸 Getters
    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public double consultarSaldo() {
        return saldo;
    }

    // 🔸 Setter (opcional) para atualizar titular
    public void setTitular(String novoTitular) {
        this.titular = novoTitular;
    }

    // 🔹 Métodos de operação
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saque inválido ou saldo insuficiente.");
        }
    }
}
