package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.PageUtility;

public class ManageCategory {
	
	public WebDriver driver;
	PageUtility pageutility =new PageUtility();
	
	public ManageCategory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//p[text()='Manage Category']") private WebElement manageCategory;
	@FindBy(xpath="//a[@onclick='click_button(2)'] ") private WebElement searchbutton;
	@FindBy(xpath="//input[@name='un'] ") private WebElement categoryInput;
	@FindBy(xpath="//button[@name='Search']") private WebElement categorysearchbutton;
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']//td[1]") private WebElement resultCategory;
	
	
	
	public void clickManageCategorylink()
	{
		manageCategory.click();
	}
	public void clickSearchbutton()
	{
		searchbutton.click();
	}
	
	public void enteCategoryInputvalue(String categoryname)
	{
		categoryInput.sendKeys(categoryname);
	}
	
	public void clickcategorysearchbutton()
	{
		categorysearchbutton.click();
	}
	public String categoryDisplayed()
	
	{
		String categoryOnSearch = resultCategory.getText();
		return categoryOnSearch;
	}
	
	
	
}
