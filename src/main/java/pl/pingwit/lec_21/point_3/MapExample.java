package pl.pingwit.lec_21.point_3;

import java.math.BigDecimal;
import java.util.*;

public class MapExample {

    public static void main(String[] args) {

        Map<String, Integer> myMap = new HashMap<>();

        myMap.put("first", 1);
        myMap.put("second", 5);

        /*Integer integer = myMap.get("first");
        System.out.println(integer);
        System.out.println(myMap);*/


        Map<String, BigDecimal> data = new HashMap<>();
        data.put("first", BigDecimal.TEN);
        data.put("second", BigDecimal.TEN);

        BigDecimal second = data.get("second");
        BigDecimal result = second.multiply(BigDecimal.TEN);
        System.out.println(result);

        if (data.containsKey("third")) {
            BigDecimal third = data.get("third");
            BigDecimal result2 = third.multiply(BigDecimal.TEN);
            System.out.println(result2);
        }

        System.out.println(data.size());
        Collection<BigDecimal> values = data.values();
        for (BigDecimal value : values) {
            System.out.println(value);
        }

        Set<String> strings = data.keySet();

        Set<Map.Entry<String, BigDecimal>> entries = data.entrySet();
        for (Map.Entry<String, BigDecimal> entry : entries) {
            entry.getKey();
            entry.getValue();
        }

    }
}
