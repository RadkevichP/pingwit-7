package pl.pingwit.lec_19.point_2;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import pl.pingwit.lec_19.point_1.Car;

import java.io.File;
import java.io.IOException;

public class XmlSerializationExample {

    public static void main(String[] args) {
        Car fabia = new Car("Skoda", "Fabia", "sold");

        XmlMapper xmlMapper = new XmlMapper();

        try {
            xmlMapper.writeValue(new File("src/main/java/pl/pingwit/lec_19/point_2/fabia.xml"), fabia);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
