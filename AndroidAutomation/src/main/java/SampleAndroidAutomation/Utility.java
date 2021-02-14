package SampleAndroidAutomation;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Utility extends Base{

	public static void initDriver() {
		
		try {

			// Ran on Appium Version 1.18.0
			DesiredCapabilities caps = new DesiredCapabilities();

			caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");

			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "OnePlus 7T");
			caps.setCapability(MobileCapabilityType.UDID, "89f2814f");
			caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);

			caps.setCapability("appPackage", "com.oneplus.calculator");
			caps.setCapability("appActivity", "com.oneplus.calculator.Calculator");
			
			URL url = new URL("http://0.0.0.0:4723/wd/hub");

			driver = new AndroidDriver<MobileElement>(url, caps);
			
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		} catch (Exception e) {
			System.out.println("Cause is: " + e.getCause());
			System.out.println("Message is: " + e.getMessage());
			e.printStackTrace();
		}
	}

	public static void quitDriver() {
		
		try {
			
			Thread.sleep(4000);
			driver.quit();
			
		} catch (Exception e) {
			
			System.out.println("Causen is: "+e.getCause());
			System.out.println("Message is: "+e.getMessage());
			e.printStackTrace();
		}
	}
	
}
