package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassOrDropdown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stubb
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/dropdown");
		WebElement dropdown= driver.findElement(By.id("dropdown"));
		Thread.sleep(3000);
		Select opt=new Select(dropdown);
		opt.selectByIndex(2);
		opt.selectByContainsVisibleText("Option 1");
		Thread.sleep(3000);
		List<WebElement> optionss = opt.getOptions();
		for (WebElement webElement : optionss) {
			System.out.println(webElement.getText());
		}
		//opt.deselectByVisibleText("Option 1");
		System.out.println(opt.isMultiple());
//		System.out.println(opt.getOptions());
//		List<WebElement> options= opt.getOptions();
//		System.out.println(options);
//		//System.out.println(opt.getOptions()); 
		
		driver.quit();

	}

}
