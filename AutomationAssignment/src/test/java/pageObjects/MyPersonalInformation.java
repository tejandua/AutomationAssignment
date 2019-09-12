package pageObjects;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyPersonalInformation {
	
	private WebDriver driver;
	
	private By personalInfo = By.xpath("//div[@id='center_column']/div/div[1]/ul/li[4]");
	private By firstName = By.id("firstname");
	private By password = By.id("old_passwd");
	private By saveButton = By.xpath("//button[@name='submitIdentity']");
	private By successMessage = By.xpath("//div[@id='center_column']/div/p");
	
	public MyPersonalInformation(WebDriver driver) {
		this.driver = driver;
	}
	
	//Method to generate a random character for the New First Name
	public char generateRandomChar() {
		Random r = new Random();
        char c = (char)(r.nextInt(26) + 'A');
		return c;
	}
	
	//Method to click on Personal Information Tab
	public void clickOnPersonalInfo() {
		driver.findElement(personalInfo).click();
	}
	
	//Method to Update First Name
	public void updateFirstName() {
		driver.findElement(firstName).clear();
		driver.findElement(firstName).sendKeys("Johnathon "+generateRandomChar());
		driver.findElement(password).sendKeys("password");
		driver.findElement(saveButton).click();
	}
	
	//Method to verify if First Name is updated with the new value
	public boolean isInfoUpdated(String message) {
		if(driver.findElement(successMessage).getText().equals(message)) 
			return true;
		return false;
	}
}
