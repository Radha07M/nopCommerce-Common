package Pages;

import PageObjects.*;
import Utilities.*;

public class Catalog_ProductsPage extends Catalog_ProductObjects implements Constant{
	BrowserActions action = new BrowserActions();
	Config config = new Config();
	
	public void clickOnAddNewButton() {
		action.waitForElementToBeVisible(addNewProduct);
		addNewProduct.click();
	}
	
	public void enterNewProductDetails(String prodName) {
		
	}
	
	public void clickOnProductSaveButton() {
		saveProd.click();
	}
}
