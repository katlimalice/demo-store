package task;

import org.openqa.selenium.WebDriver;

import appobject.CartAppObject;

public class CartTask {

	private CartAppObject cartAppObject;

	public CartTask(WebDriver driver) {
		this.cartAppObject = new CartAppObject(driver);
	}

}
