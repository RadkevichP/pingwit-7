package pl.pingwit.lec_13.point_1;

import org.apache.commons.lang3.RandomUtils;

import java.math.BigDecimal;
import java.util.ArrayList;

public class OOMErrorExample {

    public static void main(String[] args) {
        ArrayList<BigDecimal> bigDecimals = new ArrayList<>();

        int i = 0;
        while (i < 10000000) {
            i++;
            bigDecimals.add(new BigDecimal(RandomUtils.nextInt()));
        }
    }

}
