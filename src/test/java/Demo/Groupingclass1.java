package Demo;
import org.testng.annotations.Test;

public class Groupingclass1 {

	
	
	@Test(priority=1,groups= {"sanity"})
	void loginbyfacebook()
	{
		System.out.println("facelook sanity");
	}
	
	@Test(priority=2,groups= {"sanity"})
	void loginbyLinkedin()
	{
		System.out.println("linkedin sanity");
	}
	
	@Test(priority=3,groups= {"sanity"})
	void loginbywhatsapp()
	{
		System.out.println("whatsapp sanity");
	}
	
}
