package Entities;

public class Preguica extends Animal{

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("OU OU");
    }

    @Override
    public void correr() {

    }

    @Override
    public void subirArvore() {
        System.out.println("Preguica subindo arvore...");
    }
}
