package Demo;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Annotationdemo1 {
	
	/*
	 1.login to application
	 2.search 
	 3.logout
	 4.again login
	 5.advanced search
	 6.logout/
	 
	 */
	
	@BeforeMethod
	void login()
	{
		System.out.println("login");
	}
	
	@Test(priority=1)
	void Search()
	{
		System.out.println("search");
	}
	
	@AfterMethod
	void logout()
	{
		System.out.println("logot");
	}
	

	@Test(priority=2)
	void advSearch()
	{
		System.out.println("Adv Search");
	}
	
	

}
