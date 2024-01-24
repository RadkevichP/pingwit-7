package pl.pingwit.lec_30.point_1;

public class ThreadTask extends Thread {
    @Override
    public void run() {
        Thread.currentThread().setName("PIngwit");
        System.out.println("Thread extension. Solving task in thread: " + Thread.currentThread().getName());
    }
}
