package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.SearchAdminUsersPage;
import utility.ExcelUtility;



public class SearchAdminUsersTest extends Base{
	
	@Test
	public void verifythatNoResultsDisplayedWhenSearchWithInvalidUserName()
	
	{
		String userName=ExcelUtility.getString(1, 0, "LoginPage");
		String password=ExcelUtility.getString(1, 1, "LoginPage");
		String searchUserName=ExcelUtility.getString(1, 0, "AdminUser");
		String userType=ExcelUtility.getString(1, 0, "AdminUserType");
		LoginPage loginpage = new LoginPage( driver);
		loginpage.enterUsernameOnUsernameField(userName).enterPassWordonPassWordField(password).clickSignIn();
		SearchAdminUsersPage adminuserssearchpage = new SearchAdminUsersPage(driver);
		adminuserssearchpage.clickadminUserLink().clickSearchButton().enterUserName(searchUserName).enterUserNameType(userType).enterSearch();
		String expectedResult =".........RESULT NOT FOUND.......";
		String actualResult= adminuserssearchpage.getresults();
		Assert.assertEquals(actualResult, expectedResult);
		
	}
}
