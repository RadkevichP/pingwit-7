package pl.pingwit.lec_21.point_2;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        Set<String> mySet = new HashSet<>();

        mySet.add("Apple");
        mySet.add("Banana");
        System.out.println(mySet.add("Orange"));
        System.out.println(mySet.add("Orange"));
        System.out.println(mySet.add("Orange"));
        System.out.println(mySet.add("Orange"));

        System.out.println(mySet);

        Product banana = new Product("Banana", 1);
        Product banana2 = new Product("Banana", 1);
        Product banana3 = new Product("Banana", 1);
        Product banana4 = new Product("Banana", 1);
        Product banana5 = new Product("Banana", 1);

        Set<Product> products = new HashSet<>();

        products.add(banana);
        products.add(banana2);
        products.add(banana3);
        products.add(banana4);
        products.add(banana5);

        System.out.println(products.size());
        System.out.println(products);
    }
}
