package tests.decisiontree;

import static tests.core.DriverFactory.getDriver;
import static tests.core.DriverFactory.killDriver;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import tests.core.LoginPage;

public class TestNewTree extends LoginPage{

	@Before
	public void inicializa() throws InterruptedException {
		login();
	}
	
	@After
	public void finaliza() {
		killDriver();
	}
	
	@Test
	public void criarArvore() throws InterruptedException {
		
		// Criando Arvore de Decisão
		getDriver().findElement(By.id("en.title")).click();
		
		getDriver().findElement(By.xpath("//*[@id='en.decNetWorks']")).click();
		
		Thread.sleep(12000);
		
		WebElement filtraDescricao = getDriver().findElement(By.id("descr"));
		
		Thread.sleep(5000);
		
		filtraDescricao.click();
		
		Thread.sleep(2000);
		
		filtraDescricao.sendKeys("Lbl6");
		
		Thread.sleep(1000);
		
		getDriver().findElement(By.id("fltButton")).click();

		Thread.sleep(1000);
		
		getDriver().findElement(By.xpath("//button[@title='Open']")).click();
		
		Thread.sleep(1000);
		
		getDriver().findElement(By.xpath("//button[@title='Edit']")).click();

		Thread.sleep(2000);

		WebElement canvas = new WebDriverWait(getDriver(), Duration.ofSeconds(50))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='mainDiagr']/div/div/canvas")));
		
		Actions actionProvider = new Actions(getDriver());
		
		
		// Teste 1
		new Actions(getDriver()).moveToElement(canvas, 0, 0).moveByOffset(-330, 5).doubleClick().build().perform();
		new Actions(getDriver()).moveToElement(canvas, 0, 0).moveByOffset(-330, 15).doubleClick().build().perform();
		
		actionProvider.moveToElement(canvas, 0, 0).moveByOffset(0, -100).click().build().perform();
		new Actions(getDriver()).moveToElement(canvas, 0, 0).moveByOffset(-330, 45).doubleClick().build().perform();
		
		// dmdays >= 10
		getDriver().findElement(By.id("field1")).clear();
		getDriver().findElement(By.id("field1")).sendKeys("days");
		
		getDriver().findElement(By.xpath("//select[@id='operation']/option[text()='G1 >= G2']")).click();

		getDriver().findElement(By.xpath("//select[@id='fldFlag']/option[text()='Value']")).click();
		
		getDriver().findElement(By.id("fld2")).clear();
		getDriver().findElement(By.id("fld2")).sendKeys("10");
		
		actionProvider.moveToElement(canvas, 0, 0).moveByOffset(0, -100).click().build().perform();
		
		
		// Teste 2
		actionProvider.moveToElement(canvas, 0, 0).moveByOffset(-330, 15).click().build().perform();
		
		Action keydown1 = actionProvider.keyDown(Keys.CONTROL).sendKeys("c").build();
		keydown1.perform();
		Action keydown2 = actionProvider.keyDown(Keys.CONTROL).sendKeys("v").build();
		keydown2.perform();
		
		new Actions(getDriver()).moveToElement(canvas, 0, 0).moveByOffset(-330, 70).doubleClick().build().perform();
		actionProvider.moveToElement(canvas, 0, 0).moveByOffset(0, -100).click().build().perform();
		
		new Actions(getDriver()).moveToElement(canvas, 0, 0).moveByOffset(-330, 90).doubleClick().build().perform();
		
		// uxacct <> null
		WebElement lancaCampo1 = getDriver().findElement(By.xpath("//*[@id='fld']"));
		lancaCampo1.sendKeys("aact");
		
		getDriver().findElement(By.xpath("//select[@id='operation']/option[text()='G1 != G2']")).click();

		getDriver().findElement(By.xpath("//select[@id='field2Flag']/option[text()='Value']")).click();
		getDriver().findElement(By.id("fld2")).clear();
		getDriver().findElement(By.id("fld2")).sendKeys("null");

		getDriver().findElement(By.id("fld1")).clear();
		getDriver().findElement(By.id("fld1")).sendKeys("aact");
		
		new Actions(getDriver()).sendKeys(Keys.ESCAPE).perform();
		actionProvider.moveToElement(canvas, 0, 0).moveByOffset(-330, 15).click().build().perform();
		
		Action keydown01 = actionProvider.keyDown(Keys.CONTROL).sendKeys("c").build();
		keydown01.perform();
		Action keydown02 = actionProvider.keyDown(Keys.CONTROL).sendKeys("v").build();
		keydown02.perform();
		actionProvider.moveToElement(canvas, 0, 0).moveByOffset(0, -100).click().build().perform();

		new Actions(getDriver()).moveToElement(canvas, 0, 0).moveByOffset(-330, 110).doubleClick().build().perform();
		new Actions(getDriver()).sendKeys(Keys.ESCAPE).perform();

		new Actions(getDriver()).moveToElement(canvas, 0, 0).moveByOffset(-330, 190).click().build().perform();
		
		// ------------ continua
	}
}
