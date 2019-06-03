package PageObjMod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class pageClass_rept {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_b6b.01.09\\Desktop\\Selenium jars\\chromedriver.exe\\");
		WebDriver driver = new  ChromeDriver();
		reposClass_Page PgObject = new reposClass_Page(driver);
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		PgObject.clicklnk();
	

		String username=null;
		PgObject.typeEmail(username);
		String pawd=null;
		PgObject.typepwd(pawd);
		PgObject.clicklgn();
		
		System.out.println("title of the page is"+driver.getTitle());

		
	}
}