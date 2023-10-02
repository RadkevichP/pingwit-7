package pl.pingwit.lec_7.point_3;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomMailGenerator {

    public static String generateRandomEmail() {
        // xxxxxxxxx@xxxx.xxx

        String name = RandomStringUtils.randomAlphabetic(8);
        String mailService = RandomStringUtils.randomAlphabetic(4);
        String domain = RandomStringUtils.randomAlphabetic(3);

        String email = name.toLowerCase() + "@" + mailService.toLowerCase() + "." + domain.toLowerCase();

        return email;
    }

}
