package testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBoxDemo extends Base {
	
	public void checkboxcommands()
	{  driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkBoxfield= driver.findElement(By.xpath("//input[@id='gridCheck']"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeSelected(checkBoxfield));
		checkBoxfield.click();
		boolean isCheckboxSelected =checkBoxfield.isSelected();
		
		
		WebElement messageClick =driver.findElement(By.xpath("//div[@id='message-one']"));
		boolean messageIsDisplayed =messageClick.isDisplayed();
		String messageClicklabel =messageClick.getText();
		
		System.out.println(messageClicklabel);
		
		
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radioButtonMale= driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		radioButtonMale.click();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBoxDemo checkboxdemo =new CheckBoxDemo();
			checkboxdemo.intializeBrowser();
			checkboxdemo.checkboxcommands();
			checkboxdemo.driverQuit();
			
		

	}

}
