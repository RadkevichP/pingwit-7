package pl.pingwit.lec_19.point_3;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

public class XmlDeserealizationExample {

    // SOAP
    public static void main(String[] args) throws IOException {

        XmlMapper xmlMapper = new XmlMapper();

        Car555 car = xmlMapper.readValue(new File("src/main/java/pl/pingwit/lec_19/point_2/fabia.xml"), Car555.class);
        System.out.println(car);
    }
}
