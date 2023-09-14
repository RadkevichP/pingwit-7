package pl.pingwit.lec_4.point_1;

public class LoopInsideLoopExample {

    public static void main(String[] args) throws InterruptedException {

        int number = 10;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("0");
            }
            Thread.sleep(300);
            System.out.println();
        }
    }
}
