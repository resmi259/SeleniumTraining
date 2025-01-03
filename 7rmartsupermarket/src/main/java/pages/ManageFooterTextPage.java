package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.RandomUtility;

public class ManageFooterTextPage {
	
	WebDriver driver;
	RandomUtility randomutility =new RandomUtility();
	
	public ManageFooterTextPage(WebDriver driver)
	{
		this.driver =driver ;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="(//i[@class ='fas fa-arrow-circle-right'])[10]") private WebElement managefootertextlink;
	@FindBy(xpath ="(//i[@class='fas fa-edit'])[1]") private WebElement editfooterbutton;
	@FindBy(xpath ="//input[@id='phone']") private WebElement phoneinputfield;
	@FindBy(xpath ="//button[@name='Update']") private WebElement updatebutton ;
	@FindBy(xpath ="//div[@class='alert alert-success alert-dismissible']") private WebElement alertmessage ;
	
			
	public ManageFooterTextPage clickManagerFooterLink()
	{
		managefootertextlink.click();
		return this;
		
	}
		
	public ManageFooterTextPage editFootertext()
	{
		editfooterbutton.click();
		return this;
	}
		
	public ManageFooterTextPage enterPhoneNumber()
	{
		double phonenumber =randomutility.randonNumberGenerator();
		String phonenum=Double.toString(phonenumber);
		phoneinputfield.sendKeys(phonenum);
		return this;
		
	}
	
	public ManageFooterTextPage clickUpdate()
	{
		updatebutton.click();	
		return this;
	}
	public boolean alertMessageDisplayed()
	{
		boolean ismsgDisplayed = alertmessage.isDisplayed();
		return ismsgDisplayed;
				
	}
	

}
