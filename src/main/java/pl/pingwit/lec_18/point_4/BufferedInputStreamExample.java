package pl.pingwit.lec_18.point_4;

import java.io.*;

public class BufferedInputStreamExample {

    public static void main(String[] args) {

        String path = "src/main/java/pl/pingwit/lec_18/bad-romance.txt";
        File file = new File(path);

        long start = System.currentTimeMillis();
        try {
            BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(file));

            byte[] bytes = new byte[3000];

            while ((inputStream.read(bytes)) != -1) {
                for (byte aByte : bytes) {
                    System.out.print((char) aByte);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println("Время выполнения программы: " + elapsed + " мс");

    }
}
