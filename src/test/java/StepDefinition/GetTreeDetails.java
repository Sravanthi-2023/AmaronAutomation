package StepDefinition;

import java.io.FileWriter;
//import pro.truongsinh.appium_flutter.FlutterFinder;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.ashwith.flutter.FlutterFinder;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
//import pro.truongsinh.appium_flutter.FlutterFinder;
//import pro.truongsinh.appium_flutter.finder.FlutterElement;

public class GetTreeDetails {
	static String serialno = "EAB3244W000"+RandomStringUtils.randomNumeric(3);
	 static AndroidDriver driver = null;
	public static void wait_element_visible(WebElement elem)
	{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));

	        wait.until(ExpectedConditions.elementToBeClickable(elem));
	}
	
	public static void wait_element_clickable(WebElement elem)
	{
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));

        wait.until(ExpectedConditions.elementToBeClickable(elem));

	}
	public static void main(String[] args) throws MalformedURLException, InterruptedException
	{
		
//		UiAutomator2Options Androidoptions = new UiAutomator2Options();
//		//AndroidDriver driver;
//		Androidoptions = new UiAutomator2Options();
//		Androidoptions.setCapability("automationName", "Flutter");
//		Androidoptions.setCapability("appium:platformVersion", "11");
//		Androidoptions.setCapability("appium:appPackage", "com.arbl.amaron");
//		Androidoptions.setCapability("appium:appActivity", "com.arbl.amaron.MainActivity");
//		Androidoptions.setCapability("unlockType", "pin");
//		Androidoptions.setCapability("unlockKey", "2580");
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setCapability("appium:platformVersion", "11");
	   // capabilities.setCapability("deviceName", "iPhone X");
	   // capabilities.setCapability("noReset", true);
	    capabilities.setCapability("appium:deviceName","Mi A3");
	    capabilities.setCapability("platformName", "Android");
	    capabilities.setCapability("appium:appPackage", "com.arbl.amaron");
	    capabilities.setCapability("appium:appActivity", "com.arbl.amaron.MainActivity");
	    capabilities.setCapability("unlockType", "pin");
	    capabilities.setCapability("unlockKey", "2580");
	 

	    capabilities.setCapability("automationName", "Flutter");
	  //  capabilities.setCapability("automationName", "UiAutomator2");
	   // driver = new IOSDriver<MobileElement>(service.getUrl(), capabilities);

			URL remoteUrl = new URL("http://127.0.0.1:4723");
		  //  AndroidDriver driver = new AndroidDriver(remoteUrl, Androidoptions);
		     driver = new AndroidDriver(remoteUrl, capabilities);
	        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
	        
//	        Thread.sleep(6000);
//	        
//	        System.out.println("Current context " + driver.getContext());
//	        System.out.println("handles " + driver.getContextHandles());
	        
//	        driver.execute('flutter: getRenderTree');
	        
	       // nn = driver.execute('flutter: getRenderTree');
	        
	        driver.context("NATIVE_APP");
//
//	          System.out.println("After native Current context " + driver.getContext());
//
//	          System.out.println("After native handles " + driver.getContextHandles());
//	        System.out.println("page Source is"+ driver.getPageSource());
	     //   wait_element_visible(driver.findElement(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_one_time_button")));
	        Thread.sleep(5000);
	        driver.findElement(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_one_time_button")).click();
	        
//	        driver.context("FLUTTER");
//	        
//	        FlutterFinder finder = new FlutterFinder(driver);
//		    WebElement element = finder.byValueKey("drawerKey");
//		    element.click();
//	        
//	        ////tree///
//		    
//		    driver.context("NATIVE_APP");
	        
	        Thread.sleep(5000);
		    driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView[1]")).click();
		    Thread.sleep(5000);
		    driver.findElement(AppiumBy.accessibilityId("Sign in")).click();
		    Thread.sleep(5000);
	        driver.context("FLUTTER");
	        
//	        FlutterFinder finder = new FlutterFinder(driver);
//		    WebElement element = finder.bySemanticsLabel("Email/Mobile Number");
//		    element.click();
//		    Thread.sleep(5000);
//		    driver.executeScript("flutter:enterText","9876023461");
//		   // element.sendKeys("9591087621");
//		    
//		    Thread.sleep(10000);
//	        System.out.println("login page");
//	        System.out.println("handles " + driver.getContextHandles());
//	        System.out.println("Current context " + driver.getContext());
//	        
	       
	        Thread.sleep(10000);

	        
	        System.out.println("Hitree");
	        String treeString = (String) driver.executeScript("flutter: getRenderTree");
	        System.out.println(treeString);	
	        System.out.println("tree");
	        
	        try{    
	            FileWriter fw=new FileWriter("C:\\Users\\srthota\\Flutter\\testout.txt");    
	            fw.write(treeString);    
	            fw.close();    
	           }catch(Exception e){System.out.println(e);}    
	           System.out.println("Success...");    
	         
	
	
	}
}
