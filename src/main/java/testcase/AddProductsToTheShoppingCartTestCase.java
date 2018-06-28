package testcase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import task.HomeTask;
import task.ProductTask;
import task.SearchResultTask;
import verificationpoints.CartVerificationsPoints;

public class AddProductsToTheShoppingCartTestCase {

	private WebDriver driver;

	private HomeTask homeTask;
	private ProductTask productTask;
	private SearchResultTask searchResultTask;

	private CartVerificationsPoints cartVerificationPoint;

	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();

		this.driver = new ChromeDriver();
		this.driver.get("http://demo.cs-cart.com/");
		this.driver.manage().window().maximize();
		this.homeTask = new HomeTask(driver);
		this.productTask = new ProductTask(driver);
		this.searchResultTask = new SearchResultTask(driver);
		this.cartVerificationPoint = new CartVerificationsPoints(driver);
	}

	@Test
	public void searchForBatmanAndIphoneAndFindProductForAddToCart() {
		this.homeTask.searchForProduct("Batman");
		this.searchResultTask.goToBatmanProduct();
		this.productTask.addBatmanToCart();

		this.homeTask.searchForProduct("iPhone");
		this.searchResultTask.goToIphoneProduct();
		this.productTask.addIphoneToCart();
		
		// In case of a message appears in front of the page
		// reload the page to vanish
		this.driver.navigate().refresh();

		this.productTask.goToMyCart();

		this.cartVerificationPoint.cartIsValid();
	}

	@After
	public void tearDown() {
		this.driver.quit();
	}

}
