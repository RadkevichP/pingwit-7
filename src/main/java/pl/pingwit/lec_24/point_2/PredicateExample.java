package pl.pingwit.lec_24.point_2;

import pl.pingwit.lec_16.point_1.UserInfo;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {

    public static void main(String[] args) {

        List<UserInfo> userInfos = List.of(
                new UserInfo("Sasha", "Petrov", "1234567", "sp@gmail.com", LocalDate.of(1990, 12, 12)),
                new UserInfo("Pavel", "Ivanov", "987654", "pi@gmail.com", LocalDate.of(1980, 12, 12)),
                new UserInfo("Anna", "Sidorova", "332211", "as@gmail.com", LocalDate.of(2005, 12, 12)),
                new UserInfo("Lena", "Ivanova", "76555", "li@gmail.com", LocalDate.of(1998, 12, 12)),
                new UserInfo("Sergey", "Sergeeev", "98876666", "ss@gmail.com", LocalDate.of(2005, 12, 12)));


        Predicate<UserInfo> userSashaPredicate = user -> user.getName().equals("Sasha");

        // вернет true, если год рождения больше чем 1990
        Predicate<UserInfo> nintyPredicate = user -> user.getAge().isAfter(LocalDate.of(1990, 12, 31));


        List<UserInfo> list = userInfos.stream()
                .filter(user -> user.getAge().isAfter(LocalDate.of(1990, 12, 31)))
                .toList();


        // возьмет имена, оставит только имена с 4 буквами, приведет к верхему регистру и соберет в сет
        Set<String> collect = userInfos.stream()
                .map(UserInfo::getName)
                .filter(name -> name.length() == 4)
                .map(String::toUpperCase)
                .collect(Collectors.toSet());


    }

    // предикат, который проверит, валиден ли имэйл у пользователя
    // предикат, который возьмет юзера, и проверит, начинается ли
}
