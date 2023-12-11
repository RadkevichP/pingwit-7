package pl.pingwit.lec_22.point_1;

import pl.pingwit.lec_21.point_2.Product;

import java.util.*;

public class ComparatorsExample {

    public static void main(String[] args) {

        Product product1 = new Product("aaa", 9);
        Product product2 = new Product("zzz", 1);
        Product product3 = new Product("rrr", 5);
        Product product4 = new Product("kkk", 3);
        Product product5 = new Product("kkk", 3);

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);

        Comparator<Product> byNameComparator = Comparator.comparing(Product::getName);
        products.sort(byNameComparator);
        System.out.println(products);

        SortedSet<Product> sortedSet = new TreeSet<>(byNameComparator);
        sortedSet.add(product1);
        sortedSet.add(product2);
        sortedSet.add(product3);
        sortedSet.add(product4);
        sortedSet.add(product5);
        System.out.println(sortedSet);
        
    }
}
