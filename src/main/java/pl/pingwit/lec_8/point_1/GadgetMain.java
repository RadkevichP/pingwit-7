package pl.pingwit.lec_8.point_1;

public class GadgetMain {

    public static void main(String[] args) {
        String type = "phone";

        AppleGadget iphone11number1 = new AppleGadget("001A", GadgetTypes.SMARTPHONE, "iPhone 11", 64);
        AppleGadget iphone11number2 = new AppleGadget("001A", GadgetTypes.SMARTPHONE, "iPhone 11", 64);
        AppleGadget iphone11number3 = iphone11number2;

        System.out.println("Are links equal? " + (iphone11number1 == iphone11number2));
        System.out.println("Are links equal? " + (iphone11number2 == iphone11number3));

        System.out.println(iphone11number1);
        System.out.println(iphone11number2);
        System.out.println("iPhones are equal? " + iphone11number1.equals(iphone11number2));

        System.out.println("HashCode 1: " + iphone11number1.hashCode());
        System.out.println("HashCode 2: " + iphone11number2.hashCode());

        // System.out.println("равны ли ссылки? :" + iphone11number1 == iphone11number2)
    }
}
