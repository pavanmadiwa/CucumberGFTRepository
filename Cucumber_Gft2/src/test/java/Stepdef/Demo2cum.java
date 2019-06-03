package Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demo2cum {
	WebDriver driver = null;

	@Given("user login page is opened")
	public void user_login_page_is_opened() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.01.09\\Desktop\\Selenium jars\\chromedriver.exe\\");
	 driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://10.232.237.143:443/TestMeApp/");
driver.findElement(By.linkText("SignIn")).click();
System.out.println("title is:"+driver.getTitle());    
	}

	@When("user enters {string} as a username and {string} as a password")
	public void user_enters_as_a_username_and_as_a_password(String userName, String password) {
		 driver.findElement(By.name("userName")).sendKeys(userName);
		 driver.findElement(By.name("password")).sendKeys(password);
	}
	   
	

	@When("user clicks on login on button")
	public void user_clicks_on_login_on_button() {
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.name("Login")).click();
	}
		 

	@Then("user finds a testme app homepage")
	public void user_finds_a_testme_app_homepage() {
		
		  driver.findElement(By.xpath("//a[@href='logout.htm']")).click();
		}
	    
	}



