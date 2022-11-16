package Application;

import Entities.ContaBancaria;
import Entities.ContaCorrente;
import Entities.ContaPoupanca;
import Entities.Relatorio;

public class Principal {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1,1000,10);
        ContaBancaria cb = new ContaPoupanca(2,1000,10);
        Relatorio r1 = new Relatorio();


        r1.gerarRelatorio(cc);
        r1.gerarRelatorio(cb);
        cc.transferir(200,cb);
        r1.gerarRelatorio(cc);
        r1.gerarRelatorio(cb);
    }
}
