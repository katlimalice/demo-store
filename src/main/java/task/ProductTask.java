package task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import appobject.ProductAppObject;

public class ProductTask {

	private ProductAppObject productAppObject;
	private WebDriver driver;

	public ProductTask(WebDriver driver) {
		this.productAppObject = new ProductAppObject(driver);
		this.driver = driver;
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
		Actions actions = new Actions(driver);

		actions.moveToElement(this.productAppObject.getGoToMyCartButton()).click();
		actions.moveToElement(this.productAppObject.getViewCartButton()).click();
		
		actions.perform();
	}
}
