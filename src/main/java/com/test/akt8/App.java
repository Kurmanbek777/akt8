package com.test.akt8;
// класс преобразования сохраненной страницы в pdf
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;

public class App 
{
    public static void main( String[] args ) throws DocumentException, IOException
    {
      // step 1
    	Document document = new Document();
        // step 2
    	PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("pdf.pdf"));
        // step 3
        document.open();
        // step 4
        XMLWorkerHelper.getInstance().parseXHtml(writer, document,
                new FileInputStream("D:\\Users\\User\\Downloads\\akt8\\src\\main\\webapp\\users\\View.xhtml"));	
        //step 5
         document.close();

        System.out.println( "PDF Created!" );
    }
}
