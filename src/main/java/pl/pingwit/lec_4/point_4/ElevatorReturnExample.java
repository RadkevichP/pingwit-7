package pl.pingwit.lec_4.point_4;

import java.util.Scanner;

public class ElevatorReturnExample {
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
        elevation(expectedFloor);

        System.out.println("Privet ot dispetchera!");
    }

    private static void elevation(int expectedFloor) {
        for (int i = 1; i <= 100; i++) {
            if (i == FORBIDDEN_FLOOR) {
                continue;
            }

            if (i == 21) {
                System.out.println("Lift polomalsya, poka!");
                return;
            }

            System.out.println("Current floor: " + (i));
            if (i == expectedFloor) {
                System.out.println("Vi priehali!");
                break;
            }

            System.out.println("edem dalshe");
        }
    }
}
