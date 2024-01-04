package pl.pingwit.lec_25.point_3;


import pl.pingwit.lec_25.point_1.Phone;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;


public class ToMapExample {

    public static void main(String[] args) {
        List<Phone> phones = List.of(
                new Phone("Apple", "IPhone 11", 2018, "12ee12"),
                new Phone("Apple", "IPhone 11", 2018, "12ee13"),
                new Phone("Apple", "IPhone 11", 2018, "12ee14"),
                new Phone("Apple", "IPhone 12", 2020, "12ee100"),
                new Phone("Apple", "IPhone 13", 2021, "12ee120"),
                new Phone("Samsung", "S21", 2018, "ss123"),
                new Phone("Samsung", "S21", 2018, "ss124"),
                new Phone("Samsung", "S21", 2018, "ss125"),
                new Phone("Samsung", "S22", 2020, "ss12333"),
                new Phone("Samsung", "S22", 2020, "ss12334"),
                new Phone("Samsung", "S22", 2020, "ss12334"),
                new Phone("Xiaomi", "Redmi 10", 2020, "xi333111"),
                new Phone("Xiaomi", "Redmi 11", 2021, "xi444111"),
                new Phone("Xiaomi", "Redmi 12", 2020, "xi777888"));

        Map<String, Phone> collect = phones.stream()
                .filter(phone -> "Apple".equalsIgnoreCase(phone.getBrand()))
                .collect(toMap(Phone::getSerialNumber, Function.identity()));


        Map<String, String> collect1 = phones.stream()
                .filter(phone -> "Apple".equalsIgnoreCase(phone.getBrand()))
                .collect(Collectors.toMap(Phone::getSerialNumber, phone -> phone.getBrand() + " " + phone.getModel()));

        System.out.println(collect);

    }
}
