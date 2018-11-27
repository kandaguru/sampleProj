package appium.test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.functions.ExpectedCondition;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.*;
import static java.time.Duration.ofSeconds;

public class AppiumTest {

	@SuppressWarnings("deprecation")
	public static void main(String args[]) throws MalformedURLException, InterruptedException {

		AndroidDriver<AndroidElement> driver;

		// TODO Auto-generated method stub
		// File appDir = new
		// File("C:\\Users\\kbas663\\eclipse-workspace\\Appium\\src\\main\\java\\ApiDemos-debug.apk");

		// System.out.println(appDir.getAbsolutePath());

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		capabilities.setCapability("appPackage", "io.appium.android.apis");
		capabilities.setCapability("appActivity", "io.appium.android.apis.ApiDemos");

		
		//capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");  //Mobile Browser apps
		
		
		// capabilities.setCapability(MobileCapabilityType.APP,
		// appDir.getAbsolutePath());

		driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement clickbtn1 = driver.findElementByXPath("//android.widget.TextView[@text='Views']");

		TouchAction t = new TouchAction(driver);
		t.tap(tapOptions().withElement(element(clickbtn1))).perform();
//
		WebElement clickbtn2 = driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']");
		t.tap(tapOptions().withElement(element(clickbtn2))).perform();

		WebElement clickbtn3 = driver.findElementByXPath("//android.widget.TextView[@text='2. Inline']");
		t.tap(tapOptions().withElement(element(clickbtn3))).perform();

		WebElement clk1 = driver.findElementByXPath("//*[@content-desc='9']");
		t.tap(tapOptions().withElement(element(clk1))).perform();
		WebElement clk = driver.findElementByXPath("//*[@content-desc='40']");
		t.longPress(longPressOptions().withElement(element(clk1)).withDuration(ofSeconds(2))).moveTo(element(clk))
				.release().perform();

		driver.navigate().back();
		driver.navigate().back();
//		

		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"Drag and Drop\"));").click();

		System.out.println(driver.findElementsByClassName("android.view.View").size());

		WebElement source = driver.findElementsByClassName("android.view.View").get(0);
		WebElement tar = driver.findElementsByClassName("android.view.View").get(2);

		t.longPress(longPressOptions().withElement(element(source)).withDuration(ofSeconds(2))).moveTo(element(tar))
				.release().perform();

		System.out.println(driver.currentActivity());
		System.out.println(driver.getContext());
		System.out.println(driver.isDeviceLocked());
		System.out.println(driver.getOrientation());

		driver.navigate().back();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));")
				.click();
		
		
		WebElement element=driver.findElementByXPath("//*[@text='Hello World! - 1']");
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.visibilityOf(element));
		
		driver.closeApp();

		// driver.hideKeyboard();

	}

}
