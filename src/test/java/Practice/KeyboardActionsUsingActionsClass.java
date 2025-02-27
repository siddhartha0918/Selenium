package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionsUsingActionsClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.zomato.com/");
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search for restaurant, cuisine or a dish']"));
		
		//Actions act=new Actions(driver);
		search.sendKeys("Biryani");
		//keyUp(),keyDown()  ?? --> Ask Mam!
		
		Thread.sleep(3000);
		driver.quit();

	}

}
