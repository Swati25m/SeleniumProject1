package Demo;

import org.testng.annotations.Test;

public class Groupingclass3 {

	
	
	@Test(priority=1,groups={"sanity","regression"})
	void paymentonline()
	{
		System.out.println("online sanity regression");
	}
	
	
	@Test(priority=2,groups={"sanity","regression","functional"})
	void paymentoffline()
	{
		System.out.println("offline sanity regression");
	}
}
