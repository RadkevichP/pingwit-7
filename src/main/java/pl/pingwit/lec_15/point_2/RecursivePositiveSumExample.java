package pl.pingwit.lec_15.point_2;

public class RecursivePositiveSumExample {

    public static void main(String[] args) {
        System.out.println(sum(10));
    }

    private static int sum(int to) {
        if (to >= 0) {
            return to + sum(to - 1);
        } else {
            return to;
        }
    }
}
