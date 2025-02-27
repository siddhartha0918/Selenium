package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteDataBackToThePropFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("./src/test/resources/CommonData.properties");
		
		Properties p=new Properties();
		
		p.load(fis);
		
		System.out.println(p.getProperty("url"));
		
		//Writing data back to Prop file
		p.put("Music", "Anirudh");
		p.put("Movie", "Magic");
		
		//Save prop file
		FileOutputStream fos=new FileOutputStream("./src/test/resources/CommonDataUpdated.properties");
		p.store(fos, "Updated data");
		

	}

}
