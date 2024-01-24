package pl.pingwit.lec_30.point_1;

public class RunnableTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable implementing. Solving task in thread: " + Thread.currentThread().getName());
    }
}
