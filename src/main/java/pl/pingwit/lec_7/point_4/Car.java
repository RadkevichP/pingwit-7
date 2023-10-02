package pl.pingwit.lec_7.point_4;

import java.util.Objects;

public class Car {
    // константы
    // поля
    // блоки инициализации
    // конструкторы
    // геттеры/сеттеры
    // методы
    // equals() & hashCode()
    // toString()
    public static final Integer WHEEL_COUNT = 4;

    private String bodyType;
    private String color;
    private String brand;
    private String model;

    public Car() {
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Car(String bodyType, String color, String brand, String model) {
        this.bodyType = bodyType;
        this.color = color;
        this.brand = brand;
        this.model = model;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void startEngine() {
        System.out.println("Engine strted! wroom!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(bodyType, car.bodyType) && Objects.equals(color, car.color) && Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bodyType, color, brand, model);
    }

    @Override
    public String toString() {
        return "Car{" +
                "bodyType='" + bodyType + '\'' +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
