package pl.pingwit.lec_3.point_5;

public class ForLoopExample {


    public static void main(String[] args) {

        int sum = 0;
        for (int i = 0; i <= 20; i++) {
            sum += i;
        }

        System.out.println(sum);

       /* for (int i = 0; i < 100; i +=5) {
            System.out.println(i);
        }*/

       /* for (int i = 100; i >= 0; i -=5) {
            System.out.println(i);
        }*/



/*
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(10-j);
            }
            System.out.println();
        }*/

    }
}
