package Pages;

import java.util.*;

import org.junit.Assert;
import org.openqa.selenium.*;

import PageObjects.*;
import Utilities.*;

public class CommonMethods extends CommonObjects{
	BrowserActions action = new BrowserActions();
	Config config = new Config();
	
	public void clickOnLeftNavMenu(String menu) {
		List<WebElement> menuList = config.getDriver().findElements(By.xpath("//*[@class='mt-2']//p"));
		Iterator<WebElement> itr = menuList.iterator();
		while(itr.hasNext()) {
			itr.next().click();
			System.out.println("Select menu: "+itr.next().getText());
		}
	}
	
	public void verifyAlertMessage(String message) {
		action.waitForElementToBeVisible(commonAlert);
		Assert.assertEquals("Successfully macthed alert message", message, commonAlert.getText().trim()); 
	}
	
	public void verifyFormTitle(String pageName) {
		action.waitForElementToBeVisible(pageTitle);
		Assert.assertEquals("Successfully macthed page title", pageName, pageTitle.getText().trim()); 
	}
}
