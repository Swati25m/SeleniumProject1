package Demo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class DataProviderdemo {

	WebDriver driver;
	
	@BeforeClass
	void setUP() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		Thread.sleep(100);
		
	}
	
	@Test(dataProvider="dp")
	void login(String username,String password) throws InterruptedException
	{
		
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(3000);
		boolean status=driver.findElement(By.xpath("//span[text()='My Account']")).isDisplayed();
		if(status==true)
		{
		driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']")).click();
		//driver.findElement(By.xpath("//a[text()='Continue']")).click();
		}
	}
	
	@DataProvider(name="dp",indices= {0})
	Object[][] logindata()
	{
		Object data[][]={
				{"swati.mare1804@gmail.com","Swati@123"},
				{"jasnd@gmail.com","jdsa@23"}
		
		                };
		return data;
		
		
	}
	
	
	
	@AfterClass
	void teardown()
	{
		
		driver.close();
	}	
	
}

