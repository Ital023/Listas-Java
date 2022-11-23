package Entities;

public class ContaBancaria {
    private double saldo;
    private double limite;

    public ContaBancaria(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldoComLimite(){
        return saldo + limite;
    }

    public boolean sacar(double valor) throws ContaException {
        double sacLimit = 0;
        sacLimit = saldo + limite;

        try{
            if(valor <= sacLimit && valor <= 500 && sacLimit > 0){
                saldo -= valor;
            }else{
                throw new ContaException("O valor excedeu o saque limite ou é acima de 500 reais!");
            }
        }catch (ContaException e){
            System.out.println("Por favor inserir valores validos!!!");
            return false;
        }
        return true;
    }

    public boolean depositar(double valor) throws ContaException {
        try{
            if(valor <= 1000){
                saldo += valor;
            }else{
                throw new ContaException("O deposito excedeu 1000 reais");
            }
        }catch (ContaException e){
            System.out.println("Inserir um valor abaixo de 1000 reais");
            return false;
        }
        return true;
    }

}
