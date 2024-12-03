package utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebElement;

public class FileUploadUtility {
	
	public void  verifyFileUploadusingSendKeys(WebElement element,String filePath)
	{
		
		element.sendKeys(filePath);
	}
	
	public void verifyFileUploadUsingRobotclass(WebElement element,String filePath) throws AWTException
	{
				
		element.click();
		
		//To copy the flepath and set the contents to clipboard
		StringSelection s = new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null); 

		Robot robot = new Robot();
        robot.delay(500);
		 
	      //releasing enter

	      robot.keyPress(KeyEvent.VK_CONTROL);
	      robot.keyPress(KeyEvent.VK_V);//two
	      robot.delay(500);
	      
	      robot.keyRelease(KeyEvent.VK_CONTROL);//release command   
	      robot.keyRelease(KeyEvent.VK_V);
	      robot.delay(500);

	      robot.keyPress(KeyEvent.VK_ENTER);
          robot.keyRelease(KeyEvent.VK_ENTER);
	      robot.delay(90);
	}
		
		

}
