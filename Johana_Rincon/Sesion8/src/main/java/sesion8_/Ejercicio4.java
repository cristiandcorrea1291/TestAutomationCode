package sesion8_;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		//metodo para los exploradores
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		//Ir a la pagina web de Celulares 
				driver.get("https://rahulshettyacademy.com/loginpagePractise/");

				System.out.println("Se ingresó  a la página web");

		 

				//Datos del formulario

				//input username

				driver.findElement(By.name("username")).sendKeys("rahulshettyacademy");

				System.out.println("Ingresa el nombre");

				//input password

				driver.findElement(By.id("password")).sendKeys("learning");

				System.out.println("ingresa  la contraseña");

				

				

				//Radiobutton USER option

				driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();

				System.out.println("Seleccione el  USER");

				
				// Find the dropdown element and select the "consult" option
				 // Encuentra la lista desplegable por su clase
		        WebElement dropdown = driver.findElement(By.xpath("//select[@class='form-control']"));

		        // Crea un objeto Select para interactuar con la lista desplegable
		        Select listaDesplegable = new Select(dropdown);

		        // Selecciona una opción por su valor
		        listaDesplegable.selectByValue("consult");

				

				//Marcar el ok del pop up que emerge al seleccionar un ROL de la lista desplegable

				// Use WebDriverWait to wait for the "okayBtn" element to become visible//implicita		

				WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(20000));

				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn"))).click();

				

				

				//Agree Terms Checkbox

				driver.findElement(By.id("terms")).click();

				System.out.println("Se marco el checkbox del  AGREE TERMS");



		// Click the "signInBtn"

				driver.findElement(By.id("signInBtn")).click();

				System.out.println("clic en el botón SignIn");

				

		 

				//Ir a la interfaz de compras

				// Wait for the "Checkout" link to become visible

				wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));

		 

				 // Find all the product buttons and click them // Find all the product buttons and click them

				List <WebElement> productos = driver.findElements(By.cssSelector(".card-footer.btn-info"));

				for(int i =0;i<productos.size();i++){

					productos.get(i).click();

					System.out.println("iteración de productos en el indice " + i + " con el nombre: " +productos);

				}

				

				

				 // Click the "Checkout" link

				driver.findElement(By.partialLinkText("Checkout")).click();

				System.out.println("ir al checkout del carrito");

				

			

				// Close the WebDriver

				System.out.println("Cerrar ventana del navegador");

			    driver.quit();


	}

}
