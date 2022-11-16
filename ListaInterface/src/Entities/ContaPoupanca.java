package Entities;

public class ContaPoupanca extends ContaBancaria implements Imprimivel{
    private double limite;

    public ContaPoupanca(int numConta, double saldo, double limite) {
        super(numConta, saldo);
        this.limite = limite;
    }

    public ContaPoupanca(int numConta, double saldo) {
        super(numConta, saldo);
    }

    @Override
    public void sacar(double amount) {
        double saldoTotal = getSaldo() + limite;
        if(getSaldo() > amount){
            setSaldo(getSaldo() - amount);
            limite = saldoTotal - amount;
        }else{
            System.out.println("Valor indisponivel para sacar!");
        }

    }

    @Override
    public void depositar(double amount) {
        setSaldo(getSaldo() + amount);
    }

    @Override
    public void mostrarDados() {
        System.out.println("-----------------");
        System.out.println("Dados da conta poupanca: ");
        System.out.println("Num conta: "+ getNumConta());
        System.out.println("Saldo: "+ getSaldo());
        System.out.println("Limite: "+ limite);
        System.out.println("-----------------");
    }
}
