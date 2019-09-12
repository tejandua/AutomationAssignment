package basePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BasePage {
	
	public static WebDriver driver = null;
	
	public static WebDriver initializeDriver() {
		String browser = "chrome";
		
		switch(browser) {
			 case "chrome"  : System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
							  driver = new ChromeDriver();
						 	  break;
			 case "firefox" : System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
		 					  driver = new FirefoxDriver();
	 					 	  break;
			 case "ie" : System.setProperty("webdriver.gecko.driver", "drivers\\IEDriverserver.exe");
		 					  driver = new InternetExplorerDriver();
			 				  break;
		 	 default : System.out.println("Invalid choice of a browser!");
		}
		
		return driver;
	}
	
	public static void quitDriver() {
			driver.quit();
	}
}
