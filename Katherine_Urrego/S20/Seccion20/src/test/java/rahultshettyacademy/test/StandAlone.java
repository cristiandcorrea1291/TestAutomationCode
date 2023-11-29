package rahultshettyacademy.test;

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
import rahultshettyacademy.pageobjects.LandingPage;

public class StandAlone {

	public static void main(String[] args) {
		
		String productname = "ZARA COAT 3"; //video 156
		
		//Configurar el controlador del navegador y crear una instancia del navegador
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//maximizar la ventana del navegador
		driver.manage().window().maximize();
		
		//ir a la pagina
		driver.get("https://rahulshettyacademy.com/client");
		System.out.println("Ingresé a la pagina web");
		
		LandingPage landingPage = new LandingPage(driver);
		
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
		
		
		//VIDEO 154 //iterar todos y cada uno de los productos
		//products.stream().filter(product->product.getText().equals("ZARA COAT 3"));
		WebElement prod = products.stream().filter(product->
		product.findElement(By.cssSelector("b")).getText().equals(productname)).findFirst().orElse(null);
		//Add to cart button
		prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
		System.out.println("Se agregó el producto al carrito") ;
		
		
		//VIDEO 155
		//esperamos el mensaje product added aparezca por eso usamos "visibilityOfElementLocated"
		//WebDriverWait espera = new WebDriverWait(driver,Duration.ofSeconds(5));
		espera.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
		System.out.println("Apareció el mensaje del producto agregado al carrito") ;
		//ng-animating ... lo cambiamos a Invisibilityof y le emviamos el elemento web
		espera.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
		System.out.println("Desapareció el mensaje del producto agregado al carrito") ;
		//clic en el icono del carrito en el Cart //[routerlink*='cart']
		driver.findElement(By.cssSelector("[routerlink*='cart']")).click();
		System.out.println("Vamos al carrito a ver los productos") ;
		
		
		//Video 156
		//Verificar los items o productos an el carrito usando "STREAM" y encontrar el botón "CHECKOUT"
		List<WebElement> cartProducts = driver.findElements(By.cssSelector(".cartSection h3"));
		System.out.println("Iteramos los productos  por el nombre de la etiqueta h3 y lo guardamos en una lista") ;
		Boolean match = cartProducts.stream().anyMatch(cartProduct->cartProduct.getText().equalsIgnoreCase(productname));
		System.out.println("Buscamos el produto y las coindencias de los nombres") ;
		Assert.assertTrue(match);//este metodo solo aceptará True, si el match es true al estar el producto en el carrito por su coindidencia en nombres
		System.out.println("Si hubo coincidencia y pasamos la comparación del assertion") ;
		
		//Ir al botón checkout
		//driver.findElement(By.cssSelector(".totalRow button")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		//js.executeScript("window.scrollBy(0,900)"); //NO RECOMENDABLE , scroll por pixeles es JS.... con esto se ubica el scroll por coordenadas
		js.executeScript("document.querySelector('.totalRow button').click();");
		System.out.println("Vamos a hacer checkout") ;
		
		//Video 157
		//Una vez en el checkout
		//Ingresar info al campo autosugestivo "Select Country"
		Actions a = new Actions(driver);
		a.sendKeys(driver.findElement(By.cssSelector("[placeholder='Select Country']")), "india").build().perform();
		System.out.println("Encuentro el campo Select Country y sugiero un texto") ;
		
		//esperar hasta que la seccion con la lista de opciones del campo sugestivo se muestre en la pagina
		//selector ta-results list-group ng-star-inserted
		espera.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));
		System.out.println("espere hasta que mostrara la lista de opciones que contienen mi sugestión") ;
		
		//clic en el pais de la lista
		//elijo a la 2 opcion
		//selector css  .ta-item:nth-of-type(2)
		//selector xpath (//button[contains(@class,'ta-item')])[2]
		driver.findElement(By.xpath("(//button[contains(@class,'ta-item')])[2]")).click();
		System.out.println("Elegi una opcion de la lista sugerida") ;
		
		
		//clic en e boton PLACE ORDER
		//selector .action__submit
		//driver.findElement(By.cssSelector(".action__submit")).click();
		js.executeScript("document.querySelector('.action__submit').click();");
		System.out.println("Hice clic en el boton Place Order para CONFIRMAR EL PEDIDO/ORDEN") ;
		
		
		//Traer , comparar e Imprimir el mensaje de THANKSYOU FOR THE ORDER
		//Selector .hero-primary
		//lo que obtengo de la pagina
		String confirmMessage = driver.findElement(By.cssSelector(".hero-primary")).getText();
		System.out.println("el texto que obtengo de la pagina es:" +confirmMessage) ;
		
		//con el texto que voy a comparar con el confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER");
		
		//Si ambos son iguales , la assetion pasara= true....en caso contrario veremos un error en la consola
		Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
		System.out.println("La assertion es TRUE...el texto de la pagina es el esperado segun la comparación");
		
		//Cerrar navegador
		System.out.println("Cerrando el browser") ;
		driver.quit();
	}

}
