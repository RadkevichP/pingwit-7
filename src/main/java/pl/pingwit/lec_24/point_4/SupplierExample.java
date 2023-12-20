package pl.pingwit.lec_24.point_4;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import pl.pingwit.lec_24.point_1.ShortUserInfo;

import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

        Supplier<Integer> myIntSupplier = () -> RandomUtils.nextInt();

        Supplier<ShortUserInfo> shortUserInfoSupplier = () -> new ShortUserInfo(
                RandomStringUtils.randomAlphabetic(5),
                RandomStringUtils.randomAlphabetic(5),
                RandomStringUtils.randomAlphabetic(5)
        );

        ShortUserInfo shortUserInfo = shortUserInfoSupplier.get();
        System.out.println(shortUserInfoSupplier.get());
        System.out.println(shortUserInfoSupplier.get());
        System.out.println(shortUserInfoSupplier.get());

    }
}
