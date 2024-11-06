package testscripts;

public class BrowserCommands extends Base {
	
	public void browserCommands()
	{
		String url =driver.getCurrentUrl();
		String title=driver.getTitle();
		
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
		browsercommands.navigateCommands();
		browsercommands.driverQuit();
	}

}
