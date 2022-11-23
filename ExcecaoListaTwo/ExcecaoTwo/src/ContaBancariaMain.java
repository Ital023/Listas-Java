import Entities.ContaBancaria;
import Entities.ContaException;

import java.util.Scanner;

public class ContaBancariaMain {
    public static void main(String[] args) throws ContaException {
        Scanner sc = new Scanner(System.in);

        double saldo = 200;
        double limite = 250;

        ContaBancaria contaBancaria = new ContaBancaria(saldo,limite);

        //System.out.println(contaBancaria.getSaldoComLimite());

        System.out.println(contaBancaria.sacar(100));

        System.out.println(contaBancaria.getSaldo());

        System.out.println("-------------");

        System.out.println(contaBancaria.depositar(100));

        System.out.println(contaBancaria.getSaldo());

        sc.close();
    }
}
