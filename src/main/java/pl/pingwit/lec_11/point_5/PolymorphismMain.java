package pl.pingwit.lec_11.point_5;

import pl.pingwit.lec_11.point_4.Mail;
import pl.pingwit.lec_11.point_4.Parcel;
import pl.pingwit.lec_11.point_4.PostItem;
import pl.pingwit.lec_11.point_4.PriorityLevel;

import java.math.BigDecimal;
import java.util.Scanner;

public class PolymorphismMain {

    public static void main(String[] args) {

        Parcel parcel = new Parcel("Riga", "Oslo", new BigDecimal("33.44"));
        parcel.getWeight();

        Parcel parcel2 = new Parcel("Minsk", "Brest", new BigDecimal("10.44"));
        Parcel parcel3 = new Parcel("Kiyv", "Harkiv", new BigDecimal("66.44"));

        Mail mail = new Mail("Riga", "Stockholm", PriorityLevel.LOW);

        PostItem[] postItems = {parcel, parcel2, parcel3, mail};

        for (PostItem postItem : postItems) {
            postItem.printDescription();
            System.out.println();
        }

        PostItem myMail = new Mail("Riga", "Stockholm", PriorityLevel.LOW);
    }
}
