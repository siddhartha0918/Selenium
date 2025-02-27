package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToAnAppn {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate to an Application
		//Typecasting
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.location=arguments[0]","https://www.facebook.com/login/");
		Thread.sleep(3000);
		
		
		//Fetching the title of the webpage
		System.out.println("Title: "+js.executeScript("return document.title"));
		
		//Fetching the URL of the webpage
		System.out.println("URL: "+js.executeScript("return document.URL"));
		
		//refresh the webpage
		js.executeScript("history.go(0)");
		Thread.sleep(3000);
		
		driver.quit();

	}

}
