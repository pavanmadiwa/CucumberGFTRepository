package PageObjMod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class reposClass_Page {
	WebDriver driver;
	By lnk = By.linkText("Log in");
	By uname = By.name("Email");
	By pwd = By.id("Password");
	By lgn = By.xpath("//input[@value,'Log in']");
	
	public reposClass_Page(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void clicklnk()
	{
		driver.findElement(lnk).click();
	}
	
	public void typeEmail(String username)
	{
		driver.findElement(uname).click();
		
	}
	
	public void typepwd(String pawd)
	{
		driver.findElement(pwd).click();
	}
			
	public void clicklgn()
	{
		driver.findElement(lgn).click();
	}

}
