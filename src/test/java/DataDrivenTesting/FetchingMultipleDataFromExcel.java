package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingMultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//		//1. Convert Physical file into java object
//		FileInputStream fis=new FileInputStream("./src/test/resources/Selenium practice 1.xlsx");
//		
//		//2. Create or fetch the Workbook
//		Workbook wb= WorkbookFactory.create(fis);
//		
//		//3. Fetch the sheet
//		Sheet sh= wb.getSheet("Sheet1");
//		
//		//4. Use loop to fetch all the Rows
//		for(int i=1;i<=sh.getLastRowNum();i++) {
//			System.out.println(sh.getRow(i).getCell(0).getStringCellValue());
//		}
		
		
		
		
		//Practice/
		//////////////////////
		FileInputStream fis=new FileInputStream("./src/test/resources/Selenium practice 1.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sh= wb.getSheet("Sheet1");
		for(int i=1;i<=sh.getLastRowNum();i++) {
			System.out.println(sh.getRow(i).getCell(1).getStringCellValue());
		}
		
		for(int i=1;i<=sh.getRow(i).getLastCellNum();i++) {
			System.out.println(sh.getrowq);
		}
		wb.close();

	}

}
