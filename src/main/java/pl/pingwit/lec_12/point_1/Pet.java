package pl.pingwit.lec_12.point_1;

public abstract class Pet {

    protected final Owner owner;
    protected final String name;

    protected Pet(String name, Owner owner) {
        this.name = name;
        this.owner = owner;
    }

    public Owner getOwner() {
        return owner;
    }

    public String getName() {
        return name;
    }

    public final String infoCard() {  // запрещаем переопределять
        return String.format("This is %s. This pet is owned by %s %s.", name, owner.name(), owner.surname());
    }

    public void jump() {  // разрешаем переопределять, но можно и не переопределять
        System.out.println(name + " jumped on the table!");
    }

    public abstract String singToOwner(String songName);  // обязываем переопределять

}
