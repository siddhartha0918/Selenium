package Practice;

import java.awt.Dimension;
import java.awt.Point;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetterMethodsFromWebElements {

	public static void main(String[] args) throws InterruptedException {
		//1. getText();    2. getAttribute();     3. getTagName();
		//4. getLocation;  5. getSize();          6. getRect();      7.getCssValue();
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/login/");
		
		WebElement search= driver.findElement(By.id("email"));
		search.sendKeys("Ben 10");
		
		System.out.println(search.getTagName());
		WebElement loginbtn= driver.findElement(By.name("login"));
		System.out.println(loginbtn.getText());
		//search.getAttribute("name");
		
		//Location
		int x= search.getLocation().getX();
		int y=search.getLocation().getY();
		System.out.println(x+" "+y);
		
		//Size
		int h= search.getSize().getHeight();
		int w= search.getSize().getWidth();
		System.out.println(h+" "+w);
		
		//Rect--> Mix up of Locations and size
		//search.getRect().getX();
		
		System.out.println(search.getCssValue("color"));
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
		

	}

}
