package pl.pingwit.lec_30.point_2;


public class IncrementorThread extends Thread {

    private final Counter counter;

    public IncrementorThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}
