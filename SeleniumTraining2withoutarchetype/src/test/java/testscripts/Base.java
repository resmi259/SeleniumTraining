package testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driver;
	
	public void intializeBrowser()
	
	{
		driver =new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		
	}
	public void driverQuit()
	
	{
//		driver.quit();
		driver.close();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base base =new Base();
		base.intializeBrowser();
		base.driverQuit();
		

	}

}
