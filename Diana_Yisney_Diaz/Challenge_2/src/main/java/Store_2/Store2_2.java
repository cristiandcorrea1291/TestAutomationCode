package Store_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Store2_2 {

		public static void main(String[] args)throws InterruptedException
		{

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.demoblaze.com/index.html");
	System.out.println("Inicio de navegacion correcta");
		//Insercion de temporizados
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(100));
		System.out.println("Seleccion de producto");
		
		//Add producto 4
		AddProductos(driver, "Laptops", "2017 Dell 15.6 Inch");
		//Add producto 5
		AddProductos(driver, "Monitors", "Apple monitor 24");
		//Add producto 6
		AddProductos(driver, "Monitors", "ASUS Full HD");
		//Add productos
		AddProductos(driver, "Phones", "Samsung galaxy s7");
		//Add producto 2
		AddProductos(driver, "Phones", "Sony xperia z5");
		//Add producto 3
		AddProductos(driver, "Laptops", "MacBook Pro");
				
		 driver.findElement(By.id("cartur")).click();
		
		 //Funcion Eliminar 
		 driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(50));
		 System.out.println("Inicia proceso de eliminacion de productos de la lista");
		 eliminarProductos(driver, "Apple monitor 24");
		 eliminarProductos(driver, "MacBook Pro");
	     eliminarProductos(driver, "Samsung galaxy s7");
		 
		
	     
	   //Realizar orden de compra
		    //driver.findElement(By.xpath("//button[normalize-space()='Place Order']")).click();
		    //driver.findElement(By.cssSelector("btn btn-success")).click();
		    driver.findElement(By.cssSelector(".btn.btn-success")).click();
		    System.out.println("Clic  Iniciar Orden de Compra");
		    
		    Thread.sleep(3000);
		    //Formulario de compra
		   
		    driver.findElement(By.id("name")).sendKeys("Diana ");
			driver.findElement(By.id("country")).sendKeys("Colombia");
		    driver.findElement(By.id("city")).sendKeys("Bogota");
		    driver.findElement(By.id("card")).sendKeys("1091762738902");
		    	    driver.findElement(By.id("month")).sendKeys("12");
		    Thread.sleep(1000);
		    driver.findElement(By.id("year")).sendKeys("28");
		    
		    
	
			//Add to cart 			
			driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Close'])[3]")).click();
			System.out.println("Cancela Orden");
				
			//Realizar orden de compra
		    driver.findElement(By.xpath("//button[normalize-space()='Place Order']")).click();
		    //driver.findElement(By.className("btn btn-success")).click();
		    System.out.println("Clic e Iniciar Orden de Compra");
		    
				
			driver.findElement(By.xpath("//button[normalize-space()='Purchase']")).click();
			System.out.println("Orden Generada");
			driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
			System.out.println("Venta Realizada");
			
	     
	     
	     
		System.out.println("Cierra el navegador ");
		// Cierra el navegador  y todas las ventanas asociadas al final del script.
		driver.quit();
	}
	
//Funcion para añadir productos	con el paso de 3 variables para el detalle de productos al carrito
		
	private static void AddProductos(WebDriver driver, String categoria, String producto) throws InterruptedException
	{
		//Add funcion de condicion de tiempo de espera para la ejecucion
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				
				//Seleccion de la categoria y el producto a adicionar al carrito
		System.out.println("Seleccion de categoria de compra");
		driver.findElement(By.linkText(categoria)).click();
		System.out.println("Seleccion de productos a comprar");
		driver.findElement(By.linkText(producto)).click();
		
			//Add to cart 			
		System.out.println("Seleccion de nuevo producto");	
				driver.findElement(By.linkText("Add to cart")).click();
				System.out.println("Clic en la opcion añadir al carrito");
				System.out.println("Lista de Productos Seleccionados,"+ producto );
				
				///Explicitwait ***
				
				//Add funcion de condicion de control de tiempo de espera para la ejecucion
				WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
				wait1.until(ExpectedConditions.alertIsPresent());
				// Aceptacion de Alerta reflejada en pantalla
				driver.switchTo().alert().accept();
				Thread.sleep(1000);
				//Redireccionamiento a al home para adicionar nuevo producto
				driver.findElement(By.partialLinkText("Cart")).click();
				Thread.sleep(1000);
				driver.findElement(By.partialLinkText("Home")).click();
				Thread.sleep(1000);
	} 
	
	
/////Funcion eliminar productos
	private static void eliminarProductos(WebDriver driver, String Nombreproducto)
	{
		//Add funcion de condicion de tiempo de espera para la ejecucion
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// Busqueda del boton eliminar
	try {
		//xpath de boton delete (//a[normalize-space()='Delete'])[1]
		//Se relaciona selector para encontrar el elemento TD para el producto q contenga la descripcion del producto
		//con la funcion following-sinbling busca un elemento hermano de acuerdo a la jerarquia de acierdo a la etiqueta //TD
		System.out.println("Validacion xpath de elemento a eliminar");
		WebElement DescartarProducto = driver.findElement(By.xpath("//td[contains(text(), '" + Nombreproducto + "')]"
		+ "/following-sibling::td/a[contains(text(), 'Delete')]"));
	
		DescartarProducto.click();
	
	Thread.sleep(500);
	}catch (org.openqa.selenium.NoSuchElementException e)
	// la funcion NoSuchElementException busca controlar la excepcion si el elemento no es encontrado
		{
		System.out.println("Producto No disponible,'"+ Nombreproducto + "' para eliminar");	
		// la funcion InterruptedException 
		}
	catch (InterruptedException e)
			{
			e.printStackTrace(); 
			}
	System.out.println("Lista de Productos Eliminados" + Nombreproducto );
	System.out.println("Total de Productos Eliminados"+ driver.findElement(By.id("totalp")).getText());
		}
		
	
	
	private static void ThreadSleep(int i) throws InterruptedException
		{
		// Funcion de manejo de entero i
		Thread.sleep(500);
		}
			
		
		
}
