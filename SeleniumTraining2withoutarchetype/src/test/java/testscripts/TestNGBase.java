package testscripts;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGBase {
	WebDriver driver;
@BeforeMethod
	public void initializeBrowser()
	{
		driver =new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

@AfterMethod
	public void driverQuit()
	{
		
		driver.quit();
	}


	
}
