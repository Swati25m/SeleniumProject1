package Pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
WebDriver driver;
	
//Constructor
LoginPage(WebDriver driver)
{
	this.driver=driver;
}
	

//Locators

By txt_username_Loc=By.xpath("//input[@placeholder='Username']");
By txt_password_loc=By.xpath("//input[@placeholder='Password']");
By txt_loginbutton=By.xpath("//button[normalize-space()='Login']");

//Action methods

public void setUserName(String user)
{
	driver.findElement(txt_username_Loc).sendKeys(user);
}

public void setPassword(String pass)
{
	driver.findElement(txt_password_loc).sendKeys(pass);
}

public void loginbutton()
{
	driver.findElement(txt_loginbutton).click();
}




}
