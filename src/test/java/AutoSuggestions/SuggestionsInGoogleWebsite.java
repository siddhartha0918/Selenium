package AutoSuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuggestionsInGoogleWebsite {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		
		Thread.sleep(3000);
		
		//identify search TF
		driver.findElement(By.name("q")).sendKeys("Anir");
		Thread.sleep(3000);
		
		//Click on any of the auto suggestions
		List<WebElement> autoSugg= driver.findElements(By.xpath("//span[contains(text(),'anir')]"));
		
		
		//driver.findElement(By.xpath("(//span[contains(text(),'anir')])[4]")).click();
		
		
		for(WebElement ele:autoSugg) {
			System.out.println(ele.getText());
		}
		
		
		
		driver.quit();
	}

}
