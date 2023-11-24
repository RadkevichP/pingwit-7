package pl.pingwit.lec_18.point_1;

import pl.pingwit.lec_13.point_4.PingwitException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Pavel Radkevich
 */
public class FileExample {

    // Java IO Input Output
    public static void main(String[] args) {

        // не используем String absolutePath = "/Users/pavelhomeair/Pingwit Course/pingwit-7/src/main/java/pl/pingwit/lec_18/point_1/bad-romance"

        String path = "src/main/java/pl/pingwit/lec_18/point_1/bad-romance";
        //String path = "src/main/java/pl/pingwit/lec_17/point_1/Application.java";
        //String s = "src" + File.separator + "main";

        File file = new File(path);
    /*
        file.createNewFile();
        // mkdir
        file.mkdir();

        file.isFile();
        file.isDirectory();*/

        //String[] list = file.list();
        //File[] files = file.listFiles();

        //if (file.exists())
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException notFoundException) {
            throw new PingwitException("File not found");
        }
    }

}
