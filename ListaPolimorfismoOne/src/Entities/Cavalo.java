package Entities;

public class Cavalo extends Animal{

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("HIU HIU");
    }

    @Override
    public void correr() {
        System.out.println("Cavalo correndo...");
    }

    @Override
    public void subirArvore() {

    }
}
