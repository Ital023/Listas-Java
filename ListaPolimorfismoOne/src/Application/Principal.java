package Application;

import Entities.*;

public class Principal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Bob",13);
        Cavalo cavalo = new Cavalo("Jumas",15);
        Preguica preguica = new Preguica("Luru",12);
        Veterinario veterinario = new Veterinario();
        Zoologico zoologico = new Zoologico();

        System.out.println("Teste 1");
        cachorro.emitirSom();
        cavalo.emitirSom();
        preguica.emitirSom();
        System.out.println();

        System.out.println("Teste 2");
        veterinario.examinar(cachorro);
        veterinario.examinar(cavalo);
        veterinario.examinar(preguica);
        System.out.println();


        System.out.println("Teste 3");
        zoologico.jaulas[0] = cachorro;
        zoologico.jaulas[1] = cavalo;
        zoologico.jaulas[2] = preguica;



        for(int i=0;i<zoologico.jaulas.length;i++){
            if(zoologico.jaulas[i] instanceof Cachorro){
                zoologico.jaulas[i].emitirSom();
                zoologico.jaulas[i].correr();
            }
            else if(zoologico.jaulas[i] instanceof Cavalo){
                zoologico.jaulas[i].emitirSom();
                zoologico.jaulas[i].correr();
            }
            else if(zoologico.jaulas[i] instanceof Preguica){
                zoologico.jaulas[i].emitirSom();
                zoologico.jaulas[i].subirArvore();
            }
        }
    }
}
