import java.util.InputMismatchException;
import java.util.Scanner;

public class PrincipalClassOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Digite o 1* numero: ");
            int num1 = sc.nextInt();

            System.out.println("Digite o 2* numero: ");
            int num2 = sc.nextInt();

            int div = num1/num2;
            System.out.println(div);
        }catch (ArithmeticException e){
            System.out.println("Divisao por zero nao pode!");
        }catch (InputMismatchException e){
            System.out.println("Insira valor do tipo INT!");
        }



        sc.close();
    }
}
