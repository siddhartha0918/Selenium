package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigating and giving inputs directly in the URL itself
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(3000);
		driver.quit();
		
		
		

	}

}
