package Utilities;

import org.openqa.selenium.WebDriver;
public class Config {
	
	//Varible declaration
	public WebDriver driver;
	
	
	//config methods
	public void setDriver(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebDriver getDriver() {
		return driver;
	}
}
