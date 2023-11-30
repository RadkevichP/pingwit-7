package pl.pingwit.lec_19.point_1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class JavaDeserializationExample {

    public static void main(String[] args) {
        String filePath = "src/main/java/pl/pingwit/lec_19/point_1/car.ping";

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            Car car = (Car) ois.readObject();

            System.out.println("Object successfully deserialized from file:");
            System.out.println(car);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
