package pl.pingwit.lec_9.immutableClasses;

import java.util.Arrays;

public class HouseMain {

    public static void main(String[] args) {
        House individual = new House("Individual-1", 5, 120, true);
        House individual2 = new House("Individual-2", 5, 120, true);
        House individual3 = new House("Individual-3", 5, 120, true);

        House[] houses = {individual, individual2, individual3};

        HouseCatalog houseCatalog = new HouseCatalog("Vilnuis", "Uzupis", houses);

     /*   System.out.println(houseCatalog);

        houses[0] = null;
        houses[1] = null;
        houses[2] = null;

        System.out.println(houseCatalog);*/
        House[] housesList = houseCatalog.getHousesList();

        housesList[0] = null;
        housesList[1] = null;
        housesList[2] = null;

        System.out.println(Arrays.toString(housesList));

        System.out.println(houseCatalog);

    }
}
