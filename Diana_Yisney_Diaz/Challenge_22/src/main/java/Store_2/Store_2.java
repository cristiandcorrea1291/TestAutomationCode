package Store_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class Store_2 {

	public static void main(String[] args)throws InterruptedException
	{
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.demoblaze.com/index.html");
		System.out.println("Inicio de navegacion correcta");
		//Insercion de temporizados
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(20));
		System.out.println("Seleccion de producto");	
		
			//Seleccion de la categoria Phones
			//Seleccion de Phones  // Class= hrefch	    
		    driver.findElement(By.linkText("Phones")).click();
		    System.out.println("Seleccion de categoria telefonos");
		    
		    //Se agrega temporizador para poder controlar el cargue de los elementos
		    Thread.sleep(1000);
		    
		    // Seleccion del telefono Samsung galaxy s6
		    driver.findElement(By.linkText("Samsung galaxy s6")).click();
		    System.out.println("Seleccion de Mobil Samsung");	
		  	
		    //Add to cart 			
		    driver.findElement(By.linkText("Add to cart")).click();
			System.out.println("Clic en la opcion añadir al carrito");	
				
			//Se agrega temporizador para poder controlar el cargue de los elementos
		    Thread.sleep(1000);
		   
		    //Agregar Button Alert
			driver.switchTo().alert().accept();
			
			// Navegar de Nuevo al Home
			  driver.findElement(By.className("nav-link")).click();
			  
///Segundo elemento
			//Seleccion de la categoria laptos
			    driver.findElement(By.linkText("Laptops")).click();
			    System.out.println("Seleccion de la categoria Laptos");	
			    
			    //Seleccion de PC MacBook air  // Class= hrefch	    href="prod.html?idp_=11" xpath="1"
			   	driver.findElement(By.linkText("MacBook air")).click();
			    System.out.println("Seleccion de producto MacBook air");	
			    
			    //Add to cart 			
				driver.findElement(By.linkText("Add to cart")).click();
				System.out.println("Clic en la opcion añadir al carrito");	

			    //Add to Wait  ExpectedConditions	
				WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
				wait1.until(ExpectedConditions.alertIsPresent());
				
				//Agregar Button Alert
				driver.switchTo().alert().accept();
			
				// Navegar de Nuevo al Home
				  driver.findElement(By.className("nav-link")).click();
				  
///Tercer elemento				  
				//Seleccion de la categoria Monitores
				    driver.findElement(By.linkText("Monitors")).click();
				    System.out.println("Seleccion de la categoria Monitores");	
				    
				    //Seleccion de PC MacBook air  // Class= hrefch	    href="prod.html?idp_=11" xpath="1"
				   	driver.findElement(By.linkText("Apple monitor 24")).click();
				    System.out.println("Seleccion de producto Apple monitor");	
				    
				    //Add to cart 			
					driver.findElement(By.linkText("Add to cart")).click();
					System.out.println("Clic en la opcion añadir al carrito");	

				    //Add to Wait  ExpectedConditions	
					WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(5));
					wait2.until(ExpectedConditions.alertIsPresent());
					
					//Agregar Button Alert
					driver.switchTo().alert().accept();		  
				  
					//Validacion de Carrito de compra
					  //Seleccion de Cart  // Class= class="nav-link"	    
				    driver.findElement(By.linkText("Cart")).click();
				    System.out.println("Seleccion vista de carro con lista de productos");
				    
				    
				    // Seleccion y elimar el telefono Samsung galaxy s6 de la lista de compra
				    driver.findElement(By.linkText("Delete")).click();
				    System.out.println("Actualiza Lista de Productos para compra");	
					Thread.sleep(500);
				  
				     //Realizar orden de compra
				    //driver.findElement(By.xpath("//button[normalize-space()='Place Order']")).click();
				    //driver.findElement(By.cssSelector("btn btn-success")).click();
				    driver.findElement(By.cssSelector(".btn.btn-success")).click();
				    System.out.println("Clic  Iniciar Orden de Compra");
				 
				   Thread.sleep(1000);
				 
				    //Formulario de compra
					driver.findElement(By.id("name")).sendKeys("Diana ");
					driver.findElement(By.id("country")).sendKeys("Colombia");
				    driver.findElement(By.id("city")).sendKeys("Bogota");
				    driver.findElement(By.id("card")).sendKeys("1091762738902");
				    driver.findElement(By.id("month")).sendKeys("12");
				    driver.findElement(By.id("year")).sendKeys("28");
				    System.out.println("Formato de compra Diligenciado");
				    
				    
				    //Add to cart 			
					driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Close'])[3]")).click();
					System.out.println("Cancela Orden");
						
					//Realizar orden de compra
				    driver.findElement(By.xpath("//button[normalize-space()='Place Order']")).click();
				    //driver.findElement(By.className("btn btn-success")).click();
				    System.out.println("Clic e Iniciar Orden de Compra");
				   
				    //Confirmar compra
					//(//button[normalize-space()='Purchase'])[1]
				    //button[normalize-space()='Purchase'])[1]
				    driver.findElement(By.xpath("(//button[normalize-space()='Purchase'])[1]")).click();
					System.out.println("Orden Generada");
					Thread.sleep(100);
					
						
					driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
					System.out.println("Venta Realizada");
					//Insercion de temporizados
					Thread.sleep(100);
					
			
			//System.out.println(" varible en java : "+ total_producto);
			System.out.println("Cierra el navegador ");
			 			   
			// Cierra el navegador  y todas las ventanas asociadas al final del script.
			driver.quit();
	}
}
