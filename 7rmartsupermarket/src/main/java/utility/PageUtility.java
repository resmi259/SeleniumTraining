package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	
	public void clickAndHoldOnElement(WebElement element, WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.clickAndHold(element).build().perform();
	}

	public void actionClick(WebElement element, WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().perform();
	}
	
	public void actiondoubleClick(WebElement element, WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();
	}
	
	public void scrollByAxis(WebDriver driver)
	
	{
		 JavascriptExecutor js =(JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(400,2000)", "");
		 
	}
    public void scrollByelement(WebDriver driver,WebElement element)
	
	{
		 JavascriptExecutor js =(JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();", element);
		 
	}
    public void dropdownSelectbyText(WebElement element,String text)
    {
    	
      Select select = new Select(element);
  	  select.selectByVisibleText(text);
    }
    
    public void dropdownSelectbyTIndex(WebElement element,int index)
    {
    	
      Select select = new Select(element);
  	  select.selectByIndex(index);
    }
    
	
	
	

}
