/*package com.ebafniMobilegrid.mobileGrid;

public class MobileGrid {

}*/



package com.ebafniMobilegrid.mobileGrid;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MobileGrid {
	DesiredCapabilities capabilities = new DesiredCapabilities();
	AppiumDriver driver;
	String URL;

	@Parameters("Device_ID")
	@BeforeTest
	public void setupCapabilities(String Device_ID) throws Exception {

		if (Device_ID.equalsIgnoreCase("599436ae")) {
			setcapabilities("io.selendroid.testapp", "io.selendroid.testapp.HomeScreenActivity",Device_ID);
		}

		if (Device_ID.equalsIgnoreCase("0870de4f")) {
			setcapabilities("io.selendroid.testapp", "io.selendroid.testapp.HomeScreenActivity",Device_ID);
			
			
		}
		URL = "http://127.0.0.1:4444/wd/hub";
		driver = new AndroidDriver(new URL(URL), capabilities);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	}

	public void setcapabilities(String apppackage, String appActivity,String device) {
		capabilities.setCapability("deviceName", device);
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("platformName", "ANDROID");
		capabilities.setCapability("androidPackage", apppackage);
		capabilities.setCapability("appActivity", appActivity);
		capabilities.setCapability("udid", device);
	}

	@Test
	public void selendroidAppTest() throws Exception {
		System.out.println("executing test 1");
		driver.findElement(By.id("io.selendroid.testapp:id/my_text_field")).sendKeys("Hi Appium");
		Thread.sleep(1000);
		
	}
	@Test
	public void selendroidAppTest_1() throws Exception{

		System.out.println("executing test 2");
		driver.findElement(By.id("io.selendroid.testapp:id/my_text_field")).sendKeys("Hi Appium");
		Thread.sleep(1000);
		
	}

	

}
