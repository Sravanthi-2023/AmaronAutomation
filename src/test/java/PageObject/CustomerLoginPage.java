package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefinition.BaseClass;

public class CustomerLoginPage {

	WebDriver ldriver;

	public CustomerLoginPage(WebDriver rDriver)
	{
		ldriver=rDriver;

		PageFactory.initElements(rDriver, this);
	}
	@FindBy(xpath = "//label[@class='mat-radio-label']")
	WebElement radioButtons;
	
	
	@FindBy(name= "mobileOrEmail")
	WebElement mobile;
	
	@FindBy(xpath="//button[text()=' Sign In']")
	WebElement signIn;
	
	@FindBy(xpath="//button[text()=' Submit']")
	WebElement submit;
	
	@FindBy(name="otp")
	WebElement OTP;

	@FindBy(xpath="//span[@class='brand-title']")
	WebElement PageTitle;
	
	@FindBy(xpath="//button[@type='button'][text()='Confirm']")
	WebElement confirmButton;
	
	@FindBy(xpath="//div[text()=' Login ']")
	WebElement loginIcon;
	
	@FindBy(xpath="//div[@class='profile ng-star-inserted dropdown']//img[@class='image-icon']")
	WebElement profileDropdown;
	
	@FindBy(linkText = "Logout")
	WebElement logout;
	
	@FindBy(xpath  = "//shared-loading/div")
	WebElement loading;
	
	@FindBy(xpath  = "//shared-loading")
	WebElement notloading;
	
	
	public void enterMobile(String mobileno) throws InterruptedException
	{
//		if(BaseClass.isElem_Displayed(loading))
//			BaseClass.wait_element_visible(notloading);
	
//		Thread.sleep(5000);

		
		BaseClass.wait_element_visible(mobile);

		mobile.clear();
//		mobile.click();
		
		BaseClass.retryClick(mobile);

		mobile.sendKeys(mobileno);
	}
	
	public void clickSignIn()
	{
		signIn.click();
	}
	
	public void enterOTP()
	{
		OTP.click();
		OTP.sendKeys("12345");
	}
	
	public void clickOnLogOutButton()
	{
		logout.click();
	}
	
	public void clickonConfirm()
	{
		confirmButton.click();
	}
	
	public void LoginVisibility()
	{
		if(loginIcon.isDisplayed())
		loginIcon.getText();
	}
	
	public void clickonLoginLink()
	{
		BaseClass.wait_element_visible(loginIcon);

		BaseClass.wait_element_clickable(loginIcon);
		loginIcon.click();
	}
	
	public void clickonSubmit()
	{
		submit.click();
	}
	
	public void clickonProfiledd()
	{
		profileDropdown.click();
	}
	
}
