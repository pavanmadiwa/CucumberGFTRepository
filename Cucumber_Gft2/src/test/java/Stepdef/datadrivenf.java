package Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class datadrivenf {
	WebDriver driver = null;
	@Given("user is opening the application")
	public void user_is_opening_the_application() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.01.09\\Desktop\\Selenium jars\\chromedriver.exe\\");
		 driver = new ChromeDriver();
	     driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp/");
		
	}

	@When("user clicks on login apge")
	public void user_clicks_on_login_apge() {
		//WebDriver driver = new ChromeDriver();
		driver.findElement(By.linkText("SignIn")).click();
		System.out.println("title is:"+driver.getTitle());
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String username, String password) {
		//WebDriver driver = new ChromeDriver();
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.findElement(By.name("Login")).click();
		 driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
		   driver.findElement(By.xpath("//a[@href='logout.htm']")).click();
	}

	@Then("Message displayed as login succesfully")
	public void message_displayed_as_login_succesfully() {
		   System.out.println("user login sucess");
	}



}
