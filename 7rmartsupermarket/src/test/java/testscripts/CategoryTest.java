package testscripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import constants.Constants;
import pages.CategoryPage;
import pages.LoginPage;
import utility.ExcelUtility;

public class CategoryTest extends Base {
	
	 LoginPage loginpage = new LoginPage(driver);

	@Test(description="this is for creating a category",groups = {"smoke"} )
	
public void verifyWhetherUserIsabletoCreateACategory()
{
	
	String userNameValue =ExcelUtility.getString(1, 0, "LoginPage");
	String passwordValue =ExcelUtility.getString(1, 1, "LoginPage");
   	loginpage.enterUsernameOnUsernameField(userNameValue);
    loginpage.enterPassWordonPassWordField(passwordValue);
    loginpage.clickSignIn();  
    String categoryname = ExcelUtility.getString(1, 0, "CategoryValue");
    String filepath=Constants.CATEGORYPAGEFILEUPLOAD;
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
