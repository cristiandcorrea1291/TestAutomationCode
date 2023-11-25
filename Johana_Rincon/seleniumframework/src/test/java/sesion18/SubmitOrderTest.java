package sesion18;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SubmitOrderTest {

	public static void main(String[] args) throws InterruptedException {
	

		// variable del producto a selecionar
		String productName = "ZARA COAT 3";
		// crea la instancia del chromdriver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// tiempo implicit
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		// pagina del Constructor es lo primero que hace
		// crea una instancia de la clase ladinpage y se le pasa el objeto driver
		LandingPage landingPage = new LandingPage(driver);
		landingPage.goTo();// se llama al metodo que es url
		// metodo loginaplication de la instancia ladinpage pasa la credenciales
		ProductCatalogue ProductCatalogue = landingPage.loginAplicaction("anshika@gmail.com", "Iamking@000");

		/*
		 * landingPage = new LandingPage(driver); landingPage.goTo();
		 * landingPage.loginAplicaction("anshika@gmail.com", "Iamking@000"); /* public
		 * void goTo() {es el metodo LandingPage
		 * driver.findElement(By.id("userEmail")).sendKeys("anshika@gmail.com");
		 * driver.findElement(By.id("userPassword")).sendKeys("Iamking@000");
		 * driver.findElement(By.id("login")).click();
		 * 
		 */

		// creando el catalogo Productos objeto de la pagina
		

		//ProductCatalogue ProductCatalogue = new ProductCatalogue(driver);
		List<WebElement>products = ProductCatalogue.getProductList();
		ProductCatalogue.addProductToCart(productName); //selecciona el producto de la variable
		CartPage CartPage =ProductCatalogue.goToCartPage();
		/*
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector( ".mb-3")));
		public WebElement getProductByName(String productName).filter(product -> product.findElement(By.cssSelector("b")).getText().equals(productName)). findFirst() .orElse(null);
		System.out.println("valida el filtro y busca el nombre del producto");
		 **WebElement spinner;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
		// esperar ng-animating
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
		driver.findElement(By.cssSelector("[routerlink*='cart']")).click()
		*/
		 
	//	Menu de carrodecompras=new carrodecompras(driver);
		
		//ProductCatalogue.goToCartPage();//las clase hijas tiene acceso a las clases padre de los metodos del padre

		//driver.findElement(By.cssSelector("[routerlink*='cart']")).click();
		
		
		threasSleep(1000);
		//verifica el producto
		Boolean match=CartPage.verifyProductDisplay(productName);
		Assert.assertTrue(match);
		//CartPage. goToCheckout();
		
		
		CheckOutPage  CheckoutPage = CartPage.goToCheckout();
		// Seleccionar el país en la página de pago
		CheckoutPage.SelectCountry("india");
		
		//CheckoutPage.submitOrder();
		// Presentar la orden
		threasSleep(3000);
		
		ConfirmationPage ConfirmationPage = CheckoutPage.submitOrder();
		//System.out.println("Haciendo clic en Place Order");
		
	
		String confirmMessage = ConfirmationPage.getConfirmationMessage();
		
		
		Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
		//System.out.println("La assertion es TRUE...el texto de la pagina es el esperado según la comparación");


	
		driver.close();

	}

	private static void threasSleep(int i) {
		// TODO Auto-generated method stub
		
	}

}
