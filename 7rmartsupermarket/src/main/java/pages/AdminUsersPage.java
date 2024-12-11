package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.PageUtility;
import utility.RandomUtility;

public class AdminUsersPage {
	
	WebDriver driver ;
	PageUtility pageutility = new PageUtility();
	RandomUtility randomutility = new RandomUtility();
	
	public  AdminUsersPage (WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath ="//p[text()='Admin Users']//following::i[2]") private WebElement adminUserlink;
	@FindBy(xpath="//a[@onclick=\"click_button(1)\"]")  private WebElement createnewcontactbutton;
	@FindBy(xpath="//input[@id='username']")  private WebElement userNameInputField;
	@FindBy(xpath="//input[@id='password']")  private WebElement passwordInputField;
	@FindBy(xpath="//select[@id='user_type']")  private WebElement userTypeDropdown;
	@FindBy(xpath="//button[@name='Create']")  private WebElement savebutton;
	@FindBy(xpath="//div[contains(@class,'alert alert-success alert-dismissible')]") private WebElement alert;
	
	public AdminUsersPage adminUserlinkClick()
	{
		adminUserlink.click();
		return this;
		}	

	public AdminUsersPage createnewClick()
	{
		createnewcontactbutton.click();
		return this;
	}
	public AdminUsersPage enterUserName(String username)
	
	{   String userName= randomutility.createaFirstName();
		userNameInputField.sendKeys(userName);	
		return this;
	}
	public AdminUsersPage enterPassWord(String password)
	{
		passwordInputField.sendKeys(password);	
		
		return this;
	}
	
	public AdminUsersPage selectuserTypeDropdown(String usertypevalue)
	{
		
		pageutility.dropdownSelectbyText(userTypeDropdown, usertypevalue);
		return this;
	}
	public AdminUsersPage clickSave()
	{
		savebutton.click();
		return this;
	}
	public boolean isalertDisplayed()
	{
		boolean alertdisplay =alert.isDisplayed();
		return alertdisplay ;
	}
	
	
	
	
}
