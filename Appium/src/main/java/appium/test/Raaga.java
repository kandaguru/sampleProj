package appium.test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.*;
import static java.time.Duration.ofSeconds;

public class Raaga {

	public static void main(String args[]) throws MalformedURLException, InterruptedException {

		AndroidDriver<AndroidElement> driver;

		// TODO Auto-generated method stub
		File appDir = new File("C:\\Users\\kbas663\\eclipse-workspace\\Appium\\src\\main\\java\\Raaga.apk");

		System.out.println(appDir.getAbsolutePath());
		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		capabilities.setCapability(MobileCapabilityType.APP, appDir.getAbsolutePath());

		driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		driver.manage().timeouts().implicitlyWait(130, TimeUnit.SECONDS);

		TouchAction t = new TouchAction(driver);

		WebElement skip = driver.findElementByAndroidUIAutomator("text(\"SKIP\")");

		t.tap(tapOptions().withElement(element(skip))).perform();

		WebElement skipdialog = driver.findElementByXPath("//*[@text='SKIP']");

		t.tap(tapOptions().withElement(element(skipdialog))).perform();

	}
}
