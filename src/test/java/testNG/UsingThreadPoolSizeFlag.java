package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class UsingThreadPoolSizeFlag {
	@Test(threadPoolSize = 2,invocationCount = 3)
	public void cow() {
		Reporter.log("Ambaaaaww",true);
	}
	
	@Test(threadPoolSize = 3,invocationCount = 2)
	public void dog() {
		Reporter.log("Bow bow",true);
	}
	
	@Test(threadPoolSize = 2,invocationCount = 8)
	public void cat() {
		Reporter.log("Meoww", true);
	}
}
