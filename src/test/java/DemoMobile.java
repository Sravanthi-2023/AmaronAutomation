import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.touch.offset.PointOption;
import jdk.internal.org.jline.utils.Log;

public class DemoMobile {
 
	static String serialno = "FEG6244W300"+RandomStringUtils.randomNumeric(3);
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		UiAutomator2Options options = new UiAutomator2Options();
//		options.setPlatformName("Android");
////		options.setCapability("automationName", "UiAutomator2");
//		options.setCapability("platformVersion", "11");
//		options.setCapability("appPackage", "com.arbl.amaron");
//		options.setCapability("appium:appActivity", "com.arbl.amaron");
		
		options.setCapability("appium:platformVersion", "11");
	//	options.setCapability("platformName", "Android");

		options.setCapability("appium:appPackage", "com.arbl.amaron");
		options.setCapability("appium:appActivity", "com.arbl.amaron.MainActivity");

		URL remoteUrl = new URL("http://127.0.0.1:4723");

	    AndroidDriver driver = new AndroidDriver(remoteUrl, options);
	    
	    Thread.sleep(10000);
	    
	    
	    driver.findElement(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_one_time_button")).click();
	    driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView[1]")).click();
	    driver.findElement(AppiumBy.accessibilityId("Sign in")).click();
	    //ppp)
	    Thread.sleep(10000);
	    driver.findElement(AppiumBy.xpath("//android.widget.EditText")).click();
	    driver.findElement(AppiumBy.xpath("//android.widget.EditText")).sendKeys("9591074112");
	    
	    driver.findElement(AppiumBy.accessibilityId("Sign In")).click();
	    Thread.sleep(7000);
	    
	    //driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[7]/android.widget.EditText")).sendKeys("123456");
	    driver.findElement(AppiumBy.className("android.widget.EditText")).click();
	    driver.findElement(AppiumBy.className("android.widget.EditText")).sendKeys("123456");
	    
	    driver.findElement(AppiumBy.accessibilityId("Submit")).click();
	    Thread.sleep(3000);
	    driver.findElement(AppiumBy.accessibilityId("Warranty\n"
	    		+ "Tab 2 of 5")).click();
	    driver.findElement(AppiumBy.accessibilityId("Battery")).click();
	    driver.findElement(AppiumBy.accessibilityId("Automotive")).click();
	    driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]")).click();
	    driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]")).sendKeys(serialno);

	    driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[3]")).click();
	    driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[3]")).sendKeys("AP05EX0347");

	    driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[4]")).click();
	    driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[4]")).sendKeys("9591074112");

	  //  driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]")).click();
	 //   driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]")).sendKeys("FORD");

	    Thread.sleep(2000);
	    
	    driver.findElement(AppiumBy.xpath("//android.widget.EditText[6]")).click();
	    driver.findElement(AppiumBy.xpath("//android.widget.EditText[6]")).sendKeys("FORD");
	    Thread.sleep(2000);
	    driver.hideKeyboard(); 
	    
	    driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"FORD\"]/preceding-sibling::android.widget.ImageView")).click();
	    
	  //  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[2]/android.widget.ImageView")).click();
	    
	    Thread.sleep(2000);
	    driver.findElement(AppiumBy.accessibilityId("Select Segment")).click();
	    Thread.sleep(4000);
	    driver.findElement(AppiumBy.accessibilityId("CAR")).click();
	    
	    driver.findElement(AppiumBy.accessibilityId("Select Model")).click();
	    Thread.sleep(4000);
	    driver.findElement(AppiumBy.accessibilityId("Figo")).click();
	    
	    driver.findElement(AppiumBy.accessibilityId("Select Fuel Type")).click();
	    Thread.sleep(4000);
	    driver.findElement(AppiumBy.accessibilityId("Petrol")).click();
	    
	    driver.findElement(AppiumBy.className("android.widget.CheckBox")).click();
	    
//	    ((Obdriver).findElementByAndroidUIAutomator("new UiScrollable(new    UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Register\").instance(0))").click();
	    
	    driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().descriptionContains(\"Register\").instance(0))"));
	    
	    WebElement reg = driver.findElement(AppiumBy.accessibilityId("Register"));
	    
	    driver.findElement(AppiumBy.accessibilityId("Register")).click();
	    
	    Thread.sleep(6000);
	    
	    driver.findElement(AppiumBy.className("android.widget.EditText")).click();
	    driver.findElement(AppiumBy.className("android.widget.EditText")).sendKeys("123456");
	    
	    driver.findElement(AppiumBy.className("android.widget.EditText")).click();
	    
	    Thread.sleep(4000);
	    
	    driver.findElement(AppiumBy.accessibilityId("Verify")).click(); 
	    
	    Thread.sleep(4000);
	    driver.findElement(AppiumBy.accessibilityId("Registration Successful")).click();
	    
	    String actualtext = driver.findElement(AppiumBy.accessibilityId("Registration Successful")).getText();
	   String expText = "Registration Successful";
	    if(actualtext.equalsIgnoreCase(expText))
	    {
	    	System.out.println("Registration is successful");
	    	//Log.info("Registration is successful");
	    }
	    else
	    {	System.out.println("Registration is not successful");
	  //  Log.info("Registration is not successful");
	    }
	    
	    WebElement text =driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Your purchase of AMARON Battery(ies) registered against Mobile/Email\")"));
	    
	    String actRegmessage = text.getText();
	    System.out.println(actRegmessage);
	    String expRegMessage = "Your purchase of AMARON Battery(ies) registered against Mobile/Email";
	    
	    if(actRegmessage.equalsIgnoreCase(expRegMessage))
	    {
	    	System.out.println("Registration of Amaron batteries with mobile num is successful");
	    	//Log.info("Registration of Amaron batteries with mobile num is successful");
	    }
	    else
	    {	System.out.println("Registration of Amaron batteries with mobile num is successful");
	  //  Log.info("Registration of Amaron batteries with mobile num is not successful");
	    }
	}

}
