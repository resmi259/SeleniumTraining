package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.PageUtility;

public class AdminUsers {
	
	WebDriver driver ;
	PageUtility pageutility;
	
	public  AdminUsers (WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath ="//li[@class='nav-item has-treeview menu-open']//descendant::i[@class=\"fas fa-angle-left right\"]") private WebElement adminUserlink;
	@FindBy(xpath ="//p[text()='Manage Users']") private WebElement manageUserLink;
	@FindBy(xpath="//a[@onclick=\"click_button(1)\"]")  private WebElement createnewcontactbutton;
	@FindBy(xpath="//input[@id='username']")  private WebElement userNameInputField;
	@FindBy(xpath="//input[@id='password']")  private WebElement passwordInputField;
	@FindBy(xpath="//select[@id='user_type']")  private WebElement userTypeDropdown;
	@FindBy(xpath="//button[@name='Create']")  private WebElement savebutton;
	@FindBy(xpath="//div[contains(@class,'alert alert-success alert-dismissible')]") private WebElement alert;
	
	public void adminUserlinkClick()
	{
		adminUserlink.click();
		
	}
	
	public void manageUserlinkClick()
	{
		manageUserLink.click();
		
	}
	
	public void createnewClick()
	{
		createnewcontactbutton.click();
	}
	public void enterUserName(String username)
	{
		userNameInputField.sendKeys(username);	
	}
	public void enterPassWord(String password)
	{
		passwordInputField.sendKeys(password);	
	}
	
	public void selectuserTypeDropdown()
	{
		pageutility.dropdownSelectbyTIndex(userTypeDropdown, 1);	
	}
	public void clickSave()
	{
		savebutton.click();
	}
	public boolean isalertDisplayed()
	{
		boolean alertdisplay =alert.isDisplayed();
		return alertdisplay ;
	}
	
	
	
	
}
