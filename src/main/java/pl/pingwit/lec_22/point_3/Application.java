package pl.pingwit.lec_22.point_3;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Application {

    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        Harvest[] harvests = objectMapper.readValue(new File("src/main/java/pl/pingwit/lec_22/point_3/harvest.json"), Harvest[].class);
        System.out.println(Arrays.toString(harvests));
    }
}
