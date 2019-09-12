package hooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import basePackage.BasePage;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	public static WebDriver driver = null;
	
	@Before("@ProductPurchase, @UpdateInformation")
	public void setUp() {
		
		driver = BasePage.initializeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.MILLISECONDS);
		
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	@After("@ProductPurchase, @UpdateInformation")
	public void tearDown() {
		BasePage.quitDriver();
	}
}
