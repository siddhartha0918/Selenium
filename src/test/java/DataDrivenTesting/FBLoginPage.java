package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLoginPage {

	public static void main(String[] args) throws IOException, InterruptedException {

		
		FileInputStream fis=new FileInputStream("./src/test/resources/FBdata.properties");
		Properties p=new Properties();
		p.load(fis);
		String FBurl=p.getProperty("url");
		String username=p.getProperty("un");
		String password=p.getProperty("pw");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(FBurl);
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
		//String TIME=
		//Typecasting
		//long time=Long.parseLong(TIME)
	}

}
