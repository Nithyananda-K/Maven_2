package DWS_TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import DWS_Pages.DWS_HomePage;
import DWS_Pages.DWS_RegisterPage;

public class DWS_RegisterTest {

	@Test
	public void TC2() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");

		// create an object of homepage
		DWS_HomePage homepage = new DWS_HomePage(driver);
		homepage.clickRegisterLink();

		// create an object of RegisterPage
		DWS_RegisterPage registerPage = new DWS_RegisterPage(driver);
		
		registerPage.clickGender();
		registerPage.enterFirstName("Pradyumna");
		registerPage.enterLastName("Ramachandra");
		registerPage.enterEmail("pradytest@qspiders.com");
		registerPage.enterpassword("pradyumna");
		registerPage.enterconfirmPassword("pradyumna");
		registerPage.clickRegisterButton();
		driver.close();
	}
}
