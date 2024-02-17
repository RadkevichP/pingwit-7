package pl.pingwit.lec_35.point_4;

import pl.pingwit.lec_35.point_1.User;
import pl.pingwit.lec_35.point_1.UserDto;

import java.util.Optional;
import java.util.Scanner;

import static pl.pingwit.lec_35.point_1.StatementMain.*;

public class Application {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("В нашей системе возможно произвести операции с Юзерами");
            System.out.println("Введите 1 для подсчета количества юзеров, 2 - для получения юзера по ID, 3 - для создания юзера, 777 - для выхода из программы");
            int operation = scanner.nextInt();

            if (operation == 1) {
                int userCount = runCountQuery();
                System.out.printf("В системе %s юзеров%n", userCount);
                System.out.println("--------------------------------------");
            } else if (operation == 2) {

                System.out.println("Введите ID пользователя для поиска:");

                int id = scanner.nextInt();
                Optional<User> userById = findUserById(id);
                if (userById.isPresent()) {
                    System.out.println(userById.get());
                } else {
                    System.out.printf("Рользователь с ID = %d не найден!%n", id);
                    System.out.println("--------------------------------------");
                }
            } else if (operation == 3) {

                System.out.println("Создаем пользователя.");
                System.out.println("Введите name пользователя:");
                String name = scanner.next();
                System.out.println("Введите surname пользователя:");
                String surname = scanner.next();
                System.out.println("Введите email пользователя:");
                String email = scanner.next();
                System.out.println("Введите phone пользователя:");
                String phone = scanner.next();

                UserDto userToCreate = new UserDto(name, surname, email, phone);
                Integer id = createUser(userToCreate);
                System.out.printf("Создан юзер с ID = %d", id);
                System.out.println("--------------------------------------");
            } else {
                System.out.println("До свидания!");
                break;
            }
        }
    }
}
