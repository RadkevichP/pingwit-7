package pl.pingwit.lec_15.point_3;

import pl.pingwit.lec_12.point_1.Hamster;
import pl.pingwit.lec_12.point_1.Owner;
import pl.pingwit.lec_12.point_1.Parrot;
import pl.pingwit.lec_12.point_1.Pet;

import java.math.BigDecimal;

public class InstanceOfExample {
    public static void main(String[] args) {

        Hamster hamster = new Hamster("Xima", new Owner("Xi", "Ling", "380909"), BigDecimal.TEN);
        Hamster hamster2 = new Hamster("Xima", new Owner("Xi", "Ling", "380909"), BigDecimal.ONE);
        Parrot parrot = new Parrot("Xima", new Owner("Xi", "Ling", "380909"));

        Pet[] pets = {hamster, hamster2, parrot};

        for (Pet pet : pets) {
            if (pet instanceof Hamster) {
                Hamster hamsterPet = (Hamster) pet;
                System.out.println(hamsterPet.getMouthVolume());
            } else if (pet instanceof Parrot) {
                Parrot parrotPet = (Parrot) pet;
                System.out.println(parrotPet.singToOwner("pavel"));
            }
        }
    }
}
