package verificationpoints;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import appobject.CartAppObject;
import framework.ScreenShot;

public class CartVerificationsPoints {

	private CartAppObject cartAppObject;
	private WebDriver driver;

	public CartVerificationsPoints(WebDriver driver) {
		this.driver = driver;
		this.cartAppObject = new CartAppObject(driver);
	}

	private boolean checkIphoneQuantityValue() {
		WebElement iphoneQuantityWebElement;

		iphoneQuantityWebElement = this.cartAppObject.getIphoneQuantityTextField();

		if (iphoneQuantityWebElement != null) {
			String qty = iphoneQuantityWebElement.getAttribute("value");

			if (qty != null && !qty.isEmpty() && qty.trim().equals("2")) {
				System.out.println("iPhone quantity ok!");
			} else {
				System.out.println("iPhone quantity invalid!");
				System.out.println("Expected iPhone quantity: 2 / Received: " + qty);

				return false;
			}
		}

		return true;
	}

	private boolean checkBatmanQuantityValue() {
		WebElement batmanQuantity;
		batmanQuantity = this.cartAppObject.getBatmanQuantityTextField();

		if (batmanQuantity != null) {
			String qty = batmanQuantity.getAttribute("value");

			if (qty != null && !qty.isEmpty() && qty.trim().equals("1")) {
				System.out.println("Batman Game quantity Ok!");
			} else {
				System.out.println("Batman Game quantity invalid!");
				System.out.println("Expected Batman Game quantity: 1 / Received: " + qty);

				return false;
			}
		}

		return true;
	}

	private boolean checkTotalPriceCartalue() {
		WebElement totalPrice;
		totalPrice = this.cartAppObject.getTotalPriceCartSpan();

		if (totalPrice != null) {
			String price = totalPrice.getAttribute("innerHTML");

			if (price != null && !price.isEmpty() && price.contains("1457.99")) {
				System.out.println("Price is valid!");

			} else {
				System.out.println("Price is invalid!");
				System.out.println("Expected price: 1457.99 / Received: " + price);

				return false;
			}
		}

		return true;
	}

	public void cartIsValid() {
		try {
			boolean batmanQty = this.checkBatmanQuantityValue();
			boolean iphoneQty = this.checkIphoneQuantityValue();
			boolean priceOk = this.checkTotalPriceCartalue();

			ScreenShot.capture(driver);

			Assert.assertTrue("The quantity of Batman games doesn't match.", batmanQty);
			Assert.assertTrue("The quantity of iPhones doesn't match.", iphoneQty);
			Assert.assertTrue("The price of the purchase doesn't match.", priceOk);

		} catch (Exception ex) {
			System.out.println(ex.getMessage());

			Assert.fail();
		}
	}
}
