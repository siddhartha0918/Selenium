package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteBackDataToExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("./src/test/resources/Selenium practice 1.xlsx");
		
		Workbook wb= WorkbookFactory.create(fis);
		
		Sheet sh= wb.getSheet("Sheet1");
		
		Row r= sh.createRow(10);
		
		Cell c=r.createCell(0);
		Cell c1= r.createCell(1);
		
		c.setCellValue("yuzichahal23");
		//c1.setCellValue("yuzi123");
		
		FileOutputStream fos=new FileOutputStream("./src/test/resources/Selenium practice 1.xlsx");
		
		wb.write(fos);
		
		wb.close();
		
		
//		//Practice
//		FileInputStream fis=new FileInputStream("./src/test/resources/Selenium practice 1.xlsx");
//		Workbook wb= WorkbookFactory.create(fis);
//		Sheet sh= wb.getSheet("Sheet1");
//		Row r= sh.getRow(8);
//		Cell c= r.getCell(1);
//		c.setCellValue("SirVivSiraj");
//		
//		FileOutputStream fos=new FileOutputStream("./src/test/resources/Selenium practice 1.xlsx");
//		wb.write(fos);
//		
//		wb.close();
//		

	}

}
