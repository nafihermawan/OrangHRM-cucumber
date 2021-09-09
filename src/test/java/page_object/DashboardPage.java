package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class DashboardPage extends BaseClass{

	public DashboardPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy(xpath = "//b[.='Admin']")
	private WebElement btnNavAdmin;
	
	@FindBy(xpath = "//b[.='PIM']")
	private WebElement btnNavPIM;
	
	@FindBy(xpath = "//b[.='Leave']")
	private WebElement btnNavLeave;
	
	@FindBy(xpath = "//b[.='Buzz']")
	private WebElement btnNavBuzz;
	
	@FindBy(xpath = "//b[.='Project Info']")
	private WebElement btnNavProjectInfo;
	
	@FindBy(xpath = "//b[.='My Info']")
	private WebElement btnNavMyInfo;
	
	@FindBy(xpath = "//b[.='Dashboard']")
	private WebElement btnNavDashboard;
	
	@FindBy(xpath = "//b[.='Directory']")
	private WebElement btnNavDirectory;
	
	@FindBy(xpath = "//b[.='Maintenance']")
	private WebElement btnNavMaintenance;

	@FindBy(id = "welcome")
	private WebElement welcomeNav;
	
	public String verifyDashboard() {
		return welcomeNav.getText();
	}
}
