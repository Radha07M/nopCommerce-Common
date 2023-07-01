package Utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserActions {
	public void waitForElementToBeVisible(WebDriver driver,WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated((By) element));
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public boolean waitForDocumentReadyState(WebDriver driver) {
		boolean flag=false;
		((JavascriptExecutor)driver).executeScript("document.");
		return flag;
	}
}
