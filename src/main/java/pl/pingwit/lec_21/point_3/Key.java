package pl.pingwit.lec_21.point_3;

import java.util.Objects;

public class Key {

    private String street;
    private Integer house;

    public Key(String street, Integer house) {
        this.street = street;
        this.house = house;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getHouse() {
        return house;
    }

    public void setHouse(Integer house) {
        this.house = house;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key key = (Key) o;
        return Objects.equals(street, key.street) && Objects.equals(house, key.house);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, house);
    }

    @Override
    public String toString() {
        return "Key{" +
                "street='" + street + '\'' +
                ", house='" + house + '\'' +
                '}';
    }
}
