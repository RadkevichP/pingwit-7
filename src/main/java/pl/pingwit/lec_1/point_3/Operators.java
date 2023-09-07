package pl.pingwit.lec_1.point_3;

public class Operators {

    public static void main(String[] args) {

        // + - * / %
        int myInt = 1001;
        long myLong = 890900L;

        long sum = myInt + myLong;
        System.out.println(sum);

        long divisionResult = myLong / myInt;
        System.out.println(divisionResult);

        long divisionRest = myLong % myInt;
        System.out.println("Остаток от деления: " + divisionRest);

        // == > < <= >= !=

        int int1 = 900;
        int int2 = 950;
        int int3 = 900;

        System.out.println("int1 > int2 " + (int1 > int2));
        System.out.println("int1 == int2 " + (int1 == int3));
        System.out.println("int1 != int2 " + (int1 != int2));


    }
}
