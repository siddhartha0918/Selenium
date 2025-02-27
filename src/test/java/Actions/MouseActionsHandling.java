package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		
		//identify search textfield
		//driver.findElement(By.name("q")).sendKeys("cameras"+Keys.ENTER);
		
		//Scroll the webpage based on co ordinates
		Actions act=new Actions(driver);
		act.scrollByAmount(100, 6000).perform();
		
		//Scroll the webelement based on WebElement
		WebElement ele=driver.findElement(By.xpath("//a[text()='Canon Camera']"));
		act.scrollToElement(ele).moveToElement(ele).click().build().perform();
		
		
		
		
		Thread.sleep(3000);
		
		//driver.quit();
	}

}
