package pl.pingwit.lec_28.point_2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FerryInspectorTest {

    private final int ALLOWED_WEIGHT = 10;
    private final int ALLOWED_PEOPLE = 15;

    private final FerryInspector target = new FerryInspector(ALLOWED_WEIGHT, ALLOWED_PEOPLE);

    @Test
    void shouldReturnFalseIfTotalWeightIsNotAllowed() {
        // given
        Vehicle[] vehicles = new Vehicle[]{new Vehicle("111", VehicleType.CAR, 10, 20)};

        // when
        boolean actual = target.departureAllowed(vehicles);

        // then
        assertThat(actual).isFalse();
    }

    @Test
    void shouldReturnFalseIfPeopleNumberNotAllowed() {
        // given
        Vehicle[] vehicles = new Vehicle[]{new Vehicle("111", VehicleType.CAR, 200, 5)};

        // when
        boolean actual = target.departureAllowed(vehicles);

        // then
        assertThat(actual).isFalse();
    }

    @Test
    void shouldReturnTrueIfAllOk() {
        // given
        Vehicle[] vehicles = new Vehicle[]{new Vehicle("111", VehicleType.CAR, 2, 2)};

        // when
        boolean actual = target.departureAllowed(vehicles);

        // then
        assertThat(actual).isTrue();
    }
}