package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class AddEmployeePage extends BaseClass{
	
	public AddEmployeePage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy(id = "firstName")
	private WebElement firstName;
	
	@FindBy(id = "middleName")
	private WebElement midName;
	
	@FindBy(id = "lastName")
	private WebElement lastName;
	
	@FindBy(id = "photofile")
	private WebElement uploadPhoto;
	
	@FindBy(id = "btnSave")
	private WebElement btnSave;
	
	public void inputFirstName(String firstname) {
		firstName.sendKeys(firstname);
	}
	
	public void inputMidName(String midname) {
		midName.sendKeys(midname);
	}
	
	public void inputLastName(String lastname) {
		lastName.sendKeys(lastname);
	}
	
	public void uploadPhoto(String image) {
		String projectLocation = System.getProperty("user.dir");
		String path = projectLocation + "//lib//photo//";
		path = path + image;
		uploadPhoto.sendKeys(path);
	}
}
