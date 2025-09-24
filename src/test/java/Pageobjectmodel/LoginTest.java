package Pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class LoginTest {

	WebDriver driver;
	
	@BeforeClass
	public void setUP() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@Test(priority=1,dataProvider="dp")
	
	public void login(String user1,String pass) throws InterruptedException
	{
		Thread.sleep(5000);
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(user1);
		lp.setPassword(pass);
		lp.loginbutton();
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	}
	
	@DataProvider(name="dp")
	Object[][] testData()
	{
		Object[][] data= {
				{"Admin","admin123"}
		};return data;
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
}
