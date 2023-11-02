package seccion12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V104Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Ir a la pagina web
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		System.out.println("Ingreso a la pagina web");

		// crear la accion
		Actions accion = new Actions(driver);

		// 2. localizo el input de busque autosugestiva
		WebElement move = driver.findElement(By.id("autocomplete"));

		// 3. Envio mi input al campo
		move.sendKeys("ind");
		System.out.println("Ingresar letras al input");
		// Ir al elemento "Hola, Identificate.Cuentas y Listas"
		// ir a un elemento especifico ->.contextClick
		// moveToElement= nos movemos el mouse a un web element especifico //build=
		// completa secuencia //perform=para ejecutar la accion
		// completar o compilar las acciones -> build()
		// Ejecutar acciones -> perform()


		Thread.sleep(2000);
		
		accion.moveToElement(driver.findElement(By.id("autocomplete"))).sendKeys(Keys.DOWN).build().perform();
		accion.moveToElement(driver.findElement(By.id("autocomplete"))).sendKeys(Keys.ARROW_DOWN); // Mover hacia abajo en la lista
		System.out.println("Hacer HOVER sobre una opcion de la lista segun la sugestión\n");
	
		
		System.out.println("Dar clic a la opcion:");
		accion.moveToElement(driver.findElement(By.id("autocomplete"))).sendKeys(Keys.ENTER); // Seleccionar  la opción ...baja en la lista deplegable con opciones
		accion.moveToElement(driver.findElement(By.id("autocomplete"))).click().build().perform();//clic en la 2da opcion...queda en el input
		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
		//
		System.out.println("Imprimir el valor de la opción marcada es:");
		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
		
		
		
        // Cerrar el navegador
        driver.quit();
	
	
	}

}
