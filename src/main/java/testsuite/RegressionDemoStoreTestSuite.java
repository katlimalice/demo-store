package testsuite;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import testcase.AddProductsToTheShoppingCartTestCase;

@RunWith(Suite.class)
@SuiteClasses(AddProductsToTheShoppingCartTestCase.class)
public class RegressionDemoStoreTestSuite {

	@BeforeClass
	public static void init() {
		System.out.println("Iniciando execução...");
	}

	@AfterClass
	public static void end() {
		System.out.println("Finalizando...");
	}
}
