package HandlingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapdealLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.snapdeal.com/");
		
		//driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		
		//Get into Login link by MouseHowering
		WebElement signin=driver.findElement(By.xpath("//span[text()='Sign In']"));
		Actions act=new Actions(driver);
		act.moveToElement(signin).perform();
		
		driver.findElement(By.xpath("//a[text()='login']")).click();
		
		
//		//Switch to frame based on index
//		driver.switchTo().frame(0);
		
		//Switch to frame based on Frame Element
		WebElement frameEle=driver.findElement(By.name("iframeLogin"));
		driver.switchTo().frame(frameEle);
		
		Thread.sleep(3000);
		
		
		//Close the login page by reference to svg tag
		driver.findElement(By.id("close-pop")).click();
		
		//Switching back the control to parent
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("keyword")).sendKeys("Cameras"+Keys.ENTER);
		
		Thread.sleep(3000);
		
		
		driver.quit();
		

	}

}
