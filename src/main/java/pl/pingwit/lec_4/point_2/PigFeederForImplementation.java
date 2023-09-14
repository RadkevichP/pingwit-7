package pl.pingwit.lec_4.point_2;


/*
    Написать программу, которая будет кормить поросенка до достижения определенного веса.
    Пользователь вводит начальный вес, итоговый вес, программа дает поросенку по 10 кг вкуснятины
*/

import java.util.Scanner;

public class PigFeederForImplementation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вес поросенка:");
        int initialWeight = scanner.nextInt();
        System.out.println("до какого веса кормить?:");
        int finalWeight = scanner.nextInt();

        int foodWeight = 10;
        int currentWeight = initialWeight;

        for (int i = initialWeight; i <= finalWeight; i += 10) {
            System.out.println("Покормил поросенка");
            currentWeight += foodWeight;
        }

        System.out.println(currentWeight);
    }
}
