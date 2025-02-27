package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/login/");
//		
//		WebElement login= driver.findElement(By.name("pass"));
//		login.sendKeys("12345678");
//		Thread.sleep(3000);
//		driver.findElement(RelativeLocator.with(By.name("email")).above(login)).sendKeys("selenium");
//		Thread.sleep(3000);
//		driver.findElement(RelativeLocator.with(By.name("login")).below(login)).click();
		WebElement signin= driver.findElement(By.xpath("//a[text()='Sign up for Facebook']"));
		
		//driver.findElement(RelativeLocator.with(By.xpath("//a[text()='Forgotten account?']")).toLeftOf(signin)).click();
		//driver.findElement(RelativeLocator.with(By.tagName("a")).toLeftOf(signin)).click();
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(signin)).sendKeys("123456789");
		driver.findElement(RelativeLocator.with(By.tagName("button")).near(signin)).click();
		Thread.sleep(3000);
		
		driver.quit();
		
		

	}

}
