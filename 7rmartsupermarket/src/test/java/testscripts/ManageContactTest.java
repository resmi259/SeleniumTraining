package testscripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageContactPage;

public class ManageContactTest extends Base {
	
	@Test (description="this is for editing  address of a contact",groups = {"smoke"} )
	public void VerifythatUserisAbletoUpdatetheContact()
	{
		String userNameValue ="admin";
	    String passwordValue ="admin";
	    LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(userNameValue);
	    loginpage.enterPassWordonPassWordField(passwordValue);
	    loginpage.clickSignIn();  
	    ManageContactPage managecontactpage = new ManageContactPage(driver);
	    managecontactpage.clickManageContact();
	    managecontactpage.editcontactbutton();
	    managecontactpage.enterAddress();
	    managecontactpage.enterAddress();
	    managecontactpage.clickUpdate();
	    boolean alertDisplay =managecontactpage.IsSaveAlertDisplayed();
	    assertTrue(alertDisplay,"Not able to update contact");
	    
	}

}
