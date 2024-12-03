package testscripts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown extends Base {
	
	public void dropdownSample()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		
		WebElement dropdownField =driver.findElement(By.xpath("//select[@id=\'single-input-field\']"));
		Select select = new Select(dropdownField);
		select.selectByIndex(1);
		select.selectByValue("Yellow");
		select.selectByVisibleText("Green");

		WebElement multipleDropdown =driver.findElement(By.xpath("//select[@id='multi-select-field']"));
		Select selectmultiple =new Select(multipleDropdown);
		boolean isMultiple = selectmultiple.isMultiple();
		selectmultiple.selectByIndex(0);
		selectmultiple.selectByIndex(2);
		List <WebElement> multioptionlist =  selectmultiple.getOptions();
		
				
	}
	
	public void verifyLangdropdown()
	{
		driver.navigate().to("https://www.selenium.dev/");
		WebElement languageDropdown = driver.findElement(By.xpath("//div[@class='dropdown']//child::a[@class='nav-link dropdown-toggle']"));
		languageDropdown.click();
		
		List <WebElement> languageoptions = driver.findElements(By.xpath("//ul[@class='dropdown-menu show']//a"));
		
		for(WebElement option:languageoptions)
		{
			String text = option.getText();
			if (text.equals("Português (Brasileiro)"))
			{
				option.click();
				break;
			}
		}
	}
		
	//WebElement googlesearch =driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//following::input[@value='Google Search']"));
	
		public void verifytable()
		{  driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		
		//Identifying and printing header of the table 
			
			WebElement table = driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
			WebElement header1 =driver.findElement(By.xpath("//table[@id='dtBasicExample']//tr[@role='row']"));
			List <WebElement> headerrow =driver.findElements(By.xpath("//table[@id='dtBasicExample']//tr[@role='row']//th"));
			List<String> values =new ArrayList<>();
				for (WebElement headername :headerrow )	
				{
			
					String textHeader = headername.getText(); 
					values.add(textHeader);
							
					
				}
				
			//Printing only column name of the table
				
				List <WebElement> employeenamerecords =driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
										
				for (WebElement employeename :employeenamerecords)
				
				{
					String namevalue = employeename.getText();
				
					
				
					if (namevalue.equals("Ashton Cox"))
					{
						System.out.println(namevalue);
						break;
					}
				}
				
				//printing a particular row of the table 
				
				List <WebElement> employeerecord3 = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[3]"));
				
				for (WebElement employeedetails: employeerecord3)
				{
					System.out.print(employeedetails.getText());
				
					break;
				}
				
						
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dropdown dropdown =new Dropdown();
		dropdown.intializeBrowser();
		dropdown.dropdownSample();
		//dropdown.driverQuit();
		dropdown.verifyLangdropdown();
		dropdown.verifytable();
			
	}

}
