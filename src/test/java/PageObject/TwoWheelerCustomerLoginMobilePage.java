package PageObject;

import java.time.Duration;
import java.util.List;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefinition.BaseClass;
import Utitlities.ReadConfig;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.SupportsContextSwitching;
import io.github.ashwith.flutter.FlutterFinder;

public class TwoWheelerCustomerLoginMobilePage {
	
	AndroidDriver ldriver;
	WebElement allow;
	WebElement Imageview;
	WebElement Signin;
	WebElement mobileno;
	WebElement Otp;
	WebElement submit;
	WebElement warranty;
	WebElement serialNum;
	WebElement battery;
	WebElement automotive;
	WebElement twoWheeler;
	WebElement vehicleNum;
	WebElement customermobile;
	WebElement selectmake;
	WebElement sellercode;
	WebElement Ford;
	WebElement Hero;
	WebElement Maestro;
	WebElement Scooters;
	WebElement car;
	WebElement selectsegment;
	WebElement selectModel;
	WebElement Figo;
	WebElement selectFuel;
	WebElement Pertol;
	WebElement clickCheckbox;
	WebElement clickRegbutton;
	WebElement enterOtp;
	WebElement reg;
	WebElement text;
	WebElement verify;
	
	static String serialno = "EAB3244W000"+RandomStringUtils.randomNumeric(3);
	 FlutterFinder finder = new FlutterFinder(ldriver);
	public TwoWheelerCustomerLoginMobilePage(AndroidDriver driver)
	{
		ldriver=driver;
		finder = new FlutterFinder(ldriver);
		PageFactory.initElements(driver, this);
				
	}
	
		
    public void clickAllow() throws InterruptedException
    {
    	//Thread.sleep(6000);
    	allow= ldriver.findElement(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_one_time_button"));
    	allow.click();

    	Thread.sleep(5000);
	    Imageview= ldriver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView[1]"));
    	Imageview.click();

    	
	    Signin =ldriver.findElement(AppiumBy.accessibilityId("Sign in"));
	    
    	Signin.click();
    }
    
    public void enterMobileNumberforTwoWheeler() throws InterruptedException
    {
    	mobileno=ldriver.findElement(AppiumBy.xpath("//android.widget.EditText"));
    	mobileno.click();
//    	mobileno.sendKeys("9591074114");
    	
    	ReadConfig readConfig = new ReadConfig();

		
    	mobileno.sendKeys(readConfig.getPhoneNumber());
	    
    	Signin=ldriver.findElement(AppiumBy.accessibilityId("Sign In"));
    	Signin.click();
	    //Thread.sleep(7000);
    }
    
    public void enterOtpForTwoWheeler() throws InterruptedException
    {
    	 Otp=  ldriver.findElement(AppiumBy.className("android.widget.EditText"));
 	    Otp.click();
 	    Otp.sendKeys("123456");
 	    
 	    submit=ldriver.findElement(AppiumBy.accessibilityId("Submit"));
 	    submit.click();
 	    //Thread.sleep(3000);
 	    warranty = ldriver.findElement(AppiumBy.accessibilityId("Warranty\n"
 	    		+ "Tab 2 of 5"));
 	    warranty.click();
    }
    
    public void enterMobileandOtp() throws InterruptedException
    {
    	mobileno=ldriver.findElement(AppiumBy.xpath("//android.widget.EditText"));
    	mobileno.click();
//    	mobileno.sendKeys("9591074112");
    	
    	ReadConfig readConfig = new ReadConfig();

		
    	mobileno.sendKeys(readConfig.getPhoneNumber());
    	
    	
	    
    	Signin=ldriver.findElement(AppiumBy.accessibilityId("Sign In"));
    	Signin.click();
	    //Thread.sleep(7000);
	    
	    //driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[7]/android.widget.EditText")).sendKeys("123456");
	    Otp=  ldriver.findElement(AppiumBy.className("android.widget.EditText"));
	    Otp.click();
	    Otp.sendKeys("123456");
	    
	    submit=ldriver.findElement(AppiumBy.accessibilityId("Submit"));
	    submit.click();
	    //Thread.sleep(3000);
	    warranty = ldriver.findElement(AppiumBy.accessibilityId("Warranty\n"
	    		+ "Tab 2 of 5"));
	    warranty.click();
    }
    public void clickBattery() throws InterruptedException
    {
    	battery= ldriver.findElement(AppiumBy.accessibilityId("Battery"));
    	battery.click();
    	//Thread.sleep(4000);
    }
    
    public void clickAutomotive()
    {
    	automotive=ldriver.findElement(AppiumBy.accessibilityId("Automotive"));
    	automotive.click();	
    }
    
    public void clickTwoWheeler() throws InterruptedException
    {
    	////Thread.sleep(4000);
    	twoWheeler=ldriver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Two Wheeler\"]"));
    	twoWheeler.click();
    	//Thread.sleep(4000);
    }
    
    public void enterserialNumberforTwoWheeler()
    {
    	serialNum=ldriver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]"));
    	serialNum.click();
    	serialNum.sendKeys(serialno);
    }
    
    public void entervehicleNum()
    {
    	vehicleNum =ldriver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[3]"));
    	vehicleNum.click();
    	vehicleNum.sendKeys("AP05EX0347");

    	
    }
    
    public void entercustmobileno()
    {
    	
    	customermobile=ldriver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[4]"));
    	customermobile.click();
//    	customermobile.sendKeys("9591074114");
    	
ReadConfig readConfig = new ReadConfig();

		
customermobile.sendKeys(readConfig.getPhoneNumber());

    				
    }
    
    public void enterSellercode()
    {
    	//sellercode="";
    			sellercode.click();
    }
    
    public void selectmake() throws InterruptedException
    {
    	//Thread.sleep(2000);
    	
    	selectmake=ldriver.findElement(AppiumBy.xpath("//android.widget.EditText[6]"));
    	selectmake.click();
    	selectmake.sendKeys("HERO");
    	 //Thread.sleep(2000);
 	    ldriver.hideKeyboard(); 
    	Hero = ldriver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"HERO\"]/preceding-sibling::android.widget.ImageView"));
    	Hero.click();
    			
    }
    
    public void selectSegment() throws InterruptedException
    {
    	
//WebElement image = ldriver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Change\"]/preceding-sibling::android.widget.ImageView"));
//    	
//    	BaseClass.wait_element_visible(image);
//    	
//     //Thread.sleep(2000);
//     selectsegment =ldriver.findElement(AppiumBy.accessibilityId("Select Segment"));
////    selectsegment.click();
//     ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//
//    BaseClass.retryClick(selectsegment);
//    
//    ldriver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
//
//    
////    ldriver.manage().timeouts().implicitlyWait(2, null);
//    ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//
//    
//    List<WebElement> elems = ldriver.findElements(AppiumBy.accessibilityId("Scooters"));
//    
//    ldriver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
//
//
//    
//    if(elems.size() == 0)
//    {
//        selectsegment =ldriver.findElement(AppiumBy.accessibilityId("Select Segment"));
//        ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//
//
//    	BaseClass.retryClick(selectsegment);
//    	
//    	   ldriver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
//
//    }
//    
//    Scooters = ldriver.findElement(AppiumBy.accessibilityId("Scooters"));
//    
//	Scooters.click();

    
//    Scooters= ldriver.findElement(AppiumBy.accessibilityId("Scooters"));
//	   if(Scooters.isDisplayed())
//		   Scooters.click();
//	   else
//	   {
//		   BaseClass.retryClick(selectsegment);
//		   Scooters.click();
//	   }

	   
	   //Thread.sleep(4000);
//	   Scooters= ldriver.findElement(AppiumBy.accessibilityId("Scooters"));
//	   Scooters.click();
    	
    	 ldriver.hideKeyboard();

         selectsegment =ldriver.findElement(AppiumBy.accessibilityId("Select Segment"));

         selectsegment =ldriver.findElement(AppiumBy.accessibilityId("Select Segment"));

       
     	BaseClass.wait_element_visible(selectsegment);

   		((SupportsContextSwitching) ldriver).context("FLUTTER");
    	
    	WebElement element = finder.byText("Select Segment");
	    element.click();
	    
	    WebElement scooter = finder.byText("Scooters");
	    scooter.click();
    		
    }
    
    public void selectModel() throws InterruptedException
    {
//    	selectModel=ldriver.findElement(AppiumBy.accessibilityId("Select Model"));
//    	selectModel.click();
//    //Thread.sleep(4000);
//    Maestro=ldriver.findElement(AppiumBy.accessibilityId("Maestro (ES)"));
//    Maestro.click();
    	
    	WebElement model = finder.byText("Select Model");
	    model.click();
	    
	    WebElement maestro = finder.byText("Maestro (ES)");
	    maestro.click();
    }
    public void selectFueltype() throws InterruptedException
    {
//    	selectFuel= ldriver.findElement(AppiumBy.accessibilityId("Select Fuel Type"));
//    	
//        BaseClass.retryClick(selectFuel);
//
////    	selectFuel.click();
//	    //Thread.sleep(4000);
//	    Pertol=ldriver.findElement(AppiumBy.accessibilityId("Petrol"));
//	    Pertol.click();
    }
    
    public void clickCheckboc()
    {
    	((SupportsContextSwitching) ldriver).context("NATIVE-APP");
    	clickCheckbox=ldriver.findElement(AppiumBy.className("android.widget.CheckBox"));
    	clickCheckbox.click();
    			
    }
    
    public void clickRegister() throws InterruptedException
    {
    	
   ldriver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().descriptionContains(\"Register\").instance(0))"));
	    
     clickRegbutton =ldriver.findElement(AppiumBy.accessibilityId("Register"));   
     clickRegbutton.click();
	    
	    //Thread.sleep(6000);
    }
    
    public void enterOtp() throws InterruptedException
    {
    	enterOtp=ldriver.findElement(AppiumBy.className("android.widget.EditText"));
    	enterOtp.click();
    	enterOtp.sendKeys("123456");
	    
    	enterOtp.click();
    	 //Thread.sleep(4000);
    	
    }
    
    public void clickVerify() throws InterruptedException
    {
    	verify = ldriver.findElement(AppiumBy.accessibilityId("Verify"));
    	verify.click(); 
	    
	    //Thread.sleep(4000);
    }
    
    public void checkRegSuccessful()
    {
      reg=ldriver.findElement(AppiumBy.accessibilityId("Registration Successful"));
      reg.click();
	    
	    String actualtext = reg.getText();
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
	    
	    text=ldriver.findElement(AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Your purchase of AMARON Battery(ies) registered against Mobile/Email\")"));
	    
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




