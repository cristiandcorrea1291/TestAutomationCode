package seccion18;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V156 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//video	156. Logic to verify items in the cart with Streams and Checkout
		
		String productname = "ZARA COAT 3";
		
		
		//Configurar el controlador del navegador y crear una instancia del navegador
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//ir a la pagina
		driver.get("https://rahulshettyacademy.com/client");
		System.out.println("Ingresé a la pagina web");
		
		//login
		driver.findElement(By.id("userEmail")).sendKeys("katherine-melissa.urrego@capgemini.com");
		driver.findElement(By.id("userPassword")).sendKeys("Katherine2023*");
		driver.findElement(By.id("login")).click();
		System.out.println("Inicie sesión el pagina web");
		
		//esperar EXPLICITA  hasta que cargue la pagina del cart con los productos
		WebDriverWait espera = new WebDriverWait(driver,Duration.ofSeconds(5));
		espera.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));
		
		//Obtener todos los articulos y guardarlos en una lista
		List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
		
		//video 154 //iterar todos y cada uno de los productos
		//products.stream().filter(product->product.getText().equals("ZARA COAT 3"));
		WebElement prod = products.stream().filter(product->
		product.findElement(By.cssSelector("b")).getText().equals(productname)).findFirst().orElse(null);
		//Add to cart button
		prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
		System.out.println("Se agregó el producto al carrito") ;
		
		
		//VIDEO 155
		//esperamos el mensaje product added aparezca por eso usamos "visibilityOfElementLocated"
		espera.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
		System.out.println("Apareció el mensaje del producto agregado al carrito") ;
		//ng-animating ... lo cambiamos a Invisibilityof y le emviamos el elemento web
		espera.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
		System.out.println("Desapareció el mensaje del producto agregado al carrito") ;
		//clic en el icono del carrito en el Cart //[routerlink*='cart']
		driver.findElement(By.cssSelector("[routerlink*='cart']")).click();
		System.out.println("Vamos al carrito a ver los productos") ;
		
		
		
		
		//Video 156
		//Verificar los items o productos an el carrito usando "STREAM" y "CHECKOUT"
		
		//Escanear los producto y ver si es el priducto con el nombre  ZARA COAT 3 en la variable productname
		//Selector para el nombre de los productos en el Cart con xpath //*[@class='cartSection']/h3
		//Iterar cada produto y guardarlo enuna lista
		//en cada iteracio traemos un producto webelement a la lista
		List<WebElement> cartProducts = driver.findElements(By.cssSelector(".cartSection h3"));
		System.out.println("Iteramos los productos  por el nombre de la etiqueta h3 y lo guardamos en una lista") ;
		//de la lista "cartProducts " traemos los items 
		//estamos guardando el producto en esta variable "cartProduct->cartProduct", traemos el texto y validamos si el texto es igual que del productname
		//Para CUALQUIER PRODUCTO por el "anyMatch" y
		//se retorna ese elemento en particular en una variable boleano llamado "match"
		Boolean match = cartProducts.stream().anyMatch(cartProduct->
		cartProduct.getText().equalsIgnoreCase(productname));
		System.out.println("Buscamos el producto y las coindencias de los nombres") ;
		
		Assert.assertTrue(match);//este metodo solo aceptará True, si el match es true al estar el producto en el carrito por su coindidencia en nombres
		System.out.println("Si hubo coincidencia y pasamos la comparación del assertion") ;
		
		//Ir al boton checkout
		//seelctor .totalRow button
		//driver.findElement(By.cssSelector(".totalRow button")).click();
		
		//driver.findElement(By.xpath("//button[contains(@class,'btn btn-primary')]")).click();
		//driver.findElement(By.cssSelector(".totalRow button.btn.btn-primary")).click();
		//driver.findElement(By.xpath("//button[text()='Checkout']")).click();

		JavascriptExecutor js = (JavascriptExecutor)driver; 
		//js.executeScript("window.scrollBy(0,900)"); //NO RECOMENDABLE , scroll por pixeles es JS.... con esto se ubica el scroll por coordenadas
		js.executeScript("document.querySelector('.totalRow button').click();");
		//driver.findElement(By.cssSelector("li.totalRow button.btn.btn-primary")).click();
		System.out.println("Vamos a hacer checkout") ;

		
		
		
		
	}

}
