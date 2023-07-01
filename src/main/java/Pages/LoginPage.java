package Pages;

import org.junit.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import PageObjects.*;
import Utilities.BrowserActions;
public class LoginPage extends LoginObjects{
	public WebDriver driver;
	BrowserActions action = new BrowserActions();
	public void launchApplication()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		PageFactory.initElements(driver, this);
		driver.get("https://admin-demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void enterEmailAndPassword(String email, String passwd) {
		username.clear();
		username.sendKeys(email);
		password.clear();
		password.sendKeys(passwd);
	}
	
	public void clickOnLoginButton() {
		loginButton.click();
	}
	
	public void clickOnLogoutLink() {
		action.waitForElementToBeVisible(driver,logOut);
		logOut.click();
	}
	
	public void VerifyPageTitle(String title) {
		action.waitForDocumentReadyState(driver);
		String pageTitle = driver.getTitle();
		Assert.assertTrue("Page Title is matching", pageTitle.equals(title));
	}
	
	public void closeBrowser()
	{
		driver.close();
	}
}
