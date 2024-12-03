package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass extends Base{
	
	public void verifyDragDrop()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement draggablen0 =driver.findElement(By.xpath("//span[text() ='Draggable n°1']"));
		WebElement dropZone =driver.findElement(By.xpath("//div[@id='mydropzone']"));
		
		Actions actions =new Actions(driver);
		//actions.moveToElement(draggablen0).build().perform();
		//actions.doubleClick(draggablen0).perform();
		actions.contextClick(draggablen0).perform() ;//right click 
		actions.dragAndDrop(draggablen0, dropZone).build().perform();
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		 WebElement textInputField =driver.findElement(By.xpath("//input[@id='single-input-field']"));
		 //actions.sendKeys(textInputField,"Hello").perform();
		 actions.keyDown(textInputField,Keys.SHIFT).sendKeys("hello").build().perform();
		 
		
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActionsClass actionclass =new ActionsClass();
		actionclass.intializeBrowser();
		actionclass.verifyDragDrop();
		actionclass.driverQuit();
		

	}

}
