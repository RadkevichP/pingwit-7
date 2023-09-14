package pl.pingwit.lec_4.point_3;


/*
    Написать программу, которая будет кормить поросенка до достижения определенного веса.
    Пользователь вводит начальный вес, итоговый вес, программа дает поросенку по 10 кг вкуснятины
*/

import java.util.Scanner;

public class PigFeederDoWhileImplementation {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вес поросенка:");
        int initialWeight = scanner.nextInt();
        System.out.println("до какого веса кормить?:");
        int finalWeight = scanner.nextInt();

        int foodWeight = 10;
        int currentWeight = initialWeight;

        do {
            currentWeight += foodWeight;
            System.out.println("покормил");
            Thread.sleep(100);
        } while (currentWeight <= finalWeight);

        System.out.println("Итоговый вес: " + currentWeight);
    }
}
