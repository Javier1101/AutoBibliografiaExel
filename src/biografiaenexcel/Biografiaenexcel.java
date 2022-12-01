package biografiaenexcel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Biografiaenexcel {

    public static void main(String[] args) {

        crearExcel();
    }

    public static void crearExcel() {

        Workbook book = new XSSFWorkbook();
        org.apache.poi.ss.usermodel.Sheet sheet = book.createSheet("Hola java");

        Row row = sheet.createRow(0);
        row.createCell(0).setCellValue("Mi nombre es José Javier Martinez Bernal tengo 19 años nací en");
        Row row1 = sheet.createRow(2);
        row1.createCell(0).setCellValue("Toluca de lerdo vivo en la colonia seminario 4 sección tengo 4");
        Row row2 = sheet.createRow(3);
        row2.createCell(0).setCellValue(" hermano 3 mas grandes que yo y uno que es menor me gusta");
        Row row3 = sheet.createRow(4);
        row3.createCell(0).setCellValue("mucho el color verde, desde chiquito me gustó mucho la");
        Row row4 = sheet.createRow(5);
        row4.createCell(0).setCellValue("tecnología como se creaba y el porqué de todas las cosas me");
        Row row5 = sheet.createRow(6);
        row5.createCell(0).setCellValue("tecnología como se creaba y el porqué de todas las cosas me ");
        Row row6 = sheet.createRow(7);
        row6.createCell(0).setCellValue("amigable ");

       
        try {
            FileOutputStream fileout = new FileOutputStream("biografia_en_excel.xlsx");
            book.write(fileout);

            fileout.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Biografiaenexcel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Biografiaenexcel.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null,"Se CREO EL EXCEL ");
    }
}
