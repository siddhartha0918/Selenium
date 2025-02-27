package Practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshotsss {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.tpointtech.com/");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File sc= ts.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("./Screenshots/javat.png");
		
		FileUtils.copyFile(sc, dest);
		
		Thread.sleep(2000);
		
		driver.quit();
		

	}

}
