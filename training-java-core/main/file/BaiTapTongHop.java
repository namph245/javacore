package file;


import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BaiTapTongHop {

    public static void main(String[] args) {

        /*
            - lấy dữ liệu từ một object json sau đó ghi vào file pdf, csv, excel
            - import data vào file pdf, csv, excel
            - export data
        */



//        createDoc();

    }



    public static void createDoc() {
        // tạo một document
        Document document = new Document();

        try {
            // khởi tạo một PdfWriter truyền vào document và FileOutputStream
            PdfWriter.getInstance(document, new FileOutputStream("HelloWorld.pdf"));

            // mở file để thực hiện viết
            document.open();
            // thêm nội dung sử dụng add function
            document.add(new Paragraph("A Hello World PDF document."));

            Phrase phrase = new Phrase();
            for (int i=0; i < 10; i++) {
                Chunk chunk = new Chunk("Hello world");
                phrase.add(chunk);
            }
            document.add(phrase);

            // để căn chỉnh vị trí, thụt đầu dòng thì dùng Paragraph
            Paragraph paragraph1 = new Paragraph("This is Paragraph 1");
            Paragraph paragraph2 = new Paragraph("This is Paragraph 2");
            //Định dạng đoạn văn bản thứ nhất
            paragraph1.setIndentationLeft(80);
            paragraph1.setIndentationRight(80);
            paragraph1.setAlignment(Element.ALIGN_CENTER);
            paragraph1.setSpacingAfter(15);

            // Đinh dạng đoạn văn bản thứ 2
            paragraph2.setSpacingBefore(15);
            paragraph2.setAlignment(Element.ALIGN_LEFT);

            //Thêm nội dung cho cả 2 đoạn văn bản trên
            Phrase phrase2 = new Phrase("This is a large sentence.");
            for (int i=0; i < 10; i++) {
                paragraph1.add(phrase2);
                paragraph2.add(phrase2);
            }

            //Thêm 2 đoạn văn bản vào document
            document.add(paragraph1);
            document.add(paragraph2);

            // đóng file
            document.close();

        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
