package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	// constructor takes webdriver argument and initializes pagefactory webelements
	public LoginPage(WebDriver driver) {
		//it initializes Webelements
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#ctl00_MainContent_username")
	public WebElement userName;

	@FindBy(xpath="//*[@id='ctl00_MainContent_password']")
	public WebElement password;
	
	@FindBy(id="ctl00_MainContent_login_button")
	public WebElement loginButton;
}
