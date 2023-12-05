package pl.pingwit.lec_20.homework;

import pl.pingwit.lec_12.point_1.Pet;

public class PetBox<T extends Pet> {

    private T[] pets;

    public PetBox(T[] pets) {
        this.pets = pets;
    }

    public T[] getPets() {
        return pets;
    }
}
