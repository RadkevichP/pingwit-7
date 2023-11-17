package pl.pingwit.lec_15.point_1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 * @author Pavel Radkevich
 * @since 13.03.23
 */
public class DateTimeExample {

    public static void main(String[] args) {

        String date1 = "2023-12-11";

        LocalDate localDate = LocalDate.of(2023, 11, 10);

        localDate = localDate.plus(30, ChronoUnit.DAYS);
        localDate = localDate.plus(20, ChronoUnit.YEARS);
        localDate = localDate.plus(20, ChronoUnit.MONTHS);

        System.out.println(localDate);
        System.out.println("---------------------------------------------------");
        LocalDate nowDate = LocalDate.now();


        LocalDateTime nowDateTime = LocalDateTime.now();
        LocalDateTime nowDateTime1 = LocalDateTime.now();

        System.out.println(nowDateTime);
        System.out.println(nowDateTime1);
        System.out.println("---------------------------------------------------");

        System.out.println(nowDateTime.getDayOfMonth());
        System.out.println(nowDateTime.getDayOfWeek());
        System.out.println(nowDateTime.getNano());
        System.out.println("---------------------------------------------------");

        System.out.println(nowDate);

        LocalDate of = LocalDate.of(1990, 1, 1);
        LocalDate of1 = LocalDate.of(1990, Month.MARCH, 1);

        System.out.println("----------------------------------------------------------------");

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMMM-yyyy-dd");
        String formattedNow = dateTimeFormatter.format(nowDate);
        System.out.println(formattedNow);


        String someDate = "December-2000-13";
        LocalDate parsed = LocalDate.parse(someDate, dateTimeFormatter);
        System.out.println(parsed);
        // parse    парсить
        System.out.println("----------------------------------------------------------------");

        // парсить строку в дату - это значит преобразовать строку в объект Java
        DateTimeFormatter forParser = DateTimeFormatter.ofPattern("yyyy-dd-MM").withLocale(Locale.GERMAN);
        LocalDate fromString = LocalDate.parse("1990-03-01", forParser);
        System.out.println(forParser.format(fromString));

        System.out.println(dateTimeFormatter.format(fromString));
        System.out.println("----------------------------------------------------------------");

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy : HH/mm/ss/ms");
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println(dateTimeFormatter1.format(dateTime));

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
    }
}
