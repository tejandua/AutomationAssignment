package stepDefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import hooks.Hooks;
import pageObjects.LogIn;
import pageObjects.MyPersonalInformation;

public class LoginStepDefinition {
	
	public LogIn login;
	public WebDriver driver = Hooks.getDriver();
	
	@Given("^user is on the website, login with the following credentials$")
	public void loginWithValidCredentials(DataTable credential) throws Exception {
	    List credentials = credential.asList(String.class);
	    login = new LogIn(driver);
	    login.clickSignIn();
	    login.enterEmail(String.valueOf(credentials.get(0)));
	    login.enterPassword(String.valueOf(credentials.get(1)));
	    login.clickSignInButton();
	}
	
	@Given("^user is on the website, navigate to My Personal Information Page$")
	public void updatePersonalInfo(DataTable credential) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		List credentials = credential.asList(String.class);
		login = new LogIn(driver);
		login.clickSignIn();
	    login.enterEmail(String.valueOf(credentials.get(0)));
	    login.enterPassword(String.valueOf(credentials.get(1)));
	    login.clickSignInButton();
	    new MyPersonalInformation(driver).clickOnPersonalInfo();
	}
}
