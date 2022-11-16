import java.util.Scanner;

public class StringsPrincipal {
    public static void main(String[] args) throws ExceptionDomain {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a 1* string: ");
        String string1 = sc.nextLine();

        System.out.println("Insira a 2* string: ");
        String string2 = sc.nextLine();

        if(string1.equals("")){
            string1 = null;
        }
        if(string2.equals("")){
            string2 = null;
        }
        varString(string1);
        varString(string2);
        try{
            if(string1.length() > string2.length()){
                System.out.println("A string 1 eh maior que a string 2");
            }else if(string1.length() < string2.length()){
                System.out.println("A string 1 eh menor que a string 2");
            }else if(string1.length() == string2.length()){
                System.out.println("A string 1 eh do mesmo tamanho que a string 2");
            }
        }catch(NullPointerException e){
            System.out.println("Preencha um valor valido para as strings");
            System.out.println(e.getMessage());
        }
        sc.close();

        }
        public static String varString(String str) throws ExceptionDomain {
            for(int i=0;i<str.length();i++){
                if(Character.isLetter(str.charAt(i)) == false){
                    throw new ExceptionDomain("Tem coisa alem de letra!");
                }
                if(Character.isUpperCase(str.charAt(i)) == false){
                    throw new ExceptionDomain("Tem letra minuscula!!!");
                }
            }
            return str;
        }
    }
