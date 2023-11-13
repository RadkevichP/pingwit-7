package pl.pingwit.lec_15.point_2;

public class JavaRecursiveCallExample {

    public static void main(String[] args) {
        call(5);
    }

    private static void call(int times) {
        if (times == 0) {
            System.out.println("Поехали!");
            return;
        }
        System.out.println(times);
        call(--times);
    }
}
