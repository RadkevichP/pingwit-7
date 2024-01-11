package pl.pingwit.lec_27.point_2;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class TaromatTest {

    Taromat taromat = new Taromat();

    // 1 - empty array
    // 2 - every type 2

    @Test
    void shouldAcceptEmptyArray() {
        // given
        Tare[] empty = new Tare[]{};
        String expectedMessage = "You recycled 0 plastic bottles, 0 glass bottles, 0 aluminium bottles";
        Receipt expected = new Receipt(expectedMessage, BigDecimal.ZERO);

        // when
        Receipt actual = taromat.acceptTare(empty);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldCountReceiptWhenNotEmptyArray() {
        // given
        Tare[] tares = new Tare[]{
                new Tare("Blanch", Material.ALUMINIUM),
                new Tare("Fanta", Material.ALUMINIUM),
                new Tare("Saint Spring", Material.PLASTIC),
                new Tare("Borjomi", Material.PLASTIC),
                new Tare("Chablis", Material.GLASS),
                new Tare("Reisling", Material.GLASS)
        };
        String expectedMessage = "You recycled 2 plastic bottles, 2 glass bottles, 2 aluminium bottles";
        Receipt expected = new Receipt(expectedMessage, new BigDecimal("0.80"));

        // when
        Receipt actual = taromat.acceptTare(tares);

        // then
        assertThat(actual).isEqualTo(expected);

    }
}