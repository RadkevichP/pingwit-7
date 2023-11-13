package pl.pingwit.lec_15.point_2;

public class JavaRecursiveFactorialExample {

    public static void main(String[] args) {
        System.out.println(factorial(6));
    }

    private static int factorial(int number) {
        if (number <= 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }
}
