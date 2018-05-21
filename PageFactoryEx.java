package pageFactory_050118;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageFactoryEx {

	WebDriver driver;
/*	Page Factory - @FindBy annotation EXAMPLES:
 
	@FindBy(name = "name") WebElement username;
	@FindBy(how = How.ID, using = "edit-pass") WebElement password;
	@FindBy(how = How.NAME, using = "op") WebElement login;
*/
	
	@FindBy(name = "txtUsername") WebElement username;
	@FindBy(id = "txtPassword") WebElement password;
	@FindBy(how=How.ID, using = "btnLogin") WebElement loginButton;
	
	@FindBy(how = How.ID, using = "menu_recruitment_viewRecruitmentModule") WebElement Recruitment;
	@FindBy(how = How.ID, using = "btnAdd") WebElement addButton;
	
	By firstName = By.id("addCandidate_firstName");
	By lastName = By.id("addCandidate_lastName");
	By Email = By.id("addCandidate_email");
	By Phone = By.id("addCandidate_contactNo");
	By Key = By.id("addCandidate_keyWords");
	By Comment = By.id("addCandidate_comment");
	By Save = By.id("btnSave");
	
	/* create constructor
	 * should have the same name as the class name
	 * constructor does not return value
	 * "this" is a reference to the current object (driver)
	 */
	
	public PageFactoryEx (WebDriver driver) {
		this.driver = driver;		
	}
	
	public void username(String userID) {
		username.sendKeys(userID);
	}
	
	public void password(String passID) {
		password.sendKeys(passID);
	}
	
	public void clickLogin() {
		loginButton.click();
	}
	
}
