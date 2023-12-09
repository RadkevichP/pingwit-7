package pl.pingwit.lec_21.point_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorExample {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        strings.add("ooppoo");
        strings.add("opopoppo");
        strings.add("erererer00");
        strings.add("qwqwqo");

        List<String> secondList = strings.stream()
                .filter(s -> s.length() != 6)
                .toList();

        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().length() == 6) {
                iterator.remove();
            }
        }

       /* for (String string : strings) {
            if (string.length() == 6) {
                strings.remove(string);
            }
        }*/


        System.out.println(strings);
    }
}
