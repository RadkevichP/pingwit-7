package pl.pingwit.lec_3.point_4;

import java.util.Scanner;

public class SwitchExample {

    // написать программу, которая принимает номер месвяца и выводит название сезона.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int monthNumber = scanner.nextInt();

        String message;
        switch (monthNumber) {
            case 12, 1, 2:
                message = "This is Winter";
                break;
            case 3, 4, 5:
                message = "This is Spring";
                break;
            case 6, 7, 8:
                message = "This is Summer";
                break;
            case 9, 10, 11:
                message = "This is Autumn";
                break;
            default:
                message = "There's no such month";
        }

        System.out.println(message);
    }
}
