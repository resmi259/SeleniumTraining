package testscripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.AdminUsers;
import pages.LoginPage;
import utility.ExcelUtility;

public class AdminUsersTest extends Base {
	
	@Test(description="this is for creating an Admin User",groups = {"smoke"} )
	
	public void verifyUserIsAbletoCreateanAdminUser()
	
	{
		String userNameValue =ExcelUtility.getString(1, 0, "LoginPage");
	    String passwordValue =ExcelUtility.getString(1, 1, "LoginPage");
	    LoginPage loginpage = new LoginPage(driver) ;
	   	loginpage.enterUsernameOnUsernameField(userNameValue);
	    loginpage.enterPassWordonPassWordField(passwordValue);
	    loginpage.clickSignIn();
	    String valueUserName = ExcelUtility.getString(1, 0, "AdminUser");
	    String valuePassWord = ExcelUtility.getString(1, 1, "AdminUser");
	    AdminUsers adminusers = new AdminUsers(driver);
	    adminusers.adminUserlinkClick();
	    adminusers.manageUserlinkClick();
	    adminusers.enterUserName(valueUserName);
	    adminusers.enterPassWord(valuePassWord);
	    adminusers.selectuserTypeDropdown();
	    adminusers.clickSave();
	    boolean alertvalue =adminusers.isalertDisplayed();
	    assertTrue(alertvalue, "Admin User Creation failed");
		
	}
	

}
