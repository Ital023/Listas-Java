package Entities;

import java.util.ArrayList;
import java.util.List;

public class Banco implements Imprimivel{
    public List<ContaBancaria> contas = new ArrayList<>();

    public void inserirConta(ContaBancaria conta){
        contas.add(conta);
    }
    public void removerConta(ContaBancaria conta){
        contas.remove(conta);
    }
    public ContaBancaria procurarConta(int numConta){
        for(ContaBancaria x:contas){
            if(numConta == x.getNumConta()){
                return x;
            }
            }
        return null;
        }

    @Override
    public void mostrarDados() {
        for (ContaBancaria x : contas){
            x.mostrarDados();
        }
    }
}

