package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageNewsPage;
import utility.ExcelUtility;

public class ManageNewsTest extends Base {
	
@Test(description ="this is for adding news",groups = {"regression"},retryAnalyzer=retry.Retry.class)

public void verifythatUserIsAbletoAddNews()
{
	String userNameValue =ExcelUtility.getString(1, 0, "LoginPage");
	String passwordValue =ExcelUtility.getString(1, 1, "LoginPage");
	String news = ExcelUtility.getString(1, 0, "ManageNews");
    LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUsernameOnUsernameField(userNameValue).enterPassWordonPassWordField(passwordValue).clickSignIn();  
    ManageNewsPage managenewspage = new ManageNewsPage(driver);
    managenewspage.clickManagenews();
    managenewspage.clickNew();
    managenewspage.enterNews(news);
    managenewspage.saveNews(news);
    boolean successMessageDisplayed =managenewspage.checksavesuccessful();
    Assert.assertTrue(successMessageDisplayed, "Not able to add the news");
	
}


}
