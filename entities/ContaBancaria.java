package entities;

public class ContaBancaria {

    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void exibirDados() {
        System.out.println("Titular da Conta: " + titular);
        System.out.println("Saldo: " + saldo);
    }


    public void depositar(double valor) {
    if (valor > 0) {
        saldo += valor;
    }
}


public void sacar(double valor) {
    if (valor > 0 && saldo >= valor) {
        saldo -= valor;
    }
}


}
