package testscripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions extends TestNGBase {

	@Test
	public void assertSample()
	{
		int a=5;
		int b =5;
		
		//HardAssert or Assert
		assertEquals(a,b,"a and b are not equal");
		WebElement getTotalButton = driver.findElement(By.xpath("//button[@id='button-two']"));
		boolean getTotalButtonavaiable =getTotalButton.isDisplayed();
		assertTrue(getTotalButtonavaiable, "Get total button is not available");
		boolean flag=false;//value is obtained from the check , this is just to make it to work
		assertFalse(flag,"expected value is false , but it is true");
		String s=null;
		assertNull(s, "String is not null");
		String s1 ="abc";
		assertNotNull(s1,"string is null");
	}
		
		//SoftAssert or Verify 
		@Test
		
		public void softAsset()
		{
			int a=5;
			int b =5;
			
			SoftAssert softassert =new SoftAssert();
			
			softassert.assertEquals(a,b,"a and b are not equal");
			
			WebElement getTotalButton = driver.findElement(By.xpath("//button[@id='button-two']"));
			boolean getTotalButtonavaiable =getTotalButton.isDisplayed();
			softassert.assertTrue(getTotalButtonavaiable, "Get total button is not available");
			
			boolean flag=false;//value is obtained from the check , this is just to make it to work
			softassert.assertFalse(flag,"expected value is false , but it is true");
			
			String s=null;
			softassert.assertNull(s, "String is not null");
			
			String s1 ="abc";
			softassert.assertNotNull(s1,"string is null");
			
			softassert.assertAll();
		}
		
		
	
	
	
	
	@Test

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
		int totalvalue = Integer.parseInt(total); //actual 
		
		assertEquals(sum,totalvalue,"Expected total is "+sum+ "but it is"+ totalvalue );
		
		

	}
}
