package pl.pingwit.lec_5.point_2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {

        int[] myIntArray = new int[10];

        Scanner[] myScannerArray = new Scanner[5];

        //System.out.println(mySecondArray[2]);
        System.out.println(myIntArray[2]);

        System.out.println(myScannerArray[2]);


        String[] myStringArray = new String[5];
        System.out.println(myStringArray[2]);

        myStringArray[2] = "Hello!";
        myStringArray[2] = "world!";

        System.out.println(myStringArray[2]);

        myStringArray[2] = "HAHAHAHA!";
        int[] mySecondArray = {10, 12, 13, 14, 19};

        int length = mySecondArray.length;

        for (int i = 0; i < length; i++) {
            //System.out.println(mySecondArray[i]);
            System.out.println("Element with index " + i + " : " + mySecondArray[i]);
        }

        // форыч  -- for each
        for (int number : mySecondArray) {
            //System.out.println(number);
        }
        System.out.println(mySecondArray);

        System.out.println(Arrays.toString(mySecondArray));
    }
}
