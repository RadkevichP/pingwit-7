package pl.pingwit.lec_11;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

public class DatabaseUtils {
    public String provideDBUrl() {
        int i = RandomUtils.nextInt(10, 30);
        return RandomStringUtils.random(i);
    }

}
