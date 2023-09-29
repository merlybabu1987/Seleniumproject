package jewellerstesting;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectsEarring {
	
	
	
public WebElement earringPrice(WebDriver driver) {
	
	return driver.findElement(By.xpath("//*[@id=\"amasty-shopby-product-list\"]/div[2]/ol/li[1]/div[2]/div/div[3]/div/span/span[1]/span"));
}

}
