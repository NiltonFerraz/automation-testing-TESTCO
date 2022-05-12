package tests.core;

import static tests.core.DriverFactory.getDriver;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import agency.catalagency.TestIncludeAgency;
import en.values.TestIncludeValues;

@RunWith(Suite.class)
@SuiteClasses({ 
	
	TestIncludeValues.class, 
	TestIncludeAgency.class 
	
})

public class SuiteTest {

	@AfterClass
	public static void finalizaTudo() {
		DriverFactory.killDriver();
	}
}
