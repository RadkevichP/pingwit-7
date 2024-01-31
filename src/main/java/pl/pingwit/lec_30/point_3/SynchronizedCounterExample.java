package pl.pingwit.lec_30.point_3;

import pl.pingwit.lec_30.point_2.Counter;
import pl.pingwit.lec_30.point_2.DecrementorThread;
import pl.pingwit.lec_30.point_2.IncrementorThread;


public class SynchronizedCounterExample {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new SynchronizedCounter();
        //Counter counter = new Counter();

        IncrementorThread incrementorThread = new IncrementorThread(counter);
        IncrementorThread incrementorThread2 = new IncrementorThread(counter);
        IncrementorThread incrementorThread3 = new IncrementorThread(counter);
        DecrementorThread decrementorThread = new DecrementorThread(counter);


        incrementorThread.start();
        incrementorThread2.start();
        incrementorThread3.start();
        decrementorThread.start();


        incrementorThread.join();
        incrementorThread2.join();
        incrementorThread3.join();
        decrementorThread.join();


        System.out.println(counter.getNumber());
    }
}
