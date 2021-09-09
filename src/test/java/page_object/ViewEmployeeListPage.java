package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class ViewEmployeeListPage extends BaseClass{
	
	public ViewEmployeeListPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy(id = "menu_pim_viewEmployeeList")
	private WebElement btnViewEmployeeList;

	@FindBy(id = "menu_pim_addEmployee")
	private WebElement btnAddEmployee;

	@FindBy(id = "menu_core_viewDefinedPredefinedReports")
	private WebElement btnReports;
	
	public void clickEmployeeList() {
		btnViewEmployeeList.click();
	}
	
	public void clickAddEmployee() {
		btnAddEmployee.click();
	}
}
