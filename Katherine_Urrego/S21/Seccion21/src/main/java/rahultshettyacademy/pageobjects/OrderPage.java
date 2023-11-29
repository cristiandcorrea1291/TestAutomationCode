package rahultshettyacademy.pageobjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//VIDEO 170
public class OrderPage {
	
	WebDriver driver;

	@FindBy(css = ".totalRow button")
	WebElement checkoutEle;

	//productos en la tabla de la pagina Orders
	@FindBy(css = "tr td:nth-child(3)")
	private List<WebElement> ProductNames;

	public OrderPage(WebDriver driver) {
		//super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	//Verificar el producto segun su nombre o titulo en la pagina ORDERS
	//tr td:nth-child(3) -> Selector de la columna Name con el nombre de los diferentes productos
	public Boolean VerifyOrderDisplay(String productName) {
		Boolean match = ProductNames.stream().anyMatch(product -> product.getText().equalsIgnoreCase(productName));
		System.out.println("Buscamos el titulo del producto en ORDERS para ver las coindencias de los nombres") ;
		return match;

	}
	
	
	// Ir al botón Checkout para validar el pedido
	public CheckoutPage goToCheckout() {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("document.querySelector('.totalRow button').click();");
	    System.out.println("Vamos a hacer checkout");
	    return new CheckoutPage(driver);
	}

	
	
}
