package appiumJ4;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;

public class bilibiliTest {
	AndroidDriver<WebElement> driver;
  @Test
  public void contextTest() {
	  
  }
  @BeforeClass
  public void beforeClass() throws MalformedURLException {
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	  capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "192.168.199.101:5555");
	  capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	  capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.1.1");
	  capabilities.setCapability(MobileCapabilityType.APP, "/test/app/bili.apk");
	  
	  capabilities.setCapability("appPackge", "tv.danmaku.bili");
	  capabilities.setCapability("appActivity", "tv.danmaku.bili.MainActivity");
	  driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
  }

  @AfterClass
  public void afterClass() {
	  driver.closeApp();
	  driver.quit();
  }

}
