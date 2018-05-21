package pageFactory_050118;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PageFactory_testCase {

	@Test
	public void testLogin() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chau\\Downloads\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com");

		// create a new instance of page class
		PageFactoryEx loginEx = PageFactory.initElements(driver, PageFactoryEx.class);
		
		loginEx.username("Admin");
		loginEx.password("admin");
		loginEx.clickLogin();

	}
}
