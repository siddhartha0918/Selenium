package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class UsingPriorityFlag {
	//For execution of all the @Tests, by default it takes ASCII value of the method and execute, if priority is not given
	@Test(priority=2)
	public void banana() {
		//System.out.println("Shuru...");
		Reporter.log("Shuru");//For printing the data in Report
		Reporter.log("Shuruuuu",true);//For printing the data in both console and report
	}
	
	@Test(priority=1)
	public void apple() {
		Reporter.log("Already start chesaav ga...",true);
	}
	
	@Test //If priority is not given for any one method, by default it takes 0 as priority
	
	public void orange() {
		Reporter.log("Enni raa...",true);
	}

}
