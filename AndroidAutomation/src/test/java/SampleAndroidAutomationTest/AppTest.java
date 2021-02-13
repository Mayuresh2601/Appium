package SampleAndroidAutomationTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import SampleAndroidAutomation.Base;

public class AppTest extends Base{

	@SuppressWarnings("static-access")
	@BeforeMethod
	public void beginTest() {
		
		utility.initDriver();
	}
	
	@Test
	public void sampleTest() {
		
		System.out.println("Inside Testing App....");
	}
	
	@SuppressWarnings("static-access")
	@AfterMethod
	public void endTest() {
		
		utility.quitDriver();
	}
}