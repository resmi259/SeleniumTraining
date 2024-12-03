package testscripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@Test
	public void testCase1()
	{
		System.out.println("TestCase1");
	}
	@BeforeMethod
 public void beforeMethod()
 
 {
	 System.out.println("beforemethod");
 }
	@AfterMethod
 public void afterMethod()
 
 {
	 System.out.println("Aftermethod");
 }
	
	
	@Test
	public void testCase2()
	{
		System.out.println("TestCase2");
	}
	@BeforeClass
 public void beforeClass()
 
 {
	 System.out.println("beforeClass");
 }
	@AfterClass
 public void afterClass()
 
 {
	 System.out.println("AfterClass");
 }
	
	
	@BeforeTest
	 public void beforeTest()
	 
	 {
		 System.out.println("beforetest");
	 }
		@AfterTest
	 public void afterTest()
	 
	 {
		 System.out.println("AfterTest");
	 }
		
		@BeforeSuite
		 public void beforeSuite()
		 
		 {
			 System.out.println("beforeSuite");
		 }
			@AfterSuite
		 public void afterSuite()
		 
		 {
			 System.out.println("AfterSuite");
		 }
		
	
}
