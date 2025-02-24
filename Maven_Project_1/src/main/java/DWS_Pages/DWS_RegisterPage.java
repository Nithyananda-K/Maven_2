package DWS_Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DWS_RegisterPage {
	
	
	public DWS_RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="gender-male")
	WebElement gender;
	
	@FindBy(name="FirstName")
	WebElement firstname;
	
	@FindBy(id="LastName")
	WebElement lastName;
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(id="ConfirmPassword")
	WebElement confirmpasword;
	
	@FindBy(name="register-button")
	WebElement registerbutton;
	
	public void clickGender() {
		gender.click();
	}
	
	public void enterFirstName(String firstnameval) {
		firstname.sendKeys(firstnameval);	
	}
	
	public void enterLastName(String lastnameval) {
		lastName.sendKeys(lastnameval);	
	}
	
	public void enterEmail(String emailval) {
		email.sendKeys(emailval);	
	}
	
	public void enterpassword(String passwordval) {
		password.sendKeys(passwordval);	
	}
	public void enterconfirmPassword(String ConfPasswordval) {
		confirmpasword.sendKeys(ConfPasswordval);	
	}
	
	public void clickRegisterButton() {
		registerbutton.click();
	}
	
	
}





