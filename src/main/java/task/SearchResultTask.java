package task;

import org.openqa.selenium.WebDriver;

import appobject.SearchResultAppObject;

public class SearchResultTask {
	private SearchResultAppObject searchResultAppObject;

	public SearchResultTask(WebDriver driver) {
		this.searchResultAppObject = new SearchResultAppObject(driver);
	}

	public void goToBatmanProduct() {
		this.searchResultAppObject.getGoToBatmanProductButton().click();
	}

	public void goToIphoneProduct() {
		this.searchResultAppObject.getGoToIphoneProductButton().click();
	}

}
