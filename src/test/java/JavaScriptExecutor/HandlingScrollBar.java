package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBar {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.ajio.com/");
		
		Thread.sleep(3000);
		
		//TypeCasting
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		//Scrolling the Webpage using hardcoded coordinates
		js.executeScript("window.scrollBy(100,2000)");
		
		//Scrolling the Webpage using element reference
		WebElement ele= driver.findElement(By.xpath("//strong[text()='EASY EXCHANGE']"));
		js.executeScript("arguments[0].scrollIntoView(true)",ele);
		
		Thread.sleep(3000);
		
		//Scroll webpage using Element coordinates
		//For getting individual co ordinates, datatype will be int. if both the co ordinates, method will be getPosition(), datatype will be Point
		int x=ele.getLocation().getX();
		int y=ele.getLocation().getY();
		js.executeScript("window.scrollBy("+x+","+y+")");
		System.out.println(x+","+y);
		Thread.sleep(3000);
		
		
		//Scroll till the bottom of the Webpage
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		
		//Scroll till the top of the window
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		Thread.sleep(3000);
		
		
		
		
		driver.quit();

	}

}
