package testscripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends Base {
	
	//when type =file and input header 
	
	public void  verifyFileUploadusingSendKeys()
	{
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement chooseFile = driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
				
		chooseFile.sendKeys("E:\\Resmi-Selenium\\Notes\\Selenium.pdf");
		
		
	}
	
	public void verifyFileUploadUsingRobotclass() throws AWTException
	{
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement wordFile= driver.findElement(By.xpath("//a[@id=\"pickfiles\"]"));
		wordFile.click();
		
		//To copy the flepath and set the contents to clipboard
		StringSelection s = new StringSelection("E:\\Resmi-Selenium\\Notes\\Selenium.pdf");
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
		
		
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileUpload fileupload =new FileUpload();
		fileupload.intializeBrowser();
		//fileupload.verifyFileUploadusingSendKeys();
		try {
			fileupload.verifyFileUploadUsingRobotclass();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fileupload.driverQuit();
				
	}

}
