package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
	
	public WebDriver driver ;
	
	public ManageNewsPage(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//p[text()='Manage News']") private WebElement managenewslink;
	@FindBy(xpath="//a[@onclick='click_button(1)']") private WebElement newsCreatebutton;
	@FindBy(xpath="//textarea[@id='news']") private WebElement newsInput ;
	@FindBy(xpath="//button[text()='Save']") private WebElement newsSavebutton;
	@FindBy(xpath="//i[@class='icon fas fa-check']") private WebElement aletmessage ;

	
	public ManageNewsPage clickManagenews()
	{
		managenewslink.click();
		return this;
	}
	
	public ManageNewsPage clickNew()
	{
		newsCreatebutton.click();
		return this;
	}
	
	public ManageNewsPage enterNews(String news)
	{
		newsInput.sendKeys(news);
		return this;
	}
	
	public ManageNewsPage saveNews(String news)
	{
		newsSavebutton.click();
		return this;
	}
	
	public boolean checksavesuccessful()
	
	{
		boolean isNewsSaved =aletmessage.isDisplayed();
		return isNewsSaved;
	}
	

}
