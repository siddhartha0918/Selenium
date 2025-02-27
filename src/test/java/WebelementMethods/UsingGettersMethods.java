package WebelementMethods;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingGettersMethods {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement register=driver.findElement(By.linkText("Register"));
		
		//Fetch Text
		System.out.println(register.getText());
		
		//Fetch Attribute
		System.out.println(register.getAttribute("class"));
		
		//Fetch tagname
		System.out.println(register.getTagName());
		
		//Fetch Size
		System.out.println(register.getSize());
		
		//Fetch Location
		System.out.println(register.getLocation());
		
		//Fetch Rect
		System.out.println(register.getRect()); //Location and size
		
		//get CSS value
		System.out.println(register.getCssValue("color"));//present in styles window
		
		driver.quit();
		
		
		
		

	}

}
