package pl.pingwit.lec_30.point_7;

import java.util.List;

/**
 * @author Pavel Radkevich
 * @since 18.05.23
 */
public class CollectionThread extends Thread{

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
