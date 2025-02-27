package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class UsingEnabledFlag {
	@Test
	public void orange() {
		Reporter.log("O-range love idhe o baby...",true);
	}
	
	@Test(enabled=false)
	public void apple() {
		Reporter.log("Pandu pandu pandu erra pandu... apple dhaani peru",true);
	}
	
	@Test
	public void banana() {
		Reporter.log("Yellow yellow banana... very very sweet banana", true);
	}

}
