package pl.pingwit.lec_16.point_1;

import org.apache.commons.lang3.RandomUtils;

public class RandomGreetingService {

    private static final String[] GREETINGS = new String[]{"Hello, %s!", "Привет, %s", "Laba diena, %s!"};

    @Deprecated(since = "23.10")
    public void greetPerson(String person) {
        String greeting = GREETINGS[RandomUtils.nextInt(0, 2)];
        System.out.printf(greeting, person);
    }
}
