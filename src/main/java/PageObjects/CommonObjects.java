package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class CommonObjects {	
	@FindBy(xpath = "//*[@class='alert alert-success alert-dismissable']")
	public WebElement commonAlert;
	
	//@FindBys(@FindBy(how=How.XPATH, using="//*[@class='mt-2']//p"))
	//public List<WebElement> LeftNavMenu;
	
	@FindBy(xpath = "//*[@id='product-form']//div//h1")
	public WebElement pageTitle;
}
