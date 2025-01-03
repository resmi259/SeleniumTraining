package testscripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import constants.Constants;
import pages.LoginPage;
import pages.SubCategoryPage;
import utility.ExcelUtility;

public class SubCategoryTest extends Base {
	
	LoginPage loginpage;
	SubCategoryPage subcategorypage;
	
	@Test(description="this is for creating a subcategory for a category",groups = {"regression"} ,retryAnalyzer=retry.Retry.class)	
	public void verifyUserAbletoCreateSubCategory()
	{
		String userNameValue =ExcelUtility.getString(1, 0, "LoginPage");
	    String passwordValue =ExcelUtility.getString(1, 1, "LoginPage");
	    String categoryname = ExcelUtility.getString(1, 0, "CategoryValue");
	    String filepath =Constants.SUBCATEGORYFILEUPLOAD;
	    subcategorypage=loginpage.enterUsernameOnUsernameField(userNameValue).enterPassWordonPassWordField(passwordValue).clickSignIn()
	    .subcategorylinkclick().clickNewSubCategory().entersubcategoryvalue().categoryselect(categoryname).uploadImage(filepath).saveSubcategory();
	    boolean alertDisplayed =subcategorypage.isSaveAlertAvailable();
	    assertTrue(alertDisplayed,"User not able to save SubCategory");
	    
		
	}
	

}
