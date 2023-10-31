package Prueba1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import java.util.NoSuchElementException;

public class AgregarEliminarProductos {

	public static void main(String[] args) {
		ThreadSleeep(4000);
		// Configura el sistema de propiedades de Selenium y el controlador de Chrome

		WebDriverManager.chromedriver().setup();
		// Se crea una instancia de ChromeDriver, que representa una instancia del
		// navegador Google Chrome.
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// Se configura una espera implícita. El programa esperará un máximo de 10

		// ingresa a la pagina web
		driver.get("https://www.demoblaze.com/index.html");

		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

		// Se llaman a las funciones AdicionarProductoAlCarrito para agregar productos a
		// las categorías "Monitors", "Phones" y "Laptops".
		ThreadSleeep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		AdicionarProductoAlCarrito(driver, "Monitors", "Apple monitor 24");
		AdicionarProductoAlCarrito(driver, "Monitors", "ASUS Full HD");

		AdicionarProductoAlCarrito(driver, "Phones", "Samsung galaxy s6");
		AdicionarProductoAlCarrito(driver, "Phones", "Iphone 6 32gb");

		AdicionarProductoAlCarrito(driver, "Laptops", "Sony vaio i7");
		AdicionarProductoAlCarrito(driver, "Laptops", "MacBook Pro");

		// clic en el elemento con el atributo id igual a "cartur", que parece al
		// agrergar el producto

		driver.findElement(By.id("cartur")).click();

		// Se llama la funcion Eliminar productos del carrito 1 de la categoria
		// Monitors,phones,Laptos

		eliminarProductoDelCarrito(driver, "Apple monitor 24");
		eliminarProductoDelCarrito(driver, "Samsung galaxy s6");
		eliminarProductoDelCarrito(driver, "Sony vaio i7");

		// Cerrar el navegador
		driver.quit();

	}

//metodo con con parametros de categaria producto

	private static void AdicionarProductoAlCarrito(WebDriver driver, String categoria, String producto) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		ThreadSleeep(4000);
		// clic en un enlace que coincide con el texto de la categoría proporcionada
		driver.findElement(By.linkText(categoria)).click();
		// poner espera wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// nombre del producto proporcionado (producto)
		driver.findElement(By.linkText(producto)).click();

		// ThreadSleeep(8000);

//enlace con el texto "Add to cart". Esto agrega el producto seleccionado al carrito de compras.

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.linkText("Add to cart")).click();
		System.out.println("Muestra los productos seleccionados, " + producto);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();

		// Ir al menú del carrito
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.partialLinkText("Cart")).click();
		driver.findElement(By.partialLinkText("Home")).click();

	}

	// Eliminar producto por categoria
	private static void eliminarProductoDelCarrito(WebDriver driver, String nombreProducto) {

		// Encuentra el botón "Delete" asociado al producto con el nombre especificado
		// WebElement deleteButton = driver.findElement(By.xpath("//td[contains(text(),
		// '" + nombreProducto + "')]/following-sibling::td/a[text()='Delete']"));
		// td <td> que contiene el texto del nombreProducto <td>Apple monitor 24</td>
		// concatenamos el producto
		try {

			WebElement deleteButton = driver.findElement(By.xpath("//td[contains(text(), '" + nombreProducto + "')]"
					+ "/following-sibling::td/a[contains(text(), 'Delete')]"));
			/// following-sibling::td: Esto busca un elemento <td> que es un hermano
			/// adyacente de la jerarquia
			// dentro td se encuntra la etiqueta a que contine la palabra delete

			deleteButton.click();

			// Espera un momento para asegurarse de que se complete la eliminación
			Thread.sleep(1000);

			// se captura 1 bloque de excepción y se muestra un mensaje indicando que no se
			// encontró el producto
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("No se encontró el producto '" + nombreProducto + "' para eliminar.");
			// 2 bloque InterruptedException
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("  Muestra los productos Eliminados " + nombreProducto);
		// muestra el total de productos que quedaron en el carro
		System.out.print("   El total es " + driver.findElement(By.id("totalp")).getText());
	}

	private static void ThreadSleeep(int i) {
		// TODO Auto-generated method stub

	}
}
