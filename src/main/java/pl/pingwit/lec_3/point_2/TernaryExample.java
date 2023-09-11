package pl.pingwit.lec_3.point_2;

import java.util.Scanner;

public class TernaryExample {


    public static final String ADULT_MESSAGE = "You are an adult person! Congrats, here is your beer!";
    public static final String NOT_ADULT_MESSAGE = "You aren't adult person. Here is your milk!";
    public static final int ADULT_AGE = 18;

    // программа, которая определит совершеннолетний вы или нет
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();

        // <condition> ? <option_for_true> : <option_for_false>

        String message = age >= ADULT_AGE ? ADULT_MESSAGE : NOT_ADULT_MESSAGE;

        System.out.println(message);
    }
}
