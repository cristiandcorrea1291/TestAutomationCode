package Prueba1;



	


		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.ExpectedConditions;
		import org.openqa.selenium.support.ui.WebDriverWait;
		import io.github.bonigarcia.wdm.WebDriverManager;
		import java.time.Duration;
		
		public class otroEjemplo {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
		        WebDriverManager.chromedriver().setup();
		        WebDriver driver = new ChromeDriver();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		        driver.get("https://www.demoblaze.com/index.html");

		        AdicionarProductoAlCarrito(driver, "Monitors", "Apple monitor 24");
		        AdicionarProductoAlCarrito(driver, "Monitors", "ASUS Full HD");

		        AdicionarProductoAlCarrito(driver, "Phones", "Samsung galaxy s6");
		        AdicionarProductoAlCarrito(driver, "Phones", "Iphone 6 32gb");

		        AdicionarProductoAlCarrito(driver, "Laptops", "Sony vaio i7");
		        AdicionarProductoAlCarrito(driver, "Laptops", "MacBook Pro");

		        driver.findElement(By.id("cartur")).click();

		        eliminarProductoDelCarrito(driver, "Apple monitor 24");
		        eliminarProductoDelCarrito(driver, "Samsung galaxy s6");
		        eliminarProductoDelCarrito(driver, "Sony vaio i7");

		        driver.quit();
		    }

		    private static void AdicionarProductoAlCarrito(WebDriver driver, String categoria, String producto) {
		    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    	driver.findElement(By.linkText(categoria)).click();
		        driver.findElement(By.linkText(producto)).click();
		        driver.findElement(By.linkText("Add to cart")).click();

		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		        wait.until(ExpectedConditions.alertIsPresent());
		        driver.switchTo().alert().accept();

		        driver.findElement(By.partialLinkText("Cart")).click();
		        driver.findElement(By.partialLinkText("Home")).click();
		    }

		    private static void eliminarProductoDelCarrito(WebDriver driver, String nombreProducto) {
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		        By deleteButtonLocator = By.xpath("//td[contains(text(), '" + nombreProducto + "')]/following-sibling::td/a[contains(text(), 'Delete')]");

		        try {
		            WebElement deleteButton = wait.until(ExpectedConditions.presenceOfElementLocated(deleteButtonLocator));
		            deleteButton.click();
		        } catch (org.openqa.selenium.TimeoutException e) {
		            System.out.println("No se encontró el producto '" + nombreProducto + "' para eliminar.");
		        }

		        System.out.println("Muestra los productos Eliminados " + nombreProducto);
		        System.out.print("   El total es " + driver.findElement(By.id("totalp")).getText());
		    }
		}

