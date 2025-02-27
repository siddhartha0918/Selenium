package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsUsingActionsClass {

	public static void main(String[] args) throws InterruptedException {

		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/scroll/newTabVertical");
		
		Actions act=new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//input[@type='checkbox']"));
		act.scrollToElement(ele);
		Thread.sleep(3000);
		ele.click();
		Thread.sleep(3000);
		
		WebElement ele2=driver.findElement(By.xpath("//button[text()='Accept Our Policy']"));
		act.scrollToElement(ele2);
		Thread.sleep(3000);
		//act.moveToElement(ele2).click().perform();
		//act.moveToElement(ele2).doubleClick().perform();
		//act.moveToElement(ele2).clickAndHold().perform();
		//act.scrollByAmount(0, 1500).perform();
		act.moveToElement(ele2).contextClick().perform();
		Thread.sleep(3000);
		
		
		
		driver.quit();
		
		
		

	}

}
