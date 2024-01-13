package pl.pingwit.lec_28.point_2;

import java.util.Arrays;

public class FerryInspector {
    private final int allowedTotalWeight;
    private final int allowedTotalPeopleOnBord;

    public FerryInspector(int allowedTotalWeight, int allowedTotalPeopleOnBord) {
        this.allowedTotalWeight = allowedTotalWeight;
        this.allowedTotalPeopleOnBord = allowedTotalPeopleOnBord;
    }

    // TDD - Test Driven Development

    // метод вернет false,  если общий вес > ALLOWED_TOTAL_WEIGHT либо общее число людей > ALLOWED_TOTAL_PEOPLE_ON_BORD
    public boolean departureAllowed(Vehicle[] vehicles) {
        Integer totalWeight = Arrays.stream(vehicles)
                .map(Vehicle::getWeight)
                .reduce(0, Integer::sum);
        if (totalWeight > allowedTotalWeight) {
            return false;
        }

        Integer totalPeopleOnBoard = Arrays.stream(vehicles)
                .map(Vehicle::getNumberOfPeopleOnBoard)
                .reduce(0, Integer::sum);
        return totalPeopleOnBoard <= allowedTotalPeopleOnBord;
    }
}



















/*

    int allPeople = 0;
    int totalMass = 0;

        for (Vehicle vehicle : vehicles) {
                allPeople += vehicle.getNumberOfPeopleOnBoard();
                totalMass += vehicle.getWeight();
                }
                return totalMass < ALLOWED_TOTAL_WEIGHT & allPeople < ALLOWED_TOTAL_PEOPLE_ON_BORD;*/
