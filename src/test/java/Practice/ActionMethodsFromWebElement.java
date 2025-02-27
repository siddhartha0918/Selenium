package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class ActionMethodsFromWebElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Changes done in gitHUB
		//Changes done in eclipse
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.youtube.com/");
		
		WebElement search= driver.findElement(By.name("search_query"));
		//sendKeys
		search.sendKeys("Kun faya kun"+Keys.ENTER);
		Thread.sleep(3000);
		WebElement searchBtn= driver.findElement(RelativeLocator.with(By.xpath("//*[@id=\"center\"]/yt-searchbox/button/yt-icon/span/div")));
		searchBtn.click();
		Thread.sleep(3000);
		search.clear();
		Thread.sleep(3000);
		search.sendKeys("o maahi");
		searchBtn.click();
		
		
		
		Thread.sleep(4000);
		
		driver.quit();

	}

}
