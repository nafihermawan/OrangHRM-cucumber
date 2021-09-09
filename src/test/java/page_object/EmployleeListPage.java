package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class EmployleeListPage extends BaseClass{
	
	public EmployleeListPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy(id = "")
	private WebElement ;
	
	@FindBy(id = "")
	private WebElement ;
	
	@FindBy(id = "")
	private WebElement ;
	
	@FindBy(id = "")
	private WebElement ;
	
	@FindBy(id = "")
	private WebElement ;
	
	@FindBy(id = "")
	private WebElement ;
}
