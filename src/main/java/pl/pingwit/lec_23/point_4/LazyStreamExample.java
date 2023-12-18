package pl.pingwit.lec_23.point_4;

import pl.pingwit.lec_12.point_1.Hamster;
import pl.pingwit.lec_12.point_1.Owner;
import pl.pingwit.lec_12.point_1.Pet;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Stream;

public class LazyStreamExample {

    public static void main(String[] args) {
        Owner owner = new Owner("Li", "Ling", "xiling@lo.ch");
        Owner owner1 = new Owner("Wu", "Tang", "popopopopo");
        Owner owner2 = new Owner("Peter", "Parker", "zzzzoo@lo.ch");
        Owner owner3 = new Owner("Wee", "Chao", "xcv@lo.ch");

        Hamster hamster1 = new Hamster("h1", owner, BigDecimal.ONE);
        Hamster hamster2 = new Hamster("h3", owner, BigDecimal.ONE);
        Hamster hamster3 = new Hamster("h5", owner1, BigDecimal.ONE);
        Hamster hamster4 = new Hamster("h2", owner2, BigDecimal.ONE);
        Hamster hamster5 = new Hamster("h8", owner3, BigDecimal.ONE);
        Hamster hamster6 = new Hamster("h9", owner1, BigDecimal.ONE);
        Hamster hamster7 = new Hamster("h90", owner2, BigDecimal.ONE);

        List<Hamster> hamsters = List.of(hamster1, hamster2, hamster3, hamster4, hamster5, hamster6, hamster7);

        /*List<Owner> uniqueOwners = hamsters.stream()
                .map(Pet::getOwner)
                .distinct()
                .peek(System.out::println)
                .toList();*/

        Stream<Owner> ownerStream = hamsters.stream()
                .map(Pet::getOwner)
                //.peek(System.out::println)
                .distinct()
                .peek(System.out::println);
        ownerStream.toList();

    }
}
