package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScripts {
	
	public static String baseUrl = "http://localhost:3000/login";
	public static ChromeDriver driver = new ChromeDriver();
	protected String userName = "";
	protected String password = "";
	private static boolean acceptNextAlert = true;
	public static String AlertsRaised = null;
	
	protected static boolean isElementPresent(By byId) {
		try {
			driver.findElement(byId);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	
	private static boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	
	private static String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}
	
	public static void handleAlerts() {
		if (isAlertPresent()) {
			while (isAlertPresent()) {
				AlertsRaised += closeAlertAndGetItsText() + ",";
			}
		}
	}
	
	static void getBaseUrlFirst() {
		driver.get(baseUrl);
	}
	
	static void logIn() {
		handleAlerts();	
	}
	
	static void Script1() {
		
	}
}
