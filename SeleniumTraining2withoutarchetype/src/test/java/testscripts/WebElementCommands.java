package testscripts;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementCommands extends Base {
	
	public void locators()
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
	
		WebElement showMessageXpath = driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement getTotalXpath =driver.findElement(By.xpath("//button[@id='button-two']"));
		WebElement xpathDynamic =driver.findElement(By.xpath("//button[contains(@id,'-one')]"));
		WebElement startWithSample1 =driver.findElement(By.xpath("//button[starts-with(@id,'button-two')]"));
		WebElement textSample1 =driver.findElement(By.xpath("//button[text()='Show Message']"));
		
		//try more xpath
		
		//text
		driver.navigate().to("https://www.amazon.in/");
		
		WebElement xpathSample11 = driver.findElement(By.xpath("//a[text() = 'MX Player']"));
		
		WebElement xpathSample12 = driver.findElement(By.xpath("//a[text()='Help']"));
		WebElement xpathSample13 = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		WebElement xpathSample14 = driver.findElement(By.xpath("//span[text()='Returns']"));
		WebElement xpathSample15 = driver.findElement(By.xpath("//a[text()='MX Player']"));
		
		//attribute
		WebElement xpathSample16 = driver.findElement(By.xpath("//a[@class='nav-logo-link nav-progressive-attribute']"));
		WebElement xpathSample17 = driver.findElement(By.xpath("//span[@id='nav-cart-count']"));
		WebElement xpathSample18 = driver.findElement(By.xpath("//span[@class='navFooterBackToTopText']"));
		WebElement xpathSample19 = driver.findElement(By.xpath("//span[@id='glow-ingress-line2']"));
		WebElement xpathSample20 = driver.findElement(By.xpath("//span[@id='glow-ingress-line1']"));
		
		//contains
		WebElement xpathSample21 = driver.findElement(By.xpath("//div[contains(@class,'nav-logo-base')]"));
		WebElement xpathSample22 = driver.findElement(By.xpath("//span[contains(@class ,'hm-icon-')]"));
		
		//starts-with
		WebElement xpathSample23 = driver.findElement(By.xpath("//div[starts-with(@class,'nav-logo-base')]"));
		WebElement xpathSample24 = driver.findElement(By.xpath("//span[starts-with(@class ,'hm-')]"));
		WebElement xpathSample25 = driver.findElement(By.xpath("//input[starts-with(@id,'twotabsearchtext')]"));
	
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		WebElement showmessAnd = driver.findElement(By.xpath("//button[@id='button-one' and @type='button']"));
		WebElement showmsgOr =driver.findElement(By.xpath("//button[@id='button-one' or @id='button-on']"));
		
		//button[@id='button-one']//parent::form
		//div[@id='collapsibleNavbar']//child::ul

		//div[@id='message-one']//following::button[@class='btn btn-primary']
		//div[@id='message-one']//preceding::button[@class='btn btn-primary']
		
		WebElement cssSelect =driver.findElement(By.cssSelector("button#button-one"));
		WebElement cssSelectClass =driver.findElement(By.cssSelector("section.clearfix")); 
		
		//div[@id='nav-logo']//following::a -child using parent
		//div[@id='nav-logo']//following::a[@id='nav-logo-sprites']
		
		//div[@class='navFooterColHead' and text() ='Connect with Us']
		
		//div[@class='navFooterColHead' and text() ='Connect with Us']//parent::div
		
		//a[@id='navBackToTop']//child::div
		
		//div[@aria-label='More on Amazon']//following-sibling::div
		
		//div[@aria-label='More on Amazon']//ancestor::div
		//div[@id='nav-logo']//ancestor::div
		
		//div[@id='nav-flyout-ya-newCust']//preceding::a[@class='nav-a']
		//a[@class='nav-a']//preceding::div[@id='nav-flyout-ya-newCust']


		//a[text()='Amazon Science']//preceding::a[text()='About Amazon']
		//a[text()='Facebook']//following::a[text()='Instagram']
		//a[@aria-label='Back to top']//parent::div
		//a[@aria-label='Back to top']//child::div

		//a[text()='Mobiles']//following-sibling::a[text()='Home & Kitchen']
		
	}
		
		public void webElementCommands()
		{
			WebElement enterMessage =driver.findElement(By.xpath("//input[@id='single-input-field']"));
			
			enterMessage.sendKeys("ABC");
			
			WebElement showMessagebutton1 =driver.findElement(By.xpath("//button[text()='Show Message']"));
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(showMessagebutton1));
			showMessagebutton1.click();
			
			WebElement yourMessage =driver.findElement(By.xpath("//div[@id='message-one']"));
		     String yourMessageText =  yourMessage.getText();
		     
		     enterMessage.clear();
		     
		     String backgrndcolorofshowmessage =showMessagebutton1.getCssValue("background-color");
		     //hex value #007bff
		     String fontwghtshowMessage =showMessagebutton1.getCssValue("font-weight");
		     
		   boolean isshowMessageButtonDisplayed= showMessagebutton1.isDisplayed();
		   boolean isshowMessageButtonEnabled= showMessagebutton1.isEnabled();
		}
		   
		  // Verify Test case is passed or failed
		   
		   public void verifyShowMessageButtonClickResult()
		   {
		   WebElement enterMessage1 =driver.findElement(By.xpath("//input[@id='single-input-field']"));
		   WebElement textInputField =driver.findElement(By.xpath("//input[@id='single-input-field']"));
		   String textValue ="XYZ";
		   enterMessage1.sendKeys(textValue);
			
			WebElement showMessagebutton2 =driver.findElement(By.xpath("//button[text()='Show Message']"));
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.elementToBeClickable(showMessagebutton2));
			showMessagebutton2.click();
			
			
			
			
			
			
			
			WebElement yourMessage2 =driver.findElement(By.xpath("//div[@id='message-one']"));
			Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
	                .withTimeout(Duration.ofSeconds(10))
	                .pollingEvery(Duration.ofSeconds(3))
	                .ignoring(NoSuchElementException.class);

	          fluentWait.until(ExpectedConditions.elementToBeClickable(yourMessage2));
		    String yourMessageText2 =  yourMessage2.getText();
		    String finalMessage = yourMessageText2.substring(15, 18);
		    System.out.println(finalMessage);
		    
				    
		    if (finalMessage.equals(textValue)) 
		    	
		    {
		    	System.out.println("TestCase is passed");
		    }
		    
		    else
		    {
		      	System.out.println("TestCase is failed");
		    }
		   }
		    
		   		    
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 		WebElementCommands webelementcommands =new WebElementCommands();
		webelementcommands.intializeBrowser();
		webelementcommands.webElementCommands();
		webelementcommands.verifyShowMessageButtonClickResult();
		webelementcommands.driverQuit();
 
	}

}
