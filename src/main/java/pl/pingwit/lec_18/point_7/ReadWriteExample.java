package pl.pingwit.lec_18.point_7;

import java.io.*;

public class ReadWriteExample {

    public static void main(String[] args) {

        String inputPath = "src/main/java/pl/pingwit/lec_18/point_7/java.png";
        String outputPath = "src/main/java/pl/pingwit/lec_18/point_7/java-copy.png";

        try (InputStream inputStream = new FileInputStream(inputPath);
             OutputStream outputStream = new FileOutputStream(outputPath)) {

            int data;
            while ((data = inputStream.read()) != -1) {
                outputStream.write(data);
                //outputStream.write("_".getBytes());
            }
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
