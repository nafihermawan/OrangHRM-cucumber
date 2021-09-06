package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class EmployleeListPage {
	
	public EmployleeListPage(WebDriver webDriver) {
		super();
		PageFactory.initElements(webDriver, this);
	}

}
