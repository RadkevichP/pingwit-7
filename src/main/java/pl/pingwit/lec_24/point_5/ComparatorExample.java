package pl.pingwit.lec_24.point_5;

import pl.pingwit.lec_16.point_1.UserInfo;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

    public static void main(String[] args) {

        List<UserInfo> userInfos = List.of(
                new UserInfo("Sasha", "Petrov", "1234567", "sp@gmail.com", LocalDate.of(1990, 12, 12)),
                new UserInfo("Pavel", "Ivanov", "987654", "pi@gmail.com", LocalDate.of(1980, 12, 12)),
                new UserInfo("Anna", "Sidorova", "332211", "as@gmail.com", LocalDate.of(2005, 12, 12)),
                new UserInfo("Lena", "Ivanova", "76555", "li@gmail.com", LocalDate.of(1998, 12, 12)),
                new UserInfo("Sergey", "Sergeeev", "98876666", "ss@gmail.com", LocalDate.of(2005, 12, 12)));

        Comparator<UserInfo> sortByBirthday = Comparator.comparing(UserInfo::getAge);

        //userInfos.sort(sortByBirthday);
        userInfos.forEach(System.out::println);

        List<UserInfo> list = userInfos.stream()
                .sorted(sortByBirthday)
                .toList();

        list.forEach(System.out::println);


    }
}
