package pl.pingwit.lec_28.point_1;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CarInsuranceCostCalculatorTest {

    // Mockito
    private final BasePriceService basePriceService = mock(BasePriceService.class);
    private final PersonRatingService personRatingService = mock(PersonRatingService.class);

    private final CarInsuranceCostCalculator target = new CarInsuranceCostCalculator(basePriceService, personRatingService);

    @Test
    void shouldCalculatePolicyPrice() {
        // given
        String personId = "MP98878788";
        Integer volume = 1600;
        InsuranceParametersInput input = new InsuranceParametersInput(volume, personId);
        // предположим, что базовая стака - 0.1 евро, а персональный рейтинг - 2.3
        BigDecimal expected = new BigDecimal("368.00");

        when(personRatingService.findPersonalRating(personId))
                .thenReturn(Optional.of(new BigDecimal("2.3")));
        when(basePriceService.loadBasePrice()).thenReturn(new BigDecimal("0.1"));


        // when
        BigDecimal actual = target.calculatePolicyPrice(input);

        // then
        assertThat(actual).isEqualTo(expected);

    }
}