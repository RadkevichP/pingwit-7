package pl.pingwit.lec_1.point_2;

import java.math.BigDecimal;

public class PrimitiveTypes {

    public static void main(String[] args) {

        // byte, short, int, long

        // byte -128 ... 127           2^7 + -
        byte myByte = 120;

        // short -32 768 ... 32 767  2^15  16 bit
        short myShort = 10000;

        // int -2^31 ... 2^31 - 1  2 147 483 647
        int myInt = 67898989;

        // long -2^63 ... 2^63
        long myLong = 1000L;

        // float, double

        // float 32-bit
        float myFloat = 100.899f;

        // double 64-bit
        double myDouble = 100.6565;
        double sum = 0.0;

        for (int i = 0; i < 10000; i++) {
            sum = sum + myDouble;
        }

        System.out.println(sum);

        // BigDecimal
        BigDecimal myBigdecimal = new BigDecimal("88.9889");


        // boolean  true/false
        boolean myBool = true;
        boolean myBool2 = false;

        // String - строка
        String myString = "Hello!";

        String multiLineString = """
                hello
                world!
                """;

        // char (character)
        char myChar = 'h';
        char myChar2 = '\uffff';
        System.out.println(myChar2);


    }
}
