package pl.pingwit.lec_24.homework;

import java.util.Objects;

/**
 * @author Pavel Radkevich
 * @since 2.05.23
 */
public class CityStreet {

    private final String city;
    private final String street;

    public CityStreet(String city, String street) {
        this.city = city;
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CityStreet that = (CityStreet) o;
        return Objects.equals(city, that.city) && Objects.equals(street, that.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street);
    }

    @Override
    public String toString() {
        return "CityStreet{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
