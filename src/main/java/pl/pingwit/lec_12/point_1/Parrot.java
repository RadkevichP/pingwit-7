package pl.pingwit.lec_12.point_1;

public class Parrot extends Pet {

    public Parrot(String name, Owner owner) {
        super(name, owner);
    }

    @Override
    public String singToOwner(String songName) {
        return "чык-чырык!!!";
    }

}
