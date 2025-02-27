package POM_qsp;

import java.awt.print.PageFormat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_QspLogin {
	//1--> Declaration
	@FindBy(id = "name")
	private WebElement myname;
	
	@FindBy(id = "email")
	private WebElement emailid;
	
	@FindBy(name = "password")
	private WebElement pwd;
	
	
	//2--> Initialization
	public POM_QspLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	

}
