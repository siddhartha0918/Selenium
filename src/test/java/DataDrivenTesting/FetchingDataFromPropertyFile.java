package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FetchingDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		//Step 1: convert Physical properties file into Java Object
		FileInputStream fis=new FileInputStream("./src/test/resources/CommonData.properties");
		
		//Step 2: Create an Object for Properties
		Properties p=new Properties();
		
		//Step 3: Load the prop obj into the java object
		p.load(fis);
		
		//Step 4: Fetch the data from prop file
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("browser"));
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("password"));
		System.out.println("timeouts");
		
		
		//Practice
//		FileInputStream fis=new FileInputStream("./src/test/resources/CommonData.properties");
//		Properties p=new Properties();
//		p.load(fis);
//		System.out.println(p.getProperty("url"));
	}

}
