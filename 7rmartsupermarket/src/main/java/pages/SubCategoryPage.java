package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import utility.FileUploadUtility;
import utility.PageUtility;
import utility.RandomUtility;

public class SubCategoryPage {
	
	WebDriver driver ;
	RandomUtility  randomutility =new RandomUtility();
	FileUploadUtility fileuploadutility =new FileUploadUtility();
	PageUtility pageutility = new PageUtility();
	
	public  SubCategoryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//i[@class='nav-icon fas fa-file-o']//following::p[text()='Sub Category']") private WebElement subcategoryLink;
	@FindBy(xpath="//a[@onclick='click_button(1)']") private WebElement newLink;
	@FindBy(xpath="//select[@id=\"cat_id\"]") private WebElement categoryDropdown;
	@FindBy(xpath ="//input[@id='subcategory']") private WebElement subcategoryInputField;
	@FindBy(xpath ="//input[@id='main_img']") private WebElement imageUpload;
	@FindBy(xpath="//button[text()='Save']") private WebElement subcategorySavebutton;
	@FindBy(xpath="//div[contains(@class,'alert-succes')]") private WebElement saveAlert;

	
    public SubCategoryPage subcategorylinkclick()
    {
    	subcategoryLink.click();
    	return this;
    }
    
    public SubCategoryPage clickNewSubCategory()
    {
    	newLink.click();
     	return this;
    }
    public SubCategoryPage categoryselect(String categoryname)
    {
    	pageutility.dropdownSelectbyText(categoryDropdown, categoryname);
     	return this;
    	  
    }
    
    public SubCategoryPage entersubcategoryvalue()
    
    {  
    	String categoryNameRn= randomutility.createaFirstName();
       subcategoryInputField.sendKeys(categoryNameRn);
    	return this;
    	
    }
    
    public SubCategoryPage uploadImage(String filepath)
    {
    	fileuploadutility.verifyFileUploadusingSendKeys(imageUpload, filepath);
     	return this;
    }

    public SubCategoryPage saveSubcategory()
    {
    	subcategorySavebutton.click();
     	return this;
    }
    public boolean isSaveAlertAvailable()
    
    {
    	boolean saveAlterDisplayed =saveAlert.isDisplayed();
    	return saveAlterDisplayed ;
    	
    }
}
