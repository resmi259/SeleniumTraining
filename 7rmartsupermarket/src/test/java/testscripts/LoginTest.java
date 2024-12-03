package testscripts;


import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import pages.LoginPage;
import utility.ExcelUtility;

public class LoginTest extends Base {
	
	@Test
	public void verifyUserLoginWithCorrectUsernameAndPassword()
	
	{   String userNameValue =ExcelUtility.getString(1, 0, "LoginPage");
	    String passwordValue =ExcelUtility.getString(1, 1, "LoginPage");
		LoginPage loginpage =new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(userNameValue);
	    loginpage.enterPassWordonPassWordField(passwordValue);
	    loginpage.clickSignIn();  
		boolean isInHomePage =loginpage.isHomePageAvailable();
		assertTrue(isInHomePage,"User is not able to login with valid username and password");
        		
	}
	@Test
	public void verifyUserLoginwithvalidUsernameAndInValidPassword()
	
	{
		    String userNameValue =ExcelUtility.getString(2, 0, "LoginPage");
		    String passwordValue =ExcelUtility.getString(2, 1, "LoginPage");
			LoginPage loginpage =new LoginPage(driver);
			loginpage.enterUsernameOnUsernameField(userNameValue);
		    loginpage.enterPassWordonPassWordField(passwordValue);
		    loginpage.clickSignIn(); 
		    boolean alertdisplay = loginpage.isAlertDisplayed();		    
			assertTrue( alertdisplay,"User is able to login with wrong password");
						
	}
	@Test
	
    public void verifyUserLoginwithInvalidUsernameAndValidPassword()
	
	{
		    String userNameValue =ExcelUtility.getString(3, 0, "LoginPage");
		    String passwordValue =ExcelUtility.getString(3, 1, "LoginPage");
			LoginPage loginpage =new LoginPage(driver);
			loginpage.enterUsernameOnUsernameField(userNameValue);
		    loginpage.enterPassWordonPassWordField(passwordValue);
		    loginpage.clickSignIn(); 
		    boolean alertdisplay = loginpage.isAlertDisplayed();		    
			assertTrue( alertdisplay,"User is able to login  with wrong username");
					
							
	}
	@Test
    public void verifyUserLoginwithInvalidUsernameAndInValidPassword()
	
	{
		    String userNameValue =ExcelUtility.getString(4, 0, "LoginPage");
		    String passwordValue =ExcelUtility.getString(4, 1, "LoginPage");
			LoginPage loginpage =new LoginPage(driver);
			loginpage.enterUsernameOnUsernameField(userNameValue);
		    loginpage.enterPassWordonPassWordField(passwordValue);
		    loginpage.clickSignIn(); 
		    boolean alertdisplay = loginpage.isAlertDisplayed();
		    assertTrue( alertdisplay,"User is able to login with wrong username and wrong password");
						
	}

}
