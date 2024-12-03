package testscripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utility.WaitUtility;

public class Base {
	
	WebDriver driver;
	@BeforeMethod
	
	public void initialiseBrowser()
	{
		 driver =new ChromeDriver();
		 driver.get("https://groceryapp.uniqassosiates.com/admin/login");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitUtility.IMPLICIT_WAIT));
		 driver.manage().window().maximize();
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
	

}
