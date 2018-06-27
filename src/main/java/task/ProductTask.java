package task;

import org.openqa.selenium.WebDriver;

import appobject.ProductAppObject;

public class ProductTask {

	private ProductAppObject productAppObject;

	public ProductTask(WebDriver driver) {
		this.productAppObject = new ProductAppObject(driver);
	}
	
	public void addBatmanToCart() {
		this.productAppObject.getAddToCartBatmanButton().click();
		this.productAppObject.getContinueShoppingButton().click();
	}
	
	public void addIphoneToCart() {
		this.productAppObject.getIncrementIphoneQuantityButton().click();
		this.productAppObject.getAddToCartIphoneButton().click();
		this.productAppObject.getContinueShoppingButton().click();
	}
	
	public void goToMyCart() {
		this.productAppObject.getGoToMyCartButton().click();
		this.productAppObject.getViewCartButton().click();
	}


}
