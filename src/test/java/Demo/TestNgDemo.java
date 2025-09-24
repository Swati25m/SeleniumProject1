package Demo;
import org.testng.annotations.Test;

public class TestNgDemo {

	@Test(priority =1)
	void openApp()
	{
		System.out.println("openapp");
	}
	
	@Test(priority =-2)
	void login()
	{
		System.out.println("login");
		
	}
	
	
	void logout()
	{
		System.out.println("logout");
	}
	
	
	
	
	
	
}
