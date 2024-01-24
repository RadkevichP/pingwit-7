package pl.pingwit.lec_30.point_4;

import pl.pingwit.lec_30.point_2.Counter;

import java.util.concurrent.atomic.AtomicInteger;


public class AtomicCounter extends Counter {

    private AtomicInteger number = new AtomicInteger(0);

    public int getNumber() {
        return number.get();
    }

    public void increment() {
        number.incrementAndGet();
    }

    public void decrement() {
        number.decrementAndGet();
    }
}
