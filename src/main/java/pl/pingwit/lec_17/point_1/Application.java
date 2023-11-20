package pl.pingwit.lec_17.point_1;

import pl.pingwit.lec_16.point_1.Customer;
import pl.pingwit.lec_16.point_1.UserInfo;

public class Application {

    public static void main(String[] args) throws IllegalAccessException {
        Customer nullableCustomer = new Customer(null, "Haha", null);
        System.out.println();

        System.out.println(nullableCustomer);
        DefaultValueProcessor defaultValueProcessor = new DefaultValueProcessor();
        defaultValueProcessor.process(nullableCustomer);
        System.out.println(nullableCustomer);

        UserInfo nullInfo = new UserInfo(null, null, null, null, null);
        defaultValueProcessor.process(nullInfo);
        System.out.println(nullInfo);
    }
}
