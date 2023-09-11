package pl.pingwit.lec_3.point_1;

import java.util.Scanner;

public class ScannerExample {

    // написать программму для страхового агента.
    // программа должна собрать данные о клиенте для последующей генерации полиса
    //
    // и уточнить у клиента, все ли верно

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String name = scanner.next();

        System.out.println("Please enter your surname:");
        String surname = scanner.next();

        System.out.println("Please enter your age:");
        int age = scanner.nextInt();
        System.out.println("Please enter your driver experience (enter decimal value):");
        double experience = scanner.nextDouble();
        System.out.println("Did you have accidents during the previous year? (enter 'true' or 'false')");
        boolean anyAccidents = scanner.nextBoolean();

        String clientInformationMessage = "Client: " + name + " " + surname + ",\n"
                + "client age: " + age + " years old, \n"
                + "client drives for " + experience + " years, \n"
                + "client had some accidents this year: " + anyAccidents;
        System.out.println("Please check all the info:");
        System.out.println(clientInformationMessage);

    }
}
