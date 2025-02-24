package Maven_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DWS_SubscribeTest {

	@Test
	public void searchTest() {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demowebshop.tricentis.com/");
		WebElement subscribeField = driver.findElement(By.xpath("//input[@id= 'newsletter-email']"));
		subscribeField.sendKeys("abc@gmail.com");
		
		WebElement subscribeButton = driver.findElement(By.xpath("//input[@value='Subscribe']"));
		subscribeButton.click();
	}
}


