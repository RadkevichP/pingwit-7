package pl.pingwit.lec_20.point_1;

import pl.pingwit.lec_15.point_1.Person;

public class PersonStringConverter implements Converter<Person, String> {
    @Override
    public String convert(Person input) {
        return input.getName();
    }
}
