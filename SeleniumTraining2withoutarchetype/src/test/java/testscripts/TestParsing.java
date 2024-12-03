package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestParsing extends Base{
	
	public void verifyTwoInputFields()
	{
		WebElement valueA = driver.findElement(By.xpath("//input[@id='value-a']"));
		WebElement valueB =driver.findElement(By.xpath("//input[@id='value-b']"));
		
		WebElement getTotalButton = driver.findElement(By.xpath("//button[@id='button-two']"));
		
		String inputA ="25";
		String inputB ="30";
				
		valueA.sendKeys(inputA);
		valueB.sendKeys(inputB);
		
		int inputAInt = Integer.parseInt(inputA);
		int inputBInt = Integer.parseInt(inputB);
		int sum =inputAInt + inputBInt;
		
		
		getTotalButton.click();
		WebElement totalMsg =driver.findElement(By.xpath("//div[@id='message-two']"));
		String totalMsgtext =totalMsg.getText();
		System.out.println(totalMsgtext);
		
		//extracting the sum from the message and converting to integer
		
		String total = totalMsgtext.substring(14,16);
		System.out.println(total);
		int totalvalue = Integer.parseInt(total);
		
		if (sum==totalvalue)
		{
			System.out.println("test case is passed");
		}
		 
		else 
		{
			System.out.println("test case is failed");
		
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestParsing textparsing = new TestParsing();
		textparsing.intializeBrowser();
		textparsing.verifyTwoInputFields();
		textparsing.driverQuit();		
      
	}
	
	
	

}
