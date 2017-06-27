package appiumJ4;



import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;


public class bilibiliTest {
	static AppiumDriver<WebElement> driver;
  @Test
  public void contextTest() throws InterruptedException {
	  driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Ö±²¥')]")).click();
	  Thread.sleep(5000);
	  Thread.sleep(5000);
	  Thread.sleep(5000);
	  Thread.sleep(5000);
//	  driver.findElement(By.xpath("//android.support.v4.view.ViewPager/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.widget.ImageView")).click();
	  System.out.println(driver.getContextHandles());
	  driver.context("WEBVIEW_tv.danmaku.bili:web");
	  driver.getCurrentUrl();
	  driver.context("NATIVE_APP");
  }
  @BeforeClass
  public static void beforeClass() throws MalformedURLException {
	  File file = new File("");
	  String path = file.getAbsolutePath();
	  file.getPath();
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	  capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "192.168.199.101:5555");
	  capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	  capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0");
	  capabilities.setCapability(MobileCapabilityType.APP, path+"/app/bili.apk");
//	  capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Selendroid");
	  capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
	  
	  capabilities.setCapability("appPackge", "tv.danmaku.bili");
	  capabilities.setCapability("appActivity", "tv.danmaku.bili.MainActivity");
	  driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
  }

  @AfterClass
  public static void afterClass() {
	  driver.closeApp();
	  driver.quit();
  }

}
