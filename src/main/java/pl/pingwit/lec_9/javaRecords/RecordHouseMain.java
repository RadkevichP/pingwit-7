package pl.pingwit.lec_9.javaRecords;

public class RecordHouseMain {

    public static void main(String[] args) {

        HouseRecord house = new HouseRecord("Ind", 5, 18, true);
        HouseRecord house2 = new HouseRecord("Ind", 5, 18, true);

        String type = house.type();
        boolean heating = house.isHeating();

        System.out.println(house);
        System.out.println(house2);

        System.out.println(house.equals(house2));


    }
}
