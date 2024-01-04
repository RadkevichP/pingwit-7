package pl.pingwit.lec_25.point_2;

import pl.pingwit.lec_25.point_1.Phone;

import java.util.List;
import java.util.Optional;


public class OptionalExample2 {

    public static void main(String[] args) {
        List<Phone> phones = List.of(
                /*new Phone("Apple", "IPhone 11", 2018, "12ee12"),
                new Phone("Apple", "IPhone 11", 2018, "12ee13"),
                new Phone("Apple", "IPhone 11", 2018, "12ee14"),
                new Phone("Apple", "IPhone 12", 2020, "12ee100"),
                new Phone("Apple", "IPhone 13", 2021, "12ee120"),*/
                new Phone("Samsung", "S21", 2018, "ss123"),
                new Phone("Samsung", "S21", 2018, "ss124"),
                new Phone("Samsung", "S21", 2018, "ss125"),
                new Phone("Samsung", "S22", 2020, "ss12333"),
                new Phone("Samsung", "S22", 2020, "ss12334"),
                new Phone("Samsung", "S22", 2020, "ss12334"),
                new Phone("Xiaomi", "Redmi 10", 2020, "xi333111"),
                new Phone("Xiaomi", "Redmi 11", 2021, "xi444111"),
                new Phone("Xiaomi", "Redmi 12", 2020, "xi777888"));


        Optional<Phone> apple = phones.stream()
                .filter(phone -> phone.getBrand().equals("Apple"))
                .findAny();

        if (apple.isPresent()) {
            Phone phone3 = apple.get();
            System.out.println(phone3.getSerialNumber());
        }

        Optional<Phone> apple1 = phones.stream()
                .filter(phone -> phone.getBrand().equals("Apple"))
                .findFirst();

        //apple.get() - получение значения из контейнера
        apple.ifPresent(phone -> System.out.println(phone.getModel()));

        // получить дефолтное значение
        Phone phone = apple.orElse(new Phone("Default", "Def", 2023, "ooo"));

        // выбросить исключение, если null
        Phone phone1 = apple.orElseThrow(() -> new IllegalArgumentException("ничего не нашли!"));

        Optional<Phone> empty = Optional.empty();
        Optional<Phone> phone2 = Optional.of(new Phone("Default", "Def", 2023, "ooo"));

    }


    private Optional<String> getSerialNumber(Phone phone) {
        if (phone == null) {
            return Optional.empty();
        }
        else return Optional.of(phone.getSerialNumber());
    }
}
