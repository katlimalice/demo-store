package appobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeAppObject {
	private WebDriver driver;

	public HomeAppObject(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFindProductsTextField() {
		return this.driver.findElement(By.id("search_input"));
	}

	public WebElement getSearchButton() {
		return this.driver.findElement(
				By.xpath("//*[@id=\"tygh_main_container\"]/div[2]/div/div[1]/div[3]/div/div[1]/div/div/form/button"));
	}
}
