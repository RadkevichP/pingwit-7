package pl.pingwit.lec_18.point_8;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FileUtilsExample {

    public static void main(String[] args) throws IOException {
        
        FileUtils.copyFile(new File("src/main/java/pl/pingwit/lec_18/point_8/java.png"),
                new File("src/main/java/pl/pingwit/lec_18/point_8/java-copy-2.png"));
    }
}
