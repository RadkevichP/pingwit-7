package pl.pingwit.lec_3.point_3;

import java.util.Scanner;

public class IfElseIfExample {

    // написать программу для определения цены посылки в зависимости от ее веса
    // до 500 г - 2 евро
    // 500 - <1000 г  - 3 евро
    // 1000   < 2000  - 5 евро
    // 2000 < 10000 - 10 евро
    // > 10000  - Too heavy! Unfortunately, we can't deliver parcels more than 10000 grams.


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter box weight in grams:");
        int boxWeight = scanner.nextInt();

        if (boxWeight < 500) {
            System.out.println("Price is 2 euro");
        } else if (boxWeight < 1000) {
            System.out.println("Price is 3 euro");
        } else if (boxWeight < 2000) {
            System.out.println("Price is 5 euro");
        } else if (boxWeight < 10000) {
            System.out.println("10 euro");
        } else {
            System.out.println("Too heavy! Unfortunately, we can't deliver parcels more than 10000 grams.");
        }

    }
}
