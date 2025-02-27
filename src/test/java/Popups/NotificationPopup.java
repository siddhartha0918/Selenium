package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {

	public static void main(String[] args) throws InterruptedException {
		
		//Example1--> qspiders
//		//Disable notifications
//		ChromeOptions opt=new ChromeOptions();
//		opt.addArguments("--disable-notifications");
//		
//		WebDriver driver=new ChromeDriver(opt);
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
//		
//		driver.findElement(By.id("browNotButton")).click();
		
		
		//Example2-->irctc
		//Disable notofications   "--disable-notifications"
		
//		ChromeOptions opt=new ChromeOptions();
//		opt.addArguments("--disable-notifications");
//		
//		WebDriver driver=new ChromeDriver(opt);
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://www.irctc.co.in/nget/train-search");
	

		
		
		//Example3--> Location   "--disable-location"
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-geolocation");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/geolocation");
		driver.findElement(By.xpath("//button[text()='Where am I?']")).click();
		
		
		Thread.sleep(3000);
		driver.quit();

	}

}
