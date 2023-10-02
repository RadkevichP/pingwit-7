package pl.pingwit.lec_7.point_3;

public class StaticNonStaticMethodsExample {

    public static void main(String[] args) {

        Integer myInt =  Integer.valueOf(12);

        String email = RandomMailGenerator.generateRandomEmail();

        System.out.println(email);
    }
}
