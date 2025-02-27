package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDisabledElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoapp.skillrary.com/");
		
		//Handling disabled element
		WebElement disabledEle= driver.findElement(By.xpath("(//input[@type='text'] )[2]"));
		
		//Typecasting
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value=arguments[1]",disabledEle,"Selenium");
		Thread.sleep(3000);
		
		
		
		//handling Enabled element by entering text
		//scrolling to the web element
		WebElement ele= driver.findElement(By.xpath("//input[@placeholder='Enter your mail']"));
		js.executeScript("arguments[0].scrollIntoView(true)",ele);
		Thread.sleep(3000);
		WebElement enabledEle=driver.findElement(By.xpath("//input[@placeholder='Enter your mail']"));
		js.executeScript("arguments[0].value=arguments[1]",enabledEle,"siddharthamandapati@gmail.com");
		Thread.sleep(3000);
		
		//Handling disabled element
		//Syntax:
		//js.executeScript("arguments[0].checked=true",login);
		
		
		
		driver.quit();
				
	}

}
