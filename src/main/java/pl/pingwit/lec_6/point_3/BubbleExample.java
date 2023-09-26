package pl.pingwit.lec_6.point_3;

import java.util.Arrays;

public class BubbleExample {

    public static void main(String[] args) {
        int[] unsorted = {90, 80, 70, 60, 50, 40, 30, 20, 10, -9, -100, -200, -300, -400, -500};

        int[] sorted = bubbleSort(unsorted);
        System.out.println(Arrays.toString(sorted));
    }

    private static int[] bubbleSort(int[] array) {

        int operationCounter = 0;

        int size = array.length;
        int lastElementIndex = size - 1;

        for (int i = 0; i < lastElementIndex; i++) {  // O(n2)
            for (int j = 0; j < lastElementIndex - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                operationCounter++;
            }
            operationCounter++;
        }
        System.out.println("Sort took " + operationCounter);
        return array;
    }
}
