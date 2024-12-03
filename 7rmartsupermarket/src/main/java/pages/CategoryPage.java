package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.FileUploadUtility;
import utility.PageUtility;
import utility.WaitUtility;

public class CategoryPage {
	
	WebDriver driver ;
	PageUtility pageutility = new PageUtility();
	FileUploadUtility fileutility =new FileUploadUtility();
	WaitUtility waitutility = new WaitUtility();
	
		
	public  CategoryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//p[text()='Category']") private WebElement categoryLink;
	@FindBy(xpath="//a[@onclick='click_button(1)']") private WebElement createNewCategogy;
	@FindBy(xpath="//input[@id='category']") private WebElement categoryNameInputField;
	@FindBy(xpath="//li[@id='134-selectable']") private WebElement discountSelect;
	@FindBy(xpath="//input[@id='main_img']") private WebElement categoryImageUpload;
	@FindBy(xpath="//button[text()='Save']") private WebElement categorySave;
	@FindBy(xpath="//div[contains(@Class,'alert-success')]") private WebElement categorySaveSuccessAlert;
	@FindBy(xpath="//input[@id='main_img']") private WebElement imageUpoad;
	@FindBy(xpath ="//label[text()='Show On Top Menu']") private WebElement topMenu;
	
	
	public void clickCategorylink()
	{
		categoryLink.click();
	}
	
	public void createNewCategoryclick()
	{
		createNewCategogy.click();
	}
	
	public void enterCategoryName(String categoryName)
	{
		categoryNameInputField.sendKeys(categoryName);
	}
	
	public void discountSelection()
	{
		pageutility.actiondoubleClick(discountSelect, driver);
	}
	
	public void imageUploadclick(String filepath)
	{
		
		fileutility.verifyFileUploadusingSendKeys(imageUpoad, filepath);
		
		}
			
	public void saveCategory()
	{
	 waitutility.waitForElement(driver, categorySave);
	 pageutility.scrollByAxis(driver);
	 //pageutility.scrollByelement(driver, categorySave);
	 pageutility.scrollByelement(driver, topMenu);
	 categorySave.click();
		 
    	}
			
	public boolean IsSaveSuccessMessageDisplayed()
		{
		boolean categorySaveSuccess =categorySaveSuccessAlert.isDisplayed();
		return categorySaveSuccess;
    	}
	

	
	
	
	

}
