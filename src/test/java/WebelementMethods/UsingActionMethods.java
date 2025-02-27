package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingActionMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		
//		//WebElement methods: 1. click()
//		  2. sendKeys()
//		  3. clear()
//		  4. submit()

		
		WebElement search= driver.findElement(By.id("small-searchterms"));
		
		
		search.sendKeys("track pants");
		Thread.sleep(3000);
		search.clear();
		Thread.sleep(2000);
		search.sendKeys("formal shirts");
		//Identify search button
		search.findElement(By.xpath("//input[@type='submit']")).submit();
		
		
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(3000);
		driver.quit();		

	}

}
