package jewellerstesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectSauceDemo {
	private WebDriver driver;

	public PageObjectSauceDemo() {
		this.driver = WebDriverManager.getDriver();
	}

	public WebElement sdUname() {

		return driver.findElement(By.cssSelector("#user-name"));
	}
	public WebElement sdPword() {

		return driver.findElement(By.cssSelector("#password"));
	}
	
	public WebElement sdLoginBtn() {

		return driver.findElement(By.cssSelector("#login-button"));
	}
}
