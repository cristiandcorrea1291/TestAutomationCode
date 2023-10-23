package sesion7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Ejercio1CasilladeVerificacion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//ingresa a la pagina
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000L);//con esto no tendre fallas por sincronización	
		//Crear la clase para los checkbooks
		//Checkbooks 1
		WebElement CasillaUnoCheckbox =  driver.findElement(By.cssSelector("input[value=option1]"));
		// Verifica que inicialmente el primer checkbox esté sin marcar
		Assert.assertFalse(CasillaUnoCheckbox.isSelected(), "Casilla sin marcar");
		//Assert.assertFalse(true, falso);
		System.out.println("Verificando que el primer checkbox esta sin marcar inicialmente...");
       // seleccionar y marcar el checkbox
		driver.findElement(By.cssSelector("input[value=option1]")).click();
		
		//Checkbooks 2
		WebElement CasillaDosCheckbox =  driver.findElement(By.cssSelector("input[value=option2]"));
		// Verifica que inicialmente el primer checkbox esté sin marcar
		Assert.assertFalse(CasillaDosCheckbox.isSelected(), "Casilla sin marcar");
		//Assert.assertFalse(true, falso);
		System.out.println("Verificando que el segundo checkbox esta sin marcar inicialmente...");
		// seleccionar y marcar el checkbox
		driver.findElement(By.cssSelector("input[value=option2]")).click();
		
		//Checkbooks 3
		WebElement CasillaTresCheckbox =  driver.findElement(By.cssSelector("input[value=option3]"));
		// Verifica que inicialmente el primer checkbox esté sin marcar
		Assert.assertFalse(CasillaTresCheckbox.isSelected(), "Casilla sin marcar");
		//Assert.assertFalse(true, falso);
		System.out.println("Verificando que el tercero checkbox esta sin marcar inicialmente...");
		// seleccionar y marcar el checkbox
		driver.findElement(By.cssSelector("input[value=option3]")).click();
		
		// Desmarco el boton
		driver.findElement(By.cssSelector("input[value=option3]")).click();
		
		//total
		//.out.println(driver.findElements(By.cssSelector("input[@type='checkbox']")).size());
		driver.findElements(By.cssSelector("input[value='checkbox']")).size();
	
		
		//input[@type='checkbox'][1]
		driver.quit();
		/*	
		//ejemplo del ejercicio
		/*Check the first  Checkbox and verify if it is successfully checked and Uncheck 
		 * it again to verify if it is successfully Unchecked
		* /

		driver.findElement(By.id("input[value=option1]")).click();

		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected()); //Should Print True

		driver.findElement(By.id("checkBoxOption1")).click();
	        
		//tener el valor de todos los checkbooks
		driver.findElements(By.cssSelector("input[value='checkbox']")).size();
		*/
	        
		}
	}

