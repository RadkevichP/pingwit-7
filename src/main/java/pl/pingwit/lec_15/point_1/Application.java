package pl.pingwit.lec_15.point_1;

import java.time.LocalDate;
import java.time.Month;

public class Application {

    public static void main(String[] args) {
        AbstractAdultChecker abstractAdultChecker = new AmericanAdultChecker();

        AdultChecker americanChecker = new AdultChecker(21);
        AdultChecker chineseChecker = new AdultChecker(19);

        Person person = new Person("Pavel", "R", LocalDate.of(1990, Month.JANUARY, 3));
        Person person2 = new Person("Peter", "Parker", LocalDate.of(2005, Month.NOVEMBER, 13));

        System.out.println(abstractAdultChecker.isAdult(person));
        System.out.println(abstractAdultChecker.isAdult(person2));
    }
}
