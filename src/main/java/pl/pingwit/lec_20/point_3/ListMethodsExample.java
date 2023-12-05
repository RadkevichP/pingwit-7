package pl.pingwit.lec_20.point_3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ListMethodsExample {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();

        List<? extends Number> numbers = new ArrayList<>();
        //

        Number[] numbers1 = new Number[]{};

        integers.add(12);
        Integer integer = integers.get(0);

        strings.add("some string");
        strings.add("some string");
        strings.add("some string");
        strings.add("some string");

        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }

        for (String string : strings) {
            System.out.println(string);
        }

        strings.forEach(System.out::println);


        strings.add(3, "another string");

        strings.set(3, "rrrr");

        System.out.println(strings);
        String s = strings.get(4);

        strings.remove(4);
        strings.remove("another string");

        System.out.println(strings);

        System.out.println(strings.size());
        boolean empty = strings.isEmpty();

        strings.clear();


    }
}


/*
Adding Elements:
boolean add(E element): Appends the specified element to the end of the list.
void add(int index, E element): Inserts the specified element at the specified position in the list.
Accessing Elements:
E get(int index): Returns the element at the specified position in the list.
int indexOf(Object o): Returns the index of the first occurrence of the specified element in the list.
int lastIndexOf(Object o): Returns the index of the last occurrence of the specified element in the list.
Removing Elements:
E remove(int index): Removes the element at the specified position in the list.
boolean remove(Object o): Removes the first occurrence of the specified element from the list.
Checking Size and Empty Status:
int size(): Returns the number of elements in the list.
boolean isEmpty(): Returns true if the list contains no elements.
Sublist Operations:
List<E> subList(int fromIndex, int toIndex): Returns a view of the portion of the list between the specified fromIndex, inclusive, and toIndex, exclusive.
Iterating Over Elements:
Iterator<E> iterator(): Returns an iterator over the elements in the list.
ListIterator<E> listIterator(): Returns a list iterator over the elements in the list.
Modifying List Content:
void clear(): Removes all elements from the list.
E set(int index, E element): Replaces the element at the specified position in the list with the specified element.
 */