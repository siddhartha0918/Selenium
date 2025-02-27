package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupExecution {
	//We can execute in group for different methods in different classes at a time by giving same group name in different classes
	
	@Test(groups = "fruit")
	public void banana() {
		Reporter.log("Aratipandu",true);
	}
	
	@Test(groups = "vegetable")
	public void potato() {
		Reporter.log("Bangaaladumpa",true);
	}
	
	@Test(groups = "flower")
	public void lilly() {
		Reporter.log("Mallepuvvu",true);
	}
	
	@Test(groups = "vegetable")
	public void brinjal() {
		Reporter.log("Vankay",true);
	}
	
	@Test(groups = "flower")
	public void rose() {
		Reporter.log("gulabi",true);
	}
	
	
	@Test(groups = "fruit")
	public void apple() {
		Reporter.log("Appliskaay",true);
	}
	
	@Test(groups = "fruit")
	public void orange() {
		Reporter.log("kamalapandu",true);
	}
	
	@Test(groups = "vegetable")
	public void ladyfinger() {
		Reporter.log("bendakaay",true);
	}

}
