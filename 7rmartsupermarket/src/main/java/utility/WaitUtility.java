package utility;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {
	
	public static final long EXPLICIT_WAIT = 50;
	public static final long IMPLICIT_WAIT = 10;
	public static final long FLUENTTIMEOUT = 50;
	public static final long  POLLINGTIME = 10;

	public void waitForElement(WebDriver driver, WebElement target) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
		wait.until(ExpectedConditions.visibilityOf(target));
	}
	
	public void waitalertIsPresent(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
		wait.until(ExpectedConditions.alertIsPresent());
	}
	public void waitElementSelectionStateToBe(WebDriver driver, WebElement target) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
		wait.until(ExpectedConditions.elementSelectionStateToBe(target, false));
	}
	
	public void waitElementtoBeClickable(WebDriver driver, WebElement target) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
		wait.until(ExpectedConditions.elementToBeClickable(target));
	}
		
		public void textToBePresentInElementValue(WebDriver driver, WebElement target,String text)
		
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
			wait.until(ExpectedConditions.textToBePresentInElement(target, text));
		
	}
		
	public void invisibilityOfTheElementLocated(WebDriver driver, WebElement target)
		
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(null));
		
	}
	
	public void titlecontains(WebDriver driver, String text)
		
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
			wait.until(ExpectedConditions.titleContains(text));
		
	}
	public void frameToBeAvailableAndSwitchToIt(WebDriver driver, WebElement target)
	
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(target));
	
}
	
	public void fluentwaitElementToBEClickable(WebDriver driver,WebElement target)
	{
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(FLUENTTIMEOUT))
                .pollingEvery(Duration.ofSeconds(POLLINGTIME))
                .ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.elementToBeClickable(target));
	 
	}
	
	
	public void fluentwaitalertIsPresent(WebDriver driver)
	{
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(FLUENTTIMEOUT))
                .pollingEvery(Duration.ofSeconds(POLLINGTIME))
                .ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.alertIsPresent());
	 
	}
	
	public void fluentwaitelementToBeSelected(WebDriver driver,WebElement target)
	{
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(FLUENTTIMEOUT))
                .pollingEvery(Duration.ofSeconds(POLLINGTIME))
                .ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.elementToBeSelected(target));
	 
	}
	
	public void fluentwaitinvisibilityOfElementLocated(WebDriver driver,String target)
	{
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(FLUENTTIMEOUT))
                .pollingEvery(Duration.ofSeconds(POLLINGTIME))
                .ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(target)));
	 
	}
	
	public void fluentwaitinvisibilityOfElementLocatedByClass(WebDriver driver,String target)
	{
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(FLUENTTIMEOUT))
                .pollingEvery(Duration.ofSeconds(POLLINGTIME))
                .ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.invisibilityOfElementLocated(By.className(target)));
	 
	}
	
	

//write for more conditions
}
