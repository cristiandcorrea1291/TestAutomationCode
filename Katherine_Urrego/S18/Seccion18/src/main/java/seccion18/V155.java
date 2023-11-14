package seccion18;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V155 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//VIDEO 155. Implementation of explicit wait to handle application synchronously on loading
		
		
		
		//VIDEO 153
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
		
		
		//Obtenr todos los articulos y guardarlos en una lista
		List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
		
		
		
		//VIDEO 154		
		WebElement prod = products.stream().filter(product->
		product.findElement(By.cssSelector("b")).getText().equals("ZARA COAT 3")).findFirst().orElse(null);

		//Add to cart button
		prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
		System.out.println("Se agregó el producto al carrito") ;
		
		
		
		//VIDEO 155
		//Mosstrar el mesaje de producto añadido al carrito de compras
		
		//esperar Explcita ->para el modal gris animado y el mensaje
		//esperamos el mensaje product added aparezca por eso usamos "visibilityOfElementLocated"
		espera.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
		System.out.println("Apareció el mensaje del producto agregado al carrito") ;
		
		//esperamos a animacion ng-animating
		//usamos "invisibilityOfElementLocated" porque estamos esperando hasta qque desaparezca la animación gris
		//lo cambiamos a Invisibilityof y le emviamos el elemento web
		espera.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
		System.out.println("Desapareció el mensaje del producto agregado al carrito") ;
		
		//clic en el icono del carrito en el Cart
		//[routerlink*='cart']
		driver.findElement(By.cssSelector("[routerlink*='cart']")).click();
		System.out.println("Vamos al carrito a ver los productos") ;
		
		
		
		
	}

}
