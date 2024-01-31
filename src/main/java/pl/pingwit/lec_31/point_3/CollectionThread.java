package pl.pingwit.lec_31.point_3;

import java.util.List;


public class CollectionThread extends Thread {

    private final List<Integer> list;

    public CollectionThread(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
    }
}
