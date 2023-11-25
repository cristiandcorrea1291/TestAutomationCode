package rahultshettyacademy.pageobjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	WebDriver driver;

	@FindBy(css = ".totalRow button")
	WebElement checkoutEle;

	@FindBy(css = ".cartSection h3")
	private List<WebElement> cartProducts;

	public CartPage(WebDriver driver) {
		//super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	
	public Boolean VerifyProductDisplay(String productName) {
		Boolean match = cartProducts.stream().anyMatch(product -> product.getText().equalsIgnoreCase(productName));
		System.out.println("Buscamos el titulo del producto") ;
		return match;

	}
	
	public CheckoutPage goToCheckout() {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("document.querySelector('.totalRow button').click();");
	    System.out.println("Vamos a hacer checkout");
	    return new CheckoutPage(driver);
	}

	
	
}
