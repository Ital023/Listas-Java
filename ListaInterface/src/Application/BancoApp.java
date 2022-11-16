package Application;

import Entities.*;

import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menuMain=0;
        int menuSec=0;
        Banco banco = new Banco();
        Relatorio relatorio = new Relatorio();

        System.out.println("---Bem Vindo ao Banco---");

        while (menuMain != 5){
            System.out.println("---Menu---");
            System.out.print("[1]Criar conta [2]Selecionar Conta [3]Remover Conta " +
                    "[4]Gerar Relatorio [5]Finalizar: ");
            int menu = sc.nextInt();

            if(menu == 1){
                System.out.println("---Criar conta---");
                System.out.print("Conta corrente[c] ou poupanca[p] : ");
                String typeAcc = sc.next();
                System.out.print("Insira o numero da conta: ");
                int numConta = sc.nextInt();
                System.out.print("Insira o seu saldo: ");
                double saldo = sc.nextDouble();

                if(typeAcc.equalsIgnoreCase("c")){
                    System.out.print("Insira a taxa de operacao: ");
                    double txOp = sc.nextDouble();
                    ContaCorrente cc = new ContaCorrente(numConta,saldo,txOp);
                    banco.inserirConta(cc);
                    System.out.println("Cadastro Finalizado!!!");
                }else{
                    System.out.print("Insira o limite: ");
                    double limite = sc.nextDouble();
                    ContaPoupanca cp = new ContaPoupanca(numConta,saldo,limite);
                    banco.inserirConta(cp);
                    System.out.println("Cadastro Finalizado!!!");
                }
            }else if(menu == 2){
                menuSec = 0;
                System.out.print("Informe o numero da conta: ");
                int numContaMenu = sc.nextInt();
                if(banco.procurarConta(numContaMenu) != null){
                    while(menuSec != 5){
                            System.out.println("---Menu das contas---");
                            System.out.print("[1]Depositar [2]Sacar [3]Transferir [4]Gerar Relatorio [5]Voltar pro menu: ");
                            menuSec = sc.nextInt();

                            if(menuSec == 1){
                                System.out.print("Insira o valor de deposito: ");
                                double saldo = sc.nextDouble();
                                banco.procurarConta(numContaMenu).depositar(saldo);
                            }else if(menuSec == 2){
                                System.out.print("Insira o valor de sacar: ");
                                double saldo = sc.nextDouble();
                                banco.procurarConta(numContaMenu).sacar(saldo);
                            }else if(menuSec == 3){
                                System.out.print("Insira a conta que deseja transferir: ");
                                int contaTransfer = sc.nextInt();
                                if(banco.procurarConta(numContaMenu) != null){
                                    System.out.print("Insira o valor para transferir: ");
                                    double valorTransfer = sc.nextDouble();
                                    banco.procurarConta(numContaMenu).transferir(valorTransfer,banco.procurarConta(contaTransfer));
                                }else{
                                    System.out.println("Conta invalida!!!");
                                }
                            }else if(menuSec == 4){
                                relatorio.gerarRelatorio(banco.procurarConta(numContaMenu));
                            }
                        }
                    }


            }else if(menu == 3){
                System.out.println("---Excluindo conta---");
                System.out.println("Informe o numero da conta: ");
                int numConta = sc.nextInt();

                for(ContaBancaria x : banco.contas){
                    if(banco.procurarConta(numConta) != null){
                        banco.removerConta(x);
                        System.out.println("Sucesso!!!");
                    }else{
                        break;
                    }
                }
            }else if(menu == 4){
                relatorio.gerarRelatorio(banco);
                System.out.println("Sucesso!!!");
            }else if(menu == 5){
                System.out.println("Programa finalizado!!!");
                break;
            }
        }
        sc.close();
    }

}
