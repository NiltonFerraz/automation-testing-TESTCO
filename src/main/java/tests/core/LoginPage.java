package tests.core;

import org.openqa.selenium.By;

public class LoginPage {

	public void accessInitialPage() {
		DriverFactory.getDriver().get("https://162.108.20.21:8181/platform");
	}
	
	public void login() throws InterruptedException {
		Thread.sleep(5000);
		DriverFactory.getDriver().findElement(By.id("det-button")).click();
		
		Thread.sleep(5000);
		DriverFactory.getDriver().findElement(By.id("proc-link")).click();
		
		DriverFactory.getDriver().findElement(By.id("login-button")).click();
		
		DriverFactory.getDriver().findElement(By.id("userName")).sendKeys("0070");
		DriverFactory.getDriver().findElement(By.id("password")).sendKeys("WOW123");
		
		DriverFactory.getDriver().findElement(By.id("login-button-intern")).click();
		
		Thread.sleep(3000);
	}
}
