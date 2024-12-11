package testscripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import constants.Constants;
import pages.CategoryPage;
import pages.LoginPage;
import utility.ExcelUtility;

public class CategoryTest extends Base {
	
	

	@Test(description="this is for creating a category",groups = {"smoke"},retryAnalyzer=retry.Retry.class)
	
public void verifyWhetherUserIsabletoCreateACategory()
{
	LoginPage loginpage = new LoginPage(driver);
	String userNameValue =ExcelUtility.getString(1, 0, "LoginPage");
	String passwordValue =ExcelUtility.getString(1, 1, "LoginPage");
    String categoryname = ExcelUtility.getString(1, 0, "CategoryValue");
    String filepath=Constants.CATEGORYPAGEFILEUPLOAD;
	loginpage.enterUsernameOnUsernameField(userNameValue).enterPassWordonPassWordField(passwordValue).clickSignIn();  
    CategoryPage categorypage =new CategoryPage(driver);
    categorypage.clickCategorylink();
    categorypage.createNewCategoryclick();
    categorypage.enterCategoryName(categoryname);
    categorypage.discountSelection();
    categorypage.imageUploadclick(filepath);
    categorypage.saveCategory();
    boolean success = categorypage.IsSaveSuccessMessageDisplayed();
    assertTrue(success,"Category creation failed");
    }


}
