package testscripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.AdminUsersPage;
import pages.LoginPage;
import utility.ExcelUtility;

public class AdminUsersTest extends Base {
	
	@Test(description="this is for creating an Admin User",groups = {"smoke"} ,retryAnalyzer=retry.Retry.class)
	
	public void verifyUserIsAbletoCreateanAdminUser()
	
	{
		String userNameValue =ExcelUtility.getString(1, 0, "LoginPage");
	    String passwordValue =ExcelUtility.getString(1, 1, "LoginPage");
	    String valueUserName = ExcelUtility.getString(1, 0, "AdminUser");
	    String valuePassWord = ExcelUtility.getString(1, 1, "AdminUser");
	    String usertype =ExcelUtility.getString(1, 0, "AdminUserType");
	    LoginPage loginpage = new LoginPage(driver) ;
		loginpage.enterUsernameOnUsernameField(userNameValue).enterPassWordonPassWordField(passwordValue).clickSignIn();
	    AdminUsersPage adminusers = new AdminUsersPage(driver);
	    adminusers.adminUserlinkClick().createnewClick().enterUserName(valueUserName).enterPassWord(valuePassWord).selectuserTypeDropdown(usertype).clickSave();
	    boolean alertvalue =adminusers.isalertDisplayed();
	    assertTrue(alertvalue, "Admin User Creation failed");
		
	}
	

}
