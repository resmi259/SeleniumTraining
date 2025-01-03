package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchNewsPage {
	
	 WebDriver driver;
	
	public SearchNewsPage( WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
@FindBy(xpath="//p[text()='Manage News']") private WebElement managenewslink;
@FindBy(xpath="//a[@onclick='click_button(2)']") private WebElement newsSearchButton ;
@FindBy(xpath="//input[@name='un']") private WebElement newsInputField ;
@FindBy(xpath="//button[@name='Search']") private WebElement searchButton;
@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']//td[1]") private WebElement searchResult;


public SearchNewsPage clickManageNewsLink()
{
	managenewslink.click();
	return this;
	
}

public SearchNewsPage clickSearchButton()
{
	newsSearchButton.click();
	return this;
}

public SearchNewsPage enterNewsText(String news)
{
	
	newsInputField.sendKeys(news);
	return this;
}

public SearchNewsPage finalSearch()
{
	searchButton.click();
	return this;

}

public String checkNewsDisplayed()

{
	String  result =searchResult.getText();
	return result;
	
}




	

}
