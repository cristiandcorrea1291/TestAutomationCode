package challenge1D1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChallengeV1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*CHALLENGE
		 Dada la siguiente pagina Web:https://www.demoblaze.com/index.html
		Automatizar el siguiente flujo:
		-Agregar dos elementos al carrito
		-Obtener el texto del total del carrito e imprimirlo 
		 */
		
		// Configura el controlador de Chrome/navegador utilizando WebDriverManager.
		WebDriverManager.chromedriver().setup();
		//WebDriver es la interfaz, ChromeDriver es la clase y driver es la instancia
		WebDriver driver  = new ChromeDriver();
		//Implicit WAIT ---se DEBE declarar despues del browserDriver
		//It will tell to WAIT at least 10 seconds based of the  number of seconds TIMEOUT I provide here
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	
		//utiliza el objeto driver para abrir un navegador web y navegar a la URL proporcionada,
		driver.get("https://www.demoblaze.com/index.html");
		
		
		//Haz clic en la categoría "Laptops" y elegimos el selector correcto segun etiqueta html
       driver.findElement(By.linkText("Laptops")).click();
       // Selecciona un producto específico y el selector asociado
       WebElement producto = driver.findElement(By.linkText("Sony vaio i7"));
       producto.click();
       //Boton para Agregar el producto al carrito
       driver.findElement(By.linkText("Add to cart")).click();
       
       System.out.println("ya agregué al carrito el producto " +producto);
			
    // Espera hasta que aparezca el cuadro de diálogo "Product added"
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
       wait.until(ExpectedConditions.alertIsPresent());
       // Acepta la alerta (cuadro de diálogo)
       driver.switchTo().alert().accept();
       
	    // Regresar a la página principal
       driver.findElement(By.partialLinkText("Home")).click();
       System.out.println(" fue al home");
       
       // PRODUCTO 2
       // Navegar nuevamente a la categoría "Monitors"
       driver.findElement(By.linkText("Monitors")).click();

       // Seleccionar otro producto y lo agrego al carrito
       driver.findElement(By.linkText("Apple monitor 24")).click();
       driver.findElement(By.linkText("Add to cart")).click();
       
       // Esperar hasta que aparezca la alerta de "Product added"
       wait.until(ExpectedConditions.alertIsPresent());

       // Aceptar la alerta
       driver.switchTo().alert().accept();

       System.out.println("ya agregué al carrito el producto " +producto);
       //Ir al carrito
       driver.findElement(By.id("cartur")).click();
       System.out.println("Ir al carrito");
      
       //Esperar explicitamente x segundos
       try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       
       
       ////H3[@id="totalp"]
       // Espera a que se cargue la página del carrito y obtén el texto del total
       WebElement cartTotalElement = driver.findElement(By.xpath("//H3[@id='totalp']"));
       //String cartTotal = cartTotalElement.getAttribute("innerText");
       String cartTotal = cartTotalElement.getText();
       // Imprime el texto del total del carrito
       System.out.println("Total del Cart es: " + cartTotal);    
       
       
       //******************************
       // Espera a que se cargue la página del carrito y obtén el texto del total
       //WebElement cartTotalElement = driver.findElement(By.id("totalp"));
       //String cartTotal = cartTotalElement.getText();

       // Imprime el texto del total del carrito
       //System.out.println("Total del carrito: " + cartTotalElement.getText());      

	
		
		
	}

}
