package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutorSample extends Base{
	
	public void verifyJavaScriptExecutorSample()
	{
		WebElement showMessagebutton1 =driver.findElement(By.xpath("//button[text()='Show Message']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", showMessagebutton1);
		
		//To scroll down
		js.executeScript("window.scrollBy(0,350)", "");
		 
		//To scrollup
		js.executeScript("window.scrollBy(0,-350)", "");
		
		WebElement getTotalButton = driver.findElement(By.xpath("//button[@id='button-two']"));
		
		//To scroll till a WebElement 
		js.executeScript("arguments[0].scrollIntoView();", getTotalButton);
		
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		JavaScriptExecutorSample javascriptexecutorsample  = new JavaScriptExecutorSample();
		javascriptexecutorsample.intializeBrowser();
		javascriptexecutorsample.verifyJavaScriptExecutorSample();
		javascriptexecutorsample.driverQuit();
	}

}
