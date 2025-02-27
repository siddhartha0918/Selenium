package HandlingFrames;

import java.time.Duration;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.zomato.com/");
		
		Thread.sleep(3000);
		
		//Click on login link
		driver.findElement(By.linkText("Log in")).click();
		
		//Switch to driver control to the frame by using id or name
		driver.switchTo().frame("auth-login-ui");
		
		//Enter Mobile number
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("9876546211");
		
		Thread.sleep(3000);
		//Close the login page by reference to svg tag
		driver.findElement(By.xpath("//*[name()='svg'][@width='24']")).click();
		
		//Switch the driver control to the main webpage
		driver.switchTo().defaultContent();
		
		//Enter text in search field
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("Mutton Biryani");
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
		

	}

}
