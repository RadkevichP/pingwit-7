package pl.pingwit.lec_19.point_5;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

/**
 * @author Pavel Radkevich
 * @since 23.03.23
 */
public class PoiExample {

    public static void main(String[] args) {
        String path = "src/main/java/pl/pingwit/lec_19/point_5/pingwit.pl_анализ_конверсий.docx";
        File file = new File(path);

        try (FileInputStream inputStream = new FileInputStream(file)) {

            XWPFDocument document = new XWPFDocument(inputStream);

            List<XWPFParagraph> paragraphs = document.getParagraphs();
            for (XWPFParagraph paragraph : paragraphs) {
                System.out.println(paragraph.getText());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
