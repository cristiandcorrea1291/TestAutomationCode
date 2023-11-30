package Sesion10;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class v86HandlingAjaxMouse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//IR A LA PAGINA
		System.out.println("Inicio del Navegador");
		driver.get("https://www.amazon.com/");

		//Crear una instancia de la clase ACTIONS
		Actions a = new Actions(driver);
		//Asignacion del path
		a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']")))
		.build().perform();
		
		System.out.println("salida del Navegador");
		// Cierra el navegador  y todas las ventanas asociadas al final del script.
		driver.quit();
		
		}
}
