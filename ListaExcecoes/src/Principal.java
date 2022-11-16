import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o 1 numero: ");
        int num1 = sc.nextInt();

        System.out.println("Insira o 2 numero: ");
        int num2 = sc.nextInt();

        try{
            int div = num1 / num2;
            System.out.println(div);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }





        sc.close();
    }
}
