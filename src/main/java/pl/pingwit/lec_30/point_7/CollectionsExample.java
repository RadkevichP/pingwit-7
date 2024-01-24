package pl.pingwit.lec_30.point_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Pavel Radkevich
 * @since 18.05.23
 */
public class CollectionsExample {

    public static void main(String[] args) throws InterruptedException {

        List<Integer> integers = Collections.synchronizedList(new ArrayList<>());
        //List<Integer> integers = new CopyOnWriteArrayList<>();

        CollectionThread collectionThread = new CollectionThread(integers);
        CollectionThread collectionThread2 = new CollectionThread(integers);
        CollectionThread collectionThread3 = new CollectionThread(integers);
        CollectionThread collectionThread4 = new CollectionThread(integers);

        collectionThread.start();
        collectionThread2.start();
        collectionThread3.start();
        collectionThread4.start();

        collectionThread.join();
        collectionThread2.join();
        collectionThread3.join();
        collectionThread4.join();

        System.out.println(integers.size());

    }
}
