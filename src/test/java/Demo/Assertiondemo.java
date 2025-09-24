package Demo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Assertiondemo {


	/*
	 * @Test void hardAssert() {
	 * 
	 * System.out.println("hard assert");
	 * 
	 * Assert.assertEquals("swati", "swati");
	 * 
	 * System.out.println("Statement after hard assert");
	 * 
	 * 
	 * }
	 */
	
	@Test
	void softAssert()
	{
		
		System.out.println("soft assert");
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals("swati", "sdas");
		
		System.out.println("Statement after hard assert");
		
		
	}
	
	
	
}
