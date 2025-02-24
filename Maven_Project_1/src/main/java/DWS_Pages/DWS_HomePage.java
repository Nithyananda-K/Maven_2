package DWS_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWS_HomePage {

	// constructor
	public DWS_HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// WebElements
	@FindBy(id = "small-searchterms")
	WebElement searchtext;

	// WebElements
	@FindBy(xpath = "//input[@type='submit']")
	WebElement searchbutton;

	// Register WebElements
	@FindBy(linkText = "Register")
	WebElement registerLink;

	// login WebElements
	@FindBy(linkText = "/login")
	WebElement loginlink;

	// Actions or methods of webelements
	public void enterSearchText(String value) {
		searchtext.sendKeys(value);
	}

	public void clicksearchButton() {
		searchbutton.click();
	}

	public void clickRegisterLink() {
		registerLink.click();
	}

	public void clickLoginLink() {
		loginlink.click();
	}
}
