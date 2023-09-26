package pl.pingwit.lec_6.point_2;

import java.util.Arrays;

public class BinarySearchExample {

    public static void main(String[] args) {

        int[] intArray = {90, 80, 70, 60, 50, 40, 30, 20, 10, -9, -100, -200, -300, -400, -500, -501, -502, -503, -504};

        Arrays.sort(intArray);

        int index = iterativeBinarySearch(intArray, 20);
        System.out.println(index);
    }

    public static int iterativeBinarySearch(int[] sortedArray, int key) {
        int index = Integer.MAX_VALUE;

        int low = 0;
        int high = sortedArray.length - 1;
        int counter = 0;

        while (low <= high) {
            counter++;
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        System.out.println("Search took " + counter + " operations");
        return index;
    }
}
