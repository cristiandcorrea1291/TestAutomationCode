package Challenge2;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

public class AgregaEliminaProductosLargo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// ingresar a la url
		// Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Del metodo driver, crea la clase chromeDriver
		WebDriver driver = new ChromeDriver();
		// ingresa a url
		driver.get("https://www.demoblaze.com/index.html");// link de la pagina
		System.out.println("Abrir la url indicada");// Mensaje de consola

		// tempororizador de tiempo a nivel general del proyecto
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(8));
		System.out.println("tiempo de ejecucion");

		// Seleciona la categoria Monitor

		driver.findElement(By.linkText("Monitors")).click();
		System.out.println("clic en monitor");
		driver.findElement(By.linkText("Apple monitor 24")).click();
		System.out.println("click en monitor selecionado");

		// clic en Boton de agregar producto

		Thread.sleep(3000);
		driver.findElement(By.linkText("Add to cart")).click();
		System.out.println("Adiciona el producto a carro ");

		// Alertas, se debe aceptar.

		Thread.sleep(3000);
		driver.switchTo().alert().accept();// Aceptar el alerta
		driver.findElement(By.partialLinkText("Cart")).click();
		System.out.println("Da click en menu de de Cart");
		driver.findElement(By.linkText("Delete")).click();

		// 2 segundo producto

		// ingresa a la pagina de Home para que actualice.
		driver.findElement(By.partialLinkText("Home")).click();
		System.out.println("Ingresa a home ");
		// ingresa a categorias Phones
		driver.findElement(By.linkText("Phones")).click();
		System.out.println("Ingresa a la categoria de phone");

		// Selecciona el producto
		
		//findElement(By.id("Phones"));
		driver.findElement(By.linkText("Nokia lumia 1520")).click();
		System.out.println("Busca el producto");

		// agrega el producto
		driver.findElement(By.linkText("Add to cart")).click();
		System.out.println("Agrega el producto seleccionado al carro, Nexus 6 ");

		// Alertas, se debe aceptar.
		Thread.sleep(3000);// Tiempo especifico para acciones concretas
		driver.switchTo().alert().accept();// Aceptar el alerta
		System.out.println("Acepta el alerta, dura 3 segundos");
		
		driver.findElement(By.partialLinkText("Cart")).click();
		System.out.println("Da click en menu de de Cart");
		driver.findElement(By.linkText("Delete")).click();
		

		// SECCION 2 Laptops

		driver.findElement(By.partialLinkText("Home")).click();
		System.out.println("Ingresa a home ");

		driver.findElement(By.linkText("Laptops")).click();
		System.out.println("Cateroria de Laptops");

		// ingresa al producto
		// <h2 class="name">Nexus 6</h2>
		driver.findElement(By.linkText("Dell i7 8gb")).click();
		System.out.println("Busca el producto");

		driver.findElement(By.linkText("Add to cart")).click();
		System.out.println("Agrega el producto seleccionado al carro, Sony vaio i5 ");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();// Aceptar el alerta
		System.out.println("Acepta el alerta, dura 3 segundos");
		driver.findElement(By.partialLinkText("Cart")).click();
		System.out.println("Da click en menu de de Cart");

		// segundo producto de Laptos
		driver.findElement(By.partialLinkText("Home")).click();
		System.out.println("Ingresa a home ");

		driver.findElement(By.linkText("Laptops")).click();
		System.out.println("Cateroria de Laptops");

		// ingresa al producto
		// <h2 class="name">Nexus 6</h2>
		driver.findElement(By.linkText("MacBook air")).click();
		System.out.println("Busca el producto");

		driver.findElement(By.linkText("Add to cart")).click();
		System.out.println("Agrega el producto seleccionado al carro, MacBook air ");
		Thread.sleep(4000);
		driver.switchTo().alert().accept();// Aceptar el alerta
		System.out.println("Acepta el alerta, dura 3 segundos");
		driver.findElement(By.partialLinkText("Cart")).click();
		System.out.println("Da click en menu de de Cart");
		driver.findElement(By.linkText("Delete")).click();

		// falta otra categoria
		
		// ingresa a la pagina de Home para que actualice.
				driver.findElement(By.partialLinkText("Home")).click();
				System.out.println("Ingresa a home ");
				// ingresa a categorias Phones
				driver.findElement(By.linkText("Phones")).click();
				System.out.println("Ingresa a la categoria de phone");

				// Selecciona el producto
				// <h2 class="name">Nexus 6</h2>
				driver.findElement(By.id("tbodyid"));
				driver.findElement(By.linkText("Nexus 6")).click();
				System.out.println("Busca el producto");
				driver.findElement(By.linkText("Add to cart")).click();
				System.out.println("Agrega el producto seleccionado al carro, MacBook air ");
				Thread.sleep(4000);
				driver.switchTo().alert().accept();// Aceptar el alerta
				System.out.println("Acepta el alerta, dura 3 segundos");
				driver.findElement(By.partialLinkText("Cart")).click();
				System.out.println("Da click en menu de de Cart");
				driver.findElement(By.linkText("Delete")).click();
				
		// 2 producto
				driver.findElement(By.partialLinkText("Home")).click();
					System.out.println("Ingresa a home ");
					// ingresa a categorias Phones
					driver.findElement(By.linkText("Phones")).click();
					System.out.println("Ingresa a la categoria de phone");

					// Selecciona el producto
					// <h2 class="name">Nexus 6</h2>
					driver.findElement(By.id("tbodyid"));
					driver.findElement(By.linkText("Nexus 6")).click();
					System.out.println("Busca el producto");
					driver.findElement(By.linkText("Add to cart")).click();
					System.out.println("Agrega el producto seleccionado al carro, MacBook air ");
					Thread.sleep(4000);
					driver.switchTo().alert().accept();// Aceptar el alerta
					System.out.println("Acepta el alerta, dura 3 segundos");
					driver.findElement(By.partialLinkText("Cart")).click();
					System.out.println("Da click en menu de de Cart");
					driver.findElement(By.linkText("Delete")).click();
					
		
		
		String total_producto;
	    total_producto=driver.findElement(By.id("totalp")).getText();//muestra el total de 2 productos agregados al carro
	
		System.out.println(" la suma de los proctos es : "+ total_producto);
		driver.close();
	}

}
