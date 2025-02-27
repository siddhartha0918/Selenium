package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionOrCalenderPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		
		//From
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Hyder");
		driver.findElement(By.xpath("//span[text()='Hyderabad']")).click();
		
		//To
		driver.findElement(By.xpath("//span[text()='To']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Kolka");
		driver.findElement(By.xpath("//span[text()='Kolkata']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[3]/div[7]/div")).click();
		Thread.sleep(3000);
		
		
		driver.quit();
		
		
		

	}

}
