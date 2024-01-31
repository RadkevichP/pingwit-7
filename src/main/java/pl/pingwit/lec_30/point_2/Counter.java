package pl.pingwit.lec_30.point_2;


public class Counter {

    protected int number = 0;

    public int getNumber() {
        return number;
    }

    // ------ 5 -> 6 -> set 6
    // ------ 5 -> 4 -> set 4
    public void increment() {
        // 1 get - read value  12
        // 2 increment +  13
        // 3 write
        number++;
    }

    // 12 + 1 - 1 = 11

    public void decrement() {
        // 12
        // 11
        number--;
    }
}
