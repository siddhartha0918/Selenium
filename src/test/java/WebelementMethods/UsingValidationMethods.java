package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingValidationMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement search= driver.findElement(By.id("small-searchterms"));
		
		
		//Check whether the element is diaplayed or not
		if(search.isDisplayed()) {
			search.sendKeys("books");
		}
		
		//Check whether the element is enabled or not
		WebElement searchbtn= driver.findElement(By.xpath("//input[@type='submit']"));
		if(searchbtn.isEnabled()) {
			searchbtn.submit();
		}
		
		//Check whether the element is selected or not
		WebElement checkbox=driver.findElement(By.id("As"));
		checkbox.click();
		Thread.sleep(3000);
		if(checkbox.isSelected()) {
			System.out.println("Checkbox selected");
		}
		else {
			System.out.println("Not selected");
		}
		
		Thread.sleep(3000);
		driver.quit();
	}

}
