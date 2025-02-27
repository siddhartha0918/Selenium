package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		
		
		driver.get("https://www.ajio.com/");
		Thread.sleep(3000);
		
		WebElement kids= driver.findElement(By.xpath("//span[text()='KIDS']"));
		Actions act=new Actions(driver);
		act.moveToElement(kids).perform();
		Thread.sleep(3000);
		
		WebElement toys= driver.findElement(By.xpath("//strong[text()='Toys']"));
		Actions act2=new Actions(driver);
		act2.moveToElement(toys).click().perform();
		Thread.sleep(3000);
		
//		driver.findElement(By.id("sortBy")).click();
		
//		driver.findElement(By.xpath("//option[@value='newn']")).click();
//		Thread.sleep(3000);
		
		WebElement dropdown=driver.findElement(By.id("sortBy"));
		Select sel=new Select(dropdown);
		sel.selectByIndex(4);
		
		
		
		
		
		//WebElement price= driver.findElement(By.xpath("(//div[@id='0'])[1]/a/div/div[2]/div[4]//span[@class='price  ']"));
		WebElement price=driver.findElement(By.xpath("//*[@id=\"0\"]/a/div/div[2]/div[3]/span"));
		Thread.sleep(3000);
		System.out.println(price.getText());
		
		
		driver.quit();
		

	}

}
