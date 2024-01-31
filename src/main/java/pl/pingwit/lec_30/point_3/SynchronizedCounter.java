package pl.pingwit.lec_30.point_3;

import pl.pingwit.lec_30.point_2.Counter;


public class SynchronizedCounter extends Counter {

    private final Object lock = new Object();
    private final Object lock2 = new Object();

    public int getNumber() {
        return number;
    }

    @Override
    public void increment() {
        synchronized (lock) {
            number++;
        }
    }

    @Override
    public synchronized void decrement() {
        synchronized (lock2) {
            number--;
        }
    }
}
