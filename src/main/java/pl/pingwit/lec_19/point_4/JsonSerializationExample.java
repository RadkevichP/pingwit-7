package pl.pingwit.lec_19.point_4;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.pingwit.lec_19.point_1.Car;

import java.io.File;
import java.io.IOException;

public class JsonSerializationExample {

    public static void main(String[] args) throws IOException {
        Car fabia = new Car("Skoda", "Fabia", "sold");

        ObjectMapper objectMapper = new ObjectMapper();

        objectMapper.writeValue(new File("src/main/java/pl/pingwit/lec_19/point_4/fabia.json"), fabia);
    }
}
