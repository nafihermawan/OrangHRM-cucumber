package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class LoginPage extends BaseClass{

	public LoginPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(id = "txtUsername")
	WebElement inputUsername;

	@FindBy(id = "txtPassword")
	WebElement inputPassword;

	@FindBy(id = "btnLogin")
	WebElement btnLogin;

	@FindBy(id = "spanMessage")
	WebElement errorMessage;

	public void setUsername(String username) {
		inputUsername.sendKeys(username);
	}

	public void setPassword(String password) {
		inputPassword.sendKeys(password);
	}

	public void clickLogin() {
		btnLogin.click();
	}

	public String getErrorMessage() {
		return errorMessage.getText();
	}

	public boolean isDisplayed() {
		return false;
	}

}