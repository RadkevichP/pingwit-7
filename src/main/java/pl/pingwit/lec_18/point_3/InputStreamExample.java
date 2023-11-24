package pl.pingwit.lec_18.point_3;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class InputStreamExample {

    public static void main(String[] args) {

        String path = "src/main/java/pl/pingwit/lec_18/bad-romance.txt";
        File file = new File(path);

        long start = System.currentTimeMillis();

        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
            int data;
            while ((data = inputStream.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println("Время выполнения программы: " + elapsed + " мс");

    }
}
