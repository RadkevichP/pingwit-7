package pl.pingwit.lec_12.point_1;

import java.math.BigDecimal;
import java.util.Objects;

public class Hamster extends Pet {

    private final BigDecimal mouthVolume;

    public Hamster(String name, Owner owner, BigDecimal mouthVolume) {
        super(name, owner);
        this.mouthVolume = mouthVolume;
    }

    public BigDecimal getMouthVolume() {
        return mouthVolume;
    }

  /*  @Override
    public void jump() {
        System.out.println("Hamster can't jump!");
    }*/

    @Override
    public String singToOwner(String songName) {
        return String.format("Frrrr, frrr, good night, my dear %s", owner.name());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hamster hamster = (Hamster) o;
        return Objects.equals(mouthVolume, hamster.mouthVolume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mouthVolume);
    }
}
