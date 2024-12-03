package testscripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import constants.Constants;
import pages.LoginPage;
import pages.SubCategoryPage;
import utility.ExcelUtility;

public class SubCategoryTest extends Base {
	
	@Test
	
	public void verifyUserAbletoCreateSubCategory()
	{
		String userNameValue =ExcelUtility.getString(1, 0, "LoginPage");
	    String passwordValue =ExcelUtility.getString(1, 1, "LoginPage");
	    LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(userNameValue);
	    loginpage.enterPassWordonPassWordField(passwordValue);
	    loginpage.clickSignIn();  
	    String filepath =Constants.SUBCATEGORYFILEUPLOAD;
	    SubCategoryPage subcategorypage= new SubCategoryPage(driver);
	    subcategorypage.subcategorylinkclick();
	    subcategorypage.clickNewSubCategory();
	    subcategorypage.entersubcategoryvalue();
	    subcategorypage.categoryselect();
	    subcategorypage.uploadImage(filepath);
	    subcategorypage.saveSubcategory();
	    boolean alertDisplayed =subcategorypage.isSaveAlertAvailable();
	    assertTrue(alertDisplayed,"User not able to save SubCategory");
	    
		
	}
	

}
