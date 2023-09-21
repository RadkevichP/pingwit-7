package pl.pingwit.lec_5.point_1;

import java.util.Scanner;

public class TwistyRoad {

    /*
    При старте программы пользователя просят ввести время в пути в секундах.
Затем, при помощи цикла while выводить на экран извилистую дорогу.

Определить время старта программы можно при помощи
System.currentTimeMillis() - это вернет вам текущее время в миллисекундах.
     */
    private static final String ROAD_BLOCK = "||  |  ||";

    public static void main(String[] args) {
        // ввод данных
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите время пути в секундах: ");
        int roadTime = scanner.nextInt();

        long startTime = System.currentTimeMillis();
        long finishTime = startTime + roadTime * 1000L;

        // цикл while
        while (System.currentTimeMillis() < finishTime) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.println(ROAD_BLOCK);
            }
            for (int i = 10; i >= 0; i--) {
                for (int j = i; j >= 0; j--) {
                    System.out.print(" ");
                }
                System.out.println(ROAD_BLOCK);
            }
        }
    }
}
