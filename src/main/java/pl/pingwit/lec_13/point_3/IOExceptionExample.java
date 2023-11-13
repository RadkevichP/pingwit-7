package pl.pingwit.lec_13.point_3;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class IOExceptionExample {

    public static void main(String[] args) {
        String pathOfOriginal = "src/main/java/org/example/hw_16/files/city.png";
        String pathOfCopy = "src/main/java/org/example/hw_16/files/buffered_img.png";

        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(pathOfOriginal));
        } catch (FileNotFoundException e) {
            System.out.println("у нас проблема!");
        }
        System.out.println("Yeep!");
    }
}
