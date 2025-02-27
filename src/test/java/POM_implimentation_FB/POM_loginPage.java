package POM_implimentation_FB;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_fb.LoginPOMpage;

public class POM_loginPage {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Fetch data from Properties file using DDT
		//1. Convert properties file in java object
		FileInputStream fis=new FileInputStream("./src/test/resources/FBdata.properties");
		
		//2. Create object for Properties
		Properties p=new Properties();
		
		//3. Load data to the object
		p.load(fis);
		
		//4. Fetch the data from File
		String url=p.getProperty("url");
		String uname=p.getProperty("un");
		String pwd=p.getProperty("pw");
		
		LoginPOMpage lp=new LoginPOMpage(driver);
		
		driver.get(url);
		
		lp.getUsername().sendKeys(uname);
		lp.getPassword(pwd);
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		lp.getUsername().sendKeys(uname);
		lp.getPassword(pwd);
		lp.getLogin();
		
		Thread.sleep(3000);
		
//		//StaleElementReferenceException--> comes when we are trying to find the element with the old address
//		WebElement user=driver.findElement(By.id("email"));
//		user.sendKeys("sele");
//		Thread.sleep(3000);
//		driver.navigate().refresh();
//		Thread.sleep(3000);
//		user.sendKeys("njnsj");
		
		
		driver.quit();
		

	}

}
