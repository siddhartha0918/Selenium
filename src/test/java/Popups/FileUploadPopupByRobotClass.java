package Popups;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopupByRobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Copy the File location
		StringSelection s = new StringSelection("C:\\Users\\SIDDHARTHA\\OneDrive\\Desktop\\FM jammer.pptx");

		// Store the copied Text in the ClipBoard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		
		//Navigate to the webpage
		driver.get("https://the-internet.herokuapp.com/upload");
		
		//Click on the fileupload button by using Actions class
		WebElement uploadFile= driver.findElement(By.id("file-upload"));
		Actions act=new Actions(driver);
		
		act.moveToElement(uploadFile).click(uploadFile).build().perform();
		Thread.sleep(5000);

		
		//Create an object for the Robot class
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
