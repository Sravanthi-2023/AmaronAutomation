package StepDefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.math3.analysis.function.Log;
import org.apache.logging.log4j.LogManager;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObject.AmarSignInPage;
import PageObject.CustomerLoginPage;
import PageObject.CustomerRegistrationPage;
import PageObject.CustomerTwoWheelerRegistrationPage;
import Utitlities.ExcelReader;
import Utitlities.ReadConfig;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
/*Child class of Baseclass*/
public class StepDef extends BaseClass {
	
	

	private static final String Excelpath = System.getProperty("user.dir")+"\\src\\test\\java\\TestData\\Login.xlsx";

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
			ChromeOptions options = new ChromeOptions();

	        options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
	        options.addArguments("--disable-notifications");
	        driver = new ChromeDriver(options);
	        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
			//driver = new ChromeDriver();
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
			
		case "andriod":
			UiAutomator2Options Androidoptions = new UiAutomator2Options();
			//AndroidDriver driver;
			Androidoptions = new UiAutomator2Options();
			Androidoptions.setCapability("appium:platformVersion", "11");
			Androidoptions.setCapability("appium:appPackage", "com.arbl.amaron");
			Androidoptions.setCapability("appium:appActivity", "com.arbl.amaron.MainActivity");
			Androidoptions.setCapability("unlockType", "pin");
			Androidoptions.setCapability("unlockKey", "2580");

				URL remoteUrl = new URL("http://127.0.0.1:4723");
			    driver = new AndroidDriver(remoteUrl, Androidoptions);
		        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		        

			    break; 
		default:
			driver = null;
			break;

		}

	
		log.fatal("Setup1 executed...");


	}

	
	/*@Before("@regression")
	public void setup2()
	{
		System.out.println("Setup2-Regression method executed..");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		log.info("Setup2 executed...");
	}*/

	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {

		loginPg= new CustomerLoginPage(driver);
		customerRegPg= new CustomerRegistrationPage(driver);
		AmarSignInPage amarSignInPg = new AmarSignInPage(driver);
		customertwoRegPg = new CustomerTwoWheelerRegistrationPage(driver);

		log.info("chrome browser launched");
	}

	@When("User opens URL")
	public void user_opens_url() {
	//String	url ="http://arbl-app.centralindia.cloudapp.azure.com/amaron/auth/login";
		String url ="https://ardsm.com/amaron/app/warranty/register";
		driver.get(url);
		log.info("AMARON url opened");

	}
	
	@Then ("Clicks on the Customers Radio button")
	public void clicks_on_the_customers_Radio_button()
	{
		
		List<WebElement> l = driver.findElements(By.xpath("//label[@class='mat-radio-label']"));
		for(WebElement list : l)
		{
			list.getSize();
			System.out.println(list.getSize());
			WebElement customerRadio = driver.findElement(By.id("customer-input"));
			if(customerRadio.isSelected())
			{
				log.info("selected Customers radio button");
				
			}
			else
			{
				customerRadio.click();
			}
		}
	}

	@And("Clicks on LoginButton")
	public void clicks_on_LoginButton() throws InterruptedException
	{
		//Thread.sleep(1000);

		loginPg.clickonLoginLink();
		log.info("user clicked on login button");
	}
	
	@When("customer enters Mobile Number as {string}")
	public void enters_mobile_no_as(String mobile)throws InterruptedException {
		//Thread.sleep(5000);
		loginPg.enterMobile(mobile);
		log.info("Mobile no entered");
		//Thread.sleep(5000);

	}
	
	@When("User enters Mobile Number as {string}")
	public void user_enters_Mobile_Number(String mobileno) throws InterruptedException {
		//Thread.sleep(5000);
		loginPg.enterMobile(mobileno);
		log.info("Mobile no entered");

	}

	@And("Click on SignIn button")
	public void click_on_SignIn_button() {
		loginPg.clickSignIn();

		log.info("Clicked on SignIn button");

	}
	
	@And("User enters OTP")
	public void user_enters_OTP() throws InterruptedException {
		
		//Thread.sleep(6000);
		loginPg.enterOTP();

		log.info("Entered OTP Successfully");

	}
	
	@And("User enters OTP as {string}")
	public void user_enters_otp_as() throws InterruptedException {
		
		//Thread.sleep(6000);
		loginPg.enterOTP();

		log.info("Entered OTP Successfully");
		//Thread.sleep(2000);

	}
	
	@Then("Click on Submit button")
	public void click_on_submit_button() throws InterruptedException
	{
		loginPg.clickonSubmit();
		//Thread.sleep(4000);
	}
	
	@Then("Scroll down to bottom")
	public void scroll_down() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[@class='form-footer-cont desk-view-show mt-3 p-3']//span[@class='terms-cond-text' and text()=' I Agree to ']")).sendKeys(Keys.PAGE_DOWN);
		//Thread.sleep(3000);
		
	}

	//////////Login feature///////////////////////////
	@Then("Verify user is on Login Page or not")
	public void verify_user_is_on_Login_page_or_not() throws InterruptedException {
		
		//Thread.sleep(3000);
		
		WebElement imgprofile = driver.findElement(By.xpath("(//img[@alt='profile'])"));
		
		if(imgprofile.isDisplayed())
		
		{
			log.warn("Test passed: User is on Login Page");

			//Assert.assertTrue(true);//pass
		}
		else
		{
			//Assert.assertTrue(false);//fail
			log.warn("Test Failed: user is not on Login page");


		}


	}

	@Then("Click on Profile dropdown")
	public void click_on_profile_dropdown()
	{
		loginPg.clickonProfiledd();
	}
	
	@When("User click on Log out")
	public void user_click_on_log_out() {
		loginPg.clickOnLogOutButton();
		log.info("user clicked on logout");

	}
	
	@Then("User clicks on Confirm button")
	public void user_clicks_on_confirm_button()
	{
		loginPg.clickonConfirm();
		log.info("Clicked on Confirm button");
		
	}

	@Then("Login link should be visible")
	public void login_link_should_be_visible()
	{
		loginPg.LoginVisibility();
        log.info("User is on Logout Page");
		
	}
