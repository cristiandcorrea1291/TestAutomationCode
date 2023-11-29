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

	public ProductCatalogue(WebDriver driver) {	//Constructor para inicializar el driver
		// TODO Auto-generated constructor stub
		//initialization
		super(driver);
		this.driver=driver;// se refiere a la local class variable ...se refiere a la variable local a traves de una instancia
		PageFactory.initElements(driver, this); //PageFactory.initElements(lo que quiero enviar , la driver class actual);
	}

	
	//PageFactory
	//@FindBy(que atributo quiero encontrar)
	//@FindBy(uso el atributo id, ccs, xpath...etc")->css
	//@FindBy(css="cual es el locator value") -> .mb-3

	//en lugar de usar List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
	@FindBy(css = ".mb-3")
	List<WebElement>  products; //lo que ssea que encuentre pongalo en "products"ya que susamos el plural de findElements para entcontrar un set de elementos
	
	/*
	 * Aqui se utiliza una anotación @FindBy en Java, que es parte de la biblioteca
	 * Selenium WebDriver para localizar elementos en una página web. En este caso,
	 * estás buscando elementos en la página web que coincidan con el selector CSS
	 * ".mb-3" y los esoy almacenando en una lista llamada products.
	 */
	
	
	//Para la ng-animation
	@FindBy(css = ".ng-animating")
	WebElement  spinner;
	
	By productsBy = By.cssSelector(".mb-3");
	By addToCartBy = By.cssSelector(".card-body button:last-of-type");
	By toastMessageBy = By.cssSelector("#toast-container");
	
	
	//Action Method which simply get the product list
	//Listará los productos diplayed/mostrados en la pagina
	public List<WebElement> getProductList() {
		//1.necesitamos asegurarnos/esperamos que los productos carguen/aparezcan en la pagina
		waitForElementToAppear(productsBy);
		//2.Se llama al elemento web "products" y Cuando los productos hayan cargado retorne a lista de productos
		return products;
	}
	
	
	//Action Method para  Validar el nombre del producto que esta en la lista
	public WebElement getProductByName (String productName) {
		WebElement prod = getProductList().stream().filter(product->
		product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
		
		return prod;
	}
	
	
	
	//Action Method para ADD THE PRODUCT TO CART o Agregar el producto al carro de compras
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
