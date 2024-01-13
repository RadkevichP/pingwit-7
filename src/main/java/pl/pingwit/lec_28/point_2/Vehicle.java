package pl.pingwit.lec_28.point_2;

import java.util.Objects;

public class Vehicle {
    private String governmentNumber;
    private VehicleType type;
    private Integer numberOfPeopleOnBoard;
    private Integer weight;

    public Vehicle(String governmentNumber, VehicleType type, Integer numberOfPeopleOnBoard, Integer weight) {
        this.governmentNumber = governmentNumber;
        this.type = type;
        this.numberOfPeopleOnBoard = numberOfPeopleOnBoard;
        this.weight = weight;
    }

    public String getGovernmentNumber() {
        return governmentNumber;
    }

    public void setGovernmentNumber(String governmentNumber) {
        this.governmentNumber = governmentNumber;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public Integer getNumberOfPeopleOnBoard() {
        return numberOfPeopleOnBoard;
    }

    public void setNumberOfPeopleOnBoard(Integer numberOfPeopleOnBoard) {
        this.numberOfPeopleOnBoard = numberOfPeopleOnBoard;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(governmentNumber, vehicle.governmentNumber) && type == vehicle.type && Objects.equals(numberOfPeopleOnBoard, vehicle.numberOfPeopleOnBoard) && Objects.equals(weight, vehicle.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(governmentNumber, type, numberOfPeopleOnBoard, weight);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "governmentNumber='" + governmentNumber + '\'' +
                ", type=" + type +
                ", numberOfPeopleOnBoard=" + numberOfPeopleOnBoard +
                ", weight=" + weight +
                '}';
    }
}
