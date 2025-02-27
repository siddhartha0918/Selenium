package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerificationMethodsFromWebElemnt {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/login/");
		
		WebElement log= driver.findElement(By.name("login"));
		System.out.println(log.isEnabled());
		System.out.println(log.isSelected());
		System.out.println(log.isDisplayed());
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
