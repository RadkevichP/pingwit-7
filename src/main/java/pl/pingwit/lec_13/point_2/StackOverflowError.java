package pl.pingwit.lec_13.point_2;

public class StackOverflowError {

    public static void main(String[] args) {
        hello();
    }

    private static void hello() {
        System.out.println("hello");
        hello();
    }
}
