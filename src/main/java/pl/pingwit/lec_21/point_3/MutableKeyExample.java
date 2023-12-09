package pl.pingwit.lec_21.point_3;

import java.util.HashMap;
import java.util.Map;

public class MutableKeyExample {

    public static void main(String[] args) {
        Map<Key, String> surnameByAddress = new HashMap<>();

        Key pushkina = new Key("Pushkina", 10);
        Key serdicha = new Key("Serdicha", 15);
        Key gaya = new Key("Gaya", 89);
        System.out.println("hash: " + gaya.hashCode());

        surnameByAddress.put(pushkina, "Semina");
        surnameByAddress.put(serdicha, "Leshik");
        surnameByAddress.put(gaya, "SSSSS");

        System.out.println(surnameByAddress.get(gaya));

        gaya.setStreet("Kolcova");
        System.out.println("hash: " + gaya.hashCode());

        System.out.println(surnameByAddress.get(gaya));

        System.out.println(surnameByAddress);
    }
}
