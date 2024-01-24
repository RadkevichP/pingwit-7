package pl.pingwit.lec_30.point_2;


public class DecrementorThread extends Thread {

    private final Counter counter;

    public DecrementorThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.decrement();
        }
    }
}
