package appobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartAppObject {
	private WebDriver driver;

	public CartAppObject(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getTotalPriceCartSpan() {
		return this.driver.findElement(By.id("sec_cart_total"));
	}

	public WebElement getContinueShoppingButton() {
		return this.driver.findElement(
				By.xpath("//*[@id=\"tygh_main_container\"]/div[3]/div/div[2]/div/div/div/div[3]/div[1]/a"));
	}

	public WebElement getIphoneQuantityTextField() {
		return this.driver.findElement(By.id("amount_892854072"));
	}

	public WebElement getBatmanQuantityTextField() {
		return this.driver.findElement(By.id("amount_1860791280"));
	}

}
