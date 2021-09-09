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
	private WebElement inputUsername;

	@FindBy(id = "txtPassword")
	private WebElement inputPassword;

	@FindBy(id = "btnLogin")
	private WebElement btnLogin;
	
	@FindBy(id = "logInPanelHeading")
	private WebElement loginPanel;

	@FindBy(id = "spanMessage")
	private WebElement errorMessage;

	public void setUsername(String username) {
		inputUsername.sendKeys(username);
	}

	public void setPassword(String username) {
		inputPassword.sendKeys(username);
	}

	public void clickLogin() {
		btnLogin.click();
	}

	public String getErrorMessage() {
		return errorMessage.getText();
	}

	public boolean isDisplayed()
	{
		return loginPanel.isDisplayed();
	}

}