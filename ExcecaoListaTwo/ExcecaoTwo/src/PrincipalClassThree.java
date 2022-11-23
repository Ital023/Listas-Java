import Entities.Login;

import java.util.Scanner;

public class PrincipalClassThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o nome de login: ");
        String login = sc.nextLine();

        System.out.print("Insira a senha: ");
        String senha = sc.nextLine();

        Login user = new Login(login,senha);

        System.out.println("----------");
        System.out.print("Insira o seu usuario para logar: ");
        String loginTent = sc.nextLine();

        System.out.print("Insira a senha para logar: ");
        String senhaTent = sc.nextLine();

        System.out.println(user.fazerLogin(loginTent,senhaTent));




        sc.close();
    }
}
