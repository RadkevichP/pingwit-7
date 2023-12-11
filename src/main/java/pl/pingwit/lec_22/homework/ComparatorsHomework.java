package pl.pingwit.lec_22.homework;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Pavel Radkevich
 */
/*
Отсортируйте список данных по имени и фамлии пользователя, выведите в консоль
Отсортируйте список данных по дате рождения в порядке убывания, выведите в консоль
Отсортируйте список данных по имени, фамилии, дате рождения, выведите в консоль
 */

public class ComparatorsHomework {

    public static void main(String[] args) {
        List<AccountInfo> accountInfos = List.of(
                new AccountInfo("Ivan", "Ivanov", "607499636", "ivan@tu.by", LocalDate.of(2000, 10, 11)),
                new AccountInfo("Fedor", "Ivanov", "607499636", "ivan@tu.by", LocalDate.of(1990, 10, 11)),
                new AccountInfo("Anna", "Ivanova", "607499636", "ivan@tu.by", LocalDate.of(2000, 10, 15)),
                new AccountInfo("Egor", "Egorov", "607499636tr", "ivan@tu.by", LocalDate.of(1989, 2, 3)),
                new AccountInfo("Andy23", "Aity", "607499636", "ivan@tu.by", LocalDate.of(2000, 10, 11)),
                new AccountInfo("Pavel", "Pavlov23", "607499636", "ivan@tu.by", LocalDate.of(2000, 10, 11)));


    }
}
