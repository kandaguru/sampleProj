package appium.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class MobileChrome {

	public static void main(String args[]) throws MalformedURLException {

		AndroidDriver<AndroidElement> driver;
		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");

//		capabilities.setCapability("appPackage", "io.appium.android.apis");
//		capabilities.setCapability("appActivity", "io.appium.android.apis.ApiDemos");

		driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://cricbuzz.com");

		driver.findElementByXPath("//a[@href='#menu']").click();
		
		
		
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//
//		WebElement recentResults = driver.findElementByXPath("//*[text()='More Fixtures']");
//
//		jse.executeScript("arguments[0].scrollIntoView(true);", recentResults);
		
//		recentResults.click();

	}

}
