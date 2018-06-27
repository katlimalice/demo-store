package task;

import org.openqa.selenium.WebDriver;

import appobject.HomeAppObject;

public class HomeTask {

	private HomeAppObject homeAppObject;

	public HomeTask(WebDriver driver) {
		this.homeAppObject = new HomeAppObject(driver);
	}

	public void searchForProduct(String product) {
		this.homeAppObject.getFindProductsTextField().sendKeys(product);
		this.homeAppObject.getSearchButton().click();
	}

}
