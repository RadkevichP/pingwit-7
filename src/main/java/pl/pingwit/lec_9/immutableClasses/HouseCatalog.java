package pl.pingwit.lec_9.immutableClasses;

import java.util.Arrays;

public final class HouseCatalog {
    private final String city;
    private final String area;
    private final House[] housesList;

    public HouseCatalog(String city, String area, House[] housesList) {
        this.city = city;
        this.area = area;
        this.housesList = Arrays.copyOf(housesList, housesList.length);
    }

    public String getCity() {
        return city;
    }

    public String getArea() {
        return area;
    }

    public House[] getHousesList() {
        House[] copyOfHouses = Arrays.copyOf(housesList, housesList.length);
        return copyOfHouses;
    }

    @Override
    public String toString() {
        return "CatalogHouse{" +
                "city='" + city + '\'' +
                ", area='" + area + '\'' +
                ", housesList=" + Arrays.toString(housesList) +
                '}';
    }
}

