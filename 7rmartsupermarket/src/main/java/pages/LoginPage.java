package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='username']")  private WebElement userNameField;
	@FindBy(xpath="//input[@name='password']") private WebElement passWordField;
	@FindBy(xpath="//button[text()='Sign In']") private WebElement signInButton;
	@FindBy(xpath="//p[text()='Dashboard']") private WebElement homePage;
	@FindBy(xpath="//div[contains(@class,'alert-danger')]") private WebElement alert;
	
	
	public LoginPage enterUsernameOnUsernameField(String username)
	{
		userNameField.sendKeys(username);
		return this;
	}
	public LoginPage enterPassWordonPassWordField(String password)
	{
		passWordField.sendKeys(password);
		return this;
	}
	public SubCategoryPage clickSignIn()
	{
		signInButton.click();
		return new SubCategoryPage (driver) ;
	}
	public boolean isHomePageAvailable()
	{
		boolean homePageDisplay =homePage.isDisplayed();
		return homePageDisplay;
	}
	
	public boolean isAlertDisplayed()
	{
		boolean alertdisplay =alert.isDisplayed();
		return alertdisplay;
	}
	
}
