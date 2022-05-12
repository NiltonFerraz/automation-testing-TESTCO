package agency.catalagency;

import static tests.core.DriverFactory.getDriver;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import tests.core.BaseTest;

public class TestIncludeAgency {

	@Test
	public void includeAgency() throws InterruptedException {
		new BaseTest().initialize();
		
		Thread.sleep(5000);
		getDriver().findElement(By.id("agency.title")).click();
		Thread.sleep(5000);
		getDriver().findElement(By.id("agency.agency")).click();
		
		// Insert New
		WebElement wait1 = new WebDriverWait(getDriver(), Duration.ofSeconds(30))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@href='#/agency-catal/create']")));
		wait1.click();
		
		// Agency
		Thread.sleep(3000);
		getDriver().findElement(By.id("agencyId")).sendKeys("NFERRAZ");
		
		// Status
		Thread.sleep(3000);
		getDriver().findElement(By.xpath("//*[@id='agencyStat'/option[text()='Ative']")).click();

		// Mother Agency 
		Thread.sleep(3000);
		getDriver().findElement(By.xpath("//*[@id='parentAgency'/option[text()=' 0001BB ']")).click();
		
		// Save
		WebElement element = new WebDriverWait(getDriver(), Duration.ofSeconds(30))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='btnsuccess']")));
		Actions actions = new Actions(getDriver());
		actions.moveToElement(element).click().build().perform();
		
	}
}
