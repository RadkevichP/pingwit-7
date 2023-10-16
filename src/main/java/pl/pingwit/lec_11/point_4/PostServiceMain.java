package pl.pingwit.lec_11.point_4;

import java.math.BigDecimal;

public class PostServiceMain {

    public static void main(String[] args) {
        Parcel parcel = new Parcel("Minsk", "Vilnius", new BigDecimal("10.5"));

        parcel.getFrom();
        parcel.getTo();

        parcel.printDescription();
        System.out.println();

        Mail mail = new Mail("Brest", "Warsaw", PriorityLevel.HIGH);
        mail.printDescription();
    }
}
