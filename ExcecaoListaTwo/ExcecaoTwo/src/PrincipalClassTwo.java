import java.util.InputMismatchException;
import java.util.Scanner;

public class PrincipalClassTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vetor[] = new int[10];
        int i=0;
        int j=1;
        do {
            int num = 0;
            try {
                System.out.printf("Insira o %d* do vetor: ", i + 1);
                num = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Insira um numero valido!");
            }


            if (num != 0) {
                try {
                    vetor[i] = num;
                    i++;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Vetor so armazena 10 numeros!");
                    j=0;
                }
            } else {
                i++;
                vetor[i] = 0;
                j = 0;
            }
        }while(j != 0);

        for(int k=0;k<i;k++){
            System.out.println(vetor[k]);
        }


        sc.close();
    }
}
