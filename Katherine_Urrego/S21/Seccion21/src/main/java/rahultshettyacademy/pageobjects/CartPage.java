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
	
	//Verificar el producto segun su nombre o titulo
	//Verificar los items o productos an el carrito usando "STREAM" y encontrar el botón "CHECKOUT"
	public Boolean VerifyProductDisplay(String productName) {
		Boolean match = cartProducts.stream().anyMatch(product -> product.getText().equalsIgnoreCase(productName));
		System.out.println("Buscamos el titulo del producto para ver las coindencias de los nombres") ;
		return match;

	}
	
	
	//Ir al boton Checkout para validar el pedido
	
	/*public CheckoutPage goToCheckout() {
		checkoutEle.click();
		System.out.println("Vamos a hacer checkout") ;
		return new CheckoutPage(driver);//se crea un objeto despues del clic y lo retornamos
	}
	
	*/
	// Ir al botón Checkout para validar el pedido
	public CheckoutPage goToCheckout() {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("document.querySelector('.totalRow button').click();");
	    System.out.println("Vamos a hacer checkout");
	    return new CheckoutPage(driver);
	}

	
	
}
