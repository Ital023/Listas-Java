public class Principal {
    public static void main(String[] args) {
    Gerente gerente = new Gerente("Bensom",65,"Masculino",1000,"1","Coperativo");
    Cliente cliente = new Cliente("Juninho",19,"Masculino",2000,2003);
    Vendedor vendedor = new Vendedor("Maria",20,"Feminino",4000,"2",20000,400);


    System.out.println(gerente);
    System.out.println(cliente);
    System.out.println(vendedor);
    }
}
