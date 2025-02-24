package DWS_TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import DWS_Pages.DWS_HomePage;
import DWS_Pages.DWS_LoginPage;

public class DWS_LoginTest {

	@Test
	public void TC3() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		//create an object of Homepage and call the methods 
		DWS_HomePage homepage= new DWS_HomePage(driver);
		homepage.clickLoginLink();
		
		// create an object of RegisterPage
		DWS_LoginPage loginPage= new DWS_LoginPage(driver);
		
		loginPage.enterEmailID("pradytest@qspiders.com");      
		loginPage.enterPassword("pradyumna");
		loginPage.clickLoginButton();
		
//		driver.close();
	}
}

