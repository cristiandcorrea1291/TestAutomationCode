package rahultshettyacademy.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rahulshettyacademy.AbstractComponents.AbstractComponent;

public class ProductCatalogue extends AbstractComponent {


	WebDriver driver; // local class  variable

	public ProductCatalogue(WebDriver driver) {	
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this); 
	}


	@FindBy(css = ".mb-3")
	List<WebElement>  products; 
	
	//Para la ng-animation
	@FindBy(css = ".ng-animating")
	WebElement  spinner;
	
	By productsBy = By.cssSelector(".mb-3");
	By addToCartBy = By.cssSelector(".card-body button:last-of-type");
	By toastMessageBy = By.cssSelector("#toast-container");
	

	//Listará los productos diplayed/mostrados en la pagina
	public List<WebElement> getProductList() {
		waitForElementToAppear(productsBy);
		return products;
	}
	
	
	//Action Method para  Validar el nombre del producto que esta en la lista
	public WebElement getProductByName (String productName) {
		WebElement prod = getProductList().stream().filter(product->
		product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
		
		return prod;
	}
	
	//Agregar el producto al carro de compras
	public void addProductToCart(String productName) throws InterruptedException {
		WebElement prod = getProductByName (productName);
		prod.findElement(addToCartBy).click();
		System.out.println("Se agregó el producto al carrito") ;
		waitForElementToAppear(toastMessageBy);///esperamos el mensaje product added aparezca
		System.out.println("Apareció el mensaje del producto agregado al carrito") ;
		waitForElementToDisappear(spinner);//esperamos el mensaje product added DESaparezca
		System.out.println("Desapareció el mensaje del producto agregado al carrito") ;
	}
	

	
	
	
	
}
