package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageNewsPage;
import utility.ExcelUtility;

public class ManageNewsTest extends Base {
	
@Test(description ="this is for adding news",groups = {"regression"})

public void verifythatUserIsAbletoAddNews()
{
	String userNameValue ="admin";
    String passwordValue ="admin";
    LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUsernameOnUsernameField(userNameValue);
    loginpage.enterPassWordonPassWordField(passwordValue);
    loginpage.clickSignIn();  
    ManageNewsPage managenewspage = new ManageNewsPage(driver);
    managenewspage.clickManagenews();
    managenewspage.clickNew();
    String news = ExcelUtility.getString(1, 0, "ManageNews");
    managenewspage.enterNews(news);
    managenewspage.saveNews(news);
    boolean successMessageDisplayed =managenewspage.checksavesuccessful();
    Assert.assertTrue(successMessageDisplayed, "Not able to add the news");
	
}


}
