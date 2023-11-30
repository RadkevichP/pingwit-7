package pl.pingwit.lec_19.point_5;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;

public class PoiExcelExample {

    public static void main(String[] args) {

        String filePath = "src/main/java/pl/pingwit/lec_19/point_5/example.xlsx";
        try (FileInputStream excelFile = new FileInputStream(filePath);
             Workbook workbook = WorkbookFactory.create(excelFile)) {

            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println();
            }
        } catch (IOException | EncryptedDocumentException e) {
            e.printStackTrace();
        }
    }
}
