package appiumJ4;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class locatorTest {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<WebElement> driver;
		File file = new File("");
		String path = file.getAbsolutePath();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.0");
		capabilities.setCapability(MobileCapabilityType.APP, path+"/app/bili.apk");
		
		capabilities.setCapability(MobileCapabilityType.AUTO_WEBVIEW,true);
		capabilities.setCapability("appPackage", "tv.danmaku.bili");
		capabilities.setCapability("appActivity", "tv.danmaku.bili.MainActivity");
		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		driver.close();
	}

}
