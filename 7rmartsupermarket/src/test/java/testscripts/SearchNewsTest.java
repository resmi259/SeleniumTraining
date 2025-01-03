package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.SearchNewsPage;
import utility.ExcelUtility;

public class SearchNewsTest extends Base{
	
	@Test (description ="this is verify the search functionality of news page",groups = {"smoke","regression"},retryAnalyzer=retry.Retry.class )
	public void verifyThatUserisAbletoSearchtheNewsSuccessfully()
	
	{
		String news =ExcelUtility.getString(1, 0, "ManageNews");
		String username =ExcelUtility.getString(1, 0, "LoginPage");
		String password =ExcelUtility.getString(1, 1, "LoginPage");
		LoginPage loginpage =new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPassWordonPassWordField(password).clickSignIn();
		SearchNewsPage searchnewspage = new SearchNewsPage(driver);
		searchnewspage.clickManageNewsLink().clickSearchButton().enterNewsText(news).finalSearch();
		String result =searchnewspage.checkNewsDisplayed();
		Assert.assertEquals(result, news);
				
	}

}
