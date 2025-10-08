package Pageobjectmodel;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {

	WebDriver driver;
	
	@BeforeClass
	public void setUP() throws InterruptedException
	{
		//WebDriverManager.chromedriver().setup();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\seleniumdriver\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@Test(priority=1,dataProvider="dp")
	
	public void login(String user1,String pass) throws InterruptedException
	{
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
