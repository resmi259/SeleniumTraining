package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageContactPage;
import utility.ExcelUtility;

public class ManageContactTest extends Base {
	
	@Test (description="this is for editing  address of a contact",groups = {"smoke"},retryAnalyzer=retry.Retry.class)
	public void VerifythatUserisAbletoUpdatetheContact()
	{
		String userNameValue =ExcelUtility.getString(1, 0, "LoginPage");
		String passwordValue =ExcelUtility.getString(1, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(userNameValue).enterPassWordonPassWordField(passwordValue).clickSignIn();
	    ManageContactPage managecontactpage = new ManageContactPage(driver);
	    managecontactpage.clickManageContact();
	    managecontactpage.editcontactbutton();
	    managecontactpage.enterAddress();
	    managecontactpage.clickUpdate();
	    boolean alertDisplay =managecontactpage.IsSaveAlertDisplayed();
	    Assert.assertTrue(alertDisplay,"Not able to update contact");
	    
	}

}
