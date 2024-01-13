package pl.pingwit.lec_28.point_1;

import java.math.BigDecimal;
import java.util.Optional;

public interface PersonRatingService {

    Optional<BigDecimal> findPersonalRating(String personId);
}
