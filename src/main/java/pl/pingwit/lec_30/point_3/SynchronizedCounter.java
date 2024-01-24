package pl.pingwit.lec_30.point_3;

import pl.pingwit.lec_30.point_2.Counter;


public class SynchronizedCounter extends Counter {

    public int getNumber() {
        return number;
    }

    @Override
    public void increment() {
        synchronized (this) {
            number++;
        }
    }

    @Override
    public void decrement() {
        synchronized (this) {
            number--;
        }
    }
}
