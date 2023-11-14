package rahultshettyacademy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import io.github.bonigarcia.wdm.WebDriverManager;
import rahulshettyacademy.AbstractComponents.AbstractComponent;
import rahultshettyacademy.pageobjects.CartPage;
import rahultshettyacademy.pageobjects.CheckoutPage;
import rahultshettyacademy.pageobjects.ConfirmationPage;
import rahultshettyacademy.pageobjects.LandingPage;
import rahultshettyacademy.pageobjects.ProductCatalogue;

public class SubmitOrderTest extends AbstractComponent{

	public SubmitOrderTest(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String productName = "ZARA COAT 3"; //video 156
		
		//Configurar el controlador del navegador y crear una instancia del navegador
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//maximizar la ventana del navegador
		driver.manage().window().maximize();
		//esperar EXPLICITA  hasta que cargue la pagina del cart con los productos
		WebDriverWait espera = new WebDriverWait(driver,Duration.ofSeconds(5));

		
		//video160-> Crear instancia de la clase LandingPage
		LandingPage landingPage = new LandingPage(driver);
	
		
		//ir a la pagina web, usando Action Methods
		landingPage.goTo();
		System.out.println("Ingresé a la pagina web");
		
		//login usando Action Methods
		ProductCatalogue productCatalogue = landingPage.loginApplication("katherine-melissa.urrego@capgemini.com", "Katherine2023*");//video 164
		System.out.println("Inicie sesión el pagina web");
		
		//VIDEO 161 Action Method
		//esperar hasta que cargue la pagina del cart con los productos
		//con la modicacion del video 164 ya NO necesito esta linea ProductCatalogue productCatalogue = new ProductCatalogue(driver);
		//Obtener todos los articulos y guardarlos en una lista
		List<WebElement> products = productCatalogue.getProductList();
		
		
		//VIDEO 162 //iterar todos y cada uno de los productos
		//Add to cart button
		//esperamos el mensaje product added aparezca por eso usamos "visibilityOfElementLocated"
		//ng-animating ... lo cambiamos a Invisibilityof y le emviamos el elemento web
		productCatalogue.addProductToCart(productName);
		
		
		//video 164 Action Method para hacer clic en el icono del carrito/menu carrito
		//clic en el icono del carrito en el Cart //[routerlink*='cart']
		productCatalogue.goToCartPage();
		System.out.println("Vamos al carrito a ver los productos") ;
		
		
		
		//Video 156 y 164
		//Verificar los items o productos an el carrito usando "STREAM" y encontrar el botón "CHECKOUT"
		//se integra al metodo gotoCartPage -> CartPage cartPage = new CartPage(driver);
		CartPage cartPage = productCatalogue.goToCartPage();//video 164
		Boolean match = cartPage.VerifyProductDisplay(productName);//retornar el true or false de acuerdo al match de titulo producto y stringque necesito
		Assert.assertTrue(match);//este metodo solo aceptará True, si el match es true al estar el producto en el carrito por su coindidencia en nombres
		System.out.println("Si hubo coincidencia y pasamos la comparación del assertion") ;
		
		
		
		//JavaSriptEXECUTOR en CartPage class
		//Ir al botón CHECKOUT(video 164)
		//JavascriptExecutor js = (JavascriptExecutor)driver; 
		//js.executeScript("document.querySelector('.totalRow button').click();");
		CheckoutPage checkoutPage = cartPage.goToCheckout();
		System.out.println("Vamos a hacer checkout") ;
		
		
		
		//Video 157 y 165
		checkoutPage.selectCountry("india");
		//Una vez en el checkout
		//Ingresar info al campo autosugestivo "Select Country"
		System.out.println("Encuentro el campo Select Country y sugiero un texto") ;
		//esperar hasta que la seccion con la lista de opciones del campo sugestivo se muestre en la pagina
		//selector ta-results list-group ng-star-inserted
		System.out.println("espere hasta que mostrara la lista de opciones que contienen mi sugestión") ;
		//clic en el pais de la lista
		System.out.println("Elegi una opcion de la lista sugerida") ;
		
		
		//JavaSriptEXECUTOR
		//clic en e boton PLACE ORDER - CONFIRMAR EL PEDIDO/ORDEN") ;
		 ConfirmationPage confirmationPage = checkoutPage.submitOrder();
	
		
		
		//Traer , comparar e Imprimir el mensaje de THANKSYOU FOR THE ORDER
		String confirmMessage = confirmationPage.getConfirmationMessage();
		System.out.println("el texto que obtengo de la pagina") ;
		
		//con el texto que voy a comparar con el confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER");
		
		//Si ambos son iguales , la assetion pasara= true....en caso contrario veremos un error en la consola
		Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
		System.out.println("La assertion es TRUE...el texto de la pagina es el esperado segun la comparación");
		
		//Cerrar navegador
		System.out.println("Cerrando el browser") ;
		driver.quit();
	}


}
