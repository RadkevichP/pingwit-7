package pl.pingwit.lec_16.point_3;

import pl.pingwit.lec_16.point_1.Customer;
import pl.pingwit.lec_16.point_1.UserInfo;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) throws IllegalAccessException {
        Customer customer = new Customer("Peter", "Parker", "rr@mail.com");
        UserInfo userInfo = new UserInfo("ppp", "ooo", "89898", "66555", LocalDate.now());

        PingwitAnnotationValidator pingwitAnnotationValidator = new PingwitAnnotationValidator();
        pingwitAnnotationValidator.validate(customer);
        pingwitAnnotationValidator.validate(userInfo);
    }
}
