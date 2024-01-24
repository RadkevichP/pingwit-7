package pl.pingwit.lec_30.point_2;


public class Counter {

    protected int number = 0;

    public int getNumber() {
        return number;
    }

    // ------ 5 -> 6 -> set 6
    // ------ 5 -> 4 -> set 4
    public void increment() {
        // 1 get - read value
        // 2 increment +
        // 3 write
        number++;
    }

    public void decrement() {
        number--;
    }
}
