package Utilities;

/*
 * Here we have achieved POJO class concept
 * POJO stands for Plain Old Java Object
 * POJO is used for increase the reusability of code and readability
 */
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
