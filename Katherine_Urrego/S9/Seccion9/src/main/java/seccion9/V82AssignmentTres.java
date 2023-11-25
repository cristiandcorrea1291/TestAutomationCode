package seccion9;

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

public class V82AssignmentTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//video 82 assignment 3
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		//Ir a la pagina web
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		System.out.println("Se ingresó  a la página web");

		//Llenar el formulario
		//input username
		driver.findElement(By.name("username")).sendKeys("rahulshettyacademy");
		System.out.println("Se ingreso el username");
		//input password
		driver.findElement(By.id("password")).sendKeys("learning");
		System.out.println("Se ingresó la contraseña");
		
		
		//Radiobutton USER option
		driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
		System.out.println("Se marcó el radiobutton USER");
		

		// Find the dropdown element and select the "consult" option
		WebElement options = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select listadeplegable= new Select(options);
		listadeplegable.selectByValue("consult");
		System.out.println("se seleccionó una opción en la lista desplegable");
		
		//Marcar el ok del pop up que emerge al seleccionar un ROL de la lista desplegable
		// Use WebDriverWait to wait for the "okayBtn" element to become visible		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(20000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn"))).click();
		
		
		//Agree Terms Checkbox
		driver.findElement(By.id("terms")).click();
		System.out.println("Se marcó la el checkbox del  AGREE TERMS");
		
		
	
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
