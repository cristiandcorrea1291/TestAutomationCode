package Prueba1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Challenge1_Prueba1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*	Dada la siguiente pagina Web:
		https://www.demoblaze.com/index.html

		Automatizar el siguiente flujo:
		-Agregar dos elementos al carrito
		-Obtener el texto del total del carrito e imprimirlo*/
		//ingresar a la url 
		// Del metodo driver, crea la clase chromeDriver
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");//link de la pagina 
		System.out.println("Abrir la url indicada");//Mensaje de consola
		
		//tempororizador de tiempo a nivel general del proyecto
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(8));
		   System.out.println("tiempo de ejecucion");
	
		
		// Haz clic en la categoría "monitor" (Asegúra  el selector sea correcto)
		//<a href="#" id="itemc" onclick="byCat('monitor')" class="list-group-item">Monitors</a>
		driver.findElement(By.linkText("Monitors")).click();
		System.out.println("clic en monitor");
		        

		// Selecciona un producto específico (cambia el selector según tus necesidades)
		// <h2 class="name">Samsung galaxy s6</h2>
		//<a href="prod.html?idp_=10" class="hrefch">Apple monitor 24</a>

		driver.findElement(By.linkText("Apple monitor 24")).click();
		System.out.println("click en monitor selecionado");

		//Boton agregar  el producto al carrito
		//<a href="#" onclick="addToCart(10)" class="btn btn-success btn-lg">Add to cart</a>
		driver.findElement(By.linkText("Add to cart")).click();
		System.out.println("Adiciona el producto a carro ");
		
		
		
		//Alertas, se debe aceptar.
		Thread.sleep(3000);//Tiempo especifico para acciones concretas
		driver.switchTo().alert().accept();//Aceptar el alerta
	
		//parte 2 Agregar el segundo producto.
		//<a href="prod.html?idp_=14" class="hrefch">ASUS Full HD</a>
		
		//ingresa a la pagina de Home para que actualice.
		driver.findElement(By.partialLinkText("Home")).click();
		System.out.println("Ingresa a home ");
		
		// ingresa a categorias 
		//<a href="#" id="itemc" onclick="byCat('phone')" class="list-group-item">Phones</a>
		driver.findElement(By.linkText("Phones")).click();
		System.out.println("Ingresa a la categoria de phone");
		
		//ingresa al producto
		//<h2 class="name">Nexus 6</h2>
		driver.findElement(By.linkText("Nexus 6")).click();
		System.out.println("Busca el producto");
		
		
		//agrega el producto
		//<a href="#" onclick="addToCart(3)" class="btn btn-success btn-lg">Add to cart</a>
		driver.findElement(By.linkText("Add to cart")).click();
		System.out.println("Agrega el producto seleccionado al carro, Nexus 6 ");
		
		//acepta el alerta
		
		//Alertas, se debe aceptar.
		Thread.sleep(3000);//Tiempo especifico para acciones concretas
		driver.switchTo().alert().accept();//Aceptar el alerta
		System.out.println("Acepta el alerta, dura 3 segundos");
		// buscar el carrito
		//seleccionar el menu del carrito
		//<a class="nav-link" href="#" onclick="showcart()">Cart</a>
		driver.findElement(By.partialLinkText("Cart")).click();
		System.out.println("Da click en menu de de Cart");
		
		//muestra el total de los productos seleccionados
		//<h3 class="panel-title" id="totalp">1050</h3>
		//Alertas, se debe aceptar.
		
		//Esperar explicitamente x segundos try es el código que se intenta ejecutar, y si se lanza una excepción durante su ejecución, el flujo de control se redirige al bloque catch para manejar la excepción.

	       try {
	    	   Thread.sleep(5000);
	       } catch (InterruptedException e) {
	    	   // TODO Auto-generated catch block
	    	   e.printStackTrace();
	       }
	 
	    System.out.println("Espera explicitamente 5 segundos ");
	    //localizador para encontrar el total
	    String total_producto;
	    total_producto=driver.findElement(By.id("totalp")).getText();//muestra el total de 2 productos agregados al carro
	
		System.out.println(" varible en java : "+ total_producto);
		// Cierra solo la venta de navegador al final de la ejecución
		//driver.close();
		System.out.println("Cierra el navegador ");
		// Cierra el navegador  y todas las ventanas asociadas al final del script.
		driver.quit();

	}

}
