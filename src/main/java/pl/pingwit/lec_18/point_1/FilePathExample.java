package pl.pingwit.lec_18.point_1;

import java.io.File;

public class FilePathExample {

    public static void main(String[] args) {
        // Platform-independent file path building
        String directoryPath = "data";
        String fileName = "example.txt";

        String platformIndependentPath = directoryPath + File.separator + fileName;

        System.out.println("Platform-independent file path: " + platformIndependentPath);
    }
}

