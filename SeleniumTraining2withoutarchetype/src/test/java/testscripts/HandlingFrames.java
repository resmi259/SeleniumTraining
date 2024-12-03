package testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingFrames extends Base {
	
	public void verfiyframes()
	{
		driver.navigate().to("	https://demo.guru99.com/test/guru99home/");
		int size=driver.findElements(By.tagName("iFrame")).size();  // to find number of iframe in a page 
		WebElement iframe =driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframe));
		
		driver.switchTo().frame(iframe);
		//driver.switchTo().frame(2);
		//driver.switchTo().frame("a077aa5e");//using id
		WebElement image =driver.findElement(By.xpath("//img[@src=\"Jmeter720.png\"]"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingFrames handlingframes =new HandlingFrames();
		
		handlingframes.intializeBrowser();
	      handlingframes.verfiyframes();
			handlingframes.driverQuit();

	}

}
