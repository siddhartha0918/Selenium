package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//Step 1. Convert Physical file into java object
		FileInputStream fis=new FileInputStream("./src/test/resources/Selenium practice 1.xlsx");
		
		//Step 2. Create workbook or fetch the workbook
		Workbook wb=WorkbookFactory.create(fis);
		
		//Step 3. Fetch the sheet
		Sheet s= wb.getSheet("Sheet1");
		
		//Step 4. Fetch the Row
		Row r= s.getRow(4);
		
		//Step 5. Fetch the Cell
		Cell c= r.getCell(1);
		
		//Step 6. Fetch the data
		String data= c.getStringCellValue();
		
		System.out.println(data);

	}

}
