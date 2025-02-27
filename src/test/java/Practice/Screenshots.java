package Practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.youtube.com/results?search_query=kunfayakun");
		
		//1. Typecast
		TakesScreenshot sc=(TakesScreenshot) driver;
		
		//2.Take the screenshot and copy
		File ss=sc.getScreenshotAs(OutputType.FILE);
		
		//3. Create an empty file to store the Screenshot
		File dest=new File("C:\\Users\\SIDDHARTHA\\OneDrive\\Desktop\\QSP\\sc2.png");
		
		//4. Copy the SCreenshot in the file
		FileUtils.copyFile(ss, dest);
		
		driver.quit();
		
	}

}
