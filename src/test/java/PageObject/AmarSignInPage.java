package PageObject;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmarSignInPage {
	
	
	WebDriver ldriver;
	
	public AmarSignInPage(WebDriver rDriver)
	{
		ldriver=rDriver;

		PageFactory.initElements(rDriver, this);
	}
	

	@FindBy(name= "mobileOrEmail")
	WebElement mobile;
	
	@FindBy(xpath="//button[text()=' Sign In']")
	WebElement signIn;
	
	@FindBy(xpath="//button[text()=' Submit']")
	WebElement submit;
	
	@FindBy(name="otp")
	WebElement OTP;


	public Boolean doLogin(String mobileno, String otp) {


		mobile.clear();

		mobile.sendKeys(mobileno);

			OTP.clear();

			OTP.sendKeys(otp);


			// To check empty fields , we need to check "required" field is on an attribute

			Boolean isRequired = null;
			if (mobileno.isBlank()) {

				JavascriptExecutor js_user = (JavascriptExecutor) ldriver;

				isRequired = (Boolean) js_user.executeScript("return arguments[0].required;", mobileno);

				return isRequired;

			} else if (otp.isBlank()) {

				JavascriptExecutor js_password = (JavascriptExecutor) ldriver;

				isRequired = (Boolean) js_password.executeScript("return arguments[0].required;", otp);

				return isRequired;


			}

			return isRequired;

		}

}
