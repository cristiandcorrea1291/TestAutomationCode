package sesion18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import extractComponents.AbstractComponent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductCatalogue extends AbstractComponent {
	// Variable para el WebDriver
	WebDriver driver;

//constructor //padre controlo del niño para waitfor
	public ProductCatalogue(WebDriver driver)// metodo Driver
	{

		super(driver);// se pase el constructor de otra clase para union
		this.driver = driver;
		PageFactory.initElements(driver, this);
		// WebDriver como parámetro, asignarlo a la variable de instancia driver
		// y luego inicializar los elementos de la página web utilizando
		// PageFactory
	}
	// lista todos los elementos guardados en la pagina.
	// List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));

	@FindBy(css = ".mb-3") // devuelve los productos
	List<WebElement> products;

	@FindBy(css = ".ng-animating") // imagin-animado
	WebElement spinner; // es la variable que contendrá la referencia al elemento identificado.

	By productsBy = By.cssSelector(".mb-3");
	By addToCart = By.cssSelector(".card-body button:last-of-type");
	// By productsBy= By.cssSelector(".mb-3");
	// agregar el producto al carro
	By toastMessage = By.cssSelector("#toast-container");// wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));

	// By.carrodecompras=By.cssSelector("[routerlink*='cart']");

	// metodo de la lista de productos
	public List<WebElement> getProductList() // se debe llamar getproductos
	{
		// espera hasta que elemento sea visible en la pagina
		waitForElementToAppear(productsBy);// public class AbstractComponent {
		return products;
	}

	// metodo.get
	// se le puede espeficiar el nombre del producto
	public WebElement getProductByName(String productName)

	{

		// Filtro- se cambia a getProductList(), para que funcione
		WebElement prod = getProductList().stream()
				.filter(product -> product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst()
				.orElse(null);
		return prod;// metodo de web element
	}

	// metodo public adicionara el producto al carro
	// tenercuidado pasa el marco producto
	// prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();

	public void addProductToCart(String productName) throws InterruptedException {

		WebElement prod = getProductByName(productName);
		// WebElement prod2= getProductByName(productName);
		// prod2.findElement(addToCart).click();
		prod.findElement(addToCart).click();
		waitForElementToAppear(toastMessage);
		waitElementToDisapear(spinner);
		// fabrica de
		// objetoswait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));

		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
	}

}
