package Entities;

public abstract class ContaBancaria implements Imprimivel {
    private int numConta;
    private double saldo;

    public ContaBancaria(int numConta, double saldo) {
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract void sacar(double amount);

    public abstract void depositar(double amount);

    public abstract void mostrarDados();

    public void transferir(double valor,ContaBancaria conta){
        this.sacar(valor);
        conta.depositar(valor);
    }

}
