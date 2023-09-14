package pl.pingwit.lec_4.point_4;

import java.util.Scanner;

public class ElevatorContinueExample {
    public static final int FORBIDDEN_FLOOR = 4;

    // break
    // continue
    // return

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite etazh: ");
        int expectedFloor = scanner.nextInt();

        if (expectedFloor == FORBIDDEN_FLOOR) {
            System.out.println("Mi vas otvezem na 5 etazh");
            expectedFloor++;
        }

        for (int i = 1; i <= 100; i++) {
            if (i == FORBIDDEN_FLOOR) {
                continue;
            }

            System.out.println("Current floor: " + (i));
            if (i == expectedFloor) {
                System.out.println("Vi priehali!");
                break;
            }

            System.out.println("edem dalshe");
        }

        System.out.println("Hello after the Loop");
    }
}
