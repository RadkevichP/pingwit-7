package pl.pingwit.lec_30.point_0;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.*;

public class Application {

    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
        CatFactsPrinter catFactsPrinter = new CatFactsPrinter();

        System.out.println("-------------------------------------------------------");
        printJokesSequentially(catFactsPrinter);
        System.out.println("-------------------------------------------------------");
        printJokesInParallel(catFactsPrinter);
    }

    private static void printJokesSequentially(CatFactsPrinter catFactsPrinter) throws IOException {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 5; i++) {
            System.out.println(catFactsPrinter.downloadRandomCatFactsFromTheInternet());
        }
        long end = System.currentTimeMillis();
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println(String.format("The sequential approach took %d milliseconds to complete", end - start));
    }

    private static void printJokesInParallel(CatFactsPrinter catFactsPrinter) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        List<Callable<String>> tasks = List.of(catFactsPrinter::downloadRandomCatFactsFromTheInternet,
                catFactsPrinter::downloadRandomCatFactsFromTheInternet,
                catFactsPrinter::downloadRandomCatFactsFromTheInternet,
                catFactsPrinter::downloadRandomCatFactsFromTheInternet,
                catFactsPrinter::downloadRandomCatFactsFromTheInternet);

        long start = System.currentTimeMillis();
        List<Future<String>> futures = executorService.invokeAll(tasks);
        for (Future<String> future : futures) {
            System.out.println(future.get());
        }

        long end = System.currentTimeMillis();
        executorService.shutdown();
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println(String.format("The parallel approach took %d milliseconds to complete", end - start));
    }


}
