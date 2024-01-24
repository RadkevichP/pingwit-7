package pl.pingwit.lec_30.point_1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Pavel Radkevich
 * @since 18.05.23
 */
public class RunnableExample {

    public static void main(String[] args) throws InterruptedException {

        Runnable task = () -> System.out.println("solving first task in thread: " + Thread.currentThread().getName());
        Runnable task2 = () -> System.out.println("solving second task in thread: " + Thread.currentThread().getName());
        Runnable task3 = () -> System.out.println("solving third task in thread: " + Thread.currentThread().getName());
        Runnable task4 = () -> System.out.println("solving fourth task in thread: " + Thread.currentThread().getName());

       /* Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);
        Thread thread4 = new Thread(task4);

        thread1.start();
        thread1.join();

        thread2.start();
        thread2.join();

        thread3.start();
        thread3.join();

        thread4.start();
        thread4.join();

        ThreadTask threadTask = new ThreadTask();
        threadTask.start();
        threadTask.join();
*/

        ExecutorService executorService = Executors.newFixedThreadPool(4);

        executorService.submit(task);
        executorService.submit(task2);
        executorService.submit(task3);
        executorService.submit(task4);

        executorService.submit(task4);
        executorService.submit(task4);
        executorService.submit(task4);

        executorService.shutdown();

        System.out.println("hello from thread: " + Thread.currentThread().getName());
    }
}
