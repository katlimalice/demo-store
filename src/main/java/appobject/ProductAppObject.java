package appobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductAppObject {
	private WebDriver driver;

	public ProductAppObject(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getAddToCartBatmanButton() {
		return this.driver.findElement(By.id("button_cart_94"));
	}

	public WebElement getIncrementIphoneQuantityButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"qty_245\"]/div/a[1]"));
	}

	public WebElement getAddToCartIphoneButton() {
		return this.driver.findElement(By.id("button_cart_245"));
	}

	public WebElement getGoToMyCartButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"sw_dropdown_8\"]/a"));
	}

	public WebElement getViewCartButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"dropdown_8\"]/div/div[2]/div[1]/a"));
	}

}