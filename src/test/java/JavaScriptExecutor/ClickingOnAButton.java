package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickingOnAButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/login/");
		
		WebElement button= driver.findElement(By.id("loginbutton"));
		
		//click on Login button by using JSE
		//Typecasting
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",button);
		
		Thread.sleep(3000);

	}

}
