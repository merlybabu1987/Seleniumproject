package jewellerstesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverManager {
	private static WebDriver driver;

	public static WebDriver getDriver() {
		if (driver == null) {
			ChromeOptions options = new ChromeOptions();
			options.setBinary("C:\\myfiles\\chrome-win64\\chrome.exe");
			System.setProperty("webdriver.chrome.driver", "C:\\myfiles\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver(options);
		}
		return driver;
	}

	public static void quitDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

}
