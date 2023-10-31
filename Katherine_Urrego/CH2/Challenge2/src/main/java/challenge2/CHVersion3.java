package challenge2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CHVersion3 {

	public static void main(String[] args) throws InterruptedException {
	
		/*CHALLENGE 2
		 * Dada la siguiente pagina Web: https://www.demoblaze.com/index.html
		 * 
		 * Automatizar el siguiente flujo: 
		 * -Agregar dos elementos de la categoria "Phone" 
		 * -Agregar dos elementos de la categoria "Laptop" 
		 * -Agregar dos elementos de la categoria "Monitor" 
		 * -En la opción ¨Cart se debe eliminar un elemento de cada categoría 
		 * -Obtener el texto del total del carrito e imprimirlo
		 * 
		 * Nota: se debe utilizar el concepto de waits y sincronizacion
		 */
		
		// Configura el sistema de propiedades de Selenium y el controlador de Chrome
		WebDriverManager.chromedriver().setup();
		//Se crea una instancia de ChromeDriver, que representa una instancia del navegador Google Chrome.
		WebDriver driver = new ChromeDriver();
		
		//Ir a la pagina web
		System.out.print("Ingresar al sitio web\n");
		driver.get("https://www.demoblaze.com/index.html");
		
		//Espera implícita. El programa esperará un máximo de n segundos para encontrar un elemento antes de lanzar una excepción si no se encuentra.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
 
		//WebDriverWait waitimplicita = new WebDriverWait(driver, Duration.ofSeconds(5));
	
		Thread.sleep(5000L);
		/*//FLUENT WAIT
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(60))
				.pollingEvery(Duration.ofSeconds(5)) //cada 3 segundos monitorea/tratará de traer el elemento de la pagina web
				.ignoring(NoSuchElementException.class);
		*/
		
			
		System.out.print("\nIniciando Método agregarProductos\n");
		// Productos para AGREGAR al carrito
		agregarProductos(driver, "Phones", "Samsung galaxy s6");
		agregarProductos(driver, "Phones", "Nokia lumia 1520");
		agregarProductos(driver, "Phones", "Nexus 6");
		agregarProductos(driver, "Laptops", "Sony vaio i5");
		agregarProductos(driver, "Laptops", "MacBook air");
		agregarProductos(driver, "Monitors", "Apple monitor 24");
		agregarProductos(driver, "Monitors", "ASUS Full HD");
 
		
		//Despues de agregar productos , ir al carro de compras para después eliminar algunos productos
		driver.findElement(By.id("cartur")).click();
 

		
		System.out.print("\n\nIniciando Método eliminarProducto\n");
		// Se llama al metodo para eliminar e imprimir el total
		eliminarProducto(driver, "Apple monitor 24");
		eliminarProducto(driver, "Samsung galaxy s6");
		eliminarProducto(driver, "Sony vaio i5");
		
	
		// Cerrar el navegador
		System.out.print("\nCerrando Navegador");
		driver.quit();
	}
	

	// METODO PARA AGREGAR PRODUCTOS AL CARRITO
	public static void agregarProductos(WebDriver driver, String categoria, String producto) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		// Hacer clic en la categoría y el producto
		driver.findElement(By.linkText(categoria)).click();		
		driver.findElement(By.linkText(producto)).click();



		// Espera Explicita para esperar a que cargue el valor TOTAL del Cart y que me facilite el imprimir el total
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Add to cart")));
 
		driver.findElement(By.linkText("Add to cart")).click();
		System.out.println("\nEl producto agregado al Carrito de compras es: " + producto);
 
		// Esperar de tiempo hasta que aparezca a la alerta en la ventana modal
		WebDriverWait esperar = new WebDriverWait(driver, Duration.ofSeconds(5));
		esperar.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
 
		// Ir al menú Home
		//driver.findElement(By.partialLinkText("Cart")).click();
		driver.findElement(By.partialLinkText("Home")).click();
		// Espera Explicita para esperar a que cargue el valor TOTAL del Cart y que me facilite el imprimir el total
		WebDriverWait wHome = new WebDriverWait(driver, Duration.ofSeconds(5));
		wHome.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Home")));
 
	}
 
	// METODO PARA ELIMINAR y OBTENER EL TOTAL DEL CARRITO
	public static void eliminarProducto(WebDriver driver, String nombreProducto) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		// Espera Explicita para esperar a que cargue el valor TOTAL del Cart y que me facilite el imprimir el total
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[contains(text(), '" + nombreProducto + "')]"
				+ "/following-sibling::td/a[contains(text(), 'Delete')]")));
 
		try {
			// Encuentra el "Delete" asociado al producto con el nombre especificado
			// WebElement deleteButton = driver.findElement(By.xpath("//td[contains(text(),
			// '" + nombreProducto + "')]/following-sibling::td/a[text()='Delete']"));
			// td <td> que contiene el texto del nombreProducto <td>xxxxxxx</td>

			WebElement Eliminar = driver.findElement(By.xpath("//td[contains(text(), '" + nombreProducto + "')]"
					+ "/following-sibling::td/a[contains(text(), 'Delete')]"));
			Eliminar.click();
 
			// Esperar para completar la eliminación
			Thread.sleep(2000);
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("No se encontró el producto '" + nombreProducto + "' que desea eliminar.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		//Muestra el producto eliminado
		System.out.println(" \n Se ha eliminado el siguiente producto: " + nombreProducto);
		
		// Espera Explicita para esperar a que cargue el valor TOTAL del Cart y que me facilite el imprimir el total
		WebDriverWait wTotal = new WebDriverWait(driver, Duration.ofSeconds(5));
		wTotal.until(ExpectedConditions.visibilityOfElementLocated(By.id("totalp")));
		// //Imprimir en consola el TOTAL en el Carro de compras despues de eliinar X producto
		System.out.print("   \nEl total es " + driver.findElement(By.id("totalp")).getText());
	}


}
