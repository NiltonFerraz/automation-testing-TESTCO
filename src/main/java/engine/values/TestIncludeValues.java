package engine.values;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;

import tests.core.BaseTest;
import tests.core.DriverFactory;
import tests.core.ReadFile;

public class TestIncludeValues {

	@Test
	public void includeValues(String arq) throws InterruptedException {
		
		new BaseTest().initialize();
		
		DriverFactory.getDriver().findElement(By.id("en.title")).click();
		Thread.sleep(5000);
		DriverFactory.getDriver().findElement(By.id("en.catals")).click();
		Thread.sleep(3000);
		DriverFactory.getDriver().findElement(By.id("en.catals.Values")).click();

		Thread.sleep(3000);
		
		DriverFactory.getDriver().findElement(By.xpath("//*[@class='btnsuccess']")).click();
		
		ReadFile arquivo = new ReadFile();
		List<String> list = arquivo.readFileTxt(arq);
		
		Thread.sleep(6000);
		
		DriverFactory.getDriver().findElement(By.id("movId")).sendKeys(list.get(1));
//		DriverFactory.getDriver().findElement(By.id("movId")).sendKeys("MODCT");
		DriverFactory.getDriver().findElement(By.id("movNme")).sendKeys(list.get(2));
//		DriverFactory.getDriver().findElement(By.id("movNme")).sendKeys("NILTON FERRAZ"));

		Thread.sleep(6000);
		
		DriverFactory.getDriver().findElement(By.xpath("//button[text()='Include']")).click();

		Thread.sleep(6000);
		
		DriverFactory.getDriver().findElement(By.id("code")).sendKeys(list.get(3));
//		DriverFactory.getDriver().findElement(By.id("code")).sendKeys("15");
		DriverFactory.getDriver().findElement(By.id("descr")).sendKeys(list.get(4));
//		DriverFactory.getDriver().findElement(By.id("descr")).sendKeys("Teste");
		Thread.sleep(6000);
		
		DriverFactory.getDriver().findElement(By.xpath("//button[text()='Include']")).click();

//		WebElement wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30))
//				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='btn-success']")));
//		wait.click();
		
		DriverFactory.getDriver().findElement(By.xpath("//*[@class='btnsuccess']")).click();
	}
}
