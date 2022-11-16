package Entities;

public class ContaCorrente extends ContaBancaria implements Imprimivel{
    private double taxaDeOperacao;

    public ContaCorrente(int numConta, double saldo, double taxaDeOperacao) {
        super(numConta, saldo);
        this.taxaDeOperacao = taxaDeOperacao;
    }

    public ContaCorrente(int numConta, double saldo) {
        super(numConta, saldo);
    }

    @Override
    public void sacar(double amount) {
        if(getSaldo() > amount) {
            setSaldo(getSaldo() - amount);
        }else{
            System.out.println("Valor indisponivel para saque!");
        }

    }

    @Override
    public void depositar(double amount) {
        setSaldo(getSaldo() + amount);
    }

    @Override
    public void mostrarDados() {
        System.out.println("-----------------");
        System.out.println("Dados da conta corrente: ");
        System.out.println("Num conta: "+ getNumConta());
        System.out.println("Saldo: "+ getSaldo());
        System.out.println("Taxa de operacao: "+ taxaDeOperacao);
        System.out.println("-----------------");
    }
}
