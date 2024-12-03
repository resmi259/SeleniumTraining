package testscripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import constants.Constants;
import pages.CategoryPage;
import pages.LoginPage;
import utility.ExcelUtility;

public class CategoryTest extends Base {

	@Test
	
public void verifyWhetherUserIsabletoCreateACategory()
{
	
	String userNameValue =ExcelUtility.getString(1, 0, "LoginPage");
	String passwordValue =ExcelUtility.getString(1, 1, "LoginPage");
    LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUsernameOnUsernameField(userNameValue);
    loginpage.enterPassWordonPassWordField(passwordValue);
    loginpage.clickSignIn();  
    String categoryname ="Grains";
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
