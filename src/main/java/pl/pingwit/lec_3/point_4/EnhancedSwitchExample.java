package pl.pingwit.lec_3.point_4;

import java.util.Scanner;

public class EnhancedSwitchExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int monthNumber = scanner.nextInt();

        String message = switch (monthNumber) {
            case 12, 1, 2 -> "This is Winter";
            case 3, 4, 5 -> "This is Spring";
            case 6, 7, 8 -> "This is Summer";
            case 9, 10, 11 -> "This is Autumn";
            default -> "There's no such month";
        };

        System.out.println(message);
    }
}
