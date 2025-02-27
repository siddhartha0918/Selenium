package Practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshotssss {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/login/");
		
		WebElement login= driver.findElement(By.name("login"));
		
		TakesScreenshot ts= (TakesScreenshot) login;
		File sc= ts.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("./Screenshots/FBloginbutton.png");
		FileUtils.copyFile(sc, dest);
		
		driver.quit();

	}

}
