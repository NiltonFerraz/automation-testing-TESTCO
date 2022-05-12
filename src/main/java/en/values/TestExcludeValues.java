package en.values;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;

import tests.core.BaseTest;
import tests.core.DriverFactory;
import tests.core.ReadFile;

public class TestExcludeValues {

	@Test
	public void excludeValues(String arq) throws InterruptedException {
		
		ReadFile arquivo = new ReadFile();
		List<String> list = arquivo.readFileTxt(arq);
		
		DriverFactory.getDriver().findElement(By.xpath("//*[@id='id']")).clear();
		DriverFactory.getDriver().findElement(By.xpath("//*[@id='id']")).sendKeys(list.get(9));

		DriverFactory.getDriver().findElement(By.id("filtButton")).click();

		Thread.sleep(5000);
		DriverFactory.getDriver().findElement(By.xpath("//button[title='Delete']")).click();

		Thread.sleep(5000);
		DriverFactory.getDriver().findElement(By.xpath("//button[text()=' Yes ']")).click();
		
		new BaseTest().finalize();
	}
}
