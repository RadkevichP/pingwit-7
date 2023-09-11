package pl.pingwit.lec_3.point_5;

import java.util.Scanner;

public class SheepWeightCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter sheep weight in kilograms: ");
        int sheepWeight = scanner.nextInt();
        System.out.println("Please enter sheep quantity: ");
        int quantity = scanner.nextInt();

        int totalWeight = 0;
        for (int i = 1; i <= quantity; i++) {
            System.out.println("Sheep #" + i + " jumped!");
            totalWeight += sheepWeight;  // totalWeight = totalWeight + sheepWeight;
        }

        System.out.println("Total weight is: " + totalWeight);

        System.out.println("Good night!");
    }
}
