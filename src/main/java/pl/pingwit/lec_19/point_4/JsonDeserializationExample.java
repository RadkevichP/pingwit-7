package pl.pingwit.lec_19.point_4;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonDeserializationExample {

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        Vehicle vehicle = objectMapper.readValue(new File("src/main/java/pl/pingwit/lec_19/point_4/fabia.json"), Vehicle.class);

        System.out.println(vehicle);
    }
}
