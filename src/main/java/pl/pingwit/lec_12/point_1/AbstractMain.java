package pl.pingwit.lec_12.point_1;

import pl.pingwit.lec_12.point_1.Hamster;
import pl.pingwit.lec_12.point_1.Owner;
import pl.pingwit.lec_12.point_1.Pet;

import java.math.BigDecimal;

public class AbstractMain {

    public static void main(String[] args) {
        // Pet blah = new Pet("Blah", new Owner("", "", ""));
        Hamster hamster = new Hamster("Xima", new Owner("Xi", "Ling", "380909"), BigDecimal.ONE);
        Hamster hamster2 = new Hamster("Xima", new Owner("Xi", "Ling", "380909"), BigDecimal.ONE);
        Pet hamster3 = new Hamster("Xima", new Owner("Xi", "Ling", "380909"), BigDecimal.ONE);
        Pet[] pets = {hamster, hamster2};

        for (Pet pet : pets) {
            pet.singToOwner("Dance");
            pet.jump();
        }
    }
}
