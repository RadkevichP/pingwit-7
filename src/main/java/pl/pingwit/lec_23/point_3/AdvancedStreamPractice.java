package pl.pingwit.lec_23.point_3;

import pl.pingwit.lec_12.point_1.Hamster;
import pl.pingwit.lec_12.point_1.Owner;
import pl.pingwit.lec_12.point_1.Pet;

import java.math.BigDecimal;
import java.util.List;
import java.util.regex.Pattern;

public class AdvancedStreamPractice {

    public static final Pattern EMAIL_PATTERN_2 = Pattern.compile("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

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

        // получить список уникальных овнеров
        List<Owner> uniqueOwners = hamsters.stream()
                .map(Pet::getOwner)
                .distinct()
                .toList();

        // получить список уникальных овнеров, проверить имэйл на валидность, отправить имэйл
        hamsters.stream()
                .map(Pet::getOwner)
                .distinct()
                .filter(AdvancedStreamPractice::isEmailValid)
                //.peek(System.out::println)  // только для дебага!!!
                .forEach(AdvancedStreamPractice::sendEmail);
    }

    private static boolean isEmailValid(Owner uniqueOwner) {
        return EMAIL_PATTERN_2.matcher(uniqueOwner.email()).matches();
    }

    private static void sendEmail(Owner owner) {
        System.out.println(String.format("Dear %s %s! Happy New Year!", owner.name(), owner.surname()));
    }
}
