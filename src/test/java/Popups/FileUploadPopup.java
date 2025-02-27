package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//a[text()='File Upload']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\SIDDHARTHA\\OneDrive\\Desktop\\sql.pptx");
		Thread.sleep(3000);
		
		driver.quit();
	}

}
