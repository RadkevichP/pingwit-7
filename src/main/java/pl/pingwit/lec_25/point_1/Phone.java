package pl.pingwit.lec_25.point_1;

import java.util.Objects;


public class Phone {

    private final String brand;
    private final String model;
    private final int year;
    private final String serialNumber;

    public Phone(String brand, String model, int year, String serialNumber) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return year == phone.year && Objects.equals(brand, phone.brand) && Objects.equals(model, phone.model) && Objects.equals(serialNumber, phone.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year, serialNumber);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }
}
