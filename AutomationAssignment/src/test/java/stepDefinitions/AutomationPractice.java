package stepDefinitions;

import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.Hooks;
import pageObjects.LogIn;
import pageObjects.MyPersonalInformation;
import pageObjects.ProductCheckout;



public class AutomationPractice {
	
	private WebDriver driver = Hooks.getDriver();
	String url = "http://automationpractice.com/index.php";
	
	@Given("^the url of the application under test$")
	public void getUrl() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(url);
	}

	@When("^user is on My Store click on T-Shirts Menu and Order a T-Shirt$")
	public void orderTShirt() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    new ProductCheckout(driver).clickTshirts();
	    new ProductCheckout(driver).addTShirtToCart();
	}

	@Then("^verify order is placed successfully in Order History$")
	public void verifyOrderHistory() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    assertTrue(new ProductCheckout(driver).isOrderPlaced());
	}

	@When("^user is on Your Personal Information Page, update First Name$")
	public void updateFirstName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		new MyPersonalInformation(driver).updateFirstName();
	}
	
	@Then("^verify if the success message \"([^\"]*)\" is displayed$")
	public void verifyUpdatedInformation(String successMessage) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    assertTrue(new MyPersonalInformation(driver).isInfoUpdated(successMessage));
	}

}
