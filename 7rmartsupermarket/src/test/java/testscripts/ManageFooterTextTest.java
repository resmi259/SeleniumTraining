package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageFooterTextPage;
import utility.ExcelUtility;


public class ManageFooterTextTest extends Base {
	
	@Test (description = "this is check whether user is able to update footer",groups ="regression",retryAnalyzer=retry.Retry.class)
	public void verifyUserIsAbleToUpdateFooter()
	
	{   		
		String userNameValue =ExcelUtility.getString(1, 0, "LoginPage");
		String passwordValue =ExcelUtility.getString(1, 1, "LoginPage");
		LoginPage loginpage =new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(userNameValue).enterPassWordonPassWordField(passwordValue).clickSignIn();
		ManageFooterTextPage managefootertextpage = new ManageFooterTextPage(driver);
		managefootertextpage.clickManagerFooterLink().editFootertext().enterPhoneNumber().clickUpdate();
		boolean successupdate =managefootertextpage.alertMessageDisplayed();
		Assert.assertTrue(successupdate, "User is not able to update the Footertext");
		
	}

}
