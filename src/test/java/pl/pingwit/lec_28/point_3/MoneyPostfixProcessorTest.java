package pl.pingwit.lec_28.point_3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MoneyPostfixProcessorTest {

    MoneyPostfixProcessor target = new MoneyPostfixProcessor();

    @Test
    void shouldAddPostfixTo1() {
        // given
        int number = 1;
        String expectedMessage = "1 рубль";

        // when
        String actual = target.addMoneyPostfix(number);
        // then
        assertThat(actual).isEqualTo(expectedMessage);
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void shouldAddPostfix(int number, String expected) {
        // given
        // when
        String actual = target.addMoneyPostfix(number);
        //then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(1, "1 рубль"),
                Arguments.of(2, "2 рубля"),
                Arguments.of(3, "3 рубля"),
                Arguments.of(4, "4 рубля"),
                Arguments.of(5, "5 рублей"),
                Arguments.of(21, "21 рубль")
        );
    }

}