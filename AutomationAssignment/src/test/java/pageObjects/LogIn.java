package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogIn {
	
	private WebDriver driver;
	
	private By signIn = By.className("login");
	private By email = By.id("email");
	private By pwd = By.id("passwd");
	private By signInButton = By.id("SubmitLogin"); 
	
	public LogIn(WebDriver driver) {
		this.driver = driver;
	}
	
	//Method to click on Sign In
	public void clickSignIn() {
		driver.findElement(signIn).click();
	}
	
	//Method to Enter Email
	public void enterEmail(String emailId) {
		driver.findElement(this.email).sendKeys(emailId);
	}
	
	//Method to Enter Password
	public void enterPassword(String password) {
		driver.findElement(pwd).sendKeys(password);
	}
	
	//Method to click on Sign In button
	public void clickSignInButton() {
		driver.findElement(signInButton).click();
	}
	
}
