package pl.pingwit.lec_12.point_2;

import org.apache.commons.lang3.RandomUtils;

public interface PalindromeChecker {

    // SOLID -  I - Interface Segregation

    Integer SOME_CONSTANT = 5;

    static boolean randomBooleanValue() { // нельзя переопределить
        return RandomUtils.nextBoolean();
    }

    default Integer randomInteger() { // можно переопределять, а можно и не переопределять
        return RandomUtils.nextInt();
    }

    boolean isPalindrome(String word);  // обязательно переопределять
}
