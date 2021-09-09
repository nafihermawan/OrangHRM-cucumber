package step_definition;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page_object.DashboardPage;
import page_object.LoginPage;

@SuppressWarnings("deprecation")
public class LoginStep {

	private WebDriver webDriver;
	
	public LoginStep() {
		super();
		this.webDriver = Hooks.webDriver;
	}

	@Given("user open the web page")
	public void loginOrangeHRM() {
		LoginPage loginPage = new LoginPage(webDriver);
		Assert.assertTrue(loginPage.isDisplayed());
	}

	@When("user input \"(.*)\" as username and \"(.*)\" as password")
	public void inputCredential(String username, String password){
		LoginPage loginPage = new LoginPage(webDriver);
		loginPage.setUsername(username);
		loginPage.setPassword(password);
		loginPage.clickLogin();
	}

	@Then("user see error message")
	public void errorMassage() {
		LoginPage loginPage = new LoginPage(webDriver);
		loginPage.getErrorMessage();
	}
	
	@Then("user see dashboard page")
	public void loginSucces() {
		DashboardPage dashboardPage = new DashboardPage(webDriver);
		dashboardPage.verifyDashboard();
	}
}
