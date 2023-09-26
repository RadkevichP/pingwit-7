package pl.pingwit.lec_6.point_1;

public class SearchExample {

    // O(n)  n - количество элементов в массиве
    public static void main(String[] args) {

        int[] myArray = {100, 70, 60, 43, 32, 120, 1233, 1999, -9};

        int operationsCounter = 0;
        int numberToFind = -9;

        for (int i = 0; i < myArray.length; i++) {
            operationsCounter++;
            if (myArray[i] == numberToFind) {
                System.out.println("элемент с значением " + numberToFind + " найден по индексу " + i);
                break;
            }
        }

        for (int i : myArray) {
            System.out.println(i);  // O(n)
        }

        // O(1)
        // O(n)
        // O(log(n))
        // O(n2)

        System.out.println("Search took " + operationsCounter + " operations");

        int fifthValue = myArray[5]; // O(1) - константная сложность, не зависит от размера массива
    }
}
