package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassOrDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		//Single select
		//driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		
		//Multi Select
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		
		WebElement dd= driver.findElement(By.id("select-multiple-native"));
//		dd.click();
		
		Select sel=new Select(dd);
		//-----------Select Methods-----------
		//sel.selectByIndex(2);
		//sel.selectByContainsVisibleText("+91");
		//sel.selectByValue(+91");
		//sel.selectByVisibleText("Option 1");
		//List<WebElement> opts = sel.getAllSelectedOptions();
		//System.out.println(opts);
		//WebElement opt2= sel.getFirstSelectedOption();
		//System.out.println(opt2);
		//List<WebElement> allOpts = sel.getOptions();
		//System.out.println(allOpts);
		boolean b = sel.isMultiple();
		System.out.println(b);
		
		//------------Deselect methods------------
		//sel.deselectAll();
		//sel.deselectByValue("2");
		//sel.deselectByIndex(1);
		//sel.deselectByVisibleText("+91");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(3000);
		
		driver.quit();
		
		

	}

}
