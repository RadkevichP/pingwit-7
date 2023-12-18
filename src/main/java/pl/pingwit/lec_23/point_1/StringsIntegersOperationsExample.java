package pl.pingwit.lec_23.point_1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringsIntegersOperationsExample {
    // убрать null
    // список строк распарсить в числа
    // убрать нечетные
    // просуммировать                                                       / посчитать кол-во / найти максимум / минимум/ среднее

    public static void main(String[] args) {
        List<String> strings = initList();

        List<Integer> ints = new ArrayList<>();
        Integer sum = 0;
        for (String s : strings) {
            if (s != null) {
                int parsed = Integer.parseInt(s);
                if (parsed % 2 == 0) {
                    sum = sum + parsed;
                }
            }
        }
        System.out.println(sum);

        // method chaining
        Stream.of("opop", "oioioi", "oioifeofjreiofgj");

        Integer summed = strings.stream()
                .filter(Objects::nonNull)           // промежуточный метод
                .map(Integer::parseInt)         // промежуточный метод
                .filter(i -> (i % 2 == 0))      // промежуточный метод
                .reduce(0, Integer::sum);  // терминальный метод

        Set<Integer> collect = strings.stream()
                .filter(Objects::nonNull)           // промежуточный метод
                .map(Integer::parseInt)         // промежуточный метод
                .collect(Collectors.toSet());

        List<Integer> collect1 = strings.stream()
                .filter(Objects::nonNull)          // промежуточный метод
                .map(Integer::parseInt)         // промежуточный метод
                .collect(Collectors.toList());

        Set<String> collect2 = strings.stream()
                .collect(Collectors.toSet());

        System.out.println(summed);


    }

    private static List<String> initList() {
        List<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add(null);
        strings.add("100");
        strings.add("-100");
        strings.add("17");
        strings.add("19");
        strings.add("111");
        strings.add("14");
        strings.add("14");
        strings.add("14");
        strings.add("12");
        strings.add("11");
        return strings;
    }
}

