package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScripts extends textFills{
	
	public static String baseUrl = "https://teamreads.netlify.com/login";
	public static ChromeDriver driver;
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
		System.setProperty("webdriver.chrome.driver", "/Users/Grant/chromedriver");
		driver = new ChromeDriver();
		driver.get(baseUrl);
	}
	
	static void contactUsTest() {
		driver.findElement(By.className("sc-jKJlTe ffCfdn button")).click();
	}
	
	static void logInTest() {
		//driver.findElement(By.className("sc-VigVT dxJGPA button")).click();
		
		driver.findElement(By.xpath("/html/body/div[@id='root']/div[@class='App']/div[@class='sc-cJSrbW emQvrI']/div[@class='sc-kGXeez mUvgm']/div[@class='loginContainer']/div[@class='sc-ckVGcZ BSJtI ButtonGroup']/button[@class='sc-VigVT dxJGPA button']")).click();
		
		driver.findElement(By.xpath("/html[@class='auth0-lock-html']/body/div[@id='auth0-lock-container-1']/div[@class='auth0-lock auth0-lock-opened auth0-lock-with-tabs']/div[@class='auth0-lock-center']/form[@class='auth0-lock-widget']/div[@class='auth0-lock-widget-container']/div[@class='auth0-lock-cred-pane auth0-lock-quiet']/div[3]/span/div/div/div[@class='auth0-lock-view-content']/div/div[@class='auth0-lock-body-content']/div[@class='auth0-lock-content']/div[@class='auth0-lock-form']/div/div[2]/div[@class='auth0-lock-input-block auth0-lock-input-username']/div[@class='auth0-lock-input-wrap auth0-lock-focused auth0-lock-input-wrap-with-icon']/input[@class='auth0-lock-input']")).sendKeys(LOGIN);
		
		//driver.findElement(By.xpath("/html[@class='auth0-lock-html']/body/div[@id='auth0-lock-container-1']/div[@class='auth0-lock auth0-lock-opened auth0-lock-with-tabs']/div[@class='auth0-lock-center']/form[@class='auth0-lock-widget']/div[@class='auth0-lock-widget-container']/div[@class='auth0-lock-cred-pane auth0-lock-quiet']/div[3]/span/div/div/div[@class='auth0-lock-view-content']/div/div[@class='auth0-lock-body-content']/div[@class='auth0-lock-content']/div[@class='auth0-lock-form']/div/div[2]/div[@class='auth0-lock-input-block auth0-lock-input-show-password']/div[@class='auth0-lock-input-block auth0-lock-input-password']/div[@class='auth0-lock-input-wrap auth0-lock-focused auth0-lock-input-wrap-with-icon']/input[@class='auth0-lock-input']")).sendKeys(PASS);
		
		//manually enter password
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.className("auth0-label-submit")).click();
		handleAlerts();	
	}
	
	static void script1() {
		handleAlerts();
	}
}
