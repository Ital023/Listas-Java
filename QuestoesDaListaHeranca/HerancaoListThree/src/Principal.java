public class Principal {
    public static void main(String[] args) {
    Fornecedor fornecedor = new Fornecedor("Alex","Rua A","85 999264453",4000,2000);
    Empregado empregado = new Empregado("Kaua","Rua B","359321931",1,1000,10);
    Administrador administrador = new Administrador("Mateus","Rua C","953812332",3,10000,10,2000);
    Operario operario = new Operario("Alberto","Rua D","230432049",4,4000,10,4000,5);
    Vendedor vendedor = new Vendedor("Janaina","Rua E","3534248923",5,5000,10,6000,5);

    System.out.println(fornecedor);
    System.out.println();

    System.out.println(empregado);
    System.out.println();
    System.out.println(administrador);
    System.out.println();

    System.out.println(operario);
    System.out.println();

    System.out.println(vendedor);
    }
}
