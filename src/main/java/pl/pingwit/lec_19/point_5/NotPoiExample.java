package pl.pingwit.lec_19.point_5;

import java.io.*;

/**
 * @author Pavel Radkevich
 * @since 23.03.23
 */
public class NotPoiExample {
    public static void main(String[] args) {

        String path = "src/main/java/pl/pingwit/lec_19/point_5/pingwit.pl_анализ_конверсий.docx";
        File file = new File(path);

        try (BufferedReader reader = new BufferedReader(new FileReader(file)))
        {
            String data;
            while (((data = reader.readLine()) != null)) {
                System.out.println(data);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
