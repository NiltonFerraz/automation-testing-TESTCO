package tests.core;

import static tests.core.DriverFactory.getDriver;
import static tests.core.DriverFactory.killDriver;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;

public class BaseTest extends LoginPage {

	@Before
	public void initialize() throws InterruptedException {
		accessInitialPage();
		login();
	}
	
	@After
	public void finalize() throws InterruptedException {
		Thread.sleep(10000);
		getDriver().findElement(By.id("logout-button")).click();
		Thread.sleep(5000);
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		if (Properties.FECHAR_BROWSER) {
			killDriver();
		}
	}
}
