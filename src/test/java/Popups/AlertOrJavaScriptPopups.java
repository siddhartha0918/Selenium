package Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertOrJavaScriptPopups {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		
//		//Switch the control to the Alert popup
		
//		//1.JS Alert
//		
//		//Click on Alert popup
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		Thread.sleep(3000);
//		
//		//driver.switchTo().alert().accept();
//		
//		Alert al= driver.switchTo().alert();
//		System.out.println(al.getText());
//		al.accept();
//		Thread.sleep(3000);
		
		
//		//2.JS confirm
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		Thread.sleep(3000);
//		
//		driver.switchTo().alert().dismiss();
//		//driver.switchTo().alert().accept();
//		Thread.sleep(3000);
		
		
		//3.JS Prompt
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		
		Alert al= driver.switchTo().alert();
		al.sendKeys("Hello");
		al.accept();
		Thread.sleep(3000);
		
		//Switching control back to webpage
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.id("result")).getText());
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("result")).getText());
		
		driver.quit();
		
		

	}

}
