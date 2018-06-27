package testcase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import task.CartTask;
import task.HomeTask;
import task.ProductTask;
import task.SearchResultTask;

public class AddProductsToTheShoppingCartTestCase {

	private WebDriver driver;

	private CartTask cartTask;
	private HomeTask homeTask;
	private ProductTask productTask;
	private SearchResultTask searchResultTask;

	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();

		this.driver = new ChromeDriver();
		this.driver.get("http://demo.cs-cart.com/");
		this.homeTask = new HomeTask(driver);
	}

	@Test
	public void searchForBatmanAndIphoneAndFindProductForAddToCart() {
		this.homeTask.searchForProduct("Batman");
		this.searchResultTask.goToBatmanProduct();
		this.productTask.addBatmanToCart();
		this.productTask.addIphoneToCart();
		this.productTask.goToMyCart();

	}

	@After
	public void tearDown() {
		this.driver.quit();
	}

}
