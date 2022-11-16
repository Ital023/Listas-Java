package Entities;

public class Veterinario {
    public Veterinario() {
    }

    public void examinar(Animal animal){
        System.out.println("Examinando...");
        animal.emitirSom();
    }
}
