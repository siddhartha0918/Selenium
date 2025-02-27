package TakingScreenshots;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShots {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.swiggy.com/");
		Thread.sleep(3000);
		
		//Screenshot of a Webpage
		
		//1--> Typecast takesScreenshot (i) with driver ref variable
		//Webdriver is the parent and TakesScreenshot is child
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		//2--> Take a screenshot and store in temp file
		File sc=ts.getScreenshotAs(OutputType.FILE);
		
		//3--> Create an Empty file
		File desti=new File("./Screenshots/SwiggyHome.png");
		File dest=new File("C:\\Users\\SIDDHARTHA\\OneDrive\\Pictures\\Screenshots\\Swiggy1.png");
		
		//4--> Copy the Screenshot in the empty file
		FileUtils.copyFile(sc, desti);
		FileUtils.copyFile(sc, dest);
		
		
		//Close the browser
		driver.quit();
		
	}

}
