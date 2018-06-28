package appobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultAppObject {
	private WebDriver driver;

	public SearchResultAppObject(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getGoToBatmanProductButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"pagination_contents\"]/div[2]/div[1]/div/form/div[1]/a"));
	}

	public WebElement getGoToIphoneProductButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"icons_245\"]/div[1]/div/div[1]/div/a"));
	}

}
