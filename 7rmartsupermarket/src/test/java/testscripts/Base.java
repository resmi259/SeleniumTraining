package testscripts;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import utility.ScreenshotUtility;
import utility.WaitUtility;

public class Base {
	
	WebDriver driver;
	@BeforeMethod(alwaysRun=true)
	@Parameters("browser")
	
	public void initialiseBrowser(String browser) throws Exception
	
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver =new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
		}
		else if (browser.equalsIgnoreCase("FireFox"))
			
		{
			driver = new FirefoxDriver();
		}
		
		else 
		{
			throw new Exception("Invalid Browser");
		}
		 driver.get("https://groceryapp.uniqassosiates.com/admin/login");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitUtility.IMPLICIT_WAIT));
		 driver.manage().window().maximize();
	}
	@AfterMethod(alwaysRun=true)
	
	
	public void driverQuit(ITestResult iTestResult) throws IOException
	{
		if (iTestResult.getStatus() == ITestResult.FAILURE) {
			ScreenshotUtility sc = new ScreenshotUtility();
			sc.getScreenshot(driver, iTestResult.getName());
		}
		driver.quit();
	}
		
	

}
