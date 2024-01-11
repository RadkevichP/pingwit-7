package pl.pingwit.lec_27.point_1;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PalindromeCheckerTest {

    private final PalindromeChecker target = new PalindromeChecker();

    // "1221" , "!@@!", "цыц", "pepa"
    @Test
    void shouldCheckStringOfDigits() {
        // given
        String stringOfDigits = "1221";

        // when
        boolean actual = target.isPalindrome(stringOfDigits);

        // then
        assertThat(actual).isTrue();
    }

    @Test
    void shouldCheckStringOfSymbols() {
        // given
        String stringOfSymbols = "!@!@!";

        // when
        boolean actual = target.isPalindrome(stringOfSymbols);

        // then
        assertThat(actual).isTrue();
    }

    @Test
    void shouldCheckCyrillicString() {
        // given
        String stringOfCyrillic = "цыц";

        // when
        boolean actual = target.isPalindrome(stringOfCyrillic);

        // then
        assertThat(actual).isTrue();
    }

    @Test
    void shouldReturnFalseIfNotPalindrome() {
        // given
        String notPalindrome = "pepa";

        // when
        boolean actual = target.isPalindrome(notPalindrome);

        // then
        assertThat(actual).isFalse();
    }

    @Test
    void shouldThrowExceptionWhenEmptyString() {
        // given
        String emptyString = "";
        String expectedMessage = "String is blank";

        // when
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> target.isPalindrome(emptyString));

        // then
        assertThat(exception.getMessage()).isEqualTo(expectedMessage);
    }

}