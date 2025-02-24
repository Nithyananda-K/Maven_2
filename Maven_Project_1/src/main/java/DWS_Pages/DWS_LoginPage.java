package DWS_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWS_LoginPage {
	
	public DWS_LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="Email")
	WebElement EmailID;
	
	@FindBy(name="Password")
	WebElement password;
	
	@FindBy(xpath ="//input[@value='Log in']")
	WebElement loginbutton;
	
	public void enterEmailID(String emailIDVal) {
		EmailID.sendKeys(emailIDVal);
	}
	
	public void enterPassword(String passwordVal) {
		password.sendKeys(passwordVal);	
	}
	
	public void clickLoginButton() {
		loginbutton.click();
		
	}
}
