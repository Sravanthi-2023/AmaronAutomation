package StepDefinition;

import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObject.CustomerLoginMobilePage;
import PageObject.CustomerLoginPage;
import PageObject.CustomerRegistrationPage;
import PageObject.CustomerTwoWheelerRegistrationPage;
import PageObject.TwoWheelerCustomerLoginMobilePage;
import Utitlities.ReadConfig;
import io.appium.java_client.android.AndroidDriver;

import org.apache.logging.log4j.*;
import org.mortbay.log.Log;

/*Parent Class*/
public class BaseClass {
	public static  WebDriver driver;
	//public static AndroidDriver adriver;
	public CustomerLoginPage loginPg;
	public CustomerRegistrationPage customerRegPg;
	public CustomerTwoWheelerRegistrationPage customertwoRegPg;
	public TwoWheelerCustomerLoginMobilePage mobileTwoWheelerCustRegPg;
	public static Logger log;
	public ReadConfig readConfig;
	public CustomerLoginMobilePage custloginMobilePg;
	//generate unique email id
	public String generateEmailId()
	{
		return(RandomStringUtils.randomAlphabetic(5));
	}
	
	public static void wait_element_clickable(WebElement elem)
	{
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));

        wait.until(ExpectedConditions.elementToBeClickable(elem));

	}
	
	public static void wait_element_visible(WebElement elem)
	{
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));

	        wait.until(ExpectedConditions.elementToBeClickable(elem));
	}
	
	public static void wait_element_invisible(WebElement elem)
	{
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));

	        wait.until(ExpectedConditions.invisibilityOf(elem));
	       
	}
	
	
	public static void set_implicit_wait()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
	}
	
	public static void retryClick(WebElement elem)
	{
        
        
//        Calendar currentTimeNow = Calendar.getInstance();
//        System.out.println("Current time now : " + currentTimeNow.getTime());
//        currentTimeNow.add(Calendar.MINUTE, 1);
//        Date tenMinsFromNow = currentTimeNow.getTime();
        
        Calendar currentTimeNow = Calendar.getInstance();

        Date cur_time_now = currentTimeNow.getTime();

//        System.out.println("Current time now : " + cur_time_now);

        currentTimeNow.add(Calendar.MINUTE, 1);

        Date oneMinsFromNow = currentTimeNow.getTime();

//        System.out.println("After adding 10 mins with Caleder add() method : " + tenMinsFromNow);

        

//        System.out.println(tenMinsFromNow.after(cur_time_now));
        
        boolean not_clicked = true;
        		
        while(not_clicked && (!cur_time_now.after(oneMinsFromNow)))
        {
        	cur_time_now = Calendar.getInstance().getTime();
        	
    		log.debug("Current Time" + cur_time_now);
    		log.debug("One Min Time" + oneMinsFromNow);
    		log.debug("" + cur_time_now.after(oneMinsFromNow));


    		
		try {
			elem.click();
			not_clicked = false;
			
		}catch(Exception e)
		{
			
//			elem.click();
			break;
			
		}
	}
	}
	
	
	
}
