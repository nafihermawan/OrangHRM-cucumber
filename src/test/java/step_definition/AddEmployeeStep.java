package step_definition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddEmployeeStep {
	private WebDriver webDriver;
	
	public AddEmployeeStep() {
		super();
		this.webDriver = Hooks.webDriver;
	}
	
	@Given("User already login with \"(.*)\" As username and \"(.*)\" as password")
		public void loginOrangeHRM(String username, String password) throws Throwable{
		LoginStep loginStep = new LoginStep();
	}
	
	@When("User open the add employee page")
	public void addEmployeePage() {
		
	}
	
	@When("User input \"(.*)\" as first name, \"(.*)\" as middle name and \"(.*)\" as last name")
	public void inputEmployeeName() {
		
	}
	
	@When("User upload photo \"(.*)\"")
	public void inputPhoto() {
		
	}
	
	@Then("User \"(.*)\" already created")
	public void employeeCreated() {
		
	}
}
