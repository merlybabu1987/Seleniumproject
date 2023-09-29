package jewellerstesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testearring {
	WebDriver driver;
	PageObjectsEarring earringPage= new PageObjectsEarring();
	@Test
	public void earrings() throws InterruptedException {
		driver.get("https://www.candere.com/jewellery/earrings.html/");
		//PageObjectsEarring gg= new PageObjectsEarring();
		Thread.sleep(3000);
	String price = 	earringPage.earringPrice(driver).getText();
		
		try {
			int extractedNumber = Integer.parseInt(price.replace("₹", "").replace(",", ""));
		System.out.println(extractedNumber);
		} catch (NumberFormatException e) {
			Assert.fail();
		}

	}

	@BeforeClass
	public void initiateBrowser() {
		ChromeOptions options =new ChromeOptions();
		options.setBinary("C:\\myfiles\\chrome-win64\\chrome.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\myfiles\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver(options);
	}
	
	
	
	@AfterTest
	public void drvierclose() {
	driver.quit();
	}
}
