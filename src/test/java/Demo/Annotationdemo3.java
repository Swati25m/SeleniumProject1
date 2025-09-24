package Demo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotationdemo3 {

	@BeforeTest
	void login()
	{
		System.out.println("Before test");
	}
	
	@BeforeSuite
	void bs()
	{
		System.out.println("Before Suite");
	}
	@AfterSuite
	void as()
	{
		System.out.println("After Suite");
	}
	
	@Test
	void search()
	{
		System.out.println("search method from demo3");
	}
	
	
	@AfterTest
	void logout()
	{
		System.out.println("After Test");
	}
	
}
