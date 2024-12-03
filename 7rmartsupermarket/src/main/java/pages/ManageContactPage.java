package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.PageUtility;
import utility.RandomUtility;

public class ManageContactPage {
	
	WebDriver driver ;
	RandomUtility randomutility =new RandomUtility();
	PageUtility pageutility =new PageUtility();
	
	public  ManageContactPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']//tbody//tr[1]/td[6]") private WebElement editButton;
	@FindBy(xpath="//p[text()='Manage Contact']") private WebElement manageContactLink;
	@FindBy(xpath="//textarea[@name=\"address\"]") private WebElement addressInputField;
	@FindBy(xpath="//button[@name='Update']") private WebElement updateButton;
	@FindBy(xpath="//div[contains (@class,'alert-success')]") private WebElement saveAlert;
	
	public void clickManageContact()
	{
		manageContactLink.click();
	}
	
    public void editcontactbutton()
    {
    	editButton.click();
    }
    
    public void enterAddress()
    
    {
    	addressInputField.clear();
    	String address = randomutility.createaFirstName();
    	addressInputField.sendKeys(address);
    }
    public void clickUpdate()
    {
    	pageutility.scrollByAxis(driver);
    	updateButton.click();
    }
    
    public boolean IsSaveAlertDisplayed()
    
    {
    	 boolean alertdisplayed =saveAlert.isDisplayed();
    	 return alertdisplayed;
    }
    
}
