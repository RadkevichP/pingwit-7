package pl.pingwit.lec_21.point_1;

import java.util.*;

public class RetainExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();

        list1.add("Apple");
        list1.add("Banana");
        list1.add("Orange");

        List<String> list2 = new ArrayList<>();

        list2.add("Banana");
        list2.add("Grapes");
        list2.add("Orange");

        System.out.println("Original List 1: " + list1);
        System.out.println("Original List 2: " + list2);

        list1.retainAll(list2);

        System.out.println("After retain(): " + list1);

        System.out.println("----------------------------------------");

        Set<String> set1 = new HashSet<>();
        set1.add("Red");
        set1.add("Green");
        set1.add("Blue");

        Set<String> set2 = new HashSet<>();
        set2.add("Green");
        set2.add("Yellow");
        set2.add("Blue");

        System.out.println("Original Set 1: " + set1);
        System.out.println("Original Set 2: " + set2);

        set1.retainAll(set2);

        System.out.println("After retainAll(): " + set1);
    }
}

