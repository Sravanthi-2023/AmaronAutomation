package StepDefinition;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import PageObject.AmarSignInPage;
import PageObject.CustomerLoginMobilePage;
import PageObject.CustomerLoginPage;
import PageObject.CustomerRegistrationPage;
import PageObject.CustomerTwoWheelerRegistrationPage;
import PageObject.TwoWheelerCustomerLoginMobilePage;
import Utitlities.ReadConfig;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.SupportsContextSwitching;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefMobile extends BaseClass{
	//UiAutomator2Options options = new UiAutomator2Options();
//AndroidDriver driver;
	
	
	@Before
	public void setup1() throws MalformedURLException
	{
		readConfig = new ReadConfig();
		
		//initialise logger
		log = LogManager.getLogger("StepDef");

		System.out.println("Setup-Sanity method executed..");

		String browser = readConfig.getBrowser();
		
		//launch browser
		switch(browser.toLowerCase())
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;

		case "msedge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			
		case "android":
			DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("appium:platformVersion", "11");
    capabilities.setCapability("appium:deviceName","Mi A3");
    capabilities.setCapability("platformName", "Android");
    capabilities.setCapability("appium:appPackage", "com.arbl.amaron");
    capabilities.setCapability("appium:appActivity", "com.arbl.amaron.MainActivity");
    capabilities.setCapability("unlockType", "pin");
    capabilities.setCapability("unlockKey", "2580");

    capabilities.setCapability("automationName", "Flutter");
		URL remoteUrl = new URL("http://127.0.0.1:4723");
	   driver = new AndroidDriver(remoteUrl, capabilities);
       
			    break;
		default:
			driver = null;
			break;

		}

	
		log.fatal("Setup executed...");


	}
	
	
	@Given("Amaron app is launching")
	public void User_opens_Amaron_url_in_Mobile() throws InterruptedException, MalformedURLException {
		((SupportsContextSwitching) driver).context("NATIVE_APP");
	
	custloginMobilePg= new CustomerLoginMobilePage((AndroidDriver) driver);
	mobileTwoWheelerCustRegPg = new TwoWheelerCustomerLoginMobilePage((AndroidDriver) driver);
		custloginMobilePg.clickAllow();

	}
	
	
	@When("user enter mobileno and otp")
	public void user_enter_mobileno_and_otp() throws InterruptedException
	{
		custloginMobilePg.enterMobileandOtp();
	}
	
	@Then ("user clicks on Battery for Mobile")
	public void user_clicks_on_battery_for_Mobile()
	{
		custloginMobilePg.clickBattery();
	}
	@Then("user clicks on Automotive for Mobile")
	public void user_clicks_on_Automotive_for_Mobile()
	{
		custloginMobilePg.clickAutomotive();
	}
	@Then("user enters serial number for Mobile")
	public void user_enters_serial_number_for_mobile()
	{
		custloginMobilePg.enterserialNumber();
	}
	@Then("user enters vehicle number for Mobile")
	public void user_enters_vehicle_number_for_Mobile()
	{
		custloginMobilePg.entervehicleNum();
	}
	@Then("user enters customer mobile number for Mobile")
	public void user_enters_customer_mobile_number_for_Mobile()
	{
		custloginMobilePg.entercustmobileno();
	}
	
	@Then("enters customer email or mobileno")
	public void enters_customer_email_or_mobileno()
	{
		custloginMobilePg.enterspecificCustMobileno();
	}
	@Then("user enters seller code for Mobile")
	public void user_enters_seller_code_for_Mobile()
	{
		custloginMobilePg.enterSellercode();
	}
	@Then("user select a make for Mobile")
	public void user_select_a_make_for_Mobile() throws InterruptedException
	{
		
		custloginMobilePg.selectmake();
		
	}
	@Then("user select segment for Mobile")
	public void user_select_segment_for_Mobile() throws InterruptedException
	{
//		((SupportsContextSwitching) driver).context("FLUTTER");

//	     selectsegment =ldriver.findElement(AppiumBy.accessibilityId("Select Segment"));

		
		custloginMobilePg.selectSegment();
	}
	@Then("user select Model for Mobile")
	public void user_select_Model_for_Mobile() throws InterruptedException
	{
		custloginMobilePg.selectModel();
	}
	@Then("user select FuelType for Mobile")
	public void user_select_FuelType_for_Mobile() throws InterruptedException
	{
		custloginMobilePg.selectFueltype();
	}
	@Then("user Clicks on Terms and Conditions checkbox")
	public void user_clicks_on_checkbox()
	{
		((SupportsContextSwitching) driver).context("NATIVE_APP");
		custloginMobilePg.clickCheckbox();
	}
	@Then("user clicks on Register button for Mobile")
	public void user_clicks_on_Register_button_for_Mobile() throws InterruptedException
	{
		custloginMobilePg.clickRegister();
	}
	@Then("user enters Otp for Mobile")
	public void user_enters_Otp_for_Mobile() throws InterruptedException
	{
		custloginMobilePg.enterOtp();
	}
	@Then("user clicks on Verify for Mobile")
	public void user_clicks_on_Verify_for_Mobile() throws InterruptedException
	{
		custloginMobilePg.clickVerify();
	}
	@Then("user redirects to Registration Successfull Page")
	public void user_redirects_to_registration_Successfull_page()
	{
		custloginMobilePg.checkRegSuccessful();
	}
	
	@Then("user clicks on TwoWheeler")
	public void user_clicks_on_TwoWheeler() throws InterruptedException
	{
		mobileTwoWheelerCustRegPg.clickTwoWheeler();
	}
	
	@Then("user enters mobile number for TwoWheeler")
	public void user_enters_mobile_number_as() throws InterruptedException
	{
		mobileTwoWheelerCustRegPg.enterMobileNumberforTwoWheeler();
	}
	@Then("user enters OTP for TwoWheeler")
	public void user_enters_OTP_for_TwoWheeler_as() throws InterruptedException
	{
		mobileTwoWheelerCustRegPg.enterOtpForTwoWheeler();
	}
	@Then("user enter customer mobile number for TwoWheeler in Mobile")
	public void user_enter_customermobile_num_for_TwoWheeler_in_Mobile()
	{
		mobileTwoWheelerCustRegPg.entercustmobileno();
	}

	@Then("user select a Make for TwoWheeler in Mobile")
	public void user_select_a_Make_for_TwoWheeler_in_Mobile() throws InterruptedException
	{
		mobileTwoWheelerCustRegPg.selectmake();
	}
	@Then("user selects Segment for TwoWheeler in Mobile")
	public void user_selects_Segment_for_TwoWheeler_in_Mobile() throws InterruptedException
	{
		//((SupportsContextSwitching) driver).context("FLUTTER");
		mobileTwoWheelerCustRegPg.selectSegment();
	}
	
	@Then("user selects ModelType for TwoWheeler in Mobile")
	public void user_selects_ModelType_for_TwoWheeler_in_Mobile() throws InterruptedException
	{
		mobileTwoWheelerCustRegPg.selectModel();
	}
	
	@Then("user enters serial number for TwoWheeler in Mobile")
	public void user_enters_serial_number_for_TwoWheeler_in_Mobile()
	{
		mobileTwoWheelerCustRegPg.enterserialNumberforTwoWheeler();
		
	}
	
	@Then("user verify You cant enter same mobile No in more than 10 Transactions alert Message")
	public void user_verify_Alert_Message()
	{ 
		 String alerttext="Please use customer Mobile No/ email for Registration. You can’t use the same email/Mobile No in more than 10 Transactions.?";

		//String  alertText= driver.findElement(AppiumBy.accessibilityId("Please use customer Mobile No/ email for Registration. You can’t use the same email/Mobile No in more than 10 Transactions.?")).getText();
		    System.out.println("Alert Text is"+":"+ alerttext);
		    
		    String ExpectedalertText = custloginMobilePg.alertTextVerification();
		    if(ExpectedalertText.equalsIgnoreCase(alerttext))
		    {
		    	
		    	System.out.println("Alert text is matching");
		    }
		    else
		    	
		    	System.out.println("Alert text is not matching");
		    
		 //driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"OK\"]")).click();
	}
	
}
