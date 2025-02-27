package Popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingNewWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		
		//Create a new empty window
		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(3000);
		
		//Create a new empty tab
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(3000);
		
		driver.quit();

	}

}
