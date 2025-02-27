package testNG;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Using_dependsOnmethod_flag {
	@Test(dependsOnMethods = "register")
	public void login() {
		Reporter.log("Login successfully!",true);
	}
	
	@Test
	public void register() {
		Reporter.log("Registration successful!",true);
		//Assert.fail();
	}
	
	@Test (dependsOnMethods = "login",invocationCount = 3)
	public void create() {
		Reporter.log("post created!",true);
	}
	
	@Test
	public void message() {
		Reporter.log("Thanks, namaste!",true);
	}

}
