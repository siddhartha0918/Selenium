package Popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserOrMultipheWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.name("q")).sendKeys("mobiles"+Keys.ENTER);
		Thread.sleep(3000);
		
		//Fetching Parent Window ID
		String pWid=driver.getWindowHandle();
		System.out.println("Parent window address: "+pWid);//Address of Parent window
		driver.findElement(By.xpath("//div[text()='MOTOROLA g05 (Plum Red, 64 GB)']")).click();
		
		//Fetching All Window IDs
		Set<String> childWids=driver.getWindowHandles();
		System.out.println("Child window address: "+childWids);//Address of Child window
		//Iterating all the Window ids
		
		for(String s:childWids) {
			//Switch the driver control
			driver.switchTo().window(s);
			System.out.println("child class windows: "+s);//Address of child windows
			if(driver.getTitle().contains("MOTOROLA g05 ( 64 GB Storage, 4 GB RAM )")) {
				driver.findElement(By.xpath("//button[text()='Buy Now']")).click();
				Thread.sleep(3000);
			}
		}
		
		driver.switchTo().window(pWid);
		
		driver.quit();
		
	}

}
