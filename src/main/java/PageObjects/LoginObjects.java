package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginObjects {
	
	@FindBy(xpath = "//*[@id='Email']")
	@CacheLookup
	public WebElement username;
	
	@FindBy(xpath = "//*[@id='Password']")
	@CacheLookup
	public WebElement password;
	
	@FindBy(xpath = "//button[contains(@class,'login-button')]")
	@CacheLookup
	public WebElement loginButton;
	
	@FindBy(xpath = "//*[@id='navbarText']//*[@href='/logout']")
	@CacheLookup
	public WebElement logOut;
}