/*	@Then("close browser")
	public void close_browser() {
		driver.close();
		log.info("Browser closed");

		//driver.quit();
	} */


	///////////////////////////Registration Process/////////////////////


	@When("user verify Registration Page Title")
	public void uuser_clicks_on_Product_Registration_Link() {
		String actualTitle = customerRegPg.verifyRegTitle();
		String expectedTitle = "Product Registration";

		if(actualTitle.equals(expectedTitle))
		{
			log.info("Registration page title matches");
			
		}
		else
		{
			log.warn("Registration page title is not matching");

		}
	}

	@Then("user click on Product Registration link")
	public void user_click_on_Product_Registartion_link() {
		customerRegPg.clickonReglink();
		log.info("Clicked on Product Registration link");

	}

	@Then("user enters battery serial number")
	public void user_enters_battery_serial_number() {
		customerRegPg.enterbatteryserialno();
		log.info("user enters battery serial number");
	
	}
	
	@Then("user enters battery serial number as {string}")
	public void user_enters_battery_serial_number_as(String serno) {
		customerRegPg.enterbatteryserialno(serno);
		log.info("user enters battery serial number");
	
	}
	
	@Then("user enters customer emailorMobile as {string}")
	public void user_enters_customer_emailorNumber_as(String mobile)
	{
		customerRegPg.entercustomeremailorMobileAs(mobile);
		log.info("user enters  customer Email/Mobile number");
	}
	
	@Then("user enters vehicle number")
	public void user_enters_vehicle_number() {
		customerRegPg.entervehiclenumber();
		log.info("user enters vehicle number");
	
	}
	
	@Then("user enters customer emailorMobile")
	public void user_enters_customer_emailorNumber() {
		customerRegPg.entercustomeremailorMobile();
		log.info("user enters  customer Email/Mobile number");
	
	}
	

	@When("user expands add option")
	public void user_expands_add_option() throws InterruptedException {
		
	   // js.executeScript("window.scrollBy(0,350)");
	    
	    customerRegPg.clickAddoption();
	    log.info("Clicked on Add option");
	    	    
	}
	
	@Then("user clicks on Select Make")
	public void user_clicks_on_select_make() throws InterruptedException {
		
		customerRegPg.selectMake();
		log.info("user selected a make");
	    
	}
	
	@Then("user select Segment") 
	public void user_select_segment()throws InterruptedException {
		
	/*	WebElement scroll = driver.findElement(By.xpath("//mat-select[@role='combobox' and @name='segment']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(scroll);
		actions.build().perform();
		//Thread.sleep(3000); */
		
		
		driver.findElement(By.xpath("//mat-select[@role='combobox' and @name='segment']")).sendKeys(Keys.PAGE_DOWN);
		//Thread.sleep(5000);
		
		customerRegPg.selectSegment();
		log.info("user selected Segment");
		
	}
	
	@Then("user select Model")
	public void user_select_model() throws InterruptedException{
		customerRegPg.selectModel();
		log.info("user selected model");
	}
	@Then("user select FuelType")
	public void user_select_fuel_type() throws InterruptedException {
		customerRegPg.selectFuelType();
		log.info("user selected FuelType");
	}
	
	@Then("verify Terms And conditions message")
	public void verify_terms_and_conditions_message() {
	   String actualText = customerRegPg.verifyTermsConditions();
	   String expectedText = " I Agree to Terms & Conditions";
	   
	   if(actualText.equalsIgnoreCase(expectedText));
	   {
		   log.info("actual text matching with expected");
	   }
	   log.info("doesnt match text");
	  
	}
	
	@Then("click on I Agree checkbox")
	public void click_on_i_agree_checkbox() {
		
		customerRegPg.clickonAgreeCheckBox();
		log.info("clicked on terms&conditions checkbox");
	}
	
	@When("user clicks on Register button")
	public void user_clicks_on_register_button() throws InterruptedException {
	    customerRegPg.clickonRegistrationButton();
	}
	
	@Then("user enters into OTP Page")
	public void user_enters_into_OTP_Page() throws InterruptedException
	{
		//Thread.sleep(3000);
		customerRegPg.verifyOtponReg();
		//Thread.sleep(5000);
	}
	
	@And("user clicks on Skip button")
	public void user_clicks_on_Skip_button()
	{
		customerRegPg.clickonSkip();
	}
	
	@Then("user checks Registration is successful or not")
	public void user_checks_Registration_is_successful_or_not()throws InterruptedException
	{
		String actualText = customerRegPg.verifyRegSucessorNot();
		String ExpectedText ="Registration Successful";
		
		if(actualText.equalsIgnoreCase(ExpectedText))
		{
			log.info("Registration is successful");
		}
		//log.info("Registration is not successful");
	}
	

	//////////////////////////////
	@Then("user get an Alert message to enter Manadatory Fields")
	public void user_get_an_Alert_message_to_enter_Mandatory_Fields() throws InterruptedException {
	/*	     
        Alert alert = driver.switchTo().alert();		   
        String alertMessage= driver.switchTo().alert().getText();	
        
        System.out.println(alertMessage);	*/
        //Thread.sleep(3000);	
       // alert.accept();
		//div[@class='toast-body']//span
        customerRegPg.verifypopupisdisplayed();	
		String actualText = customerRegPg.verifypopupisdisplayed();
		String expText = "The serial Number ABCDEHGV009717 you have entered is not associated with any product identification code. Hence cannot Register.";
        if(actualText.contains(expText))
        {
        	System.out.println("Alert message is validated sucessfully");
        	log.info("Alert message is validated sucessfully");
        }
        else
        {
        	System.out.println("Alert message is not validated sucessfully");
        	log.info("Alert message is not validated sucessfully");
        }
		
	}
	
	@Then("user get an Alert message for using same no multiple times")
	public void user_get_an_Alert_message_for_using_same_no_multiple_times() throws InterruptedException {
		     
        Alert alert = driver.switchTo().alert();		   
        String alertMessage= driver.switchTo().alert().getText();	
        String expMessage = "This Product(s) FEG6244W300123 is already registered with us. Check Product status for more details";
        System.out.println(alertMessage);	
        //Thread.sleep(3000);	
       // alert.accept();
		//div[@class='toast-body']//span
        
        if(alertMessage.contains(expMessage))
        {
        	System.out.println("Alert message is validated sucessfully");
        	log.info("Alert message is validated sucessfully");
        }
        else
        {
        	System.out.println("Alert message is not validated sucessfully");
        	log.info("Alert message is not validated sucessfully");
        }
		
	}

	@Then("Login Page Title should match")
	public void page_title_should_match() throws InterruptedException {
		
		String expectedTitle ="Amar[a] Raja";
		//Thread.sleep(5000);
		String actualTitle=driver.getTitle();
        System.out.println(actualTitle);
        
        Assert.assertEquals(actualTitle,expectedTitle );
		
		if(actualTitle.equals(expectedTitle))
		{
			log.warn("Test passed: Login feature :Page title matched.");

			//Assert.assertTrue(true);//pass
		}
		else
		{
			//Assert.assertTrue(false);//fail
			log.warn("Test Failed: Login feature- page title not matched.");


		}


	}
	
	@Then("pop-up should be displayed")
	public void pop_up_should_be_displayed() throws InterruptedException {
		customerRegPg.verifypopupisdisplayed();	
		String actualText = customerRegPg.verifypopupisdisplayed();
		   String expectedText = "Please use customer Mobile No/ email for Registration. You can’t use the same email/Mobile No in more than 10 Transactions.?";
		   if(actualText.equalsIgnoreCase(expectedText));
		   {
			   log.info("actual text matching with expected");
		   }
	}
	
	@Then("Register button should be disabled")
	public void register_button_should_be_disabled() throws InterruptedException {
		customerRegPg.verifyRegbuttonisenabled();
		log.info("Register button is disabled");
	}
	
	@Then("user click on Two Wheeler image")
	public void user_click_on_two_wheeler_image() throws InterruptedException {
		customertwoRegPg.clickonTwoWheeler();
		log.info("Clicked on Two Wheeler Image");

		
	}

	@Then("user enters battery serial number for TwoWheeler")
	public void user_enters_battery_serial_number_for_two_wheeler() throws InterruptedException {
		customertwoRegPg.enterbatteryserialno();
		log.info("user enters battery serial number");
	}
	
	@Then("user enters vehicle number for TwoWheeler")
	public void user_enters_vehicle_number_for_two_wheeler() {
		customertwoRegPg.entervehiclenumber();
		log.info("user enters vehicle number");
	}
	
	@Then("user enters customer emailorMobile for TwoWheeler")
	public void user_enters_customer_emailor_mobile_for_two_wheeler() {
		customertwoRegPg.entercustomeremailorMobile();
		log.info("user enters  customer Email/Mobile number");
	}
	
	@Then("user clicks on Select Make for TwoWheeler")
	public void user_clicks_on_select_make_for_two_wheeler() throws InterruptedException {
		customertwoRegPg.selectMake();
		log.info("user selected a make");
	}
	
	@Then("user select Segment for TwoWheeler")
	public void user_select_segment_for_two_wheeler() throws InterruptedException {
		customertwoRegPg.selectSegment();
		log.info("user selected Segment");
	}
	
	@Then("user select Model for TwoWheeler")
	public void user_select_model_for_two_wheeler() throws InterruptedException {
		customertwoRegPg.selectModel();
		log.info("user selected model");
	}
	
	@Then("user select FuelType for TwoWheeler")
	public void user_select_fuel_type_for_two_wheeler() throws InterruptedException {
		customertwoRegPg.selectFuelType();
		log.info("user selected FuelType");
	}
	
	@Then("user enters seller code")
	public void user_enters_seller_code() throws InterruptedException {
		customertwoRegPg.entersellercode();
		log.info("user entered sellercode");
	}
	
	/**********************************************************************/

	
	@SuppressWarnings("deprecation")
	@When("The user enter sheet {string} and {string}")

	public void the_user_enter_sheet_and(String sheetname, String rownumber)

			throws InvalidFormatException, IOException, InterruptedException {


		ExcelReader reader = new ExcelReader();


		List<Map<String, String>> testdata = reader.getData(Excelpath, sheetname);

		String mobileno = testdata.get((Integer.parseInt(rownumber))).get("mobileno");

		String otp = testdata.get((Integer.parseInt(rownumber))).get("OTP");

	//	message = testdata.get(rownumber).get("expectedmessage");


		System.out.println("User Enter mobileno as \" " + mobileno + " \"and OTP as \" " + otp + "\" ");

		if (mobileno != null || otp != null)
		{
			//Thread.sleep(5000);
		WebElement	mobileNumber = driver.findElement(By.name("mobileOrEmail"));
		mobileNumber.clear();
		mobileNumber.click();
		//Thread.sleep(3000);
		mobileNumber.sendKeys(mobileno);
		
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()=' Sign In']")).click();
		
		//Thread.sleep(3000);
		
		WebElement	OTP1 = driver.findElement(By.name("otp"));
         
		//Thread.sleep(4000);
		OTP1.click();
		//Thread.sleep(4000);
		OTP1.sendKeys(otp);
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()=' Submit']")).click();
	
		//button[text()=' Submit']
		}
	}
	

	@After
	public void teardown(Scenario sc)
	{
		System.out.println("Tear Down method executed..");
		if(sc.isFailed()==true)
		{
			//Convert web driver object to TakeScreenshot
           
			String fileWithPath = System.getProperty("user.dir")+"\\Screenshot\\failedScreenshot.png";
			TakesScreenshot scrShot =((TakesScreenshot)driver);

			//Call getScreenshotAs method to create image file
			File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

			//Move image file to new destination
			File DestFile=new File(fileWithPath);

			//Copy file at destination

			try {
				FileUtils.copyFile(SrcFile, DestFile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		try
		{
		driver.quit();
		}
		catch(Exception e)
		{
			
		}
	}

	/*@After
	public void teardown2()
	{
		System.out.println("Tear Down method executed..");
		driver.quit();
	}*/

	/*@BeforeStep
	public void beforeStepMethodDemo()
	{
		System.out.println("This is before step....");
	}


	@AfterStep
	public void afterStepMethodDemo()
	{
		System.out.println("This is after step....");
	}*/


	

		


	

}
