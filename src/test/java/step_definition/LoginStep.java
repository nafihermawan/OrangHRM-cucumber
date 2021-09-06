package step_definition;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page_object.LoginPage;

@SuppressWarnings("deprecation")
public class LoginStep {

	private WebDriver driver;
	
	public LoginStep() {
		super();
		this.driver = Hooks.driver;
	}

	@Given("user open the web page")
	public void LoginPage() {
		LoginPage loginPage;
		loginPage = new LoginPage(driver);
	}

	@When("user input \"(.*)\" as username and \"(.*)\" as password")
	public void inputInvalidCredential(){
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setUsername("username");
		loginPage.setPassword("password");
		loginPage.clickLogin();
	}

	@Then("user see error message")
	public void errorMassage() {
		LoginPage loginPage = new LoginPage(driver);
		Assert.assertEquals("Invalid credentials", loginPage.getErrorMessage());
	}

}
