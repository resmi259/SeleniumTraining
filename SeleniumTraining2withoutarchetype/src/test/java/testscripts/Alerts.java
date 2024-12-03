package testscripts;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts extends Base {
	
public void verifyalerts()
{
	//To Accept the alert (say oke)
	driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
	WebElement alertClick1 = driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]"));
	alertClick1.click();
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.alertIsPresent());
	driver.switchTo().alert().accept();
	
	//To Cancel the alert 
	WebElement alertConfirm =driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
	alertConfirm.click();
	String text =driver.switchTo().alert().getText();
	driver.switchTo().alert().dismiss();
	
	//To enter text in the input box and accept
	WebElement alertPrompt =driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
	alertPrompt.click();
	driver.switchTo().alert().sendKeys("Resmi");
	driver.switchTo().alert().accept();
	
	//Window Popout not an alert window 
	
	WebElement windowPopup =driver.findElement(By.xpath("//a[text()='Window Popup']"));
	windowPopup.click();
	WebElement facebookLink =driver.findElement(By.xpath("//a[@class='btn btn-primary windowSingle']"));
	facebookLink.click();
	
	String mainWindow =driver.getWindowHandle();
	
	Set<String> s1 =driver.getWindowHandles();
	
	Iterator <String> iterator =s1.iterator();
	
	while (iterator.hasNext())
	{
		
		String childWindow =iterator.next();
		if (!mainWindow.equalsIgnoreCase(childWindow))
			
		{
			driver.switchTo().window(childWindow);
		//	WebElement emailFacebook =driver.findElement(By.xpath("//input[@name='email' and @id=":rr:"]"));
			driver.close();
		}
			
		
	}
	driver.switchTo().window(mainWindow);
	
	
	
	
	//WebElement passwordFacebook =driver.findElement(By.xpath("//input[@id=':rt:']"));
	
	//emailFacebook.sendKeys("Resmi");
	//passwordFacebook.sendKeys("password1!");
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alerts alerts =new Alerts();
		alerts.intializeBrowser();
		alerts.verifyalerts();
		alerts.driverQuit();
		
	}

}
