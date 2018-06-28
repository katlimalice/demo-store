package appobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

	public WebElement getContinueShoppingButton() {
		WebDriverWait wait = new WebDriverWait(this.driver, 3);
		return wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[7]/div/div[2]/div[1]/a")));
	}

	public WebElement getGoToMyCartButton() {
		WebDriverWait wait = new WebDriverWait(this.driver, 3);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"tygh_main_container\"]/div[2]/div/div[1]/div[3]/div/div[2]/div")));
	}

	public WebElement getViewCartButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"dropdown_8\"]/div/div[2]/div[1]/a"));
	}

}