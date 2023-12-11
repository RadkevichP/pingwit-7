package pl.pingwit.lec_22.point_2;

import pl.pingwit.lec_21.point_2.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UnmodifiableCollectionsExample {

    public static void main(String[] args) {
        Product product1 = new Product("aaa", 9);
        Product product2 = new Product("zzz", 1);
        Product product3 = new Product("rrr", 5);
        Product product4 = new Product("kkk", 3);
        Product product5 = new Product("kkk", 3);


        List<Product> products = List.of(product1, product2, product3);


        // Mutable but not growable
        List<String> list = Arrays.asList("✅");
        list.set(0, "✔️"); // Works

        // Immutable
        List<String> emptyList = Collections.emptyList();

        // Immutable
        List<String> singletonList =
                Collections.singletonList("✅");

        // Mutable
        List<String> arrayList = new ArrayList<>();
        arrayList.add("✅");

        // "Unmodifiable" but arrayList is still Mutable
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);

        // Immutable
        List<String> listOf = List.of("✅");

        // Immutable
        List<String> copyOf = List.copyOf(new ArrayList<>(List.of("✅")));


    }
}
