package ExercicioOne;

import ExercicioOne.Entities.Cachorro;
import ExercicioOne.Entities.Peixe;

public class Application {
    public static void main(String[] args) {
        Peixe peixe = new Peixe("Nemo",6,"Agua salgada");
        Cachorro cachorro = new Cachorro("Bob",15,"Pitbull");

        System.out.println(peixe);
        System.out.println(cachorro);
    }
}
