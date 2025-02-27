package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class UsingInvocationCountFlag {
	@Test(priority=2, invocationCount = 3)
	//InvocationCount--> No.of times the method should execute
	public void apple() {
		Reporter.log("Already start chesaav ga...",true);
	}
	
	@Test (priority=1)
	public void orange() {
		Reporter.log("Enni raa...",true);
	}

}
