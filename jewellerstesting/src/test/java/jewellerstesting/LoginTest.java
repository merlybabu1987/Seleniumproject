package jewellerstesting;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
	PageObjectSauceDemo sd;

	@BeforeTest
	public void setup() {
		driver = WebDriverManager.getDriver();
		 sd = new PageObjectSauceDemo();
		
	}
	@Test
public void login() throws InterruptedException {
	driver.get("https://www.saucedemo.com/");
	Thread.sleep(3000);
	sd.sdUname().sendKeys("standard_user");
	sd.sdPword().sendKeys("secret_sauce");
	sd.sdLoginBtn().click();
	
}
@AfterSuite
public void drvierclose() {
	driver.quit();
}
}
