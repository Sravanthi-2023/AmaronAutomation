package PageObject;

import java.util.List;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import StepDefinition.BaseClass;
import Utitlities.ReadConfig;

public class CustomerRegistrationPage {
	
	WebDriver ldriver;
	String serialno = "F EG62 48 W 0" +" "+ RandomStringUtils.randomNumeric(5);
	
	

	public CustomerRegistrationPage(WebDriver rDriver)
	{
		ldriver=rDriver;

		PageFactory.initElements(rDriver, this);
	}
	@FindBy(xpath = "//span[text()='Product Registration & Status']")
	WebElement prodRegStatusLink;
	
	@FindBy(xpath="//span[@class='toaster-message ng-star-inserted']")
	WebElement popupmsg;
	
	@FindBy(xpath= "//div[text()='Product Registration']")
	WebElement ProdRegTitle;
	
	@FindBy(xpath="//input[@data-placeholder='Battery Serial Number']")
	WebElement batteryserialnum;
	
	@FindBy(xpath="//input[@data-placeholder='Vehicle Number/VIN Number']")
	WebElement vehiclenumber;

	@FindBy(xpath="//input[@data-placeholder='Customer Mobile / Email']")
	WebElement custmobilenumber;
	
	@FindBy(xpath="//div[@class='title desk-view-show pl-4 mb-4']//i[@class='material-icons icon ng-star-inserted'][normalize-space()='add']")
	WebElement vehicleaddIcon;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement selectmake;
	
	@FindBy(xpath = "//img[@alt='FORD']")
	WebElement selectProduct;
	
	@FindBy(xpath = "//mat-select[@name='segment']/ancestor::mat-form-field/..")
	WebElement segmentWait;
	
	@FindBy(name = "segment")
	WebElement segmentdropdownclick;
	
	@FindBy(xpath="//div[@class='mat-select-arrow ng-tns-c115-1']")
	WebElement clickDropdown;
	
	@FindBy(id="searchSegment")
	WebElement clickSearchSegement;
	
	@FindBy(xpath="//mat-option[@role='option']")
	WebElement selectoption;
	
	
	@FindBy(xpath = "//mat-select[@role='combobox' and @name='model']")
	WebElement modeldropdownclick;
	
	@FindBy(xpath="//input[@id='searchModel']")
	WebElement clickmodelsearch;
	
	@FindBy(xpath = "//mat-select[@role='combobox' and @name='fuelType']")
	WebElement Fueldropdownclick;
	
	@FindBy(xpath="//mat-option[@role='option']")
	WebElement Options;
	
	@FindBy(xpath="//input[@id='searchFT']")
	WebElement clickfuelsearch;
	
	@FindBy(xpath="//div[@class='form-footer-cont desk-view-show mt-3 p-3']//span[@class='terms-cond-text' and text()=' I Agree to ']")
	WebElement IAgreeTo;
	
	@FindBy(xpath="//div[@class='form-footer-cont desk-view-show mt-3 p-3']//span[@class='font-bold text-underline pointer-cursor' and text()=' Terms & Conditions']")
	WebElement TermsConditions;
	
	@FindBy(xpath="//span[@class='checkmark']")
	WebElement checkbox;
	
	@FindBy(xpath="//button[@class='btn btn-secondary action-btn mr-4 m-0']")
	WebElement Regbutton;
	
	@FindBy(xpath="//button[@class='btn btn-secondary action-btn mr-4 m-0 cursor-disabled']")
	WebElement RegbuttonDisabled;
	
	@FindBy(id="partition-otp")
	WebElement otp;
	
	@FindBy(xpath="//button[@class='btn btn-secondary action-btn arbl-btn']")
	WebElement otpbutton;
	
	
	
	@FindBy(xpath="//button[@type='button' and text()=' Skip ']")
	WebElement skip;
	
	@FindBy(xpath="//div[text()='Registration Successful']")
	WebElement regsucess;
	
	@FindBy(xpath="//div[text()='Status']")
	WebElement statuslink;
	
	@FindBy(xpath="//input[@placeholder='Registered Mobile/Email Id']")
	WebElement statusmobileno;
	
	@FindBy(xpath="//button[@type='submit' and text()='Check Status ']")
	WebElement checkStatus;
	
	@FindBy(xpath="//h5[contains(text(),'Registered Batterie(s)/HUPS(s) Against Mobile Number/Email')]")
	WebElement regbatteries;
	
	@FindBy(xpath="//div[@class='battery-list row mt-3']//div[@class='card flex-row col-12']//div")
	WebElement listofbatteris;
	
	@FindBy(xpath="//input[@data-placeholder ='Seller Code']")
    WebElement sellercode;
	
	@FindBy(xpath = "//mat-select[@name='model']/ancestor::mat-form-field/..")
	WebElement modelWait;
	
	@FindBy(xpath  = "//shared-loading/div")
	WebElement loading;
	
	@FindBy(xpath  = "//shared-loading")
	WebElement notloading;
	
	
	public String verifyRegTitle()
	{
		ProdRegTitle.getText();
		String text = ProdRegTitle.getText();
		System.out.println("Registration Title is"+ text);
		return text;
		
	}
	

