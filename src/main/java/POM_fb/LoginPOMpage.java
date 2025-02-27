package POM_fb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMpage {
	
	//1. Declaration
	
	@FindBy(id = "email")
	private WebElement username;
	
	@FindBy(name = "pass")
	private WebElement password;
	
	@FindBy(name = "login")
	private WebElement login;

	
	//2. Initialization
	public LoginPOMpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	//3. Utilization
	public WebElement getUsername() {
		return username;
	}


	public void getPassword(String pass) {
		password.sendKeys(pass);
	}


	public void getLogin() {
		login.click();
	}
	
	
	
	

}
