package pl.pingwit.lec_30.point_2;



public class CounterExample {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        IncrementorThread incrementorThread = new IncrementorThread(counter);
        DecrementorThread decrementorThread = new DecrementorThread(counter);

        incrementorThread.start();
        decrementorThread.start();

        incrementorThread.join();
        decrementorThread.join();

        System.out.println(counter.getNumber());
    }
}
