package pl.pingwit.lec_28.point_1;

import java.math.BigDecimal;

public class CarInsuranceCostCalculator {

    private final BasePriceService basePriceService;
    private final PersonRatingService personRatingService;

    public CarInsuranceCostCalculator(BasePriceService basePriceService,
                                      PersonRatingService personRatingService) {
        this.basePriceService = basePriceService;
        this.personRatingService = personRatingService;
    }

    // метод должен рассчитать стоимость страховки на авто. исходные данные - объем двигателя и номер паспорта
    // метод должен вызвать BasePriceService, чтобы получить базовую ставку страховки basePrice за 1 кубический см
    // далее он должен вызвать PersonRatingService и получить по номеру паспорта коэффициент personalRate для конкретного человека
    // и последним шаго метод перемножит объем мотора х basePrice х personalRate
    public BigDecimal calculatePolicyPrice(InsuranceParametersInput input) {
        BigDecimal personalRating = personRatingService.findPersonalRating(input.personalId())
                .orElse(BigDecimal.ONE);

        BigDecimal basePrice = basePriceService.loadBasePrice();

        return personalRating.multiply(BigDecimal.valueOf(input.engineVolume())
                .multiply(basePrice));
    }
}
