package Demo;

import org.testng.annotations.Test;

public class Groupingclass2 {

	@Test(priority=1,groups= {"regression"})
	void regression1()
	{
		System.out.println("regressiontest1");
	}
	
	@Test(priority=2,groups= {"regression"})
	void regression2()
	{
		System.out.println("regressiontest2");
	}
	
	
	
	
}
