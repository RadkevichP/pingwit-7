package pl.pingwit.lec_25.point_2;

import pl.pingwit.lec_15.point_1.Person;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

public class FindToOptionalExample {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Pavel", "R", LocalDate.of(1990, Month.JANUARY, 3)),
                new Person("Anna", "R", LocalDate.of(1990, Month.JANUARY, 3)),
                new Person("Anna", "R", LocalDate.of(1800, Month.JANUARY, 3)),
                new Person("Anna", "Zazybo", LocalDate.of(1800, Month.JANUARY, 3)),
                new Person("Peter", "Parker", LocalDate.of(2005, Month.NOVEMBER, 13)));

        Optional<Person> any = people.stream()
                .filter(person -> "Anna".equals(person.getName()))
                .findAny();

        any.ifPresent(person -> System.out.println(person.getDateOfBirth()));

        Optional<Person> first = people.stream()
                .filter(person -> "R".equals(person.getSurname()))
                .findFirst();

        Person person = first.orElseThrow(() -> new RuntimeException("Person not found!!!!"));
        System.out.println(person);

        Optional<Person> any1 = people.stream()
                .filter(person2 -> person2.getSurname().startsWith("Z"))
                .findAny();

        Person person1 = any1.orElseGet(() -> new Person("Z", "Z", LocalDate.of(1987, 12, 12)));
        System.out.println(person1);
    }
}
