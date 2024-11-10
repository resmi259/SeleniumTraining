package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base {
	
	public void webElementCommands()
	{
		
		WebElement showMessageButton = driver.findElement(By.id("button-one"));
		WebElement classNameSample =driver.findElement(By.className("clearfix"));
		WebElement nameSample =driver.findElement(By.name("viewport"));
		WebElement tagNameSample = driver.findElement(By.tagName("header"));
		WebElement linkTextSample =driver.findElement(By.linkText("Checkbox Demo"));
		WebElement partialLinkTextSample =driver.findElement(By.partialLinkText("Checkbox"));
		
		//using linktext 
		
		WebElement selectInput =driver.findElement(By.linkText("Select Input"));
		WebElement formSubmit =driver.findElement(By.linkText("Form Submit"));
		WebElement ajaxformsubmit =driver.findElement(By.linkText("Ajax Form Submit"));
		WebElement radioButton =driver.findElement(By.linkText("Radio Buttons Demo"));
		WebElement simpleFormDemo =driver.findElement(By.linkText("Simple Form Demo"));
		//using id
		
		WebElement progressBarsid =driver.findElement(By.id("progress-bars"));
		WebElement listBox =driver.findElement(By.id("list0box"));
		WebElement alertModals = driver.findElement(By.id("alert-modal"));
		WebElement others =driver.findElement(By.id("others"));
		
	
		
		//using partiallink 
		WebElement jquerySelect2=driver.findElement(By.partialLinkText("Jquery"));
		WebElement ajaxformsubmit2 =driver.findElement(By.partialLinkText("Ajax"));
		WebElement simpleFormDemo2 =driver.findElement(By.partialLinkText("Form Demo"));
		WebElement radioButton2 =driver.findElement(By.partialLinkText("Buttons Demo"));

		
		
		driver.navigate().to("https://www.amazon.in/");
		
		//By id
		
		WebElement searchAmazon = driver.findElement(By.id("nav-search-submit-button"));
		
		
		
		//By classname
		WebElement amazonLogo =driver.findElement(By.className("nav-logo-link"));
		WebElement cartLogo =driver.findElement(By.className("nav-cart-icon"));
		WebElement flag =driver.findElement(By.className("icp-nav-flag"));
		//WebElement address =driver.findElement(By.className("nav-line-2 nav-progressive-content"));
		WebElement home =driver.findElement(By.className("hm-icon-label"));
		
		
		//By partiallink
		WebElement pressReleases =driver.findElement(By.partialLinkText("Press Releases"));
		
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 		WebElementCommands webelementcommands =new WebElementCommands();
		webelementcommands.intializeBrowser();
		webelementcommands.webElementCommands();
		webelementcommands.driverQuit();
 
	}

}
