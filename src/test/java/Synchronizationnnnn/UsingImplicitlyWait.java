package Synchronizationnnnn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingImplicitlyWait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		//Maximize
		driver.manage().window().maximize();
		
		//Using Implicitly Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Navigate to an Application
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.id("email")).sendKeys("Selenium");
		
		driver.findElement(By.name("login")).click();
		
		System.out.println(driver.getTitle());
		driver.quit();
		
		
		

	}

}
