package pl.pingwit.lec_10.stringBuilder;

public class StringBuilderMain {
    public static void main(String[] args) {

        String s = "hello";
        for (int i = 0; i < 1000; i++) {
            s = s + "Mama! ";
        }
        System.out.println(s);


        StringBuilder stringBuilder = new StringBuilder("hello");
        for (int i = 0; i < 1000; i++) {
            stringBuilder.append("Mama! ");
        }
        System.out.println(stringBuilder);


        StringBuffer buffer = new StringBuffer("zazaz");
        for (int i = 0; i < 1000; i++) {
            buffer.append("Mama! ");
        }
        System.out.println(buffer);
    }
}
