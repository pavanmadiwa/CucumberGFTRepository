package Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demo1 {
	
WebDriver driver = null;
@Given("the login page opened")
public void the_login_page_opened() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.01.09\\Desktop\\Selenium jars\\chromedriver.exe\\");
	 driver = new ChromeDriver();
     driver.manage().window().maximize();
	driver.get("http://10.232.237.143:443/TestMeApp/");
	driver.findElement(By.linkText("SignIn")).click();
	System.out.println("title is:"+driver.getTitle());
	
	
}

@When("user enters Lalitha as username")
public void user_enters_Lalitha_as_username() {
    driver.findElement(By.name("userName")).sendKeys("Lalitha");
}

@When("user enters password{int} as password")
public void user_enters_password_as_password(Integer int1) {
   driver.findElement(By.name("password")).sendKeys("password123");
}

@Then("user will be able to access homepage of testme app")
public void user_will_be_able_to_access_homepage_of_testme_app() {
   driver.findElement(By.name("Login")).click();
   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
   driver.findElement(By.xpath("//a[@href='logout.htm']")).click();
}
	}


