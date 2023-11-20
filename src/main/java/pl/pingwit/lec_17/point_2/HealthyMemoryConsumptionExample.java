package pl.pingwit.lec_17.point_2;

import org.apache.commons.lang3.RandomUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class HealthyMemoryConsumptionExample {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            execute();
        }
    }

    private static void execute() throws InterruptedException {
        List<BigDecimal> objects = new ArrayList<>();

        for (int i = 0; i < 5000000; i++) {
            objects.add(new BigDecimal(RandomUtils.nextInt()));
        }

        BigDecimal sum = BigDecimal.ZERO;
        for (BigDecimal object : objects) {
            sum = sum.add(object);
        }
        System.out.println("Sum is " + sum);

        Thread.sleep(100);
        System.out.println("уходим на следующию итерацию");
    }

}
