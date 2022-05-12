package engine.values;

import java.time.Duration;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import tests.core.DriverFactory;
import tests.core.ReadFile;

public class TestEditValues {

	@Test
	public void editValues(String arq) throws InterruptedException {
		
		ReadFile arquivo = new ReadFile();
		List<String> list = arquivo.readFileTxt(arq);
		
		DriverFactory.getDriver().findElement(By.xpath("//*[@id='id']")).sendKeys(list.get(6));
		DriverFactory.getDriver().findElement(By.id("filtButton")).click();

		Thread.sleep(1000);

		DriverFactory.getDriver().findElement(By.xpath("//*[@title='Edit']")).click();
		
		WebElement wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(30))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@title='Edit']")));
		wait.click();
		
		Thread.sleep(3000);
		
		DriverFactory.getDriver().findElement(By.id("descr")).clear();
		DriverFactory.getDriver().findElement(By.id("descr")).sendKeys(list.get(7));
//		DriverFactory.getDriver().findElement(By.id("description")).sendKeys("Teste Alterdo");
		Thread.sleep(3000);
		DriverFactory.getDriver().findElement(By.xpath("//*[@text()=' Include ']")).click();

		DriverFactory.getDriver().findElement(By.xpath("//*[@class='btnsuccess']")).click();
	}
}
