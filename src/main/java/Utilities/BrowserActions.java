package Utilities;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserActions {
	Config config = new Config();
	public void waitForElementToBeVisible(WebElement element) {
		WebDriverWait wait = new WebDriverWait(config.getDriver(), Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated((By) element));
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void waitForDocumentReadyState() {
		config.getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}
}
