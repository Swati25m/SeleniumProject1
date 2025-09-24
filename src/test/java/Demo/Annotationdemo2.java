package Demo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Annotationdemo2 {
	/*
	 1.login to application
	 2.search 
	 3.advanced search
	 4.logout
	 */
	
	@BeforeClass
	void login()
	{
		System.out.println("login");
	}
	
	@Test(priority=1)
	void Search()
	{
		System.out.println("search");
	}
	
	@Test(priority=2)
	void advSearch()
	{
		System.out.println("Adv Search");
	}
	
	
	@AfterClass
	void logout()
	{
		System.out.println("logout");
	}
	

	
}
