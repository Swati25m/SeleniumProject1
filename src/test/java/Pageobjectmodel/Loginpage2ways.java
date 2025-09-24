package Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage2ways {
	
	WebDriver driver;
	
	Loginpage2ways(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//Locators
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement txt_username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txt_password;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement loginclick;
	
	//Action methods
	
	public void setUserName(String user)
	{
		txt_username.sendKeys(user);
	}

	public void setPassword(String pass)
	{
		txt_password.sendKeys(pass);
	}

	public void loginbutton()
	{
		loginclick.click();
	}

}
