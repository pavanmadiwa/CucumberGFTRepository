package PageObjMod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class pageImpl {
@Test
  public void Method() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_b6b.01.09\\Desktop\\Selenium jars\\chromedriver.exe\\");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://demowebshop.tricentis.com");
	  driver.manage().window().maximize();
	  
	  pageClass2_fact locateElem = PageFactory.initElements(driver,pageClass2_fact.class);
	  locateElem.loginMethod("pav@gmail.com","pa@123");
  }
}
