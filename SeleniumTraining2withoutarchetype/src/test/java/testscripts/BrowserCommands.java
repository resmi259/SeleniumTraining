package testscripts;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserCommands extends Base {
	
	public void browserCommands()
	{
		String url =driver.getCurrentUrl();
		String title=driver.getTitle();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains(title));
		
	}
	
	public void navigateCommands()
	{
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

	public static void main(String[] args) {
		
		BrowserCommands browsercommands = new BrowserCommands();
		browsercommands.intializeBrowser();
		browsercommands.browserCommands();
		browsercommands.navigateCommands();
		browsercommands.driverQuit();
	}

}
