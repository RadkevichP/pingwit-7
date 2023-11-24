package pl.pingwit.lec_18.point_6;

import java.io.*;

/**
 * @author Pavel Radkevich
 * @since 21.03.23
 */
public class ReaderExample {

    public static void main(String[] args) {

        String inputPath = "src/main/java/pl/pingwit/lec_18/point_6/bad-romance";
        String outputPath = "src/main/java/pl/pingwit/lec_18/point_6/bad-romance-copy";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputPath));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputPath))
        ) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                //  \n
                bufferedWriter.write(line);
                bufferedWriter.write("\n");
                //bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
