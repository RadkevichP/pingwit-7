package pl.pingwit.lec_25.point_1;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import pl.pingwit.lec_15.point_1.Person;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        String username = generateSomeUsername();
        String surname = null;

        if (username != null) {
            System.out.println(username.length());
        }

        // create optional
        Optional<String> usernameOpt = Optional.of("surname"); // только если объект-содержимое не null

        // создает из объекта и из null
        Optional<String> usernameOpt2 = Optional.ofNullable(surname);

        // вернет пустую "коробку"
        Optional<Person> emptyOpt = Optional.empty();

        // более современный дизайн методов
        Optional<String> optionalName = generateSomeUsernameOptional();

        boolean present = optionalName.isPresent();

        // work with optional
        if (optionalName.isPresent()) {
            String user = optionalName.get();
            System.out.println(user);
        }

        //-------------------------------------------
        String user = optionalName.orElseThrow(() -> new IllegalArgumentException("No username provided!"));
        System.out.println(user);

        // ------------------------------------------
        String userOrDefault = optionalName.orElse("Default Name");

        // отложенное выполнение
        String userOrGet = usernameOpt2.orElseGet(() -> RandomStringUtils.random(5));


        String someString = usernameOpt2
                .map(String::toUpperCase)
                .orElseGet(() -> RandomStringUtils.random(8));

        // используйте Optional для возвращаемых из методов значений.
        // не используйте его в качестве параметра метода
    }


    // нужно написать новую версию метода
    private static String generateSomeUsername() {
        if (RandomUtils.nextBoolean()) {
            return null;
        } else {
            return RandomStringUtils.random(5);
        }
    }

    private static Optional<String> generateSomeUsernameOptional() {
        if (RandomUtils.nextBoolean()) {
            return Optional.empty();
        } else {
            return Optional.of(RandomStringUtils.random(5));
        }
    }

}
