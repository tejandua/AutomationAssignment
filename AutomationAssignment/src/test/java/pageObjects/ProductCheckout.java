package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utlilityClasses.*;

public class ProductCheckout {
	
	private WebDriver driver;
	public String ordRef = "";
	
	private By tshirts = By.xpath("//div[@id='block_top_menu']/ul/li[3]/a");
	private By tshirt = By.xpath("//div[@id='center_column']/ul/li/div/div[1]/div/a[1]/img");
	private By addToCart = By.xpath("//div[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]/span");
	private By proceedToCheckout = By.xpath("//div[@id='layer_cart']/div[1]/div[2]/div[4]/a/span");
	private By proceedSummary = By.xpath("//div[@id='center_column']/p[2]/a[1]/span");
	private By proceedAddress = By.xpath("//div[@id='center_column']/form/p/button/span");
	private By proceedShipping = By.xpath("//button[@name='processCarrier']");
	private By tnc = By.id("cgv");
	private By paymentMethod = By.cssSelector("a[class='bankwire']");
	private By confirmOrder = By.xpath("//p[@id='cart_navigation']/button/span");
	private By backToOrders = By.xpath("//div[@id='center_column']/p/a");
	private By orderReference = By.xpath("//div[@id='center_column']/div");
	private By orderHistoryReference = By.xpath("//table[@id='order-list']/tbody/tr[1]/td[1]/a");
	
	public ProductCheckout(WebDriver driver) {
		this.driver = driver;
	}
	
	//Method to click on TShirts Menu
	public void clickTshirts() {
		driver.findElement(tshirts).click();
	}
	
	//Method to add a T-Shirt to Cart
	public void addTShirtToCart() {
		Actions actions = new Actions(driver);
		WebElement shirt = driver.findElement(tshirt);
		Action mouseOver = actions.moveToElement(shirt).build();
		mouseOver.perform();
		
		ExplicitWait.useExplicitWait(driver, addToCart);
		
		driver.findElement(addToCart).click();
		driver.findElement(proceedToCheckout).click();
		driver.findElement(proceedSummary).click();
		driver.findElement(proceedAddress).click();
		driver.findElement(tnc).click();
		driver.findElement(proceedShipping).click();
		driver.findElement(paymentMethod).click();
		driver.findElement(confirmOrder).click();
		driver.findElement(backToOrders).click();
	}
	
	//Method to verify if order is placed successfully
	public boolean isOrderPlaced() throws Exception {
		Thread.sleep(1000);
		ordRef = driver.findElement(orderReference).getText();
		if(ordRef.contains(driver.findElement(orderHistoryReference).getText())){
			return true;
		}
		return false;
	}
}
