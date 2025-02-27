package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronizationnn {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//1. Implicit Wait	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://www.flipkart.com/");
		WebElement element= driver.findElement(By.name("q"));
		element.click();
		//element.sendKeys("cameras"+Keys.ENTER);
		
		//2. ExplicitWait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.titleContains("Cameras- Buy Products Online at Best Price in India - All Categories | Flipkart.com"));
		wait.until(ExpectedConditions.visibilityOf(element));
		//wait.until(ExpectedConditions.elementToBeClickable(element));
		
		element.sendKeys("cameras"+Keys.ENTER);
		
		//3. FluentWait
//		FluentWait<WebDriver> fwait=new FluentWait<WebDriver>(driver);
//		wait.withTimeout(Duration.ofSeconds(10));
//		wait.pollingEvery(Duration.ofSeconds(1));
//		wait.ignoring(Exception.class);
//		
		
		
		
		driver.findElement(By.name("q")).sendKeys("cameras"+Keys.ENTER);
		
		System.out.println(driver.getTitle());
		
		
		driver.quit();
		

	}

}
