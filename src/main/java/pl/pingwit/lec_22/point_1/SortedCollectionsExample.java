package pl.pingwit.lec_22.point_1;

import pl.pingwit.lec_12.point_1.Owner;
import pl.pingwit.lec_12.point_1.Pet;
import pl.pingwit.lec_21.point_2.Product;

import java.util.*;

public class SortedCollectionsExample {

    public static void main(String[] args) {

        SortedSet<String> sortedSet = new TreeSet<>();

        sortedSet.add("z");
        sortedSet.add("a");
        sortedSet.add("b");
        sortedSet.add("we");

        System.out.println(sortedSet);

        SortedSet<Integer> integerSortedSet = new TreeSet<>();

        integerSortedSet.add(10);
        integerSortedSet.add(9);
        integerSortedSet.add(-1);
        integerSortedSet.add(-5);
        System.out.println(integerSortedSet);

        SortedSet<Product> products = new TreeSet<>();

        products.add(new Product("bbb", 18));
        products.add(new Product("zzzzzz", 18));
        products.add(new Product("aaaa", 18));

        System.out.println(products);

        Comparator<Product> byCode = Comparator.comparing(Product::getCode);
        Comparator<Product> byName = Comparator.comparing(Product::getName);

        SortedSet<Product> productsByCode = new TreeSet<>(byCode);

        productsByCode.add(new Product("aaa", 12));
        productsByCode.add(new Product("xxx", 3));
        productsByCode.add(new Product("ddd", 0));
        productsByCode.add(new Product("abbbaa", 199));

        System.out.println(productsByCode);

        Comparator<String> byLength = Comparator.comparing(String::length);

        SortedSet<String> st = new TreeSet<>(byLength);
        st.add("zvcfvdfvev");
        st.add("aveververveverver");
        st.add("beveve");
        st.add("we");
        System.out.println(st);

        SortedMap<Product, String> productStringSortedMap = new TreeMap<>(byCode);

        //Comparator<Pet> petComparator = Comparator.comparing(Pet::getOwner);

        List<String> myStrings = new ArrayList<>();
        myStrings.add("aasad");
        myStrings.add("ijoijojioijoijoojoiojoi");
        myStrings.add("aa");
        myStrings.add("ffgggggggg");
        myStrings.add("aaewwrwrwrwwwsad");

        //myStrings.sort(byLength);
        Collections.sort(myStrings, byLength);
        System.out.println(myStrings);

        Comparator<Owner> ownersByName = Comparator.comparing(Owner::name);
        Comparator<Owner> ownersBySurname = Comparator.comparing(Owner::surname);
        // обратный порядок
        Comparator<Owner> ownersBySurnameКумукыув = Comparator.comparing(Owner::surname).reversed();

        Comparator<Owner> ownerComparator = ownersByName.thenComparing(ownersBySurname);
        Owner owner1 = new Owner("Alex", "Petrov", "90909");
        Owner owner2 = new Owner("Alex", "Alexov", "90909");
        Owner owner3 = new Owner("Alex", "Zaa", "90909");

        List<Owner> owners = new ArrayList<>();
        owners.add(owner1);
        owners.add(owner2);
        owners.add(owner3);

        owners.sort(ownerComparator);
        System.out.println(owners);
    }
}
