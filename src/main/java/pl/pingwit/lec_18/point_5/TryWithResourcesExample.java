package pl.pingwit.lec_18.point_5;

import java.io.*;

public class TryWithResourcesExample {

    public static void main(String[] args) {

        String path = "src/main/java/pl/pingwit/lec_18/bad-romance.txt";
        File file = new File(path);

        try (InputStream inputStream = new FileInputStream(file)) {

            int data;
            while ((data = inputStream.read()) != -1) {
                System.out.print((char) data);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
