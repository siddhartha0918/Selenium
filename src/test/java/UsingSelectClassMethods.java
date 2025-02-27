
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingSelectClassMethods {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.amazon.in/");
		
		//identify the dropdown
		WebElement dropdown= driver.findElement(By.id("searchDropdownBox"));
		
		//create an instance of select class
		Select s=new Select(dropdown);
		
		//Select by index
		s.selectByIndex(5);
		
		//select by Value
		s.selectByValue("search-alias=amazon-devices");
		
		//select by Visible text
		s.selectByVisibleText("Amazon Fresh Meat");
		
		//check whether the DD is single/multi select DD
		System.out.println(s.isMultiple());
		
		//Fetch all the elements
		List<WebElement> list= s.getOptions();
		for(WebElement ele:list) {
			System.out.println(ele.getText());
		}
		
		//Fetch all selected options
		List<WebElement> allS= s.getAllSelectedOptions();
		for(WebElement ele2:allS) {
			System.out.println(ele2.getText());
		}
		
		//Fetch first selected option
		System.out.println(s.getFirstSelectedOption().getText());
		
		//deselect the first selected option
		s.deselectByIndex(5);
		
		//deselect by visible text
		s.deselectByVisibleText("Amazon Fresh Meat");
		
		//deselect all
		s.deselectAll();
		}

}