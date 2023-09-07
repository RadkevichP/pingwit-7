package pl.pingwit.lec_2.point_3;

import java.util.HashSet;
import java.util.Set;

public class WrappersExample {

    public static Integer myInt;

    public static void main(String[] args) {

        Set<Integer> myIntSet = new HashSet<>();

        // int -> Integer
        // byte -> Byte
        // long -> Long
        // char -> Character
        // double -> Double
        // float   -> Float
        // boolean -> Boolean


        /*System.out.println(myInt);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Long.MAX_VALUE);

        Integer myRegularInteger = 10;*/

        String myIntString = "1234";

        // нужно поправить название переменной
        Integer myParsedInteger = Integer.parseInt(myIntString);

        System.out.println(myIntString + 6);
        System.out.println(myParsedInteger + 6);


        int x =89;
        Integer y = x;

        int k = y;

        // очень важный коментарий
        // очень важный коментарий

    }

}
