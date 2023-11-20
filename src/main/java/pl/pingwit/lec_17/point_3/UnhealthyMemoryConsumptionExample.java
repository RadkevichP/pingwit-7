package pl.pingwit.lec_17.point_3;

import org.apache.commons.lang3.RandomUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class UnhealthyMemoryConsumptionExample {
    public static void main(String[] args) throws InterruptedException {

        List<BigDecimal> objects = new ArrayList<>();

        while (true) {
            execute(objects);
        }
    }

    private static void execute(List<BigDecimal> objects) throws InterruptedException {
        for (int i = 0; i < 500000; i++) {
            objects.add(new BigDecimal(RandomUtils.nextInt()));
        }
        BigDecimal sum = BigDecimal.ZERO;

        for (BigDecimal object : objects) {
            sum = sum.add(object);
        }
        Thread.sleep(100);
        System.out.println("уходим на следующию итерацию");
    }

}
