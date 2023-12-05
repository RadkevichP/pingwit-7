package pl.pingwit.lec_20.point_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInsertionBenchmark {

    public static void main(String[] args) {

        // для ArrayList доступ по индексу имеет константную сложность O(1)
        // для LinkedList доступ по индексу имеет линейную сложность O(n)

        int size = 100000; // Adjust the size based on your benchmark needs

        List<Integer> arrayList = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        insertAtBeginning(arrayList, size);
        long endTime = System.currentTimeMillis();
        System.out.println("ArrayList - Insert at Beginning: " + (endTime - startTime) + " milliseconds");
        arrayList.clear();

        List<Integer> linkedList = new LinkedList<>();
        startTime = System.currentTimeMillis();
        insertAtBeginning(linkedList, size);
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList - Insert at Beginning: " + (endTime - startTime) + " milliseconds");
        linkedList.clear();

        startTime = System.currentTimeMillis();
        insertInMiddle(arrayList, 100000);
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList - Insert in Middle: " + (endTime - startTime) + " milliseconds");
        arrayList.clear();

        startTime = System.currentTimeMillis();
        insertInMiddle(linkedList, 100000);
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList - Insert in Middle: " + (endTime - startTime) + " milliseconds");
        linkedList.clear();

        startTime = System.currentTimeMillis();
        insertAtEnd(arrayList, size);
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList - Insert at End: " + (endTime - startTime) + " milliseconds");
        arrayList.clear();


        startTime = System.currentTimeMillis();
        insertAtEnd(linkedList, size);
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList - Insert at End: " + (endTime - startTime) + " milliseconds");
        linkedList.clear();
    }

    private static void insertAtBeginning(List<Integer> list, int size) {
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
    }

    private static void insertInMiddle(List<Integer> list, int size) {
        for (int i = 0; i < size; i++) {
            list.add(list.size() / 2, i);
        }
    }

    private static void insertAtEnd(List<Integer> list, int size) {
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
    }
}
