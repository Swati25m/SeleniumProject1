package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTesting {

	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser"})
	void setUp(String br) throws InterruptedException
	{
	switch(br.toLowerCase())
	{
	case "chrome": 
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();break;
		
	case "edge": 
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();break;
		
	case "firefox": 
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();break;
	default:System.out.println("invalid browser");return;
	}
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	}
	
	
	@Test(priority=1)
	void disply()
	{
		boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(true, status);
		
	}
	
	@Test(priority=2)
	void login()
	{
		String str=driver.getCurrentUrl();
		Assert.assertEquals(str, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	
	@AfterClass
	void tearDown()
	{
		driver.close();
	}

}
