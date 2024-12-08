package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageCategory;
import utility.ExcelUtility;


public class ManageCategoryTest  extends Base {
	
	
	@Test(description="this is for searching a category",groups = {"regression"} )
	
	public void verifyThatUserIsAbletoSearchACategory()
	{
		String userNameValue =ExcelUtility.getString(1, 0, "LoginPage");
		String passwordValue =ExcelUtility.getString(1, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
	   	loginpage.enterUsernameOnUsernameField(userNameValue);
	    loginpage.enterPassWordonPassWordField(passwordValue);
	    loginpage.clickSignIn();
		ManageCategory managecatgory = new ManageCategory(driver);
		managecatgory.clickManageCategorylink();
		managecatgory.clickSearchbutton();
		String categoryName = ExcelUtility.getString(1, 0, "ManageCategory");
		managecatgory.enteCategoryInputvalue(categoryName);
		managecatgory.clickcategorysearchbutton();
		String categoryvalue= managecatgory.categoryDisplayed();
		Assert.assertEquals(categoryName,categoryvalue,"Category Search is not working");
	}

}
