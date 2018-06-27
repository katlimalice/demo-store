package verificationpoints;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import appobject.CartAppObject;

public class CartVerificationsPoints {

	private WebDriver driver;

	private CartAppObject cartAppObject;

	public CartVerificationsPoints(WebDriver driver) {
		this.driver = driver;
	}

	public void checkIphoneQuantityValue() {
		WebElement iphoneQuantity;
		iphoneQuantity = this.cartAppObject.getIphoneQuantityTextField();

		if (iphoneQuantity != null) {
			String invalid = iphoneQuantity.getAttribute("innerHTML");

			if (invalid.toUpperCase().contains("2")) {
				System.out.println("Test passed");

			} else {
				System.out.println("Error!");
				Assert.fail();
			}
		}

	}

	public void checkBatmanQuantityValue() {
		WebElement batmanQuantity;
		batmanQuantity = this.cartAppObject.getBatmanQuantityTextField();

		if (batmanQuantity != null) {
			String invalid = batmanQuantity.getAttribute("innerHTML");

			if (invalid.toUpperCase().contains("1")) {
				System.out.println("Test passed");

			} else {
				System.out.println("Error!");
				Assert.fail();
			}
		}

	}

}
