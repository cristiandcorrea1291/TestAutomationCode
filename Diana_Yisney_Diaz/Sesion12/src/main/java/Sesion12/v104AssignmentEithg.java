package Sesion12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class v104AssignmentEithg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		System.out.println("Inicio del navegador ");
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		System.out.println("Ingreso a la pagina web");

		Actions accion = new Actions(driver);
		WebElement move = driver.findElement(By.id("autocomplete"));

		move.sendKeys("ind");
		System.out.println("Ingresar letras al input");
	
		Thread.sleep(2000);
		
		accion.moveToElement(driver.findElement(By.id("autocomplete"))).sendKeys(Keys.DOWN).build().perform();
		accion.moveToElement(driver.findElement(By.id("autocomplete"))).sendKeys(Keys.ARROW_DOWN); 
		System.out.println("Hacer HOVER sobre una opcion de la lista segun la sugestión\n");
	
		
		System.out.println("Dar clic a la opcion:");
		accion.moveToElement(driver.findElement(By.id("autocomplete"))).sendKeys(Keys.ENTER); 
		accion.moveToElement(driver.findElement(By.id("autocomplete"))).click().build().perform();
		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
		//
		System.out.println("Imprimir el valor de la opción marcada es:");
		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
		
		
		System.out.println("Cerrar navegador");
		driver.quit();	
	
	
	}
	
}
