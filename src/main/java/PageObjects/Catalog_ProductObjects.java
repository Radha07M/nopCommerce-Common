package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Catalog_ProductObjects {
	@FindBy(xpath = "//*[@class='btn btn-primary' and @href='/Admin/Product/Create']")
	@CacheLookup
	public WebElement addNewProduct;
	
	@FindBy(xpath = "//*[@id='product-details-area']//*[@id='Name']")
	@CacheLookup
	public WebElement prodName;
	
	@FindBy(xpath = "//*[@for='Name']/..//*[@class='ico-help']")
	@CacheLookup
	public WebElement prodHelpIcon;
	
	@FindBy(xpath = "//*[@for='ProductTypeId']/..//*[@class='ico-help']")
	@CacheLookup
	public WebElement prodTypeHelpIcon;

	@FindBy(xpath = "//*[@id='ProductTypeId']")
	@CacheLookup
	public WebElement prodType;
	
	@FindBy(xpath = "//*[@id='Sku']")
	@CacheLookup
	public WebElement prodSKU;
	
	@FindBy(xpath = "//*[@id='Price']")
	@CacheLookup
	public WebElement prodPrice;
		
	@FindBy(xpath = "//*[@id='product-form']//*[@name='save']")
	@CacheLookup
	public WebElement saveProd;
}
