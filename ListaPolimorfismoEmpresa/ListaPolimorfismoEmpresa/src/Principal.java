import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
    FuncBasico funcBasico1 = new FuncBasico("Gabriel",1,"Vendedor","Fortaleza");
    FuncBasico funcBasico2 = new FuncBasico("Junin",2,"Vendedor","Fortaleza");
    FuncBasico funcBasico3 = new FuncBasico("Arooba",3,"Vendedor","Fortaleza");
    FuncBasico funcBasico4 = new FuncBasico("Daniel",4,"Supervisor","Fortaleza");

    FuncEM funcEM1 = new FuncEM("Cristiano",5,"Supervisor","BackEnd");
    FuncEM funcEM2 = new FuncEM("Dybala",6,"Supervisor","BackEnd");
    FuncEM funcEM3 = new FuncEM("Mbappe",7,"Vendedor","BackEnd");
    FuncEM funcEM4 = new FuncEM("Rodolfo",8,"Supervisor","BackEnd");

    FuncGrad funcGrad1 = new FuncGrad("Neymar",9,"Vendedor","FrontEnd","FBUNI");
    FuncGrad funcGrad2 = new FuncGrad("Messi",10,"Gerente","FrontEnd","FBUNI");

    Funcionario funcionarios[] = new Funcionario[10];

    funcionarios[0] = funcBasico1;
    funcionarios[1] = funcBasico2;
    funcionarios[2] = funcBasico3;
    funcionarios[3] = funcBasico4;
    funcionarios[4] = funcEM1;
    funcionarios[5] = funcEM2;
    funcionarios[6] = funcEM3;
    funcionarios[7] = funcEM4;
    funcionarios[8] = funcGrad1;
    funcionarios[9] = funcGrad2;



    double totalCusto = calcularCustoGeral(funcionarios);
    System.out.println(totalCusto);

    calcularCustoEscolaridade(funcionarios);
        System.out.println();
        System.out.println();
        System.out.println(calcularCustoGeralComissoes(funcionarios));

        FuncBasico funcBasicoCom1 = new FuncBasico("Gabriel",1,"Vendedor","Fortaleza");
        FuncBasico funcBasicoCom2 = new FuncBasico("Junin",2,"Vendedor","Fortaleza");
        FuncBasico funcBasicoCom3 = new FuncBasico("Arooba",3,"Vendedor","Fortaleza");
        FuncBasico funcBasicoCom4 = new FuncBasico("Daniel",4,"Vendedor","Fortaleza");

        FuncEM funcEMCom1 = new FuncEM("Cristiano",5,"Vendedor","BackEnd");
        FuncEM funcEMCom2 = new FuncEM("Dybala",6,"Vendedor","BackEnd");
        FuncEM funcEMCom3 = new FuncEM("Mbappe",7,"Vendedor","BackEnd");
        FuncEM funcEMCom4 = new FuncEM("Rodolfo",8,"Supervisor","BackEnd");

        FuncGrad funcGradCom1 = new FuncGrad("Neymar",9,"Supervisor","FrontEnd","FBUNI");
        FuncGrad funcGradCom2 = new FuncGrad("Messi",10,"Gerente","FrontEnd","FBUNI");

        Funcionario funcionarioCom[] = new Funcionario[10];


        funcionarios[0] = funcBasicoCom1;
        funcionarios[1] = funcBasicoCom2;
        funcionarios[2] = funcBasicoCom3;
        funcionarios[3] = funcBasicoCom4;
        funcionarios[4] = funcEMCom1;
        funcionarios[5] = funcEMCom2;
        funcionarios[6] = funcEMCom3;
        funcionarios[7] = funcEMCom4;
        funcionarios[8] = funcGradCom1;
        funcionarios[9] = funcGradCom2;


        calcularCustoGeralComissoes(funcionarioCom);
    }
    public static double calcularCustoGeral(Funcionario funcionario[]){
        double salario = 0;
        for(int i = 0;i<funcionario.length;i++){
            salario = salario + funcionario[i].getSalario();
        }
        return salario;
    }
    public static double calcularCustoGeralComissoes(Funcionario funcionario[]){
        double salario = 0;
        for(int i = 0;i<funcionario.length;i++){
            if(funcionario[i] != null){
                if (funcionario[i].getCargo().equalsIgnoreCase("Gerente")){
                    salario = salario + funcionario[i].getSalario() + 1500;
                }
                else if(funcionario[i].getCargo().equalsIgnoreCase("Supervisor")){
                    salario = salario + funcionario[i].getSalario() + 600;
                }
                else if(funcionario[i].getCargo().equalsIgnoreCase("Vendedor")){
                    salario = salario + funcionario[i].getSalario() + 250;
                }
            }
        }
        return salario;
    }

    public static void calcularCustoEscolaridade(Funcionario funcionario[]){
        double salarioBasico = 0;
        double salarioEM = 0;
        double salarioGrad = 0;
        for(int i = 0;i<funcionario.length;i++){
            if(funcionario[i] instanceof FuncGrad){
                salarioGrad = salarioGrad + funcionario[i].getSalario();
            }
            else if(funcionario[i] instanceof FuncEM){
                salarioEM = salarioEM + funcionario[i].getSalario();
            }
            else {
                salarioBasico = salarioBasico + funcionario[i].getSalario();
            }
        }
        System.out.println("Salario total de graduação= "+salarioGrad);
        System.out.println("Salario total do ensino medio= "+salarioEM);
        System.out.println("Salario total do ensino basico= "+salarioBasico);
    }
}
