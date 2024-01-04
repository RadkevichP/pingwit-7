package pl.pingwit.lec_25.point_2;

import pl.pingwit.lec_15.point_1.Person;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class AllMatchAnyMatchExample {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Pavel", "R", LocalDate.of(1990, Month.JANUARY, 3)),
                new Person("Pavel2", "Ro", LocalDate.of(1880, Month.JANUARY, 3)),
                new Person("Pavel3", "Re", LocalDate.of(1770, Month.JANUARY, 3)),
                new Person("Pavel4", "Ru", LocalDate.of(1660, Month.JANUARY, 3)),
                new Person("Peter", "Parker", LocalDate.of(2005, Month.NOVEMBER, 13)));

        List<Person> startsWithP = people.stream()
                .filter(person -> person.getName().startsWith("P"))
                .toList();

        boolean allMatches = startsWithP.size() == startsWithP.size();

        boolean allFromP = people.stream()
                .allMatch(person -> person.getName().startsWith("P"));

        System.out.println(allFromP);

        boolean atLeastOne = people.stream()
                .anyMatch(person -> person.getSurname().equals("Re"));
        System.out.println(atLeastOne);

        long count = people.stream()
                .filter(person -> person.getSurname().equals("Re"))
                .count();

        System.out.println(count);

    }
}
