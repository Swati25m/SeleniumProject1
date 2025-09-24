package Demo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listnersclass implements ITestListener {

	public void onTestStart(ITestResult result) {
	    // not implemented
		
		System.out.println("Test started");
	  }
	
	public void onTestSuccess(ITestResult result) {
	    // not implemented
		System.out.println("Test successfull");
	  }
	public void onTestFailure(ITestResult result) {
		    // not implemented
		System.out.println("Test failure");
		  }

	public void onTestSkipped(ITestResult result) {
		    // not implemented
		System.out.println("Test skipped");
		  }
	 
	public void onFinish(ITestContext context) {
		    // not implemented
		System.out.println("Testes finished");
		  }
	
	
	
	
}
