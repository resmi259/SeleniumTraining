package testscripts;


import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import utility.ExcelUtility;

public class LoginTest extends Base {
	
	@Test(description="this is for successful login",groups= {"smoke","regression"},priority=1)
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
	@Test(description="this is for login with invalid password",groups= {"smoke"},priority=2)
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
	@Test(description="this is for login with invalid username",groups= {"regression"})
	
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
	@Test(description="this is for login with invalid username",groups = {"regression"} ,dataProvider="InvalidLogInData")
    public void verifyUserLoginwithInvalidUsernameAndInValidPassword(String userNameValue,String passwordValue)
	
	{

			LoginPage loginpage =new LoginPage(driver);
			loginpage.enterUsernameOnUsernameField(userNameValue);
		    loginpage.enterPassWordonPassWordField(passwordValue);
		    loginpage.clickSignIn(); 
		    boolean alertdisplay = loginpage.isAlertDisplayed();
		    assertTrue( alertdisplay,"User is able to login with wrong username and wrong password");
						
	}
	@DataProvider(name="InvalidLogInData")
	public Object[][] getDataFromDataProvider()
	{
		return new Object[][] {   
			
			new Object[] {"abc","abc"},
			new Object[] {"123","123"}
			
		};
		
	}

}
