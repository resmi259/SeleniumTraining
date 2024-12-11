package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageCategoryPage;
import utility.ExcelUtility;


public class ManageCategoryTest  extends Base {
	
	
	@Test(description="this is for searching a category",groups = {"regression"} ,retryAnalyzer=retry.Retry.class)
	
	public void verifyThatUserIsAbletoSearchACategory()
	{
		String userNameValue =ExcelUtility.getString(1, 0, "LoginPage");
		String passwordValue =ExcelUtility.getString(1, 1, "LoginPage");
		String categoryName = ExcelUtility.getString(1, 0, "ManageCategory");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(userNameValue).enterPassWordonPassWordField(passwordValue).clickSignIn();
		ManageCategoryPage managecatgory = new ManageCategoryPage(driver);
		managecatgory.clickManageCategorylink();
		managecatgory.clickSearchbutton();
		managecatgory.enteCategoryInputvalue(categoryName);
		managecatgory.clickcategorysearchbutton();
		String categoryvalue= managecatgory.categoryDisplayed();
		Assert.assertEquals(categoryName,categoryvalue,"Category Search is not working");
	}

}
