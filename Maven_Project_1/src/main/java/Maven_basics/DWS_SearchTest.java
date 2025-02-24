package Maven_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DWS_SearchTest {

	@Test
	public void searchTest() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Reporter.log("Application Launched successfully ");

		WebElement searchField = driver.findElement(By.xpath("//input[@id= 'small-searchterms']"));
		searchField.sendKeys("computer", Keys.RETURN);
		
//		WebElement subscribeButton = driver.findElement(By.xpath("//input[@value='Search']"));
//		subscribeButton.click();
	}
}


