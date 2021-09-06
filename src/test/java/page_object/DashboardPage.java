package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class DashboardPage extends BaseClass{

	public DashboardPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	
	}
}
