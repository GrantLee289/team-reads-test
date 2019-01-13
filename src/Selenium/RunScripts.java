package Selenium;

import java.util.concurrent.TimeUnit;

public class RunScripts extends TryCatchTest{
	
	public static void main (String[] args) {

		getBaseUrlFirst();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		TestAndRetry();
	}
}