	public void clickonReglink() {
		BaseClass.wait_element_clickable(prodRegStatusLink);
		BaseClass.wait_element_visible(prodRegStatusLink);
		BaseClass.retryClick(prodRegStatusLink);
//		prodRegStatusLink.click();
		
	}

	public void enterbatteryserialno()
	{
		batteryserialnum.click();
		batteryserialnum.sendKeys(serialno);
		System.out.println(serialno);
	}


	public void entervehiclenumber() {
		vehiclenumber.click();
		vehiclenumber.sendKeys("AP05EX0347");
		
	}


	public void entercustomeremailorMobile() {
		custmobilenumber.click();
		
ReadConfig readConfig = new ReadConfig();

		
		custmobilenumber.sendKeys(readConfig.getPhoneNumber());
		
//		custmobilenumber.sendKeys("8813478891");
		
	}
	
	public void entercustomeremailorMobileAs(String mobile) {
		custmobilenumber.click();
		custmobilenumber.sendKeys(mobile);
		
	}
	
	
	public void clickAddoption() throws InterruptedException
	{
		
		vehicleaddIcon.click();
		//Thread.sleep(2000);
		
	}
	
	public void selectMake() throws InterruptedException
	{
		selectmake.click();
		selectmake.sendKeys("FORD");
		//Thread.sleep(2000);
		selectProduct.click();
		
		
	}
	
	public void selectSegment()throws InterruptedException
	
	{
//		
//		if(BaseClass.isElem_Displayed(loading))
//			BaseClass.wait_element_visible(notloading);
//		Thread.sleep(5000);
		
//		BaseClass.wait_element_clickable(notloading);

		
//List<WebElement> ele_list = ldriver.findElements(By.xpath("//shared-loading/div"));
//		
//		if(ele_list.size()!=0)
//		{
//			BaseClass.wait_element_invisible(loading);
//		}
		
		BaseClass.wait_element_clickable(segmentWait);
		BaseClass.wait_element_visible(segmentWait);

		
		BaseClass.wait_element_clickable(segmentdropdownclick);
		BaseClass.wait_element_visible(segmentdropdownclick);

		BaseClass.retryClick(segmentdropdownclick);

//		segmentdropdownclick.click();
		//Thread.sleep(3000);
		BaseClass.wait_element_clickable(clickSearchSegement);
		BaseClass.wait_element_visible(clickSearchSegement);
		clickSearchSegement.click();
		clickSearchSegement.sendKeys("CAR");
		//Thread.sleep(2000);
		Options.click();
		
		
	}
	
	public void selectModel() throws InterruptedException
	{
		//Thread.sleep(4000);
		
		BaseClass.wait_element_visible(modelWait);
		BaseClass.wait_element_clickable(modelWait);
		
		BaseClass.wait_element_visible(modeldropdownclick);
		BaseClass.wait_element_clickable(modeldropdownclick);
		modeldropdownclick.click();
		clickmodelsearch.click();
		clickmodelsearch.sendKeys("Figo");
		//Thread.sleep(2000);
		Options.click();
		
		
	}
	
	public void selectFuelType() throws InterruptedException
	{
//		Fueldropdownclick.click();
//		clickfuelsearch.click();
//		clickfuelsearch.sendKeys("Petrol");
		//Thread.sleep(2000);
//		Options.click();
		
	}
	
	public String verifyTermsConditions()
	{
		String agree= IAgreeTo.getText();
		String terms=TermsConditions.getText();
		
		String verifyterms = agree + terms ;
		
		System.out.println(verifyterms);
		
		return verifyterms;
	
		
	}
	
	public void clickonAgreeCheckBox()
	{
		BaseClass.wait_element_visible(checkbox);
		BaseClass.wait_element_clickable(checkbox);
		
		BaseClass.retryClick(checkbox);

//		checkbox.click();
	}
	
	public void clickonRegistrationButton() throws InterruptedException
	{
		BaseClass.wait_element_clickable(Regbutton);
		BaseClass.wait_element_visible(Regbutton);
		Regbutton.click();
		//Thread.sleep(4000);
	}


	public void verifyOtponReg() throws InterruptedException {
		
		//Thread.sleep(4000);
		otp.click();
		otp.sendKeys("12345");
		otpbutton.click();
		
	}

    public void clickonSkip()
    {
    	skip.click();
    }
	public String verifyRegSucessorNot() throws InterruptedException{
		
		String regSucess = regsucess.getText();
		System.out.print(regSucess);
		return regSucess;
	}


public String verifypopupisdisplayed() throws InterruptedException{
		
		String message = popupmsg.getText();
		System.out.print(message);
		return message;
	}


public void verifyRegbuttonisenabled() throws InterruptedException{
	
	if(RegbuttonDisabled.isEnabled())
	{
		//Assert.fail("Register button is enabled");
		System.out.println("Registration button is not Disabled");
	}
	else
		
		System.out.println("Registration button is Disabled");
}


public void enterbatteryserialno(String serno) {
	batteryserialnum.click();
	batteryserialnum.sendKeys(serno);
	System.out.println(serno);
	
}

public void entersellercode() {

    sellercode.click();
    sellercode.sendKeys("10012209");

}
}
