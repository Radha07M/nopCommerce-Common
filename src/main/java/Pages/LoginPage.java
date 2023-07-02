package Pages;

import org.junit.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import PageObjects.*;
import Utilities.BrowserActions;
import Utilities.Constant;
public class LoginPage extends LoginObjects{
	public WebDriver driver;
	BrowserActions action = new BrowserActions();
	public void launchApplication()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+Constant.DRIVERPATH);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		PageFactory.initElements(driver, this);
		driver.get(Constant.APPURL);
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
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String pageTitle = driver.getTitle();
		Assert.assertTrue("Page Title is matching", pageTitle.equals(title));
	}
	
	public void closeBrowser()
	{
		driver.close();
	}
	
	public void enterMailAddress(String mailId) {
		username.clear();
		username.sendKeys(mailId);
	}
	
	public void enterPassword(String passwd) {
		password.clear();
		password.sendKeys(passwd);
	}
	
	public void verifyFieldsErrorMsgOnLogin(String errorMsg) {
		Assert.assertEquals("Successfully verified Field Error Message ", errorMsg, emailFieldError.getText());
	}
	
	public void verifySummaryErrorMsgOnLogin(String errorMsg) {
		Assert.assertEquals("Successfully verified summary Error Message ", errorMsg, loginAccError.getText());
	}
}
