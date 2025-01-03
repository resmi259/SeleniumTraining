package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.PageUtility;

public class SearchAdminUsersPage {
	
	
	WebDriver driver;
	PageUtility pageutility = new PageUtility();
	
	public SearchAdminUsersPage(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//p[text()='Admin Users']//following::i[2]") private WebElement adminUserlink;
	@FindBy(xpath ="//a[@onclick='click_button(2)']") private WebElement searchButton;
	@FindBy(xpath ="//input[@name='un']") private WebElement adminInputField;
	@FindBy(xpath="//select[@id='user_type']")  private WebElement userTypeDropdown;
	@FindBy(xpath="//button[@name='Search']")  private WebElement enterSearch;
	@FindBy(xpath="//table [@class='table table-bordered table-hover table-sm']//td//following::span[@id='res']")  private WebElement searchResult;
	
	
	public SearchAdminUsersPage clickadminUserLink()
	{
		adminUserlink.click();
		return this;
	}
	
	public SearchAdminUsersPage clickSearchButton()
	{
		searchButton.click();
		return this;
	}

	public SearchAdminUsersPage enterUserName(String username)
	{
		
		adminInputField.sendKeys(username);
		return this;
	}
	public SearchAdminUsersPage enterUserNameType (String usernameType)
	{
		pageutility.dropdownSelectbyText(userTypeDropdown, usernameType);
		
		return this;
	}
	
	public SearchAdminUsersPage enterSearch( )
	{
		enterSearch.click();
		return this;
	}
	
	public String getresults()
	{
		return searchResult.getText();
		
	
		
	}
	
	

}
