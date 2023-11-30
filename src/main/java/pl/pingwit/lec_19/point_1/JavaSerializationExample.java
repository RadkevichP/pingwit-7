package pl.pingwit.lec_19.point_1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class JavaSerializationExample {

    public static void main(String[] args) {

        String filePath = "src/main/java/pl/pingwit/lec_19/point_1/car.ping";
        Car car = new Car("Audi", "A4", "used");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {

            oos.writeObject(car);
            System.out.println("Object successfully serialized to file.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
